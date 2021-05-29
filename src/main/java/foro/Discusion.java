package foro;

import java.util.List;

public class Discusion {
    private String titulo;
    private int id;
    
    public Discusion(String titulo, int id) {
        this.titulo = titulo;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }
}
