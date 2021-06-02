package GUIS.logingui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class loguinguiMethods { //Clase creada para respetar el principio de responsabilidad única
    public static boolean checkGoodFormat(String correo) {
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();
    }
}
