import java.util.Random;
import java.util.Scanner;

class Player {

  //Player
  private String name;
  private int level;
  private int experience;
  private int experienceRequired;
  //Resources
  private int wood;
  private int stone;
  private int fiber;
  private int iron;
  //Instruments
  private int knife;
  private int knifeDurability = 25;
  private int axe;
  private int axeDurability = 50;
  private int pickaxe;
  private int pickaxeDurability = 75;
  //Items
  public int boat;

  private Random random = new Random();
  Scanner scanner = new Scanner(System.in);
  public Player() {
    this.name = "Player";
    this.level = 1;
    this.experience = 0;
    this.wood = 0;
    this.stone = 0;
    this.fiber = 0;
    this.knife = 1;
    this.axe = 0;
    this.pickaxe = 0;
  }

  public Player (String name) {
    this.name = name;
    this.level = 1;
    this.experience = 0;
  }

  public String getName() {
   return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getExperience(){
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  public int getExperienceRequired(){
    return experienceRequired;
  }

  public int getWood() {
    return wood;
  }

  public int getStone() {
    return stone;
  }
  
  public int getFiber() {
    return fiber;
  }

  public int getIron() {
    return iron;
  }

  public int getKnife() {
    return knife;
  }

  public int getKnifeDurability() {
    return knifeDurability;
  }

  public int getAxe() {
    return axe;
  }

  public int getAxeDurability() {
    return axeDurability;
  }

  public int getPickaxe() {
    return pickaxe;
  }

  public int getPickaxeDurability() {
    return pickaxeDurability;
  }

  public int getBoat() {
    return boat;
  }

  public void chopTree() {
    System.out.println("you chopped a tree");
    wood++;
    System.out.println("+ 1 wood");
    axeDurability--;
    System.out.println("- 1 axe durability");
    int expGained = 17 + random.nextInt(16);
    experience += expGained;
    System.out.println("+ " + expGained + " experience points");

    if (random.nextDouble() < 0.1) { 
      fiber++;
      System.out.println("+ 1 fiber");
    }
  }

  public void mineStone() {
    System.out.println("you mined a stone");
    stone++;
    System.out.println("+ 1 stone");
    pickaxeDurability--;
    System.out.println("- 1 pickaxe durability");
    int expGained = 12 + random.nextInt(12);
    experience += expGained;
    System.out.println("+ " + expGained + " experience points");
    
    if(random.nextDouble() < 0.05) {
      iron++;
    }
  }

  public void craft() {
    System.out.println("What do you want to craft?");
    System.out.println("|1: wooden axe  (10 wood, 2 fiber)     |  2: stone axe  (25 stone, 5 fiber)     |  3: iron axe  (5 iron, 10 fiber)\n" +
                       "|4: wooden pickaxe  (15 wood, 2 fiber) |  5: stone pickaxe  (30 stone, 5 fiber) |  6: iron pickaxe  (10 iron, 10 fiber)\n" +
                       "|7: boat  (700 wood)                   |");

    int choice = scanner.nextInt();
    switch(choice){
    case 1:
    craftWoodenAxe();
    break;
    case 2:
    craftStoneAxe();
    break;
    case 3:
    craftIronAxe();
    break;
    case 4:
    craftWoodenPickaxe(); 
    break;
    case 5:
    craftStonePickaxe();
    break;
    case 6:
    craftIronPickaxe();
    break;
    case 7:
    craftBoat();
    break;
    default:
    System.out.println("Invalid choice");
    }
  }

  public void levelUp() {
    if (experience > 99) {
      level++;
      experience = experience - 100;
        System.out.println("Congratulations! You reached the " + level + "th level!");
    }
  }
  public void viewProfile(){
    System.out.println("Your profile");
    System.out.println("================================================================");
    System.out.println("Name: " + getName());
    System.out.println("Level: " + getLevel());
    System.out.println("Experience: " + getExperience());
    System.out.println("to next level: " + getExperienceRequired());
    System.out.println("================================================================");
  }
  public void craftWoodenAxe(){
    if (wood >= 10 && fiber >= 2){
      System.out.println("You crafted a wooden axe!");
      wood -= 10;
      fiber -= 2;
    } else {
      System.out.println("You cannot craft this item!");
    }
  }
  public void craftStoneAxe() {
    if (stone >= 25 && fiber >= 5) {
      System.out.println("You crafted a stone axe!");
      stone -= 10;
      fiber -= 5;
    } else {
      System.out.println("You cannot craft this item!");
    }
  }
  public void craftIronAxe() {
    if(iron >=5 && fiber >= 10){
      System.out.println("You crafted an iron axe!");
      iron -= 5;
      fiber -= 10;
    } else {
      System.out.println("You cannot craft this item, you don't have enough resources");
    }
  }
  public void craftWoodenPickaxe() {
    if(wood >= 15 && fiber >= 2) {
      System.out.println("You crafted a wooden pickaxe!");
      wood -= 15;
      fiber -= 2;
    } else {
      System.out.println("You cannot craft this item, you don't have enough resources");
    }
  }
  public void craftStonePickaxe() {
    if(stone >= 30 && fiber >= 5) {
      System.out.println("You crafted a stone pickaxe!");
      stone -= 30;
      fiber -= 5;
    } else {
      System.out.println("You cannot craft this item, you don't have enough resources");
    }
  }
  public void craftIronPickaxe() {
    if(iron >= 10 && fiber >= 10) {
      System.out.println("You crafted an iron pickaxe!");
      iron -= 10;
      fiber -= 10;
    } else {
      System.out.println("You cannot craft this item, you don't have enough resources");
    }
  }
  public void craftBoat() {
  if(wood >= 700){
    System.out.println("You crafted a boat!");
    boat++;
    wood -= 700;
    } else {
    System.out.println("You don't have enough wood to craft a boat, you need" + " more wood");
    }
  }
}