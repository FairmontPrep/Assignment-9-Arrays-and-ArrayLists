/* INSTRUCTIONS
 * The Scrambler class will scramble the words in an array that is passed in 
 * the constructor. It is assumed that the array will have an even number of 
 * words.
 * 
 * The method recombine returns a String created from its two String paramters 
 * as follows:
 * - take the first half of word1
 * - take the second half of word2
 * - concatenate the two halves and return the new string
 * EXAMPLE:
 *  word1       word2       recombine(word1, word2)
 * "apple"     "pear"           "apar"
 * "pear"      "apple"          "peple"
 * If the word has an odd number of letters, the second half of the word 
 * contains the extra letter.
 * 
 * The method mixedWords creates and returns a new array of String objects as follows:
 * - it takes the first pair of strings in words and combines them to produce a pair of strings that have been mixed using recombine
 * - each string will have its own front half and the other string's back half
 * - repeat for each pair that exists.
 * EXAMPLE:
 * Input:  {"apple", "pear", "this", "cat"}
 * Output: {"apar", "peple", "that", "cis"}
 */

public class Scrambler {
    private String[] scrambledWords;

    /* Constructor
     * @param wordArr an array of String objects
     *      Precondition: wordArr.length is even
     */
    public Scrambler(String[] wordArr) {
        scrambledWords = mixedWords(wordArr);
    }

    public String[] getScrambles() {
        return scrambledWords;
    }

    /* COMPLETE THIS METHOD
     * @param word1 a String of characters
     * @param word2 a String of characters
     * @return a String that contains the first half of word1 and the second 
     *      half of word2
     */
    public String recombine(String word1, String word2) {
        // Insert your code below

        return null;
    }

    /* COMPLETE THIS  METHOD
     * @param words an array of String objects
     *      Precondition: words.length is even
     * @return an array of String objects created by recombining pairs of 
     *      strings in array words
     *      Postcondition: the length of the returned array is words.length
     */
    private String[] mixedWords(String[] words) {
        // Insert your code below

        return null;
    }
}