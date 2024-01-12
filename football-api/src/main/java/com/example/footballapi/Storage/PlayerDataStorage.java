package main.java.com.example.footballapi.Storage; 
import org.springframework.stereotype.Component;

import main.java.com.example.footballapi.Model.Player;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


@Component 
public class PlayerDataStorage {

      public ArrayList<Player> getPlayerDataset() {
        ArrayList<Player> players = new ArrayList<>(); 
       BufferedReader reader = null; 
       try {
        reader = new BufferedReader(new FileReader("C:\\Jonathan94453\\translation-api\\football-api\\data\\EPL player stats - Sheet1.csv")); 
        String line; 

        while((line = reader.readLine()) != null  ) {
            String[] values = line.split(","); 
            String playername = values[0]; 
            String Playerteam = values[1]; 
            int PlayerAge = values[2]; 

            Player player = new Player(playername, Playerteam, PlayerAge); 





            players.add(player); 
        }
    }catch (IOException e){ 
        e.printStackTrace();
       } finally {
        if(reader != null) {
            try {
                reader.close(); 
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       } 
 return players;  
    }















}
