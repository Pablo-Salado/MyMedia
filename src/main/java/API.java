import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

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

                        JSONObject json = readJsonFromUrl("http://www.omdbapi.com/?t=" + nombrePelicula + "&apikey=bbdb735d");
                        System.out.println(json.toString());
                        System.out.println(json.names());
                }
                
        }
}