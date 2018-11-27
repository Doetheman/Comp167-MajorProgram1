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
public class CraftData {

    private ArrayList<String> imageFiles ;
    private String phaserSoundFile;
    private double thrustIncreaseAmount;
    private double thrustDecreaseAmount;
    private double maxSpeed;

    public CraftData() {
        imageFiles = new ArrayList<>();
        phaserSoundFile = "";
        thrustIncreaseAmount = 0;
        thrustDecreaseAmount = 0;
        maxSpeed = 0;
    }

    public String getPhaserSoundFile() {
        return phaserSoundFile;
    }

    /**
     * @param phaserSouldFile the phaserSouldFile to set
     */
    public void setPhaserSoundFile(String phaserSouldFile) {
        this.phaserSoundFile = phaserSouldFile;
    }

    /**
     * @return the thrustIncreaseAmount
     */
    public double getThrustIncreaseAmount() {
        return thrustIncreaseAmount;
    }

    /**
     * @param thrustIncreaseAmount the thrustIncreaseAmount to set
     */
    public void setThrustIncreaseAmount(double thrustIncreaseAmount) {
        this.thrustIncreaseAmount = thrustIncreaseAmount;
    }

    /**
     * @return the thrustDecreaseAmount
     */
    public double getThrustDecreaseAmount() {
        return thrustDecreaseAmount;
    }

    /**
     * @param thrustDecreaseAmount the thrustDecreaseAmount to set
     */
    public void setThrustDecreaseAmount(double thrustDecreaseAmount) {
        this.thrustDecreaseAmount = thrustDecreaseAmount;
    }

    /**
     * @return the maxSpeed
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @param maxSpeed the maxSpeed to set
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;   
    }
        public void setImageFile(ArrayList<String> Files) {
        setImageFiles(Files);
    }
    
    public void addImageFiles( String item) {
        imageFiles.add(item);
    }
              
    public String getImageFile( int index) {
        return getImageFiles().get(index);
    }
    
    public void setImageFiles( int index, String item){
        this.getImageFiles().set(index, item);
    }

   public String deleteImageFiles( int index){
       return getImageFiles().remove(index);
   }

    @Override
    public String toString() {
        String image = " ";
        String ls = System.lineSeparator();
        for(int i =0; i < imageFiles.size();i++){
            image+= imageFiles.get(i);
        }
        return image+ls+ phaserSoundFile +"|" +ls+ thrustIncreaseAmount + "|"+ thrustDecreaseAmount + "|" + maxSpeed+ls;
    }

    /**
     * @return the imageFiles
     */
    public ArrayList<String> getImageFiles() {
        return imageFiles;
    }

    /**
     * @param imageFiles the imageFiles to set
     */
    public void setImageFiles(ArrayList<String> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public void getPhaserSoundFile(String trim) {
       phaserSoundFile = trim; 
    }
    public int getNumImageFiles(){
        return imageFiles.size();
    }

}
