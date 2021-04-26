
package password;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author danyx25
 */
public class Password {
    private static  Connection conexion;
    //DECLARAMOS LOS DATOS DE CONEXION (DATOS STRING PARA INSERTAR VALORES DE ESE TIPO):
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "0980929395";
    private static final String url = "jdbc:mysql://localhost:3306/gestionPassword? useUnicode=true&use"
            + " JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    //METODO CONECTOR
    public static Connection conectarBaseDatos() {
        //RESETEAMOS A NULL LA CONEXION A LA RED
        
        conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //NOS CONECTAMOS A LA BD
            conexion = (Connection) DriverManager.getConnection(url, user, pass);
            //COMPROBAR LA CONEXION:
            if (conexion != null) {
                System.out.println("Conexion Exitosa");

            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion " + e.getMessage());

        }
        return conexion;
    }
   
}

