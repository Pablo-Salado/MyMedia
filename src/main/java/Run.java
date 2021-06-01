import GUIS.forogui.Frame_Foro;
import GUIS.logingui.LoginGUI;
import GUIS.peliculasgui.peliculasGUI;
import db.access.DBConnection;
import db.access.DBConnectionJDBC;


public class Run {

    public static void main(String[] args) throws InterruptedException {

        LoginGUI loginGUI = new LoginGUI();
        Frame_Foro frame_foro = new Frame_Foro();
        DBConnection DBAccess = DBConnectionJDBC.getInstance();
        peliculasGUI peliculasGUI = new peliculasGUI();

        loginGUI.setVisible(true);
        while (!loginGUI.logued())
            Thread.yield();
        loginGUI.setVisible(false);
        frame_foro.setVisible(true);
    }
}
