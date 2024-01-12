package com.example.footballapi.Controller;

import main.java.com.example.footballapi.Model.Player;
import main.java.com.example.footballapi.Storage.PlayerDataStorage; 

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList; 

     

@RestController
public class PlayerController {
 


@GetMapping("/api/player/allplayers")
public ArrayList<Player> getPlayerDatabase() {
  PlayerDataStorage playerdatastorage = new PlayerDataStorage(); 
    return playerdatastorage.getPlayerDataset(); 
}





// @GetMapping("api/player/{playerName}") 
// public String getPlayerInformation(@PathVariable String playerName) {
//   PlayerDataStorage getplayerinfo = new PlayerDataStorage(); 
//   return getplayerinfo.getInfobyPlayerName(playerName); 
// }

}
         