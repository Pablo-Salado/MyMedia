package foro;

public class Mensaje {
    private final String mensaje;
    private final String autor;
    private final String fecha;
    
    public Mensaje(String mensaje, String autor, String fecha) {
        this.mensaje = mensaje;
        this.autor = autor;
        this.fecha = fecha;
    }
    
    public String getMensaje() {
        return mensaje;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getFecha() {
        return fecha;
    }
}
