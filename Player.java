/**
 * This file holds attributes and characteristics of the player of the game,
 * and is responsible for some aspects of the current gamestate
 *
 * @author Ethan Wadsworth
 * Date: 28 March 2020
 * Sources: https://docs.oracle.com/javase/tutorial/index.html
 */
import java.io.*;
import java.util.Scanner;

/**
 * This class contains the methods that update the current state of the player
 * and the game during each playthrough.
 */
public class Player {

  // fields
  // current not used
  private String name;
  private String gender;
  // amount of money player starts with
  private int money = 120000;
  // player's income - currently not used
  private int income = 75000;
  // Spouse object that this Player has
  private Spouse sigOth;
  // Child object for this Player
  private Child child;
  // the planet health
  private int planetHealth = 100;
  // Name of neighbor in-game
  private String neighbor;

  // constants
  // Upper bound of names roll
  private static final int NAMES_ROLL = 100;
  // file not found error message
  private static final String FILE_ERROR = "File not found!";
  // name of the names file used to randomly generate name
  private static final String NAMES_FILE = "names.txt";

  /**
   * default constructor - creates new Player object with a new Child and Spouse
   * @param none
   */
  Player() {
    this.child = new Child();
    this.sigOth = new Spouse();
  }

  /**
   * Returns the name of this Player
   * @param none
   * @return name of the player
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the gender of this Player
   * @param none
   * @return gender of the player
   */
  public String getGender() {
    return this.gender;
  }

  /**
   * Returns reference to the Spouse object stored in the Player object
   * @param none
   * @return reference to Spouse object beloning to this Player
   */
  public Spouse getSpouse() {
    return this.sigOth;
  }

  /**
   * Returns reference to the Child object stored in the Player object
   * @param none
   * @return reference to Child object belonging to this Player
   */
  public Child getChild() {
    return this.child;
  }

  /**
   * Returns the current planet health for this game
   * @param none
   * @return current health of the planet
   */
  public int getPlanetHealth() {
    return this.planetHealth;
  }

  /**
   * Sets the planet health to the value passed in
   * @param health value to set the current planet health to
   * @return none
   */
  public void setPlanetHealth(int health) {
    this.planetHealth = health;
  }

  /**
   * Returns the current player money
   * @param none
   * @return current player money
   */
  public int getMoney() {
    return this.money;
  }

  /**
   * Sets the money in this Player to the value passed in
   * @param money value to set player money to
   * @return none
   */
  public void setMoney(int money) {
    this.money = money;
  }

  /**
   * Randomly sets and returns the name of the player's neighbor for this game
   * @param none
   * @return The name of the player's neighbor
   */
  public String getSetNeighbor() {
    try{
      Scanner reader = new Scanner(new File(NAMES_FILE));
      String[] names = new String[NAMES_ROLL];
      int i = 0;
      // Putting each name in the names file into a single array
      while(reader.hasNextLine()) {
        names[i++] = reader.nextLine();
      }
      // choosing random name
      this.neighbor = names[(int)Math.round(Math.random() * NAMES_ROLL)];
      reader.close();
      return this.neighbor;
    }
    catch(FileNotFoundException e) {
      System.out.println(FILE_ERROR);
    }
    return this.neighbor;
  }

  /**
   *
   * @param none
   * @return the name of the neighbor
   */
  public String getNeighbor() {
    return this.neighbor;
  }
}
