/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterbackend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Doetheman
 */
public class MeteorIO {

    /**
     *
     * @param configFile
     * @return
     */
    public static MeteorConfigData readConfigFile(String configFile) {
        
        MeteorConfigData info = new MeteorConfigData();

        try {

            Scanner scan = new Scanner(new File(configFile));

            info.setRankData(readRankData(scan));
            info.setSoundData(readSoundData(scan));
            info.setLevelData(readLevelData(scan));
            info.setCraftData(readCraftData(scan));
            info.setMeteorData(readMeteorData(scan));
            info.setExplosionData(readExplosionData(scan));
        } catch (FileNotFoundException ex) {
            System.exit(-1);
        }
        return info;
    }

    private static RankData readRankData(Scanner scan) {
        
        RankData rankD = new RankData();
        String[] store = scan.nextLine().split(",");
        while (!store[0].equals("*")) {
            Rank rank = new Rank();
            
            rank.setRankId(Integer.parseInt(store[0].trim()));
            rank.setRankName(store[1].trim());
            rank.setPointsNeeded(Integer.parseInt(store[2].trim()));
            rankD.addRanks(rank);
            store = scan.nextLine().split(",");
        }

        return rankD;
    }

    private static SoundData readSoundData(Scanner scan) {
        SoundData SD = new SoundData();
        for (int i = 0; i < 5; i++) {
            String x = scan.nextLine().trim();
            SD.setSoundResource(i, x);
        }
        return SD;
        
    }
    
    
    private static LevelData readLevelData(Scanner scan) {

        LevelData Ld = new LevelData();
        String[] data = scan.nextLine().split(",");
        while (!data[0].equals("*")) {
            Level lvl = new Level();
            
            lvl.setLevelRangeMin(Integer.parseInt(data[0].trim()));
            lvl.setLevelRangeMax(Integer.parseInt(data[1].trim()));
            lvl.setMaxMeteorSpeed(Double.parseDouble(data[2].trim()));
            lvl.setNumMeteors(Integer.parseInt(data[3].trim()));
            lvl.setLevelBackgroundImage(data[4].trim());
            Ld.addLevels(lvl);
            data = scan.nextLine().split(",");
        }
        
        return Ld;
    }

    private static CraftData readCraftData(Scanner scan) {
        CraftData CD = new CraftData();

        String[] readED = scan.nextLine().trim().split(",");

        for (int i = 0; i < readED.length; i++) {
            CD.addImageFiles(readED[i].trim());
        }
        CD.getPhaserSoundFile(scan.nextLine().trim());
        CD.setThrustIncreaseAmount(scan.nextDouble());
        CD.setThrustDecreaseAmount(scan.nextDouble());
        CD.setMaxSpeed(scan.nextDouble());
        scan.nextLine();

        return CD;
    }

    private static MeteorData readMeteorData(Scanner scan) {
        MeteorData MD = new MeteorData();

        MD.setMeteorSpriteFile(scan.nextLine().trim());
        MD.setMinSize(scan.nextInt());
        MD.setMeteorCols(scan.nextInt());
        MD.setMeteorRows(scan.nextInt());
        MD.setMaxSpeed(scan.nextDouble());
        scan.nextLine();

        return MD;
    }

    private static ExplosionData readExplosionData(Scanner scan) {
        ExplosionData ED = new ExplosionData();

        ED.setExplosionSpriteFile(scan.nextLine().trim());
        ED.setExplosionCols(scan.nextInt());
        ED.setExplosionRows(scan.nextInt());

        return ED;
    }

    public static GamerProfileCollection readGamerProfileData(String gamerDataFile) {
        GamerProfileCollection GPC = new GamerProfileCollection();

        Scanner scan;
        try {
            scan = new Scanner(new File(gamerDataFile));
            while (scan.hasNextLine()) {
                GamerProfile GP = new GamerProfile();
                String[] names = scan.nextLine().split(",");
                System.out.println(java.util.Arrays.toString(names));
                GP.setFirstname(names[0]);
                GP.setLastname(names[1]);
                GP.setGamerId(names[2]);
                String[] score = scan.nextLine().split(" ");
                GP.setGamerRank(Integer.parseInt(score[0]));
                GP.setGamesPlayed(Integer.parseInt(score[1]));
                GP.setTorpedoesFired(Integer.parseInt(score[2]));
                GP.setMeteorsHit(Integer.parseInt(score[3]));
                GP.setHighScore(Integer.parseInt(score[4]));
                GP.setTotalScore(Integer.parseInt(score[5]));
                GPC.addGamerProfile(GP);

            }
        } catch (FileNotFoundException ex) {
            
        }
        return GPC;

    }

    /**
     *
     * @param GPC
     */
    public static void writeGamerProfileData(GamerProfileCollection GPC) {

        try {
            PrintWriter out = new PrintWriter(new File("config/gameData.txt"));
            out.print(GPC.toString());
            out.close();

        } catch (IOException ex) {

        }

    }
}
