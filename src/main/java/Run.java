import GUIS.forogui.Frame_Foro;
import GUIS.logingui.logingui.LoginGUI;
import db.access.DBConnection;
import db.access.DBConnectionJDBC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Run {
    private static class threadChecker extends Thread{
        LoginGUI loginGUI;
        private boolean isLogued = false;

        private threadChecker(LoginGUI loginGUI){this.loginGUI = loginGUI;}

        public void run(){
            while (!loginGUI.logued()){
                this.yield();
            };
            isLogued = true;
        }

        public boolean isLogued() {
            return isLogued;
        }
    }
    public static void main(String[] args) throws InterruptedException {

        LoginGUI loginGUI = new LoginGUI();
        Frame_Foro frame_foro = new Frame_Foro();
        DBConnection DBAccess = DBConnectionJDBC.getInstance();
        peliculasGUI peliculasGUI = new peliculasGUI();
        threadChecker threadChecker = new threadChecker(loginGUI);

        loginGUI.setVisible(true);
        threadChecker.start();
        while (!threadChecker.isLogued()){
            Thread.yield();
        }
        loginGUI.setVisible(false);
        peliculasGUI.setVisible(true);
    }
}
