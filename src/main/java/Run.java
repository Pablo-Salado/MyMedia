import GUIS.forogui.Frame_Foro;
import GUIS.logingui.LoginGUI;
import GUIS.peliculasgui.peliculasGUI;
import db.access.DBConnection;
import db.access.DBConnectionJDBC;


public class Run {

    public static void main(String[] args) throws InterruptedException {

        LoginGUI loginGUI = new LoginGUI();
        
        DBConnection DBAccess = DBConnectionJDBC.getInstance();
        
        peliculasGUI peliculasGUI = new peliculasGUI();

        Frame_Foro frame_foro = new Frame_Foro(DBAccess,loginGUI.getUsername());
        loginGUI.setVisible(true);
        while (!loginGUI.logued())
            Thread.yield();
        loginGUI.setVisible(false);
        while(true){
            peliculasGUI.setVisible(true);
            while(!peliculasGUI.getForo())
                Thread.yield();
            peliculasGUI.setVisible(false);
            peliculasGUI.setForo(false);
            frame_foro.setVisible(true);
            while(true)
                Thread.yield();
        }
    }
}
