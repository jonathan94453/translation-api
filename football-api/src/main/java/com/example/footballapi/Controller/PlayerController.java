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
 
private PlayerDataStorage getstorageobject() {
  PlayerDataStorage getplayerinfo = new PlayerDataStorage(); 
  return getplayerinfo; 
}

@GetMapping("player/allplayers")
public ArrayList<Player> getPlayerDatabase() {
 
    return getstorageobject().getPlayerDataset(); 
}





@GetMapping("player/Playerteam/{playerName}") 
public Map<String, String>  getPlayerTeam(@PathVariable String playerName) {
String team = getstorageobject().getPlayerTeam(playerName); 

    Map<String, String> response = new HashMap<>();
    response.put("team", team);

    return response;

} 

@GetMapping("player/PlayerBirthdate/{playerName}") 
public Map<String, String> sendbirthdate(@PathVariable String playerName) {
  String birthdate = getstorageobject().getPlayerBirthdate(playerName); 
  Map<String, String> response = new HashMap<>(); 
response.put("Birthdate", birthdate); 


  return response; 
}

@GetMapping("player/PlayerHeight/{playerName}") 
public Map<String, String> sendHeight(@PathVariable String playerName) {
  String height = getstorageobject().getPlayerHeight(playerName); 
  Map<String, String> jsonresponse = new HashMap<>(); 
  jsonresponse.put("Height", height); 
  return jsonresponse; 
}


@GetMapping("player/PlayerPosition/{playerName}") 
public Map<String, String> sendpos(@PathVariable String playerName) {
  String pos = getstorageobject().getPlayerPosition(playerName); 
  Map<String, String> jsonresponse = new HashMap<>(); 
  jsonresponse.put("Position", pos); 
  return jsonresponse; 
}




} 