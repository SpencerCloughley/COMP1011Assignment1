package com.example.comp1011assignment1;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeSet;

public class DBUtility {
    private static String user = "Spencerlaksrclough";
    private static String password = "cHZFbQmpR4";
    private static String connectUrl = "jdbc:mysql://172.31.22.43:3306/Spencerlaksrclough";

    public static ArrayList<Match> getMatches(){
        ArrayList<Match> matches = new ArrayList<>();
        String sql = "SELECT * FROM games";
        String responseMsg;
        try(
                Connection conn = DriverManager.getConnection(connectUrl, user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()){

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



        return matches;
    }
}
