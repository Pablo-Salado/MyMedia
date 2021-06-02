import db.access.DBConnection;
import db.access.DBConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test{
    public static void main(String[] args) throws SQLException {

        DBConnection dbConnection = DBConnectionJDBC.getInstance();

        /*List<String> res = new ArrayList<String>();

        res = dbConnection.getTopics(2);

        for(String x: res)
            System.out.println(x);*/
    }
}
