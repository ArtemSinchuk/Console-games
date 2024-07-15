import java.util.Scanner;



public class MainClass {
  private static boolean hasBoat;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to te Island survival game!\nexpand your terminal to see the text");
    System.out.print("Please enter your nickname: ");
    Player p1 = new Player(scanner.nextLine());

    System.out.println("Your profile");
    System.out.println("================================================================");
    System.out.println("Name: " + p1.getName());
    System.out.println("Level: " + p1.getLevel());
    System.out.println("Experience: " + p1.getExperience());
    System.out.println("to the next level: " + p1.getExperienceRequired());
    System.out.println("================================================================");
    
    // instructions
    System.out.println("INSTUCTIONS");
    System.out.println("if you have no instruments, simply restart the game");
    System.out.println("instruments are stackable, so if you craft 2 stone axes, you can mine 4 wood at the same time");
    System.out.println("");
    System.out.println("type 1 if you understand");
    int userDecision = scanner.nextInt();

    // guide
    System.out.println("------------------------------------------------------------------------");
    System.out.println("GUIDE:");
    System.out.println("Your goal is to escape the island\nyou can do this by building a boat");
    System.out.println("you have a knife in your inventory, you can use it to chop the three");
    System.out.println("get some wood to craft a wooden axe and wooden pickaxe");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("type 1 to start a game");
    int userDecision1 = scanner.nextInt();

    // storyline
    System.out.println("========================================================================");
    System.out.println("STORYLINE");
    System.out.println("You find yourself standing on a pristine beach, the sun's warm rays streaming through the water.\n" +
    "The sand beneath your feet feels soft and inviting, and the gentle waves lap at your feet.\n" +
    "You can see a small, uninhabited island in the distance, its vibrant colors and lush vegetation beckoning you closer.\n" +
    "You decide to embark on a journey to explore this enchanting land, eager to discover its secrets and uncover its hidden treasures.\n" +
    "As you approach the island, you notice that it's not as uninhabited as it first seemed.\n" +
    "A friendly-looking creature greets you, offering to share its knowledge and guide you through the island's mysteries.\n" +
    "You accept the creature's offer, eager to learn more about this magical land and its inhabitants.\n" +
    "However, as you spend more time with the creature, you begin to feel a growing sense of unease.\n" +
    "The creature reveals that it has been cursed by a powerful sorcerer, and that it must return to its homeland to break the curse.\n" +
    "You realize that you must leave the island at once, or face the consequences of the curse.\n" +
    "You decide to trust the creature and follow its guidance, knowing that you must leave this enchanting land behind.");
    System.out.println("========================================================================");

    // gameplay
    System.out.println("What do you want to do?");
    while(!hasBoat){
      System.out.println("1: chop a three  |  2: mine stone  |  3: craft  |  4: inventory  | 5: profile  | 6: advancements");
      int choice = scanner.nextInt();
      switch(choice){
      case 1:
        p1.chopTree();
        p1.levelUp();
      break;
      case 2:
        p1.mineStone();
        p1.levelUp();
      break;
      case 3:
        p1.craft();
      break;
      case 4:
      if (p1.getWood() > 0)
        System.out.println("Wood: " + p1.getWood());
      if (p1.getStone() > 0)
        System.out.println("Stone: " + p1.getStone());
      if (p1.getFiber() > 0)
        System.out.println("Fiber: " + p1.getFiber());
      if (p1.getIron() > 0)
        System.out.println("Iron: " + p1.getIron());
      if (p1.getKnife() > 0)
        System.out.println("Knife: " + p1.getKnifeDurability());
        if (p1.getAxe() > 0)
        System.out.println("Axe: " + p1.getAxeDurability());
        if (p1.getPickaxe() > 0)
        System.out.println("Pickaxe: " + p1.getPickaxeDurability());
      break;
      case 5:
      p1.viewProfile();
      break;
      case 6:
      p1.viewAdvancements();
      break;
      default:
        System.out.println("error: unknown choice");
      }
      if(p1.boat > 0){
        hasBoat = true;
      }
    }
    System.out.println("Congratulations, you have successfully escaped the island");
    scanner.close();
  }
}
