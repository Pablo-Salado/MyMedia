import GUIS.forogui.Frame_Foro;
import GUIS.logingui.logingui.LoginGUI;
import db.access.DBConnection;
import db.access.DBConnectionJDBC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Run {

    public static void main(String[] args) throws InterruptedException {

        LoginGUI loginGUI = new LoginGUI();
        Frame_Foro frame_foro = new Frame_Foro();
        DBConnection DBAccess = DBConnectionJDBC.getInstance();
        peliculasGUI peliculasGUI = new peliculasGUI();

        loginGUI.setVisible(true);
        while (!loginGUI.logued()){
            Thread.yield();
        }
        loginGUI.setVisible(false);
        peliculasGUI.setVisible(true);
    }
}
