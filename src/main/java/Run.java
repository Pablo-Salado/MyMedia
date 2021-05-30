import GUIS.forogui.Frame_Foro;
import GUIS.logingui.logingui.LoginGUI;
import db.access.DBConnection;
import db.access.DBConnectionJDBC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Run {
    static Lock l = new ReentrantLock();
    static Condition logued = l.newCondition();
    private static class threadChecker extends Thread{
        LoginGUI loginGUI;

        private threadChecker(LoginGUI loginGUI){this.loginGUI = loginGUI;}

        public void run(){
            while (!loginGUI.logued()){
                System.out.println();
            };
            try{
                l.lock();
                logued.signal();
            }finally {
                l.unlock();
            }

        }
    }
    public static void main(String[] args) throws InterruptedException {

        LoginGUI loginGUI = new LoginGUI();
        Frame_Foro frame_foro = new Frame_Foro();
        DBConnection DBAccess = DBConnectionJDBC.getInstance();
        peliculasGUI peliculasGUI = new peliculasGUI();
        threadChecker threadChecker = new threadChecker(loginGUI);

        loginGUI.setVisible(true);
        try{
            l.lock();
            threadChecker.start();
            if(!loginGUI.logued())logued.await();
        }finally {
            l.unlock();
        }
        loginGUI.setVisible(false);
        peliculasGUI.setVisible(true);
    }
}
