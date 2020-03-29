/**
 * This file holds attributes and characteristics of a spouse that belong to the
 * player's family
 *
 * @author Ethan Wadsworth
 * Date: 28 March 2020
 * Sources: https://docs.oracle.com/javase/tutorial/index.html
 */
import java.util.Scanner;
import java.io.*;

/**
 * This class contains the methods that sets up the Spouse object for each
 * player every time the game is run
 */
public class Spouse {

  // fields
  // name of the player's spouse
  private String name;
  // gender of the spouse - not currently used
  private String gender;
  // Scanner to read the list of names during random generation
  private Scanner reader;

  // constants
  // Upper bound of names roll
  private static final int NAME_ROLL = 100;
  // file not found error message
  private static final String FILE_ERROR = "File not found!";
  // name of the names file used to randomly generate name
  private static final String NAMES_FILE = "names.txt";

  /**
   * default constructor - creates new Spouse object with null gender and name
   * @param none
   */
  Spouse () {
    this.gender = null;
    this.name = null;
  }

  // Using player gender to set spouse gender
  // public void setGender(String gender) {
  //   if (gender.equals("male")) {
  //     this.gender = "female";
  //   }
  //   this.gender = "male";
  //   this.setName();
  // }

  /**
   * Randomly sets and returns the name of the player's spouse for this game
   * @param none
   * @return The name of the player's spouse
   */
  public String getSetName() {
    try{
      Scanner reader = new Scanner(new File(NAMES_FILE));
      String[] names = new String[NAME_ROLL];
      int i = 0;
      // Putting each name in the names file into a single array
      while(reader.hasNextLine()) {
        names[i++] = reader.nextLine();
      }
      // choosing random name
      this.name = names[(int)Math.round(Math.random() * NAME_ROLL)];
      reader.close();
      return this.name;
    }
    catch(FileNotFoundException e) {
      System.out.println(FILE_ERROR);
    }
    return this.name;
  }
}
