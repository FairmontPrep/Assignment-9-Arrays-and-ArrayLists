import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class RecordTest {
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

    @DisplayName("record Test 1")
    @Test
    void record_Test01() {
        ScoreStats ss = new ScoreStats(createList());
        assertTrue(!ss.record(60));
        ScoreInfo si = ss.getList().get(1);
        boolean correctIndex = (si.getScore() == 60);
        int resultFreq = si.getFrequency();
        int expectedFreq = 2;
        assertTrue(correctIndex);
        assertEquals(expectedFreq, resultFreq);
    }

    @DisplayName("record Test 2")
    @Test
    void record_Test02() {
        ScoreStats ss = new ScoreStats(createList());
        assertTrue(ss.record(40));
        ScoreInfo si = ss.getList().get(0);
        boolean correctIndex = (si.getScore() == 40);
        int resultFreq = si.getFrequency();
        int expectedFreq = 1;
        assertTrue(correctIndex);
        assertEquals(expectedFreq, resultFreq);
    }

    @DisplayName("record Test 3")
    @Test
    void record_Test03() {
        ScoreStats ss = new ScoreStats(createList());
        assertTrue(ss.record(100));
        ScoreInfo si = ss.getList().get(5);
        boolean correctIndex = (si.getScore() == 100);
        int resultFreq = si.getFrequency();
        int expectedFreq = 1;
        assertTrue(correctIndex);
        assertEquals(expectedFreq, resultFreq);
    }

    @DisplayName("record Test 4")
    @Test
    void record_Test04() {
        ScoreStats ss = new ScoreStats(createList());
        assertTrue(!ss.record(90));
        ScoreInfo si = ss.getList().get(4);
        boolean correctIndex = (si.getScore() == 90);
        int resultFreq = si.getFrequency();
        int expectedFreq = 5;
        assertTrue(correctIndex);
        assertEquals(expectedFreq, resultFreq);
    }

    @DisplayName("record Test 5")
    @Test
    void record_Test05() {
        ScoreStats ss = new ScoreStats(createList());
        assertTrue(ss.record(85));
        ScoreInfo si = ss.getList().get(4);
        boolean correctIndex = (si.getScore() == 85);
        int resultFreq = si.getFrequency();
        int expectedFreq = 1;
        assertTrue(correctIndex);
        assertEquals(expectedFreq, resultFreq);
    }

    @DisplayName("record Test 6")
    @Test
    void record_Test06() {
        ScoreStats ss = new ScoreStats(createList());
        assertTrue(!ss.record(80));
        ScoreInfo si = ss.getList().get(3);
        boolean correctIndex = (si.getScore() == 80);
        int resultFreq = si.getFrequency();
        int expectedFreq = 4;
        assertTrue(correctIndex);
        assertEquals(expectedFreq, resultFreq);
    }
}
