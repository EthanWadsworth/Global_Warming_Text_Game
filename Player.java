public class Player {
  private String name;
  private String gender;
  private int money = 100000;
  private int income = 75000;
  private Spouse sigOth;
  private Child child;

  Player(String name, String gender) {
    this.name = name;
    this.gender = gender;
    if (this.gender.equals("male")) {
      this.sigOth.setGender("female");
    } else {
      this.sigOth.setGender("male");
    }
  }

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
}
