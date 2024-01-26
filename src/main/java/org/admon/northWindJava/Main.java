package org.admon.northWindJava;

import org.admon.northWindJava.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dbName = "northWind";
        String userName = "postgres";
        String password = "**********";

        String URL = "jdbc:postgresql://localhost:5432/" + dbName;

        Database database = new Database(
                URL,
                userName,
                password);


        Connection databaseConnection = database.getConnection();
        PreparedStatement preparedStatement = databaseConnection.prepareStatement("SELECT * FROM getegories");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String dinoName = resultSet.getString("category_name");
            System.out.println(dinoName);
        }
    }
}