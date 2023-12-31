package models.views.inboxtable;

import models.interfaces.Emailable;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

/**
 * This class is an extended class of {@link DefaultTableCellRenderer} that is used to render the action buttons in
 * the table. Specifically changing the button's background color when it is being selected.
 *
 * @author <a href="https://github.com/vianneynara">Nara</a>
 * */

public class TableActionCellRender extends DefaultTableCellRenderer {
    /**
     * Associated email
     * */
    private Emailable currentEmail;

    public TableActionCellRender() {
        setVerticalAlignment(SwingConstants.CENTER);
        setHorizontalAlignment(SwingConstants.LEADING);
    }

    public void setCurrentEmail(Emailable currentEmail) {
        this.currentEmail = currentEmail;
    }

    /**
     * This method sets the background color of the action buttons in the table so that it matches the table's
     * background color.
     * */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        PanelAction action = new PanelAction(currentEmail);
        
        if (!isSelected && (row % 2 == 0)) {
            action.setBackground(Color.WHITE);
        } else {
            action.setBackground(component.getBackground());
        }
        return action;
    }
}
