import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MixedWordsTest {
    
    @DisplayName("mixedWords Test 1")
    @Test
    void mixedWords_Test01() {
        String[] strs = {"apple", "pear"};
        Scrambler sc = new Scrambler(strs);
        String expected1 = "apar";
        String result1 = sc.getScrambles()[0];
        String expected2 = "peple";
        String result2 = sc.getScrambles()[1];
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("mixedWords Test 2")
    @Test
    void mixedWords_Test02() {
        String[] strs = {"apple", "pear", "plum", "pineapple"};
        Scrambler sc = new Scrambler(strs);
        String expected1 = "plapple";
        String result1 = sc.getScrambles()[2];
        String expected2 = "pineum";
        String result2 = sc.getScrambles()[3];
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("mixedWords Test 3")
    @Test
    void mixedWords_Test03() {
        String[] strs = {"parrot", "pigeon"};
        Scrambler sc = new Scrambler(strs);
        String expected1 = "pareon";
        String result1 = sc.getScrambles()[0];
        String expected2 = "pigrot";
        String result2 = sc.getScrambles()[1];
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("mixedWords Test 4")
    @Test
    void mixedWords_Test04() {
        String[] strs = {"parrot", "pigeon", "dog", "llama"};
        Scrambler sc = new Scrambler(strs);
        String expected1 = "dama";
        String result1 = sc.getScrambles()[2];
        String expected2 = "llog";
        String result2 = sc.getScrambles()[3];
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("mixedWords Test 5")
    @Test
    void mixedWords_Test05() {
        String[] strs = {"square", "triangle"};
        Scrambler sc = new Scrambler(strs);
        String expected1 = "squngle";
        String result1 = sc.getScrambles()[0];
        String expected2 = "triaare";
        String result2 = sc.getScrambles()[1];
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("mixedWords Test 6")
    @Test
    void mixedWords_Test06() {
        String[] strs = {"superman", "flash", "robin", "raven", "batman", "hawkgirl"};
        Scrambler sc = new Scrambler(strs);
        String expected1 = "batgirl";
        String result1 = sc.getScrambles()[4];
        String expected2 = "hawkman";
        String result2 = sc.getScrambles()[5];
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
}
