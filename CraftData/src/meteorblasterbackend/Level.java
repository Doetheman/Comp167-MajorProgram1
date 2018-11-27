/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterbackend;

/**
 *
 * @author Doetheman
 */
public class Level {
    private int levelRangeMin;
    private int levelRangeMax;
    private double maxMeteorSpeed;
    private int numMeteors;
    private String levelBackgroundImage;
    
    /**
     *
     */
    public Level(){
        levelRangeMin = 0;
        levelRangeMax = 0;
        maxMeteorSpeed = 0.0;
        numMeteors = 0;
        levelBackgroundImage = " ";
    }

    /**
     * @return the levelRangeMin
     */
    public int getLevelRangeMin() {
        return levelRangeMin;
    }

    /**
     * @param levelRangeMin the levelRangeMin to set
     */
    public void setLevelRangeMin(int levelRangeMin) {
        this.levelRangeMin = levelRangeMin;
    }

    /**
     * @return the levelRangeMax
     */
    public int getLevelRangeMax() {
        return levelRangeMax;
    }

    /**
     * @param levelRangeMax the levelRangeMax to set
     */
    public void setLevelRangeMax(int levelRangeMax) {
        this.levelRangeMax = levelRangeMax;
    }

    /**
     * @return the maxMeteorSpeed
     */
    public double getMaxMeteorSpeed() {
        return maxMeteorSpeed;
    }

    /**
     * @param maxMeteorSpeed the maxMeteorSpeed to set
     */
    public void setMaxMeteorSpeed(double maxMeteorSpeed) {
        this.maxMeteorSpeed = maxMeteorSpeed;
    }

    /**
     * @return the numMeteors
     */
    public int getNumMeteors() {
        return numMeteors;
    }

    /**
     * @param numMeteors the numMeteors to set
     */
    public void setNumMeteors(int numMeteors) {
        this.numMeteors = numMeteors;
    }

    /**
     * @return the levelBackgroundImage
     */
    public String getLevelBackgroundImage() {
        return levelBackgroundImage;
    }

    /**
     * @param levelBackgroundImage the levelBackgroundImage to set
     */
    public void setLevelBackgroundImage(String levelBackgroundImage) {
        this.levelBackgroundImage = levelBackgroundImage;
    }
    @Override
    public String toString(){
        String ls = System.lineSeparator();
        return levelRangeMin + ", " + levelRangeMax + ", " + maxMeteorSpeed+", "+numMeteors+", "+levelBackgroundImage+ls;
    }
}

