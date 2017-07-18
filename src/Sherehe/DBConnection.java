package Sherehe;

import java.awt.Component;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DBConnection {

    String User = "root";
    String Pass = "dennis";
    String dbName = "Sherehe";
    String url = "jdbc:mysql://localhost/";
    String driver = "com.mysql.jdbc.Driver";

    Statement St;
    Connection Conn;
    ResultSet rs;

    public DBConnection() {

        try {

            Class.forName(driver);
            Conn = DriverManager.getConnection(url + dbName , User , Pass);
            System.out.println("Connection Created");
           St=Conn.createStatement();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        new DBConnection();
    }
    
      public void clear(JFrame fm) {
        JTextField txt;
        JComboBox cbo;

        for (Component c : fm.getContentPane().getComponents()) {
            if (c instanceof JComboBox) {
                cbo = (JComboBox) c;
                cbo.setSelectedIndex(0);

            }

        }
        for (Component ct : fm.getContentPane().getComponents()) {
            if (ct instanceof JTextField) {
                txt = (JTextField) ct;
                txt.setText("");

            }
        }

    }
}
