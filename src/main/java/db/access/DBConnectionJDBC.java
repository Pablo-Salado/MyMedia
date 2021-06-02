package db.access;
/*  @author Andrés Garrido López
    @author Arthur Eboh Chukwuka Pérez
    Clase para establecer conexión con la base de datos de aws
    Basado en el github del profesor Jose María �?lvarez Palomo(UMA) https://github.com/JoseMariaAlvarez/conexionBD
*/

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnectionJDBC extends DBConnection {
    private Connection connection;

    private static DBConnectionJDBC interfaceinstance = null;

    private DBConnectionJDBC(){

        try {
            connection = DriverManager.getConnection(DB_URL+"/"+DB_SCHEMA, user, password);
        }catch (SQLException throwables) {
            System.err.format("SQL State : %s\n%s", throwables.getSQLState(), throwables.getMessage());
            throwables.printStackTrace();
        }
    }

    public static DBConnectionJDBC getInstance(){
        if(interfaceinstance == null){
            interfaceinstance = new DBConnectionJDBC();
        }
        return interfaceinstance;
    }

    @Override
    public void addUser(User user) {
        String addCommandSQL = "INSERT INTO User(username,email,password,role,age) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(addCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getPassword());
            preparedStatement.setInt(4,0);
            preparedStatement.setDate(5, user.getAge());
            int res = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            System.err.println();
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteUser(User user) {

        String deleteCommandSQL = "DELETE FROM User WHERE username LIKE ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(deleteCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public boolean checkPassword(String username,String password) {
        boolean pass = false;
        String passwordCommandSQL = "SELECT password FROM User WHERE (username LIKE ? AND password = ?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(passwordCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
                pass = true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pass;
    }

    @Override
    public boolean checkFreeUserName(String username) {
        boolean pass = true;
        String checkFreeUserNameCommandSQL = "SELECT username FROM User WHERE username LIKE ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(checkFreeUserNameCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
                pass = false;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pass;
    }

    @Override
    public boolean checkFreeEmail(String email) {
        boolean pass = true;
        String checkFreeUserNameCommandSQL = "SELECT email FROM User WHERE email LIKE ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(checkFreeUserNameCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
                pass = false;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return pass;
    }


    @Override
    public void createTopic(String title, String username, int id) {
        String createTopicCommandSQL = "INSERT INTO Discusion(id,titulo,idforo,autor) VALUES (id,?,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(createTopicCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,title);
            preparedStatement.setInt(2,id);
            preparedStatement.setString(3,username);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    @Override
    public void createForum(String title) {
        String createForumCommandSQL = "INSERT INTO Foro(id,titulo,descripcion) VALUES (id,?,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(createForumCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,title);
            preparedStatement.setString(2,"Texto de ejemplo");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void createMessage(String Text, String username,int idDiscusion) {
        String createMessageCommandSQL = "INSERT INTO Mensaje(id,cuerpo,idDiscusion,autor) VALUES (id,?,?,?)";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(createMessageCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,Text);
            preparedStatement.setInt(2,idDiscusion);
            preparedStatement.setString(3,username);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteMessage(int id) {
        String deleteMessageCommandSQL = "DELETE FROM Mensaje WHERE id LIKE ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(deleteMessageCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, Integer.toString(id));
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<String> getTopicMessages(int idDiscusion) {
        String getTopicMessagesCommandSQL = "SELECT cuerpo FROM Mensaje WHERE idDiscusion = ?";
        List<String> messages = new ArrayList<String>();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getTopicMessagesCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, String.valueOf(idDiscusion));
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                messages.add(rs.getString("cuerpo"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return messages;
    }

    @Override
    public List<String> getTopics(int idForo) {
        String getTopicsCommandSQL = "SELECT titulo FROM Discusion WHERE idForo = ?";
        List<String> topics = new ArrayList<String>();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getTopicsCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, String.valueOf(idForo));
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                topics.add(rs.getString("titulo"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return topics;
    }

    @Override
    public List<String> getTopicsID(int idForo) {
        String getTopicsCommandSQL = "SELECT id FROM Discusion WHERE idForo = ?";
        List<String> topics = new ArrayList<String>();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getTopicsCommandSQL,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, String.valueOf(idForo));
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                topics.add(rs.getString("id"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return topics;
    }

}
