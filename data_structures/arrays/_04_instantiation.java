class _04_instantiation{
  public static void main(String[] args){
    Wizard wizard1 = new Wizard("Shelly", "Healer");
    wizard1.introduce();
    wizard1.play();
    System.out.println();

    Wizard wizard2 = new Wizard("Shawn", "Dark Magic");
    wizard2.introduce();
    wizard2.play();
    System.out.println();

    Player player1 = new Player("Shibu", "Swimmer");
    player1.introduce();
    System.out.println();

  }
}

public class Player{
  String name;
  String type;
  public Player(String name, String type){
    System.out.println("Player " + this);
    this.name = name;
    this.type = type;
  }
  public void introduce(){
    System.out.println("Hi I am " + this.name + " I am a " + this.type);
  }
}

public class Wizard extends Player{
  public Wizard(String name, String type){
    // System.out.println("Wizard " + this); // need to instantiate super first
    super(name, type);
    System.out.println("Wizard " + this);
  }
  public void play(){
    System.out.println("WEEEEE I am a " + this.type);
  }
}