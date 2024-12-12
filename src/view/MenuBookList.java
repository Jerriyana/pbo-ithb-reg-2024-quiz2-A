package view;
import controller.Controller;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DimensionUIResource;

public class MenuBookList extends JFrame{    
    private JTextField createTextField(int width, int height) {
        JTextField textField = new JTextField();
        textField.setMaximumSize(new DimensionUIResource(width, height));
        textField.setAlignmentX(LEFT_ALIGNMENT);
        return textField;
    }

    private JPasswordField createTextPasswordField(int width, int height) {
        JPasswordField textField = new JPasswordField();
        textField.setMaximumSize(new DimensionUIResource(width, height));
        textField.setAlignmentX(LEFT_ALIGNMENT);
        return textField;
    }

    public MenuBookList(){
        // JFrame Input
        setTitle("Form Input E-KTP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);

        // JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(20, 35, 0, 0));

        // 1. Email 
        panel.add(new JLabel("Email : "));
        JTextField email = createTextField(300, 20);
        panel.add(email);

        // 2. Password 
        panel.add(new JLabel("Email : "));
        JPasswordField password = createTextPasswordField(300, 20);
        panel.add(password);

        // 3. Login 
        JButton login = new JButton("Login");        

        login.addActionListener(e -> {
            String emailText = email.getText();
            String passwordText = email.getText();
                      
        });
    }
}
