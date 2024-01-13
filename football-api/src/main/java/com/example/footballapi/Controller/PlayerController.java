package com.example.footballapi.Controller;

import com.example.footballapi.Model.Player;
import com.example.footballapi.Storage.PlayerDataStorage; 

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map; 

     

@RestController
public class PlayerController {
 


@GetMapping("/api/player/allplayers")
public ArrayList<Player> getPlayerDatabase() {
  PlayerDataStorage playerdatastorage = new PlayerDataStorage(); 
    return playerdatastorage.getPlayerDataset(); 
}





@GetMapping("api/player/Playerteam/{playerName}") 
public Map<String, String>  getPlayerInformation(@PathVariable String playerName) {
  PlayerDataStorage getplayerinfo = new PlayerDataStorage(); 
 String team = getplayerinfo.getPlayerTeam(playerName);

    Map<String, String> response = new HashMap<>();
    response.put("team", team);

    return response;

}
} 