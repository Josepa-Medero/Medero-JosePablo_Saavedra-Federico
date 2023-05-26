package com.backendParcial.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class H2Connection {

    private static final String CREATE = "DROP TABLE IF EXISTS ODONTOLOGO; CREATE TABLE ODONTOLOGO( NUMERO MATRICULA VARCHAR(100) NOT NULL, NOMBRE VARCHAR(100) NOT NULL, APELLIDO VARCHAR(100) NOT NULL)";

    public static void crearTabla() {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement st = connection.createStatement();
            st.execute(CREATE);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/C9Parcial", "sa", "sa");

    }
}