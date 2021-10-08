package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String access = "jdbc:ucanaccess://src/ventas.accdb";
           // String myBD = "jdbc:mysql://localhost:3306/sistemaventa?serverTimezone=UTC";
            con = DriverManager.getConnection(access);
            //con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
/*public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/sistemaventa?serverTimezone=UTC";
            //usuario y contraseña
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            //capturaos el error que se pueda producir
            System.out.println(e.toString());

        }
        //con esto eliminamos ese error
        return null;
    }
}*/
