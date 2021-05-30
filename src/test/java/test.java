import db.access.DBConnection;
import db.access.DBConnectionJDBC;

public class test {
    public static void main(String[] args) {

        DBConnection DBAccess = DBConnectionJDBC.getInstance();
        /*User user = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de usuario");
        String username = sc.nextLine();

        while (!DBAccess.checkFreeUserName(username)){
            System.out.println("Introduce el nombre de usuario");
            username = sc.nextLine();
        }

        System.out.println("Introduce el email");
        String email = sc.nextLine();
        while (!DBAccess.checkFreeEmail(email)){
            System.out.println("Introduce el nombre de usuario");
            email = sc.nextLine();
        }
        System.out.println("Introduce la contraseña");
        String password = sc.nextLine();

        user = new User(username,email,password);

        DBAccess.addUser(user);
    }*/


    }

}
