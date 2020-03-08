import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class Screen extends StartingScreen {
  // Used for Setting uo the button format for the main container on each
  // Screen
  // I need to create a template for each Screen, like background, buttons, and
  // main text that can then be used to set everything up. This can be the
  // parent class perhaps
  // private JFrame window;
  private JButton choice1, choice2;
  private JPanel mainTextPanel, buttonPanel;
  private Container container;
  private JTextArea textArea;
  private String[] textList;
  private static final int windowHeight = 600;
  private static final int windowWidth = 600;

  public Screen() {
    // Setting up the screen
    // this.window = new JFrame();
    // this.window.setSize(windowHeight, windowWidth);
    // this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // this.window.setLayout(null);
    // this.window.getContentPane().setBackground(Color.black);
    this.container = super.getContainer();

    // Setting up the panel for the current situation to be displayed
    this.mainTextPanel = new JPanel();
    this.mainTextPanel.setBounds(100, 100, 600, 250);
    this.mainTextPanel.setBackground(Color.black);
    this.container.add(mainTextPanel);

    // Setting up the text to be displayed in the text panel
    this.textArea = new JTextArea();
    this.textArea.setBounds(100, 100, 600, 250);
    this.textArea.setBackground(Color.black);
    this.textArea.setForeground(Color.white);
    this.textArea.setFont(new Font("Dialog", Font.PLAIN, 10));
    this.textArea.setLineWrap(true);
    this.mainTextPanel.add(this.textArea);

    // Setting up the button panel
    this.buttonPanel = new JPanel();
    this.buttonPanel.setBounds(200, 500, 200, 100); // edit later
    this.buttonPanel.setBackground(Color.black);
    this.buttonPanel.setLayout(new FlowLayout());
    container.add(this.buttonPanel);

    // Setting up the button for the second choice
    this.choice1 = new JButton("");
    this.choice1.setBackground(Color.gray);
    this.choice1.setFont(new Font("Dialog", Font.PLAIN, 10));
    this.buttonPanel.add(this.choice1);

    // Setting up the button for the second choice
    this.choice2 = new JButton("");
    this.choice2.setBackground(Color.gray);
    this.choice2.setFont(new Font("Dialog", Font.PLAIN, 10));
    this.buttonPanel.add(this.choice2);
  }

  // public void showScreen() {
  //   this.window.setVisible(true);
  // }

  public void setChoiceOneText(String text) {
    this.choice1.setText(text);
  }

  public void setChoiceTwoText(String text) {
    this.choice2.setText(text);
  }

  public void setMainText(String text) {
    this.textList = text.split(" ");
    StringBuilder textScroll = new StringBuilder("");
    for (String word: this.textList) {
      textScroll.append(word);
      this.textArea.setText(textScroll.substring(0, textScroll.length()));
      this.textArea.setVisible(true);
    }
  }

  // public int getWindowHeight() {
  //   return windowHeight;
  // }
  //
  // public int getWindowWidth() {
  //   return windowWidth;
  // }

  public void setButtonsVisibility(boolean option) {
    if(option) {
      this.buttonPanel.setVisible(false);
    } else {
      this.buttonPanel.setVisible(true);
    }
  }
}
