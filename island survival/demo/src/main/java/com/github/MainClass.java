package com.github;

import java.util.Scanner;

public class MainClass {
    private static boolean hasBoat = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Welcome to the Island survival game!\nExpand your terminal to see the text");
        System.out.print("Please enter your nickname: ");
        Player p1 = new Player(scanner.nextLine());

        System.out.println("Your profile");
        System.out.println("================================================================");
        System.out.println("Name: " + p1.getName());
        System.out.println("Level: " + p1.getLevel());
        System.out.println("Experience: " + p1.getExperience());
        System.out.println("To the next level: " + p1.getExperienceRequired());
        System.out.println("================================================================");
        
        // Instructions
        System.out.println("INSTRUCTIONS");
        System.out.println("If you have no instruments, simply restart the game");
        System.out.println("Instruments are stackable, so if you craft 2 stone axes, you can mine 4 wood at the same time");
        System.out.println("If you craft a boat, the game ends. If you want to continue the game and complete advancements, don't craft the boat.");
        System.out.println("Type 1 if you understand");
        int userDecision = scanner.nextInt();

        // Guide
        System.out.println("------------------------------------------------------------------------");
        System.out.println("GUIDE:");
        System.out.println("Your goal is to escape the island\nyou can do this by building a boat");
        System.out.println("You have a knife in your inventory, you can use it to chop the tree");
        System.out.println("Get some wood to craft a wooden axe and wooden pickaxe");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Type 1 to start the game");
        int userDecision1 = scanner.nextInt();

        // Storyline
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

        // Gameplay
        System.out.println("What do you want to do?");
        while(!hasBoat){
            System.out.println("1: chop a tree  |  2: mine stone  |  3: craft  |  4: inventory  |  5: profile  |  6: advancements");
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
                    p1.getResources().displayResources();
                    if (p1.hasKnife()) {
                        System.out.println("Knife durability: " + p1.getKnifeDurability());
                    }
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
            if(p1.getBoat() > 0){
                hasBoat = true;
                p1.advancements.checkForAdvancements();
            }
        }
        System.out.println("Congratulations, you have successfully escaped the island");
        System.out.println("Your final profile: ");
        p1.viewProfile();
        System.out.println("Your advancements: ");
        p1.advancements.displayCompletedAdvancements();
        scanner.close();
    }
}
