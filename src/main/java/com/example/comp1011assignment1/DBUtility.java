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
                int gameId=resultSet.getInt("gameId");
                int gameDuration=resultSet.getInt("gameDuration");
                int seasonId = resultSet.getInt("seasonId");
                int winner = resultSet.getInt("winner");
                int firstBlood = resultSet.getInt("firstBlood");
                int firstTower = resultSet.getInt("firstTower");
                int firstInhibitor = resultSet.getInt("firstInhibitor");
                int firstBaron = resultSet.getInt("firstBaron");
                int firstDragon = resultSet.getInt("firstDragon");
                int firstRiftHerald = resultSet.getInt("firstRiftHerald");

                try {
                    Match match = new Match(gameId,gameDuration,seasonId,winner,firstBlood,firstTower,firstInhibitor,firstDragon,firstBaron,firstRiftHerald);
                    matches.add(match);
                }
                catch (IllegalArgumentException e){
                    System.out.println("Match was not valid");
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return matches;
    }
}
