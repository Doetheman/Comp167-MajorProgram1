/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterbackend;
import java.io.File;


/**
 *
 * @author Doetheman
 */
public class meteorblasterbackend {

    /**
      public static void main(String[] args){
     
     GamerProfile test1 = new GamerProfile(); 
     GamerProfile test2 = new GamerProfile(); 
     GamerProfile test3 = new GamerProfile();
     GamerProfileCollection Collect = new GamerProfileCollection();
     Collect.addGamerProfile(test1);
     Collect.addGamerProfile(test2);
     Collect.addGamerProfile(test3); 
     System.out.print(Collect.toString()); 
      }
     * @param args
     */
  
    /**
    public static void main(String[] args) {
        
        GamerProfile test = new GamerProfile();
        MeteorIO data = new MeteorIO(); 
        GamerProfileCollection x = data.readGamerProfileData(args[0]);
         data.writeGamerProfileData( x);
        System.out.println(x.toString());
      

        System.out.println();
    }
    
    
    public static void main(String[] args){
        SoundData test = new SoundData();
        System.out.println(test.toString());
    }
   */
    public static void main (String[] args){
        MeteorIO MO = new MeteorIO();
        MeteorConfigData test = new MeteorConfigData();
        test = MO.readConfigFile("meteorBlasterConfig.txt");
        
        System.out.println(test.toString());
    }
}
