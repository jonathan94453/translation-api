package com.example.footballapi.Storage; 
import org.springframework.stereotype.Component;

import com.example.footballapi.Model.Player;

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
        reader = new BufferedReader(new FileReader("C:\\Jonathan94453\\football-api\\football-api\\data\\EPL player stats - Sheet1.csv")); 
        String line; 

        while((line = reader.readLine()) != null  ) {
            String[] values = line.split(","); 
            String playerName = values[0]; 
            String playerTeam = values[1]; 
            String playerBirthday = values[2]; 
            String playerHeight = values[3]; 
            String playerPosition = values[4]; 


            Player player = new Player(playerName, playerTeam, playerBirthday, playerHeight, playerPosition); 
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



// return height; 
public String getPlayerTeam(String target) {

ArrayList<Player> playerlist = getPlayerDataset(); 
String targetTeam = ""; 
for(int i = 0; i < playerlist.size(); i++) {
    Player currentPlayer = playerlist.get(i);  
    if(currentPlayer.getName().equals(target)) {
       targetTeam = currentPlayer.getTeam(); 
        break;  
    }
}

if(targetTeam.isEmpty()) {
    return "did not find"; 
}

return targetTeam; 

} 


// Get player birthdate
            public String getPlayerBirthdate(String target) {

                ArrayList<Player> playerlist = getPlayerDataset(); 
                String targetBirthdate = ""; 
                for(int i = 0; i < playerlist.size(); i++) {
                    Player currentPlayer = playerlist.get(i);  
                    if(currentPlayer.getName().equals(target)) {
                       targetBirthdate= currentPlayer.getbirthdate(); 
                        break;  
                    }
                }
                
                if(targetBirthdate.isEmpty()) {
                    return "did not find"; 
                }
                
                return targetBirthdate; 
                
                
                }

// Get Player Height
public String getPlayerHeight(String target) {
    ArrayList<Player> playerlist = getPlayerDataset(); 
String playerheight = "";
for(int i = 0; i < playerlist.size();) {
    Player current  = playerlist.get(i);
    System.out.println("Comparing" + playerlist.get(i) + "with" + target);
    if(current.getName().equals(target)) {
        playerheight = current.getHeight();
        break; 
    }
    else {
        return "Error: Did not find"; 
    }
}

return playerheight; 

}

// Get Player Position 

public String getPlayerPosition(String target) {
    ArrayList<Player> playerlist = getPlayerDataset(); 
    String playerposition = ""; 
    for(int i = 0; i < playerlist.size();) {
        Player index = playerlist.get(i); 
        if(index.getName().equals(target)) {
            playerposition = index.getPosition(); 
            break;
        } 
        else {
            return "did not find"; 
        }
    }
    return playerposition; 
}





}