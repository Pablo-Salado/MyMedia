import java.util.List;

public class Discusion {
    private String titulo;
    private List<Mensaje> mensajes = null;
    
    public Discusion(String titulo, Mensaje primero) {
        this.titulo = titulo;
        añadirMensaje(primero);
    }
    
    public static void añadirMensaje(Mensaje m) {
        
    }
    
    public void eliminarMensaje(Mensaje m) {
        
    }
    
    public List<Mensaje> getMensajes() {
        return mensajes;
    }
    
    
    
}
