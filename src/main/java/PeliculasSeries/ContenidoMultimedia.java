package PeliculasSeries;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

import com.mysql.cj.jdbc.SuspendableXAConnection;
import org.json.JSONException;
import org.json.JSONObject;


public class ContenidoMultimedia {
    JSONObject infoPelicula;


    public ContenidoMultimedia(String nombre) throws IOException { //al constructor se le pasa el nombre de la película,la busca y configura
        nombre=nombre.replace(" ","-");
        infoPelicula=obtenerPelicula(nombre);

    }

    private static JSONObject obtenerPelicula(String nombre) throws IOException {
        JSONObject json=null;
        try {
            int id;
            json = readJsonFromUrl("https://api.themoviedb.org/3/search/multi?api_key=33890a00119dd4252bba26f546853049&language=es&query=" + nombre + "&page=1&include_adult=false");
            json = json.getJSONArray("results").getJSONObject(0);
            id = Integer.parseInt(json.get("id").toString());
            //después de obtener el id busco la peli con mas datos
            if (json.get("media_type").toString().equals("movie")) {
                json = readJsonFromUrl("https://api.themoviedb.org/3/movie/" + id + "?api_key=33890a00119dd4252bba26f546853049&language=es");

            } else {
                json = readJsonFromUrl("https://api.themoviedb.org/3/tv/" + id + "?api_key=33890a00119dd4252bba26f546853049&language=es");
            }
            System.out.println(json.toString());
            //devuelve el primer resultado
        }catch (FileNotFoundException e){
            System.out.println("La pelicula no ha podido ser encontrada");
            json=null;
        }
        return json;
    }



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


    ////////////////////////////////////////////////////////////////
    //GETTERS
    ///////////////////////////////////////////////////////////////
    //INFORMACION A LA QUE TENEMOS ACCESO:["original_language","imdb_id","video","title","backdrop_path","revenue",
    // "genres","popularity","production_countries","id","vote_count","budget","overview","original_title","runtime",
    // "poster_path","spoken_languages","production_companies","release_date","vote_average","belongs_to_collection",
    // "tagline","adult","homepage","status"]
    public int getDuracion(){
        return Integer.parseInt(infoPelicula.get("runtime").toString());
    }

    public String getArgumento(){

        return infoPelicula.get("overview").toString();
    }
    public String getGenero(){
        return infoPelicula.getJSONArray("genres").getJSONObject(0).get("name").toString();
    }
    public String getNombre(){
        return infoPelicula.get("original_title").toString();
    }
    public String getURLCaratula(){
        return ("https://image.tmdb.org/t/p/w500"+infoPelicula.get("poster_path").toString());
    }
    public String getProductora(){
        return infoPelicula.getJSONArray("production_companies").getJSONObject(0).get("name").toString();
    }
    public String getFechaEstreno(){
        return infoPelicula.get("release_date").toString();
    }
    public double getPuntuacion(){
        return Double.parseDouble(infoPelicula.get("vote_average").toString());
    }






}