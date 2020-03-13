import java.io.*;
import java.util.Scanner;

public class Child {
  private String name;
  private static final int NAMES_ROLL = 100;

  Child() {
    this.name = null;
  }

  public String getSetName() {
    try{
      Scanner reader = new Scanner(new File("names.txt"));
      String[] names = new String[NAMES_ROLL];
      int i = 0;
      while(reader.hasNextLine()) {
        names[i++] = reader.nextLine();
      }
      this.name = names[(int)Math.round(Math.random() * NAMES_ROLL)];
      reader.close();
      return this.name;
    }
    catch(FileNotFoundException e) {
      System.out.println("File not found!");
    }
    return this.name;
  }
}
