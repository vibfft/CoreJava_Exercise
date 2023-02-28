package com.vibfft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;

public class SQLExercise extends Exercise {

    ExType type;
    ExLevel level;

    SQLExercise() {
        type = ExType.SCANNER;
        level = ExLevel.EASY;
    }

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/characters";
        String username = "root";
        String password = "mn12Mysql!";

        int batchSize = 20;

        Connection connection = null;

        try {

            //connection = DriverManager.getConnection(jdbcURL, username, password);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name?user=root&password=mn12Mysql!&serverTimezone=UTC");
            connection.setAutoCommit(false);

            String sql = "INSERT INTO characters (character_id, character_name, universe_id) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            SQLExercise s = new SQLExercise();
            InputStream is = s.getClass().getClassLoader().getResourceAsStream("characters.csv");
            BufferedReader lineReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String lineText;

            int count = 0;

            lineReader.readLine(); // skip header line

            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                int characterId = Integer.parseInt(data[0]);
                String characterName = data[1];
                int universeId = Integer.parseInt(data[2]);

                statement.setInt(1, characterId);
                statement.setString(2, characterName);
                statement.setInt(2, universeId);


                statement.addBatch();

                if (count % batchSize == 0) {
                    statement.executeBatch();
                }
            }

            lineReader.close();

            // execute the remaining queries
            statement.executeBatch();

            connection.commit();
            connection.close();

        } catch (IOException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            ex.printStackTrace();

            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
