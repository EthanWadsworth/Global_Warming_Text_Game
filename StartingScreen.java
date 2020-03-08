import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class StartingScreen {
  private JFrame window;
  private Container container;
  private JPanel titleWindow, startButtonPanel;
  private JLabel titleText;
  private JButton startButton;
  private StartHandler startHandle = new StartHandler(this);
  public boolean flag = true;

  public StartingScreen() {
    // Setting up the starting window
    this.window = new JFrame();
    this.window.setVisible(true);
    this.window.setSize(600, 600);
    this.window.getContentPane().setBackground(Color.black);
    this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.window.setLayout(null);
    this.container = this.window.getContentPane();

    // Creating the title window
    this.titleWindow = new JPanel();
    this.titleWindow.setBounds(100, 100, 400, 250);
    this.titleWindow.setBackground(Color.black);
    this.titleWindow.setForeground(Color.white);
    this.titleWindow.setFont(new Font("Dialog", Font.PLAIN, 120));

    // Creating the title text label
    this.titleText = new JLabel("Game Name"); //TODO edit later
    this.titleText.setForeground(Color.white);
    this.titleText.setFont(new Font("Dialog", Font.PLAIN, 55));

    // Creating the start button panel
    this.startButtonPanel = new JPanel();
    this.startButtonPanel.setBounds(200, 400, 150, 150);
    this.startButtonPanel.setBackground(Color.black);

    // Creating the start button
    this.startButton = new JButton("START");
    this.startButton.addActionListener(startHandle);
    this.startButton.setBackground(Color.black);
    this.startButton.setForeground(Color.white);
    this.startButton.setFocusPainted(false);
    this.startButton.setFont(new Font("Dialog", Font.PLAIN, 20));

    // Setting up the screen
    this.titleWindow.add(this.titleText);
    this.startButtonPanel.add(this.startButton);
    this.container.add(this.titleWindow);
    this.container.add(this.startButtonPanel);
  }

  public JPanel getTitleText() {
    return this.titleWindow;
  }

  public JPanel getButtonPanel() {
    return this.startButtonPanel;
  }

  public Container getContainer() {
    return this.container;
  }

  // Class to hide visibility of start screen once clicked
  public class StartHandler implements ActionListener {
    StartingScreen start;

    public StartHandler(StartingScreen screen) {
      this.start = screen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      this.start.getTitleText().setVisible(false);
      this.start.getButtonPanel().setVisible(false);
      this.start.flag = false;
    }
  }
}
