package com.example.footballapi.Model;

public class Player {
    private String birthdate; 
    private String Name; 
    private String team; 
    private String height; 
    private String position; 


public Player(String Name, String team, String birthdate, String height, String position) {
    this.Name = Name; 
    this.team = team; 
    this.birthdate = birthdate; 
    this.height = height; 
    this.position = position; 
} 




public String getbirthdate() {
    return birthdate; 
} 

public String getName() {
    return Name; 
} 

public String getTeam() {
    return team; 
}

public String getHeight() {
    return height; 
} 

public String getPosition() {
    return position; 
}










}
