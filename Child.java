import java.io.*;
import java.util.Scanner;

public class Child {
  private String name;
  private static final int NAMES_ROLL = 100;

  Child() {
    this.name = null;
  }

  private void setName() {
    try{
      Scanner reader = new Scanner(new File("names.txt"));
      String[] names = new String[NAMES_ROLL];
      int i = 0;
      while(reader.hasNextLine()) {
        names[i++] = reader.nextLine();
      }
      this.name = names[(int)Math.round(Math.random() * NAMES_ROLL)];
      reader.close();
    }
    catch(FileNotFoundException e) {
      System.out.println("File not found!");
    }
  }
}
