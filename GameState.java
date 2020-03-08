// import java.awt.Color;
// import java.awt.Container;
// import java.awt.Font;
// import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
//
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JTextArea;

public class GameState {
  // First creating and showing the start screen before initializing the rest
  // of the game

  // Getting information for the current screen
  private String position;

  public static void main(String[] args) throws InterruptedException {
    // Screen screen = new Screen();
    // screen.showScreen();
    StartingScreen startScreen = new StartingScreen();
    while(startScreen.flag) {
      continue;
    }
    Thread.sleep(2000);
    Screen intro = new Screen();
    intro.setMainText("Hello my name is Ethan");
    // Screen intro = new Screen();
  }
}
