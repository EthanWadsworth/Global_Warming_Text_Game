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

class Screen {
  // Used for Setting uo the button format for the main container on each
  // Screen
  // I need to create a template for each Screen, like background, buttons, and
  // main text that can then be used to set everything up. This can be the
  // parent class perhaps
  public String currentFrame, currPosition, formattedMsg, neighbor, child, spouse;
  public JFrame window;
  public JButton choice1, choice2, startButton;
  public JPanel mainTextPanel, buttonPanel, startButtonPanel, titleWindow, gamePanel;
  public Container container;
  public JTextArea textArea;
  public String[] textList;
  public JLabel titleText, planetHealth, playerMoney, moneyAmount, healthNum, year, yearNum;
  public Player player = new Player();
  public Font titleFont = new Font("Dialog", Font.PLAIN, 46);
  public Font screenFont = new Font("Dialog", Font.PLAIN, 15);
  public Font largeButtonFont = new Font("Dialog", Font.PLAIN, 24);

  // Keeps track of the ending - determined based on this score
  private int doomsdayCounter = 0;
  private int currYear = 1;
  // To keep track of mistakes - if all 3 mistakes made, bad end given
  public int mistakeCounter = 0;

  // Starting planet decay rate
  public int baseDecayRate = 10;

  // Starting money loss rate for starting money amount
  // with each year this base rate increases based on
  public int moneyLoss = 12000;

  // Adds a certain amount for positie actions, and subtracts of negative actions
  public int actionCount = 0;

  // keeps track of social movement checks
  public boolean voteFlag = false;
  public boolean protest = false;

  // for handling if solar was already implemented
  private boolean solarFlag = false;

  public ChoiceHandler handle = new ChoiceHandler();
  public TitleHandler titlehandle = new TitleHandler();
  // public // add title handler

  private static final int windowHeight = 700;
  private static final int windowWidth = 700;

  public Screen() {
    // Setting up the screen
    this.window = new JFrame();
    this.window.setSize(windowHeight, windowWidth);
    this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.window.setLayout(null);
    this.window.getContentPane().setBackground(Color.black);
    // this.window.setVisible(true);
    this.container = this.window.getContentPane();

    this.titleWindow = new JPanel();
    this.titleWindow.setBounds(100, 100, 500, 250);
    this.titleWindow.setBackground(Color.black);
    // this.titleWindow.setForeground(Color.white);
    // this.titleWindow.setFont(titleFont);
    this.titleText = new JLabel(Text.GAME_TITLE);
    this.titleText.setForeground(Color.white);
    this.titleText.setFont(titleFont);

    this.startButtonPanel = new JPanel();
    this.startButtonPanel.setBounds(225, 400, 250, 250);
    this.startButtonPanel.setBackground(Color.black);

    this.startButton = new JButton(Text.START);
    this.startButton.addActionListener(titlehandle);
    this.startButton.setBackground(Color.black);
    this.startButton.setForeground(Color.white);
    this.startButton.setFocusPainted(false);
    this.startButton.setFont(largeButtonFont);
    this.startButton.setBorderPainted(false);

    this.titleWindow.add(this.titleText);
    this.startButtonPanel.add(this.startButton);

    this.container.add(this.titleWindow);
    this.container.add(this.startButtonPanel);

    this.window.setVisible(true);
  }

  // public void showScreen() {
  //   this.window.setVisible(true);
  // }

  public void setChoiceOneText(String text) {
    this.choice1.setText(text);
  }

  public Screen getScreen() {
    return this;
  }

  public void setChoiceTwoText(String text) {
    this.choice2.setText(text);
  }

  public void setMainText(String text) {
    // this.textList = text.split(" ");
    // StringBuilder textScroll = new StringBuilder("");
    // for (String word: this.textList) {
    //   textScroll.append(word + " ");
    //   this.textArea.setText(textScroll.substring(0, textScroll.length()));
    //   this.textArea.setVisible(true);
    // }
    this.textArea.setText(text);
  }

