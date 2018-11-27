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
public class RankData {

    private ArrayList<Rank> ranks;

    public RankData() {
        ranks = new ArrayList<>();
    }
    public void setRank( ArrayList<Rank> sr){
        ranks = sr;
    }
    public int getRankNum() {
        return ranks.size();
    }

    public Rank getRank(int index) {
        return ranks.get(index);
    }

    public void setRank(int index, Rank setRank) {
        ranks.add(index, setRank);
    }

    public void addRanks(Rank addRank) {
        ranks.add(addRank);
    }

    public Rank deleteRank(int index) {
        ranks.remove(index);
        return ranks.get(index);
    }
    public int getNumRanks(){
        return ranks.size();
    }

    @Override
    public String toString() {

        String output = "";
        for (int i = 0; i < ranks.size(); i++) {
            output += ranks.get(i).toString();
        }
        return output;
    }
}
