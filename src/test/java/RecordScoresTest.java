import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class RecordScoresTest {
    private ArrayList<ScoreInfo> createList() {
        ArrayList<ScoreInfo> scList = new ArrayList<>(Arrays.asList(
            new ScoreInfo(50),
            new ScoreInfo(60),
            new ScoreInfo(70),
            new ScoreInfo(80),
            new ScoreInfo(90)));
            scList.get(2).increment();
            scList.get(3).increment();
            scList.get(3).increment();
            scList.get(4).increment();
            scList.get(4).increment();
            scList.get(4).increment();
        return scList;
    }

    @DisplayName("recordScores Test 1")
    @Test
    void recordScores_Test01() {
        ScoreStats ss = new ScoreStats(createList());
        int[] scores = {60, 70, 55, 100};
        ss.recordScores(scores);
        ScoreInfo si1 = ss.getList().get(1);
        ScoreInfo si2 = ss.getList().get(6);
        assertTrue(si1.getScore() == 55);
        assertTrue(si2.getScore() == 100);
    }

    @DisplayName("recordScores Test 2")
    @Test
    void recordScores_Test02() {
        ScoreStats ss = new ScoreStats(createList());
        int[] scores = {85, 60, 23, 50};
        ss.recordScores(scores);
        ScoreInfo si1 = ss.getList().get(0);
        ScoreInfo si2 = ss.getList().get(5);
        assertTrue(si1.getScore() == 23);
        assertTrue(si2.getScore() == 85);
    }

    @DisplayName("recordScores Test 3")
    @Test
    void recordScores_Test03() {
        ScoreStats ss = new ScoreStats(createList());
        int[] scores = {60, 60, 45, 65};
        ss.recordScores(scores);
        ScoreInfo si1 = ss.getList().get(0);
        ScoreInfo si2 = ss.getList().get(3);
        assertTrue(si1.getScore() == 45);
        assertTrue(si2.getScore() == 65);
    }

    @DisplayName("recordScores Test 4")
    @Test
    void recordScores_Test04() {
        ScoreStats ss = new ScoreStats(createList());
        int[] scores = {65, 95, 70, 85, 104};
        ss.recordScores(scores);
        ScoreInfo si1 = ss.getList().get(5);
        ScoreInfo si2 = ss.getList().get(8);
        assertTrue(si1.getScore() == 85);
        assertTrue(si2.getScore() == 104);
    }
}
