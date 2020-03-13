import java.util.Scanner;
import java.io.*;

public class Spouse {
  private String name;
  private String gender;
  private static final int NAME_ROLL = 100;
  private Scanner reader;

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

  // randomly setting the name of the spouse
  public String getSetName() {
    try{
      Scanner reader = new Scanner(new File("names.txt"));
      String[] names = new String[NAME_ROLL];
      int i = 0;
      while(reader.hasNextLine()) {
        names[i++] = reader.nextLine();
      }
      this.name = names[(int)Math.round(Math.random() * NAME_ROLL)];
      reader.close();
      return this.name;
    }
    catch(FileNotFoundException e) {
      System.out.println("File not found!");
    }
    return this.name;
  }
}
