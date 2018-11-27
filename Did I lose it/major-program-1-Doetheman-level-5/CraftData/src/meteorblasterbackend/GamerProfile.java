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
public class GamerProfile {

    private String firstname;
    private String lastname;
    private String gamerID;
    private int gamerRank;
    private int gamesPlayed;
    private int torpedosFired;
    private int meteorsHit;
    private int highScore;
    private int totalScore;

    public GamerProfile() {
        firstname = " ";
        lastname = " ";
        gamerID = " ";
        gamerRank = 0;
        gamesPlayed = 0;
        torpedosFired = 0;
        meteorsHit = 0;
        highScore = 0;
        totalScore = 0;
    }

    /**
     * @return the Firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the gamerID
     */
    public String getGamerId() {
        return gamerID;
    }

    /**
     * @param gamerId the gamerID to set
     */
    public void setGamerId(String gamerId) {
        this.gamerID = gamerId;
    }

    /**
     * @return the gamerRank
     */
    public int getGamerRank() {
        return gamerRank;
    }

    /**
     * @param gamerRank the gamerRank to set
     */
    public void setGamerRank(int gamerRank) {
        this.gamerRank = gamerRank;
    }

    /**
     * @return the gamesPlayed
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * @param gamesPlayed the gamesPlayed to set
     */
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    /**
     * @return the torpedosFired
     */
    public int getTorpedoesFired() {
        return torpedosFired;
    }

    /**
     * @param torpedosFired the torpedosFired to set
     */
    public void setTorpedoesFired(int torpedosFired) {
        this.torpedosFired = torpedosFired;
    }

    /**
     * @return the meteorsHit
     */
    public int getMeteorsHit() {
        return meteorsHit;
    }

    /**
     * @param meteorsHit the meteorsHit to set
     */
    public void setMeteorsHit(int meteorsHit) {
        this.meteorsHit = meteorsHit;
    }

    /**
     * @return the highScore
     */
    public int getHighScore() {
        return highScore;
    }

    /**
     * @param highScore the highScore to set
     */
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    /**
     * @return the totalScore
     */
    public int getTotalScore() {
        return totalScore;
    }

    /**
     * @param totalScore the totalScore to set
     */
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {

        return firstname + ", " + lastname + ", " + gamerID + System.lineSeparator()
                + gamerRank + " " + gamesPlayed + " " + torpedosFired+" "
                + meteorsHit + " " + highScore + " " + totalScore + System.lineSeparator();
    }

}
