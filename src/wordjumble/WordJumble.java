/*
 * Evan Robertson
 * WordJumble.java
 * April 4 2020
 * This program uses recursion to find every combinaton of letters given a word
 */

package wordjumble;
import javax.swing.*;
/**
 *
 * @author Evan
 */
public class WordJumble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get input
        String letters = JOptionPane.showInputDialog("Enter a word to jumble");
        //Call jumble method
        jumbleWords(letters, "");
    }
    
    //This method uses recursion to jumble each letter of a word for every possible combination
    public static void jumbleWords(String word, String jumbLet) {
        int pos;
        String remainingLetters;
        String origWord = word;
        String origJumbledLetters = jumbLet;
        if (word.length() == 1) {
          System.out.println(jumbLet + word);
        } else {
          for (pos = 0; pos < origWord.length(); pos++) {
            remainingLetters = origWord.substring(0, pos)
              + origWord.substring(pos + 1, origWord.length());
            //recursive call to jumbleWords()
            jumbleWords(remainingLetters, 
              origJumbledLetters + origWord.charAt(pos));
          }
        }
    }

    
}
