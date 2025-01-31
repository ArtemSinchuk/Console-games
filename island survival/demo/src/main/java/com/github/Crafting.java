package com.github;
public class Crafting {

  public boolean craftWoodenAxe(Resources resources) {
      if (resources.getWood() >= 10 && resources.getFiber() >= 2) {
          System.out.println("You crafted a wooden axe!");
          resources.reduceWood(10);
          resources.reduceFiber(2);
          return true;
      } else {
          System.out.println("You cannot craft this item!");
          return false;
      }
  }

  public boolean craftStoneAxe(Resources resources) {
      if (resources.getStone() >= 25 && resources.getFiber() >= 5) {
          System.out.println("You crafted a stone axe!");
          resources.reduceStone(25);
          resources.reduceFiber(5);
          return true;
      } else {
          System.out.println("You cannot craft this item!");
          return false;
      }
  }

  public boolean craftIronAxe(Resources resources) {
      if (resources.getIron() >= 5 && resources.getFiber() >= 10) {
          System.out.println("You crafted an iron axe!");
          resources.reduceIron(5);
          resources.reduceFiber(10);
          return true;
      } else {
          System.out.println("You cannot craft this item, you don't have enough resources");
          return false;
      }
  }

  public boolean craftWoodenPickaxe(Resources resources) {
      if (resources.getWood() >= 15 && resources.getFiber() >= 2) {
          System.out.println("You crafted a wooden pickaxe!");
          resources.reduceWood(15);
          resources.reduceFiber(2);
          return true;
      } else {
          System.out.println("You cannot craft this item, you don't have enough resources");
          return false;
      }
  }

  public boolean craftStonePickaxe(Resources resources) {
      if (resources.getStone() >= 30 && resources.getFiber() >= 5) {
          System.out.println("You crafted a stone pickaxe!");
          resources.reduceStone(30);
          resources.reduceFiber(5);
          return true;
      } else {
          System.out.println("You cannot craft this item, you don't have enough resources");
          return false;
      }
  }

  public boolean craftIronPickaxe(Resources resources) {
      if (resources.getIron() >= 10 && resources.getFiber() >= 10) {
          System.out.println("You crafted an iron pickaxe!");
          resources.reduceIron(10);
          resources.reduceFiber(10);
          return true;
      } else {
          System.out.println("You cannot craft this item, you don't have enough resources");
          return false;
      }
  }

  public boolean craftBoat(Resources resources) {
      if (resources.getWood() >= 700) {
          System.out.println("You crafted a boat!");
          resources.reduceWood(700);
          return true;
      } else {
          System.out.println("You don't have enough wood to craft a boat, you need more wood");
          return false;
      }
  }
}
