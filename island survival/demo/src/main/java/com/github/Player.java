package com.github;
import java.util.Random;
import java.util.Scanner;

class Player {

    private String name;
    private int level;
    private int experience;
    private int experienceRequired;
    private Resources resources;
    private Crafting craft;
    private Instruments instruments;
    private Items items;
    Advancements advancements;
    private int knifeDurability = 25;
    private boolean hasKnife = true;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public Player() {
        this("Player");
    }

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.experienceRequired = 100;
        this.resources = new Resources();
        this.craft = new Crafting();
        this.instruments = new Instruments();
        this.items = new Items();
        this.advancements = new Advancements();
    }

    // Getters and Setters
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperienceRequired() {
        return experienceRequired;
    }

    public Resources getResources() {
        return resources;
    }

    public int getBoat() {
        return items.getboat();
    }

    public boolean hasKnife() {
        return hasKnife;
    }

    public int getKnifeDurability() {
        return knifeDurability;
    }

    public void useKnife() {
        knifeDurability--;
        if (knifeDurability <= 0) {
            hasKnife = false;
            System.out.println("Your knife has broken.");
        }
    }

    public void chopTree() {
        int woodGained = 0;
        if (hasKnife) {
            woodGained = 1;
            useKnife();
            System.out.println("You used your knife to chop a tree \n+ " + woodGained + " wood");
        } else {
            woodGained = instruments.useAxes();
            if (woodGained <= 0) {
                System.out.println("You don't have an axe to chop a tree!");
                return;
            }
            System.out.println("You chopped a tree \n+ " + woodGained + " wood");
        }
        resources.addWood(woodGained);
        gainExperience(17 * woodGained, 16 * woodGained);
        
        if (random.nextDouble() < 0.3) {
            int fiberGained = woodGained;
            resources.addFiber(fiberGained);
            System.out.println("+ " + fiberGained + " fiber");
        }
        advancements.unlockFirstWood();
        if (resources.getWood() >= 1000)
        advancements.unlockWood1000();
    }

    public void mineStone() {
        int stoneGained = instruments.usePickaxes();
        if (stoneGained <= 0) {
            System.out.println("You don't have a pickaxe to mine stone!");
            return;
        }
        System.out.println("You mined stone and gained " + stoneGained + " stone.");
        resources.addStone(stoneGained);
        gainExperience(12 * stoneGained, 12 * stoneGained);

        if (random.nextDouble() < 0.05) {
            int ironGained = stoneGained;
            resources.addIron(ironGained);
            System.out.println("+ " + ironGained + " iron");
            advancements.unlockFirstIron();
            if (resources.getIron() >= 1000)
            advancements.unlockIron1000();
        }
        advancements.unlockFirstStone();
        if (resources.getStone() >= 1000)
        advancements.unlockStone1000();
    }

    private void gainExperience(int baseExp, int randomExp) {
        int expGained = baseExp + random.nextInt(randomExp);
        experience += expGained;
        System.out.println("+ " + expGained + " experience points");
        levelUp();
    }

    public void craft() {
        System.out.println("What do you want to craft?");
        System.out.println("|1: wooden axe  (10 wood, 2 fiber)     |  2: stone axe  (25 stone, 5 fiber)     |  3: iron axe  (5 iron, 10 fiber)\n" +
                           "|4: wooden pickaxe  (15 wood, 2 fiber) |  5: stone pickaxe  (30 stone, 5 fiber) |  6: iron pickaxe  (10 iron, 10 fiber)\n" +
                           "|7: boat  (700 wood)                   \n"+
                           "|99: exit");

        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                if (craft.craftWoodenAxe(resources)) {
                    instruments.addAxe(new Axe("Wooden Axe", 50, 1));
                }
                break;
            case 2:
                if (craft.craftStoneAxe(resources)) {
                    instruments.addAxe(new Axe("Stone Axe", 100, 2));
                }
                break;
            case 3:
                if (craft.craftIronAxe(resources)) {
                    instruments.addAxe(new Axe("Iron Axe", 200, 3));
                }
                break;
            case 4:
                if (craft.craftWoodenPickaxe(resources)) {
                    instruments.addPickaxe(new Pickaxe("Wooden Pickaxe", 75, 1));
                }
                break;
            case 5:
                if (craft.craftStonePickaxe(resources)) {
                    instruments.addPickaxe(new Pickaxe("Stone Pickaxe", 150, 2));
                }
                break;
            case 6:
                if (craft.craftIronPickaxe(resources)) {
                    instruments.addPickaxe(new Pickaxe("Iron Pickaxe", 300, 3));
                }
                break;
            case 7:
                if (craft.craftBoat(resources)) {
                    items.setboat(1);
                    System.out.println("Congratulations! You crafted a boat and can now leave the island!");
                }
                break;
            case 99:
                System.out.println("");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void levelUp() {
        while (experience >= experienceRequired) {
            level++;
            experience -= experienceRequired;
            experienceRequired += (experienceRequired / 5);
            System.out.println("Congratulations! You reached level " + level + "!");
            if (level == 50)
            advancements.unlockLevel50();
        }
    }

    public void viewProfile() {
        System.out.println("Your profile");
        System.out.println("================================================================");
        System.out.println("Name: " + getName());
        System.out.println("Level: " + getLevel());
        System.out.println("Experience: " + getExperience());
        System.out.println("To next level: " + (getExperienceRequired() - getExperience()));
        System.out.println("================================================================");
    }

    public void viewAdvancements() {
        System.out.println("Your advancements:");
        advancements.displayCompletedAdvancements();
        System.out.println("\nlocked advancements:");
        advancements.displayLockedAdvancements();
    }
}
