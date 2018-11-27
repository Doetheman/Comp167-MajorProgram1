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
public class MeteorConfigData {

    private CraftData craftData;
    private MeteorData meteorData;
    private ExplosionData explosionData;
    private RankData rankData;
    private SoundData SoundData;
    private LevelData levelData;

    public MeteorConfigData() {

        craftData = new CraftData();
        meteorData = new MeteorData();
        explosionData = new ExplosionData();
        rankData = new RankData();
        levelData = new LevelData();
        SoundData = new SoundData();
    }

    public CraftData getCraftData() {
        return craftData;
    }

    public void setCraftData(CraftData cData) {
        craftData = cData;
    }

    public MeteorData getMeteorData() {
        return meteorData;
    }

    public void setMeteorData(MeteorData mData) {
        meteorData = mData;
    }

    public ExplosionData getExplosionData() {
        return explosionData;
    }

    public void setExplosionData(ExplosionData eData) {
        explosionData = eData;
    }

    public RankData getRankData() {
        return rankData;
    }

    public void setRankData(RankData rData) {
        rankData = rData;
    }

    public LevelData getLevelData() {
        return levelData;
    }

    public void setLevelData(LevelData lData) {
        levelData = lData;
    }

    @Override
    public String toString() {
        String ls = System.lineSeparator();
        return rankData + "|" + SoundData +"|"+ levelData+"|"+craftData + "|" + meteorData + "|" + explosionData ;

    }

    /**
     * @return the SoundData
     */
    public SoundData getSoundData() {
        return SoundData;
    }

    /**
     * @param SoundData the SoundData to set
     */
    public void setSoundData(SoundData SoundData) {
        this.SoundData = SoundData;
    }

}
