/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import helpers.connectionDb;

/**
 *
 * @author Zeref
 */
public class functions {

    public ResultSet rs;
    public Statement st;

    public int cud(String query, String info) {
        try {
            String sql = query;
            st = connectionDb.Con().createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, info, "Informasi", JOptionPane.INFORMATION_MESSAGE);

            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Informasi", JOptionPane.WARNING_MESSAGE);
            return 0;
        } finally {
            try {
                connectionDb.Con().close();

            } catch (Exception e) {
            }
        }
    }

    public int select(String query) {
        try {
            String sql = query;
            st = connectionDb.Con().createStatement();
            rs = st.executeQuery(sql);
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Informasi", JOptionPane.WARNING_MESSAGE);
            return 0;
        } finally {
            try {
                connectionDb.Con().close();

            } catch (Exception e) {
            }

        }
    }
}
