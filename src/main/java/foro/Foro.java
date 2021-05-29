package foro;

import java.util.List;

public class Foro {
    private static final int ID_PELICULAS = 1;
    private static final int ID_SERIES = 2;
    private String title;
    private String Text;
    
    public Foro(String title,String text) {
         this.title = title;
         this.Text = text;
    }

    public static int getIdPeliculas() {
        return ID_PELICULAS;
    }

    public static int getIdSeries() {
        return ID_SERIES;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return Text;
    }
}