  public void setSituationScreen() {
    this.titleWindow.setVisible(false);
    this.startButtonPanel.setVisible(false);

    this.mainTextPanel = new JPanel();
    this.mainTextPanel.setBounds(75, 75, 550, 500);
    this.mainTextPanel.setBackground(Color.black);
    // this.container.add(this.mainTextPanel);

    // Setting up the text to be displayed in the text panel
    this.textArea = new JTextArea(Text.INSTRUCTIONS);
    this.textArea.setBounds(75, 75, 550, 500);
    this.textArea.setBackground(Color.black);
    this.textArea.setForeground(Color.white);
    this.textArea.setFont(screenFont);
    this.textArea.setLineWrap(true);
    this.textArea.setWrapStyleWord(true);
    this.mainTextPanel.add(this.textArea);
    this.container.add(this.mainTextPanel);

    // Setting up the button panel
    this.buttonPanel = new JPanel();
    this.buttonPanel.setBounds(250, 580, 200, 100); // edit later
    this.buttonPanel.setBackground(Color.black);
    this.buttonPanel.setLayout(new GridLayout(2, 1));
    container.add(this.buttonPanel);

    // Setting up the button for the second choice
    this.choice1 = new JButton(Text.CONTINUE);
    this.choice1.setBackground(Color.black);
    this.choice1.setForeground(Color.white);
    this.choice1.setFont(largeButtonFont);
    this.choice1.addActionListener(handle);
    this.choice1.setFocusPainted(false);
    this.choice1.setBorderPainted(false);
    this.choice1.setActionCommand("1");
    this.buttonPanel.add(this.choice1);

    // Setting up the button for the second choice
    this.choice2 = new JButton(Text.EMPTY_STR);
    this.choice2.setBackground(Color.black);
    this.choice2.setForeground(Color.white);
    this.choice2.setFocusPainted(false);
    this.choice2.setFont(largeButtonFont);
    this.choice2.setBorderPainted(false);
    this.choice2.addActionListener(handle);
    this.choice2.setActionCommand("2");
    this.buttonPanel.add(this.choice2);

    this.gamePanel = new JPanel();
    gamePanel.setBounds(100, 15, 600, 50);
    gamePanel.setBackground(Color.black);
    gamePanel.setLayout(new GridLayout(1, 4));

    this.playerMoney = new JLabel("Money: ");
    this.playerMoney.setFont(screenFont);
    this.playerMoney.setForeground(Color.white);
    this.gamePanel.add(this.playerMoney);

    this.moneyAmount = new JLabel(Integer.toString(this.player.getMoney()));
    this.moneyAmount.setFont(screenFont);
    this.moneyAmount.setForeground(Color.white);
    this.gamePanel.add(this.moneyAmount);

    this.planetHealth = new JLabel("Planet HP: ");
    this.planetHealth.setFont(screenFont);
    this.planetHealth.setForeground(Color.white);
    this.gamePanel.add(this.planetHealth);

    this.healthNum = new JLabel(Integer.toString(this.player.getPlanetHealth()));
    this.healthNum.setFont(screenFont);
    this.healthNum.setForeground(Color.white);
    this.gamePanel.add(this.healthNum);

    this.year = new JLabel("Year");
    this.year.setFont(screenFont);
    this.year.setForeground(Color.white);
    this.gamePanel.add(this.year);

    this.yearNum = new JLabel(Integer.toString(this.currYear));
    this.yearNum.setFont(screenFont);
    this.yearNum.setForeground(Color.white);
    this.gamePanel.add(this.yearNum);
    container.add(gamePanel);

    this.child = this.player.getChild().getSetName();
    this.neighbor = this.player.getSetNeighbor();
    this.spouse = this.player.getSpouse().getSetName();

    this.currPosition = "intro";
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

  public void calcPlayerMoney() {
    double initialRate = 0.1;
    double rateIncrease = 0.1;

    for (int i = 1; i < this.currYear; i++) {
      initialRate += rateIncrease;
    }
    this.player.setMoney(this.player.getMoney() - (int)(this.moneyLoss + (this.moneyLoss*initialRate)));
    if (this.player.getMoney() < 0) {
      this.player.setMoney(0);
    }
  }

  public void introScreen() {
    this.currPosition = "intro";
    this.setMainText(Text.INSTRUCTIONS);
    this.setChoiceOneText(Text.CONTINUE);
    this.setChoiceTwoText(Text.EMPTY_STR);
  }

  // For introducing the game's setting and characters
  public void welcomeScreen() {
    this.currPosition = "welcome";
    this.setMainText(String.format(Text.WELCOME, this.spouse, this.child));
    this.setChoiceOneText(Text.START);
    this.setChoiceTwoText(Text.EMPTY_STR);
  }
  /****************** Introducing general GW information ***************/
  // The first global warming info panel, where you are asked if you know about
  // global warming
  public void generalGWInfo() {
    this.currPosition = "GW1";
    this.formattedMsg = String.format(Text.GWARMINGQ, this.neighbor, this.neighbor);
    this.setMainText(this.formattedMsg);
    this.setChoiceOneText(Text.YES);
    this.setChoiceTwoText(Text.NO);
  }

  // If answer is no to first question, then present this tile
  public void generalGWInfoNO() {
    this.currPosition = "GW1Ans";
    this.setMainText(String.format(Text.GWARMINGANSNO, this.neighbor, this.neighbor, this.neighbor));
    this.setChoiceOneText(Text.YES);
    this.setChoiceTwoText(Text.NO);
  }

  // If answer is yes to first question, then present this tile
  public void generalGWInfoYes() {
    this.currPosition = "GW1Ans";
    // String nghbr = this.player.getNeighbor();
    this.setMainText(String.format(Text.GWARMINGANSY, this.neighbor, this.neighbor, this.neighbor));
    this.setChoiceOneText(Text.YES);
    this.setChoiceTwoText(Text.NO);
  }

  /******************* Ruin Screens **********************/

  // first ruin screen
  public void increaseFoodPrice() {
    this.currPosition = "foodincr";
    this.mistakeCounter++;
    player.setPlanetHealth(player.getPlanetHealth() - this.baseDecayRate);
    this.baseDecayRate += this.baseDecayRate;
    this.healthNum.setText(Integer.toString(player.getPlanetHealth()));
    this.currYear += 2;
    this.calcPlayerMoney();
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    this.yearNum.setText(Integer.toString(currYear));
    this.setMainText(String.format(Text.FOOD_INCREASE, this.neighbor, this.neighbor));
    this.setChoiceOneText(Text.YES);
    this.setChoiceTwoText(Text.NO);
  }

  // second ruin screen
  public void secondWarning() {
    this.currPosition = "warning2";
    this.mistakeCounter++;
    player.setPlanetHealth(player.getPlanetHealth() - this.baseDecayRate);
    this.baseDecayRate += this.baseDecayRate;
    this.healthNum.setText(Integer.toString(player.getPlanetHealth()));
    this.currYear += 2;
    this.calcPlayerMoney();
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    this.yearNum.setText(Integer.toString(currYear));
    this.setMainText(String.format(Text.RUIN_TWO, this.neighbor, this.spouse, this.child, this.child));
    this.setChoiceOneText(Text.YES);
    this.setChoiceTwoText(Text.NO);
  }
  // third ruin screen
  public void finalWarning() {
    this.currPosition = "finalWarning";
    this.mistakeCounter++;
    this.calcPlayerMoney();
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    player.setPlanetHealth(player.getPlanetHealth() - this.baseDecayRate);
    this.baseDecayRate += this.baseDecayRate;
    if (this.player.getPlanetHealth() < 0) {
      this.player.setPlanetHealth(1);
    }
    this.healthNum.setText(Integer.toString(player.getPlanetHealth()));
    this.currYear += 2;
    this.yearNum.setText(Integer.toString(currYear));
    this.setMainText(Text.RUIN_THREE);
    this.setChoiceOneText(Text.YES);
    this.setChoiceTwoText(Text.NO);
  }

  /********************* Preserve Screens ***************************/
  public void mainPreserve() {
    this.currPosition = "mainPreserve";
    this.setMainText(Text.MAIN_PRESERVE_MSG);
    if (this.solarFlag && (!(this.voteFlag && this.protest))) {
      this.setChoiceOneText(Text.EMPTY_STR);
      this.setChoiceTwoText(Text.SOCIAL);
    } else if ((this.voteFlag && this.protest) && (!solarFlag)) {
      this.setChoiceOneText(Text.SOLAR);
      this.setChoiceTwoText(Text.EMPTY_STR);
    } else {
      this.setChoiceOneText(Text.SOLAR);
      this.setChoiceTwoText(Text.SOCIAL);
    }
  }

  public void implementSolar() {
    this.currPosition = "solar";
    this.yearNum.setText(Integer.toString(++currYear));
    this.solarFlag = true;
    this.doomsdayCounter++;
    this.calcPlayerMoney();
    this.player.setMoney(this.player.getMoney() - 30000);
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    this.baseDecayRate -= (this.baseDecayRate/2);
    player.setPlanetHealth(player.getPlanetHealth() - this.baseDecayRate);
    this.healthNum.setText(Integer.toString(player.getPlanetHealth()));
    this.setMainText(Text.IMPLEMENT_SOLAR);
    this.setChoiceOneText(Text.YES);
    this.setChoiceTwoText(Text.NO);
  }

  public void solarFail() {
    this.currPosition = "solar fail";
    this.yearNum.setText(Integer.toString(++currYear));
    player.setPlanetHealth(player.getPlanetHealth() - 5);
    this.player.setMoney(this.player.getMoney() + 5000);
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    this.healthNum.setText(Integer.toString(player.getPlanetHealth()));
    this.setMainText(Text.TO_POOR);
    this.setChoiceOneText(Text.CONTINUE);
    this.setChoiceTwoText(Text.EMPTY_STR);
  }

  public void social() {
    this.currPosition = "social main";
    this.setChoiceOneText(Text.VOTE);
    this.setChoiceTwoText(Text.GO_PROTEST);
    this.setMainText(Text.JOIN_SOCIAL);
    if (this.voteFlag) {
      this.setChoiceOneText(Text.EMPTY_STR);
    }
    if (this.protest) {
      this.setChoiceTwoText(Text.EMPTY_STR);
  }
}

  public void protest() {
    this.currPosition = "protest";
    this.yearNum.setText(Integer.toString(++currYear));
    this.protest = true;
    this.calcPlayerMoney();
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    this.doomsdayCounter++;
    this.baseDecayRate -= (this.baseDecayRate/2);
    player.setPlanetHealth(player.getPlanetHealth() - this.baseDecayRate);
    this.setMainText(Text.PROTEST);
    this.setChoiceOneText(Text.YES);
    this.setChoiceTwoText(Text.NO);
  }

  public void petition() {
    this.currPosition = "petition";
    this.yearNum.setText(Integer.toString(++currYear));
    this.voteFlag = true;
    this.doomsdayCounter++;
    this.calcPlayerMoney();
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    this.baseDecayRate -= (this.baseDecayRate/4);
    player.setPlanetHealth(player.getPlanetHealth() - this.baseDecayRate);
    this.setMainText(String.format(Text.PETITION, this.child));
    this.setChoiceOneText(Text.YES);
    this.setChoiceTwoText(Text.NO);
  }

  /********************* End Screens ***************************/

  // Bad Ending
  public void badEnd() {
    this.currPosition = "bad";
    this.currYear += 10;
    this.yearNum.setText(Integer.toString(this.currYear));
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    this.setMainText(Text.BAD_END);
    this.healthNum.setText(Integer.toString(0));
    this.setChoiceOneText(Text.EMPTY_STR);
    this.setChoiceTwoText(Text.EMPTY_STR);
    this.choice1.setVisible(false);
    this.choice2.setVisible(false);
  }

  // Neutral Ending
  public void neutralEnd() {
    this.currPosition = "neutral";
    this.currYear += 15;
    this.yearNum.setText(Integer.toString(this.currYear));
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    this.healthNum.setText(Integer.toString(0));
    this.setMainText(String.format(Text.NEUTRAL_END, this.spouse, this.child));
    this.setChoiceOneText(Text.EMPTY_STR);
    this.setChoiceTwoText(Text.EMPTY_STR);
    this.choice1.setVisible(false);
    this.choice2.setVisible(false);
  }

  // Good Ending
  public void goodEnd() {
    this.currPosition = "good";
    this.currYear += 10;
    this.healthNum.setText(Integer.toString(100));
    this.moneyAmount.setText(Integer.toString(this.player.getMoney()));
    this.yearNum.setText(Integer.toString(this.currYear));
    this.setMainText(Text.GOOD_END);
    this.setChoiceOneText(Text.EMPTY_STR);
    this.setChoiceTwoText(Text.EMPTY_STR);
    this.choice1.setVisible(false);
    this.choice2.setVisible(false);
  }

  /******************** Inner classes for handling events ****************/

  public class TitleHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
      setSituationScreen();
    }
  }

  public class ChoiceHandler implements ActionListener {

    // for keeping track of text scrolling on continue button presses
    // private static int continue = 0;

    @Override
    public void actionPerformed(ActionEvent event) {

      // conditions for different endings
      if (player.getMoney() <= 0) {
        player.setMoney(0);
      }
      if (player.getPlanetHealth() <= 0) {
        badEnd();
      }
      if (voteFlag && protest && solarFlag) {
        goodEnd();
      }
      if ((player.getMoney() <= 0)) {
        if ((doomsdayCounter > 0) && (doomsdayCounter < 3)) {
          neutralEnd();
        }
      }
      if ((voteFlag && protest) && (player.getMoney() < 30000)) {
        neutralEnd();
      }
      if (currYear > 10) {
        if ((doomsdayCounter > 0) && (doomsdayCounter < 3)) {
          neutralEnd();
        } else if(doomsdayCounter >= 3) {
          goodEnd();
        } else {
          badEnd();
        }
      }

      String getChoice = event.getActionCommand();

      switch(currPosition) {
        case "intro":
          switch(getChoice) {
            case "1": welcomeScreen(); break;
            case "2": break;
          }
          break;

        case "welcome":
          switch(getChoice) {
            case "1": generalGWInfo(); break;
          }
          break;

        case "GW1":
          switch(getChoice) {
            case "1": generalGWInfoYes(); break;
            case "2": generalGWInfoNO();break;
          }
          break;

        case "GW1Ans":
          switch(getChoice) {
            case "1": mainPreserve(); break;
            case "2": increaseFoodPrice(); break;
          }
          break;

        case "mainPreserve":
          switch(getChoice) {
            // TODO implement solarFail when money system established
            case "1":
              if (player.getMoney() < 30000) {
                solarFail();
                break;
              } else {
                implementSolar();
                break;
              }

            case "2": social(); break;
          }
          break;

        case "solar fail":
          switch(getChoice) {
            case "1": mainPreserve(); break;
          }
          break;

        case "social main":
          switch(getChoice) {
            case "1": petition(); break;
            case "2": protest(); break;
          }
          break;

        case "protest":
          switch(getChoice) {
            case "1": mainPreserve(); break;
            case "2":
              if (mistakeCounter == 0) {
                increaseFoodPrice();
              } else if(mistakeCounter == 1) {
                secondWarning();
              } else if(mistakeCounter == 2) {
                finalWarning();
              } else {
                badEnd();
              }
              break;
          }
          break;

        case "petition":
          switch(getChoice) {
            case "1": mainPreserve(); break;
            case "2":
              if (mistakeCounter == 0) {
                increaseFoodPrice();
              } else if(mistakeCounter == 1) {
                secondWarning();
              } else if(mistakeCounter == 2) {
                finalWarning();
              } else {
                badEnd();
              }
              break;
          }
          break;

        case "solar":
          switch(getChoice) {
            case "1":
              if (mistakeCounter == 0) {
                increaseFoodPrice();
              } else if(mistakeCounter == 1) {
                secondWarning();
              } else if(mistakeCounter == 2) {
                finalWarning();
              } else {
                badEnd();
              }
              break;
            case "2": mainPreserve(); break;
          }
          break;

        case "foodincr":
          switch(getChoice) {
            case "1": mainPreserve(); break;
            case "2": secondWarning(); break;
          }
          break;

        case "warning2":
          switch(getChoice) {
            case "1": mainPreserve(); break;
            case "2": finalWarning(); break;
          }
          break;

        case "finalWarning": // For bad ending or getting on Preserve path
          switch(getChoice) {
            case "1": mainPreserve(); break;
            case "2":
              healthNum.setText(Integer.toString(0));
              moneyAmount.setText(Integer.toString(0));
              badEnd();
              break;
          }
          break;

        default:
          break;
      }
    }
  }

  // Starting the game
  public static void main(String[] args) {
    new Screen();
  }
}
