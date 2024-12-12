package controller;
import model.*;
import view.MenuBookList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();

    public Users getUser(String email, String password) {
        Users user = null;
        conn.connect();
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";        
        try (PreparedStatement stmt = conn.con.prepareStatement(query)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user = new Users();
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));                                                
            }            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }                     
        return user; 
    }
}
