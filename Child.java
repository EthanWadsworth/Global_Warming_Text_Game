/**
 * This file holds attributes and characteristics of a child that belong to the
 * player's family
 *
 * @author Ethan Wadsworth
 * Date: 28 March 2020
 * Sources: https://docs.oracle.com/javase/tutorial/index.html
 */
import java.io.*;
import java.util.Scanner;

/**
 * This class contains the methods that sets up the Child object for each player
 * every time the game is run
 */
public class Child {

  // fields
  // The name chosen for this Child
  private String name;

  // constants
  // Upper bound of name roll
  private static final int NAMES_ROLL = 100;
  // file not found error message
  private static final String FILE_ERROR = "File not found!";
  // name of the names file used to randomly generate name
  private static final String NAMES_FILE = "names.txt";

  /**
   * default constructor - initializes name to null 
   * @param none
   */
  Child() {
    this.name = null;
  }

  /**
   * Randomly sets and returns a name from a text file of the 100 most popular
   * names
   * @param none
   * @return name chosen for this Child object
   */
  public String getSetName() {
    try{
      Scanner reader = new Scanner(new File(NAMES_FILE));
      String[] names = new String[NAMES_ROLL];
      int i = 0;
      // Putting each name in the names file into a single array
      while(reader.hasNextLine()) {
        names[i++] = reader.nextLine();
      }
      // choosing random name
      this.name = names[(int)Math.round(Math.random() * NAMES_ROLL)];
      reader.close();
      return this.name;
    }
    catch(FileNotFoundException e) {
      System.out.println(FILE_ERROR);
    }
    return this.name;
  }
}
