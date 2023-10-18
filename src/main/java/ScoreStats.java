import java.util.ArrayList;

public class ScoreStats {
    private ArrayList<ScoreInfo> scoreList;

    public ScoreStats (ArrayList<ScoreInfo> newList) {
        scoreList = newList;
    }

    public ArrayList<ScoreInfo> getList() {
        return scoreList;
    }

    /* COMPLETE THIS METHOD
     * Records a score in the database, keeping the database in increasing score 
     * order. If no other ScoreInfo object represents score, a new ScoreInfo 
     * object representing score is added to the database; otherwise, the 
     * frequency in the ScoreInfo object representing score is incremented.
     * @param score a score to be recorded in the list
     * @return true if a new ScoreInfo object representing score was added to 
     *          the list; false otherwise
     */
    public boolean record(int score) {
        // Insert your code below

        
        return false;
    }

    /* COMPLETE THIS METHOD
     * Records all scores in studentScores in the database, keeping the database 
     * in increasing score order
     * @param studentScores an array of student test scores
     */
    public void recordScores(int[] studentScores) {
        // Insesrt your code below


    }
}
