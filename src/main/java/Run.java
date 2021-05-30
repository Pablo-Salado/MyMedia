import db.User;
import db.access.DBConnection;
import db.access.DBConnectionJDBC;
import forogui.Frame_Foro;
import logingui.LoginGUI;

public class Run {
    public static void main(String[] args) {
        LoginGUI loginGUI = new LoginGUI();
        Frame_Foro frame_foro = new Frame_Foro();
        DBConnection DBAccess = DBConnectionJDBC.getInstance();


        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                loginGUI.setVisible(true);
                if(loginGUI.logued())
                    System.out.println(loginGUI.getUsername());
                    DBAccess.createTopic("Topic de prueba",loginGUI.getUsername(),2);
                //new Frame_Foro().setVisible(true);

            }
        });
    }
}
