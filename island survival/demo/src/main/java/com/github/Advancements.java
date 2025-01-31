package com.github;

public class Advancements {
  
  //private boolean complete;
  private boolean firstWood;
  private boolean firstStone;
  private boolean firstIron;
  private boolean craftBoat;
  private boolean wood1000;
  private boolean stone1000;
  private boolean iron1000;
  private boolean level50;

  private boolean ultrasurvival;

  public Advancements() {
    this.firstWood = false;
    this.firstStone = false;
    this.firstIron = false;
    this.craftBoat = false;
    this.wood1000 = false;
    this.stone1000 = false;
    this.iron1000 = false;
    this.level50 = false;
    this.ultrasurvival = false;
}
  public void unlockFirstWood() {
    if (!firstWood) {
      firstWood = true;
      System.out.println("you gain new advancement! \ncollect 1 wood");
    }
  }

  public void unlockFirstStone() {
    if (!firstStone){
      firstStone = true;
      System.out.println("you gain new advancement! \ncollect 1 stone");
    }
  }
  
  public void unlockFirstIron() {
    if (!firstIron) {
      firstIron = true;
      System.out.println("you gain new advancement! \ncollect 1 iron");
    }
  }
  
  public void unlockCraftBoat() {
    if (!craftBoat) {
      craftBoat = true;
      System.out.println("you gain new advancement! \ncraft a boat");
    }
  }
  
  public void unlockWood1000() {
    if (!wood1000) {
      wood1000 = true;
      System.out.println("you gain new advancement! \ncollect 1000 wood");
    }
  }
  
  public void unlockStone1000() {
    if (!stone1000) {
      stone1000 = true;
      System.out.println("you gain new advancement! \ncollect 1000 stone");
    }
  }
  
  public void unlockIron1000() {
    if (!iron1000) {
      iron1000 = true;
      System.out.println("you gain new advancement! \ncollect 1000 iron");
    }
  }
  
  public void unlockLevel50() {
    if (!level50) {
      level50 = true;
      System.out.println("you gain new advancement! \nlevel up to 50");
    }
  }
  
  public void unlockUltrasurvival() {
    if (!ultrasurvival) {
      checkForAdvancements();
      ultrasurvival = true;
      System.out.println("you gain new advancement! \ncomplete all advancements");
    }
  }
  public void checkForAdvancements() {
    if (firstWood && firstStone && firstIron && craftBoat && wood1000 && stone1000 && iron1000 && level50 && ultrasurvival) {
      unlockUltrasurvival();
    }
  }
  public void displayLockedAdvancements() {
    if (firstWood == false) System.out.println("My first Wood: Collect 1 wood");
    if (firstStone == false) System.out.println("My first Stone: Collect 1 stone");
    if (firstIron == false) System.out.println("My first Iron: Collect 1 iron");
    if (craftBoat == false) System.out.println("Escape: Craft a boat");
    if (wood1000 == false) System.out.println("Wooden Pile: Collect 1000 wood");
    if (stone1000 == false) System.out.println("Stone Reserve: Collect 1000 stone");
    if (iron1000 == false) System.out.println("Iron Supply: Collect 1000 iron");
    if (level50 == false) System.out.println("Survivalist: Level up to 50");
    if (ultrasurvival == false) System.out.println("Ultra-Survivalist: Complete all advancements");
    System.out.println("");
}
  public void displayCompletedAdvancements() {
    if (firstWood == true) System.out.println("First Wood Unlocked!");
    if (firstStone == true) System.out.println("First Stone Unlocked!");
    if (firstIron == true) System.out.println("First Iron Unlocked!");
    if (craftBoat == true) System.out.println("Boat Crafted!");
    if (wood1000 == true) System.out.println("1000 Wood Collected!");
    if (stone1000 == true) System.out.println("1000 Stone Collected!");
    if (iron1000 == true) System.out.println("1000 Iron Collected!");
    if (level50 == true) System.out.println("Level 50 Unlocked!");
    if (ultrasurvival == true) System.out.println("All Advancements Completed!");
  }
}
