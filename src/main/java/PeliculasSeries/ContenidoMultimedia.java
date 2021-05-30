package PeliculasSeries;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

import com.mysql.cj.jdbc.SuspendableXAConnection;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.DOMImplementation;


public  class ContenidoMultimedia {
    JSONObject infoPelicula;
    Boolean error=false;
    int tipo; //0 si es pelicula , 1 si es una serie



    public ContenidoMultimedia(String nombre) throws IOException { //al constructor se le pasa el nombre de la película,la busca y configura
        nombre=nombre.replace(" ","-");
        try{
            infoPelicula=obtenerMultimedia(nombre);
            try{
                infoPelicula.get("number_of_episodes");
                tipo=1;
            }catch (Exception e){
                tipo=0;
            }

        }
        catch (Exception e){
            System.out.println("Error no se encontro la pelicula");
            error=true;
        }

    }

    private static JSONObject obtenerMultimedia(String nombre) throws IOException {
        JSONObject json=null;
        try {
            int id;
            json = readJsonFromUrl("https://api.themoviedb.org/3/search/movie?api_key=33890a00119dd4252bba26f546853049&language=es&query=" + nombre + "&page=1&include_adult=false");
            json = json.getJSONArray("results").getJSONObject(0);
            id = Integer.parseInt(json.get("id").toString());
            //después de obtener el id busco la peli con mas datos
                json = readJsonFromUrl("https://api.themoviedb.org/3/movie/" + id + "?api_key=33890a00119dd4252bba26f546853049&language=es");


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
        int res;
        if(error){
            res=0;
        }else{

                res = Integer.parseInt(infoPelicula.get("runtime").toString());

        }
        return res;
    }

    public String getArgumento(){
        String res;
        if(error){
            res="error";
        }else{

                res = infoPelicula.get("overview").toString();

        }

        return res;
    }
    public String getGenero(){
        String res;
        if(error){
            res="error";
        }else{
            res=infoPelicula.getJSONArray("genres").getJSONObject(0).get("name").toString();
        }
        return res;
    }
    public String getNombre(){
        String res;
        if(error){
            res="error";
        }else{
            res=infoPelicula.get("original_title").toString();
        }
        return res;
    }
    public String getURLCaratula(){
        String res;
        if(error) {
            res="https://i.pinimg.com/736x/b7/d0/b6/b7d0b611d3d927b74c6b71f5e797a5fe.jpg";

        }else{
                res = "https://image.tmdb.org/t/p/w500" + infoPelicula.get("poster_path").toString();

        }
        return res;
    }
    public String getProductora(){
        String res;
        if(error){
            res="error";

        }else{
                res=infoPelicula.getJSONArray("production_companies").getJSONObject(0).get("name").toString();

        }
        return res;
    }
    public String getFechaEstreno(){
        String res;
        if(error){
            res="error";
        }else{
                    res = infoPelicula.get("release_date").toString();

        }
        return res;
    }
    public double getPuntuacion(){
        double res;
        if(error){
            res=0;


        }else{
            res=Double.parseDouble(infoPelicula.get("vote_average").toString());

        }
        return res;
    }





}