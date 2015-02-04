/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author admin
 */
public class MyRenderer extends DefaultTableCellHeaderRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        if (!table.isRowSelected(row)) {
            if (value != null) {
                if (((String)value).contains("OK")) {
                    c.setBackground(Color.green);
                } else if (((String)value).contains("OFF")) {
                    c.setBackground(Color.red);
                } else {
                    c.setBackground(table.getBackground());
                }
            } else {
                c.setBackground(table.getBackground());
            }
        }
        return c;
    }

}
