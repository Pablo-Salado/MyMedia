package db.access;
/*  @author Andrés Garrido López
    Clase abstracta para establecer los métodos que interaccionan con la base de datos interna
    Basado en el github del profesor Jose María Álvarez Palomo(UMA) https://github.com/JoseMariaAlvarez/conexionBD
*/

import db.User;

public abstract class DBConnection {
    static final String DB_URL = "jdbc:mysql://iis2021.cobadwnzalab.eu-central-1.rds.amazonaws.com";
    static final String DB_SCHEMA = "grupoC";

    //DB Credentials
    static final String user = "usuarioC";
    static final String password = "manzanosalado";


    //Methods | add a new user | delete an user | chech password
    public abstract void addUser(User user);
    public abstract void deleteUser(User user);
    public abstract boolean checkPassword(String username, String password);
    public abstract boolean checkFreeUserName(String username);
    public abstract boolean checkFreeEmail(String email);

}
