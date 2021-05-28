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

public class API{

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
                while(true) {
                        String nombrePelicula;
                        System.out.println("Dime el nombre de la peli:");
                        Scanner sc = new Scanner(System.in);
                        nombrePelicula = sc.nextLine();
                        System.out.println("El nombre de la peli introducida es: " + nombrePelicula);

                        JSONObject json = readJsonFromUrl("https://api.themoviedb.org/3/search/multi?api_key=33890a00119dd4252bba26f546853049&language=es&query="+nombrePelicula+"&page=1&include_adult=false");
                        JSONObject res;
                        System.out.println(json.toString());
                        //en res almaceno la primera pelicula
                        res=json.getJSONArray("results").getJSONObject(0);
                        System.out.println(res.names().toString());
                        System.out.println(res.get("id"));
                        int p= Integer.parseInt(res.get("id").toString());
                        System.out.println("El id de la pelicula en tipo entero es:"+p);
                        System.out.println("Obtengo la descripccion avanzada de la peli");
                        if(res.get("media_type").toString().equals("movie")){

                                res=readJsonFromUrl("https://api.themoviedb.org/3/movie/"+p+"?api_key=33890a00119dd4252bba26f546853049&language=en-US");

                        }else{
                                res=readJsonFromUrl("https://api.themoviedb.org/3/tv/"+p+"?api_key=33890a00119dd4252bba26f546853049&language=en-US");
                        }

                        System.out.println(res.names().toString());

                }
                
        }
}