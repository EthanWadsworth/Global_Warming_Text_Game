import java.util.Scanner;
import java.io.*;

public class Spouse {
  private String name;
  private String gender;
  private static final int NAME_ROLL = 50;
  private Scanner reader;

  Spouse () {
    this.gender = null;
    this.name = null;
  }

  // Using player gender to set spouse gender
  public void setGender(String gender) {
    if (gender.equals("male")) {
      this.gender = "female";
    }
    this.gender = "male";
    this.setName();
  }

  // randomly setting the name of the spouse
  private void setName() {
    try {
      if (this.gender.equals("male")) {
        Scanner reader = new Scanner(new File("boy_names.txt"));

      } else {
        Scanner reader = new Scanner(new File("girl_names.txt"));
      }
      String[] names = new String[NAME_ROLL];
      int i = 0;
      while (reader.hasNextLine()) {
        names[i++] = reader.nextLine();
      }
      this.name = names[(int)Math.round(Math.random() * NAME_ROLL)];
      reader.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
}
