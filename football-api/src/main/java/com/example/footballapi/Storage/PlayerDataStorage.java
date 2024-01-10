package main.java.com.example.footballapi.Storage; 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PlayerDataStorage {
    public ArrayList<String[]> getPlayerDataset() {
        ArrayList<String[]> dataset = new ArrayList<>(); 
       BufferedReader reader = null; 
       try {
        reader = new BufferedReader(new FileReader("C:\\Jonathan94453\\translation-api\\translation-api\\data\\EPL player stats - Sheet1.csv")); 
        String line; 

        while((line = reader.readLine()) != null  ) {
            String[] values = line.split(","); 
            dataset.add(values); 
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
 return dataset; 
    }
}
