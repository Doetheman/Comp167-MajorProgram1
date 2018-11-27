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
public class GamerProfileCollection {

    private String filename;//value 1 of type string
    private GamerProfile selectedProfile; //value 2 of type GamerProfile
    private GamerProfile highGameProfile;//value 3 of type GamerProfile
    private ArrayList<GamerProfile> gamerProfile;//value 4 is an array list

    public GamerProfileCollection() {
        filename = "";
        selectedProfile = new GamerProfile();
        highGameProfile = new GamerProfile();
        gamerProfile = new ArrayList<>();
    }

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param filename the filename to set
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * @return the selectedProfile
     */
    public GamerProfile getSelectedProfile() {
        return selectedProfile;
    }

    /**
     * @param selectedProfile the selectedProfile to set
     */
    public void setSelectedProfile(GamerProfile selectedProfile) {
        this.selectedProfile = selectedProfile;
    }

    /**
     * @return the highGameProfile
     */
    public GamerProfile getHighGameProfile() {
        return highGameProfile;
    }

    /**
     * @param highGameProfile the highGameProfile to set
     */
    public void setHighGameProfile(GamerProfile highGameProfile) {
        this.highGameProfile = highGameProfile;
    }

    public void addGamerProfile(GamerProfile Gamer) {
        getGamerProfile().add(Gamer);
    }
     /**
     * @return the gamerProfile
     */
    public ArrayList<GamerProfile> getGamerProfile() {
        return gamerProfile;
    }
       
    /**
     * @param gamerProfile the gamerProfile to set
     */
    public void setGamerProfile( ArrayList<GamerProfile> gamerProfile) {
        this.gamerProfile = gamerProfile;
    }
    
    public int getNumGamerProfiles(){
        return gamerProfile.size();
    }
    
    public GamerProfile getGamerProfile( int index) {
        return gamerProfile.get(index);
    }
    
    public void setGamerProfile( int index, GamerProfile item){
         this.gamerProfile.set(index, item);
    }

   public GamerProfile deleteGamerProfile( int index){
       return gamerProfile.remove(index);
   }
            
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < getGamerProfile().size(); i++) {
            output += getGamerProfile().get(i).toString();
        }
        return output;
    }
}
