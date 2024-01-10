package com.example.footballapi.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.footballapi.Storage.PlayerDataStorage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("api/player")
public class PlayerController {
  private final PlayerDataStorage playerdatastorage; 
  

@Autowired
public PlayerController(PlayerDataStorage playerdatastorage) {
    this.playerdatastorage = playerdatastorage; 
}

@GetMapping("api/player/allplayers")
public ArrayList<String> getPlayerDatabase() {
    return playerdatastorage.getPlayerDataset(); 
}

}
