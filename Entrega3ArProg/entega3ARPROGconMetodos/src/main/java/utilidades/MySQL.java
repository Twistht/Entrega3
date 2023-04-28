package utilidades;

import java.sql.*;

public class MySQL {
    public void AgregarDatos(String consulta) {


        try{
            String baseDeDatos = "Entrega3";
            String usuario = "root";
            String contraseña = "12345";
            String host = "localhost";
            String puerto = "3306";
            String driver = "com.mysql.jdbc.Driver";
            String conexionUrl = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDeDatos + "?useSSL=false";

            Class.forName(driver);
            Connection con= DriverManager.getConnection(conexionUrl, usuario, contraseña);
            PreparedStatement stmt1 = con.prepareStatement(consulta);
            stmt1.execute(consulta);

            System.out.println("¡Los datos se han añadido correctamente!");


        } catch (SQLException e) {
            System.out.println("Error en la ejecucion de la consulta SQL" + e.getMessage());

        } catch (ClassNotFoundException e) {

            System.out.println("Error al cargar el drive JDBCL" + e.getMessage());
        }
    }
    public void MostrarDatos(String consulta) throws ClassNotFoundException {

        String baseDeDatos = "Entrega3";
        String usuario = "root";
        String contraseña = "12345";
        String host = "localhost";
        String puerto = "3306";
        String driver = "com.mysql.jdbc.Driver";
        String conexionUrl = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDeDatos + "?useSSL=false";

        try {

            Class.forName(driver);
            Connection con = DriverManager.getConnection(conexionUrl, usuario, contraseña);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumnas = rsmd.getColumnCount();

            // Imprimir nombres de las columnas
            for (int i = 1; i <= numColumnas; i++) {
                System.out.printf("%-17s", rsmd.getColumnName(i));
            }

            System.out.println();

            // Imprimir separadores de columna
            for (int i = 1; i <= numColumnas; i++) {
                System.out.print("------------------");
            }

            System.out.println();

            //imprime los valores de las filas
            while (rs.next()) {
                for (int i = 1; i <= numColumnas; i++) {
                    System.out.printf("%-17s", rs.getString(i));
                }

                System.out.println();

            }

        } catch (SQLException e) {

            System.out.println("Error al ejecutar la consulta: " + e.getMessage());

        }

    }

}
