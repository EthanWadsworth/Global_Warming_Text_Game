import java.io.*;
import java.util.Scanner;

public class Player {
  private String name;
  private String gender;
  private int money = 120000;
  private int income = 75000;
  private Spouse sigOth;
  private Child child;
  private int planetHealth = 100;
  private String neighbor;
  private static final int NAMES_ROLL = 100;

  Player() {
    this.child = new Child();
    this.sigOth = new Spouse();
  }

  // Player(String name, String gender) {
  //   this.name = name;
  //   this.gender = gender;
  //   if (this.gender.equals("male")) {
  //     this.sigOth.setGender("female");
  //   } else {
  //     this.sigOth.setGender("male");
  //   }
  // }

  public String getName() {
    return this.name;
  }

  public String getGender() {
    return this.gender;
  }

  public Spouse getSpouse() {
    return this.sigOth;
  }

  public Child getChild() {
    return this.child;
  }

  public int getPlanetHealth() {
    return this.planetHealth;
  }

  public void setPlanetHealth(int health) {
    this.planetHealth = health;
  }

  public int getMoney() {
    return this.money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  // Setting the name of the neighbor to random every single time called
  // and getting the name
  public String getSetNeighbor() {
    try{
      Scanner reader = new Scanner(new File("names.txt"));
      String[] names = new String[NAMES_ROLL];
      int i = 0;
      while(reader.hasNextLine()) {
        names[i++] = reader.nextLine();
      }
      this.neighbor = names[(int)Math.round(Math.random() * NAMES_ROLL)];
      reader.close();
      return this.neighbor;
    }
    catch(FileNotFoundException e) {
      System.out.println("File not found!");
    }
    return this.neighbor;
  }

  public String getNeighbor() {
    return this.neighbor;
  }
}
