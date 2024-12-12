package view;
import controller.Controller;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DimensionUIResource;

public class MainMenu extends JFrame{
    Controller controller = new Controller();
    public MainMenu(){        
        // JFrame Main Menu 
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        
        // JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(20, 35, 0, 0));

        JButton menu1 = new JButton("1. Menu Login");
        JButton menu2 = new JButton("2. Menu Book List");
        JButton menu3 = new JButton("3. Menu Transactions");
        panel.add(menu1);
        panel.add(menu2);
        panel.add(menu3);

        // Menu 1 : Menu Login
        menu1.addActionListener(e -> {
            new MenuLogin(controller).setVisible(true);
            setVisible(false);
        });

        // Menu 2 : Menu Book List
        menu2.addActionListener(e -> {
            
            setVisible(false);
        });

        // Menu 3 : Menu Transactions
        menu3.addActionListener(e -> {
            System.exit(0);
        });


        add(panel);
    }
}
