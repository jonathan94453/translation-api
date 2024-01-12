package main.java.com.example.footballapi.Model;

public class Player {
    private int age; 
    private String Name; 
    private String team; 



public Player(String Name, String team, int age) {
    this.Name = Name; 
    this.team = team; 
    this.age = age; 
} 




public int getAge() {
    return age; 
} 

public String getName() {
    return Name; 
} 

public String getTeam() {
    return team; 
}











}
