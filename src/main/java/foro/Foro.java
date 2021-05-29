package foro;

import java.util.List;

public class Foro {
    private int id;
    private String title;
    private String Text;
    
    public Foro(int id, String title,String text) {
         this.id = id;
         this.title = title;
         this.Text = text;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return Text;
    }
}
