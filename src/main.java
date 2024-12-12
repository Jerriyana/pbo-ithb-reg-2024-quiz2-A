import javax.swing.SwingUtilities;
import controller.Controller;
import view.MainMenu;
public class main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        SwingUtilities.invokeLater(()-> new MainMenu().setVisible(true));        
    }
}
