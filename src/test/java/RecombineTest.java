import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RecombineTest {
    
    @DisplayName("recombine Test 1")
    @Test
    void recombine_Test01() {
        Scrambler sc = new Scrambler(null);
        String expected1 = "apar";
        String result1 = sc.recombine("apple", "pear");
        String expected2 = "peple";
        String result2 = sc.recombine("pear", "apple");
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("recombine Test 2")
    @Test
    void recombine_Test02() {
        Scrambler sc = new Scrambler(null);
        String expected1 = "plapple";
        String result1 = sc.recombine("plum", "pineapple");
        String expected2 = "pineum";
        String result2 = sc.recombine("pineapple", "plum");
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("recombine Test 3")
    @Test
    void recombine_Test03() {
        Scrambler sc = new Scrambler(null);
        String expected1 = "pareon";
        String result1 = sc.recombine("parrot", "pigeon");
        String expected2 = "pigrot";
        String result2 = sc.recombine("pigeon", "parrot");
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("recombine Test 4")
    @Test
    void recombine_Test04() {
        Scrambler sc = new Scrambler(null);
        String expected1 = "dama";
        String result1 = sc.recombine("dog", "llama");
        String expected2 = "llog";
        String result2 = sc.recombine("llama", "dog");
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("recombine Test 5")
    @Test
    void recombine_Test05() {
        Scrambler sc = new Scrambler(null);
        String expected1 = "squngle";
        String result1 = sc.recombine("square", "triangle");
        String expected2 = "triaare";
        String result2 = sc.recombine("triangle", "square");
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
    
    @DisplayName("recombine Test 6")
    @Test
    void recombine_Test06() {
        Scrambler sc = new Scrambler(null);
        String expected1 = "batgirl";
        String result1 = sc.recombine("batman", "hawkgirl");
        String expected2 = "hawkman";
        String result2 = sc.recombine("hawkgirl", "batman");
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
}
