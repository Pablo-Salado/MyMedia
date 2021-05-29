import db.User;
import forogui.Frame_Foro;
import logingui.LoginGUI;

public class Run {
    public static void main(String[] args) {
        LoginGUI loginGUI = new LoginGUI();
        Frame_Foro frame_foro = new Frame_Foro();

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                loginGUI.setVisible(true);
                String currentUser = loginGUI.getUsername();

            }
        });
    }
}
