import PeliculasSeries.ContenidoMultimedia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

import com.mysql.cj.jdbc.SuspendableXAConnection;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class API {

        private static String readAll(Reader rd) throws IOException {
                StringBuilder sb = new StringBuilder();
                int cp;
                while ((cp = rd.read()) != -1) {
                        sb.append((char) cp);
                }
                return sb.toString();
        }

        public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
                InputStream is = new URL(url).openStream();
                try {
                        BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                        String jsonText = readAll(rd);
                        JSONObject json = new JSONObject(jsonText);
                        return json;
                } finally {
                        is.close();
                }
        }

        public static void main(String[] args) throws IOException, JSONException {
                while (true) {
                        ContenidoMultimedia c;
                        String nombrePelicula;
                        System.out.println("Dime el nombre de la peli que quieres buscar");
                        Scanner sc = new Scanner(System.in);
                        nombrePelicula = sc.nextLine();
                        c= new ContenidoMultimedia(nombrePelicula);
                        System.out.println("El nombre de la pelicula es: " + c.getNombre());
                        System.out.println("La fecha de estreno es: " + c.getFechaEstreno());
                        System.out.println("El argumento de la pelicula es: " + c.getArgumento());
                        System.out.println("La duracion de la policula es: "+c.getDuracion()+ " minutos");
                        System.out.println("La productora de la pelicula es: "+c.getProductora());
                        System.out.println("La puntuación media de la pelicula sobre 10 es: "+c.getPuntuacion());
                        System.out.println("El url donde se encuentra la caratula de la pelicula es: "+c.getURLCaratula());
                        System.out.println("El genero de la pelicula es: "+c.getGenero());



                }
        }
}