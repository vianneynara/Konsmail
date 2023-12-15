package utils;

import java.sql.*;
import java.util.ArrayList;

import models.objects.Account;
import models.objects.Email;

/**
 * This class will be used to handle all the database operations such as the
 * input and output.
 *
 * @author <a href="https://github.com/trustacean">Edward</a>
 * @author <a href="https://github.com/vianneynara">Nara</a>
 * @author <a href="https://github.com/FatDog98">Patrick</a>
 */

public class DatabaseUtils {
    /**
     * Grabs all the emails from the database.
     *
     * @return An {@link ArrayList} of emails.
     */
    // TODO: make a getSentMailbox method

    public static ArrayList<Email> getMailbox(String userUuid) {
        ArrayList<Email> mailbox = new ArrayList<>();
        String query = "SELECT * FROM MAILBOX WHERE RECIPIENT_UUID = ?";
    
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
    
            // Set the userUuid in the PreparedStatement
            ps.setString(1, userUuid);
    
            try (ResultSet rs = ps.executeQuery()) {
                // iterates through the result set and adds the emails to the mailbox
                while (rs.next()) {
                    String uuid = rs.getString("uuid");
                    String sender = rs.getString("sender_uuid");
                    String recipient = rs.getString("recipient_uuid");
                    String subj = rs.getString("subject");
                    String content = rs.getString("content");
                    Timestamp date = rs.getTimestamp("timestamp");
                    boolean isFlagged = rs.getBoolean("is_flagged");
                    boolean isRead = rs.getBoolean("is_read");
    
                    mailbox.add(new Email(uuid, sender, recipient, subj, content, date.toLocalDateTime(), isFlagged, isRead));
                }
            }
    
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        return mailbox;
    }
    

    /**
     * Grabs all the accounts from the database.
     *
     * @return An {@link ArrayList} of accounts.
     */
    public static Account getAccount(String address) {
        Account account = null;
        String query = "SELECT * FROM ACCOUNTS WHERE email_address = ?";

        try (Connection conn = DatabaseConnector.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {

            // Set the parameter value before executing the query
            ps.setString(1, address);

            try (ResultSet rs = ps.executeQuery()) {
                // Iterates through the result set and adds the account to the variable
                while (rs.next()) {
                    String fName = rs.getString("first_name");
                    String lName = rs.getString("last_name");
                    String eAddr = rs.getString("email_address");
                    String uuid = rs.getString("uuid");

                    account = new Account(fName, lName, eAddr, "", uuid);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return account;
    }

    public static String getUuid(String emailAddress) {
        String query = "SELECT uuid FROM ACCOUNTS WHERE email_address = ?";
    
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
    
            ps.setString(1, emailAddress);
    
            ResultSet rs = ps.executeQuery();
    
            // Check if the ResultSet has any rows
            if (rs.next()) {
                // Retrieve the "uuid" column value
                return rs.getString("uuid");
            }
        } catch (SQLException e) {
            ULogger.logError(e, "Failed to check if account exists.");
        }
        return null;
    }
    

    /**
     * Inserts an email into the database.
     *
     * @param mail The email to be inserted.
     */
    public static void insertMail(Email mail) {
        String query = "INSERT INTO MAILBOX " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        // Tries to connect to the database and execute the query using
        // try-with-resources
        try (Connection conn = DatabaseConnector.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {

            // Sets the question marks to the email's corresponding attributes
            ps.setString(1, mail.getUuid());
            ps.setString(2, mail.getSender());
            ps.setString(3, mail.getRecipient());
            ps.setString(4, mail.getSubject());
            ps.setString(5, mail.getContent());
            ps.setString(6, mail.getDateTime().toString());
            ps.setString(7, Boolean.toString(mail.getFlag()));
            ps.setString(8, Boolean.toString(mail.getRead()));

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Inserts an account into the database.
     *
     * @param account The account to be inserted.
     */
    public static void insertAccount(Account account) {
        String query = "INSERT INTO ACCOUNTS " +
                "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnector.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {

            // Sets the question marks to the account's corresponding attributes
            ps.setString(1, account.getUuid());
            ps.setString(2, account.getEmailAddress());
            ps.setString(3, account.getPassword());
            ps.setString(4, account.getFirstName());
            ps.setString(5, account.getLastName());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Checks whether an account exists in the database.
     *
     * @param address The email address to be checked.
     */
    public static boolean emailAddressExists(String address) {
        String query = "SELECT email_address FROM ACCOUNTS WHERE email_address = ?";

        try (Connection conn = DatabaseConnector.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            // sets the first question mark to the email address
            ps.setString(1, address);

            // executes the query and returns true if the result set is not empty
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            ULogger.logError(e, "Failed to check if account exists.");
            return false;
        }
    }

    /**
     * Checks if the email address and password matches in the database.
     *
     * @param address  The email address to be checked.
     * @param password The password to be checked.
     */
    public static boolean emailAddressAndPasswordMatches(String address, String password) {
        String query = "SELECT email_address FROM ACCOUNTS WHERE email_address = ? AND password = ?";

        try (Connection conn = DatabaseConnector.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            // sets the first question mark to the email address
            ps.setString(1, address);
            ps.setString(2, password);

            // executes the query and returns true if the result set is not empty
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            ULogger.logError(e, "Failed to check if account exists.");
            return false;
        }
    }

    public static boolean updateAccount(String fname, String lname, String emailAddress, String password) {
        String query = "UPDATE ACCOUNTS " +
                "SET FIRST_NAME = ?, LAST_NAME = ?, PASSWORD = ? " +
                "WHERE EMAIL_ADDRESS = ?";
    
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
    
            // Sets the question marks to the corresponding attributes
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, password);
            ps.setString(4, emailAddress);
    
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    

}