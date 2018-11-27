/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterbackend;

import java.util.ArrayList;

/**
 *
 * @author Doetheman
 */
public class LevelData {
    private ArrayList<Level> levels;
    
    public LevelData(){
        levels = new ArrayList<>();
    }

    /**
     * @return the levels
     */
    public ArrayList<Level> getLevels() {
        return levels;
    }

    /**
     * @param levels the levels to set
     */
    public void setLevels(ArrayList<Level> levels) {
        this.levels = levels;
    }
    
    public void addLevels(Level item) {
        levels.add(item);
    }
              
    public Level getLevel( int index) {
        return levels.get(index);
    }
    
    public void setGamerProfile( int index, Level item){
        this.levels.set(index, item);
    }

   public Level deleteLevels( int index){
       return levels.remove(index);
   }
   public int getNumLevels(){
       return levels.size();
               }
    @Override
    public String toString(){
        String output = "";
        for (int i = 0; i < levels.size(); i++) {
            output += levels.get(i).toString();
        }
        return output;
    }
}
