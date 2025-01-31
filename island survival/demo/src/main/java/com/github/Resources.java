package com.github;

public class Resources {

  private int wood;
  private int stone;
  private int iron;
  private int gold;
  private int fiber;

  public Resources() {
      this.wood = 0;
      this.stone = 0;
      this.iron = 0;
      this.gold = 0;
      this.fiber = 0;
  }

  // Getters
  public int getWood() {
      return wood;
  }

  public int getStone() {
      return stone;
  }

  public int getIron() {
      return iron;
  }

  public int getGold() {
      return gold;
  }

  public int getFiber() {
      return fiber;
  }

  // Setters
  public void setWood(int wood) {
      this.wood = wood;
  }

  public void setStone(int stone) {
      this.stone = stone;
  }

  public void setIron(int iron) {
      this.iron = iron;
  }

  public void setGold(int gold) {
      this.gold = gold;
  }

  public void setFiber(int fiber) {
      this.fiber = fiber;
  }

  // Add resources
  public void addWood(int amount) {
      wood += amount;
  }

  public void addStone(int amount) {
      stone += amount;
  }

  public void addIron(int amount) {
      iron += amount;
  }

  public void addGold(int amount) {
      gold += amount;
  }

  public void addFiber(int amount) {
      fiber += amount;
  }

  // Reduce resources
  public void reduceWood(int amount) {
      wood -= amount;
  }

  public void reduceStone(int amount) {
      stone -= amount;
  }

  public void reduceIron(int amount) {
      iron -= amount;
  }

  public void reduceGold(int amount) {
      gold -= amount;
  }

  public void reduceFiber(int amount) {
      fiber -= amount;
  }

  // Display resources
  public void displayResources() {
      System.out.println("Resources:");
      if (wood > 0) System.out.println("Wood: " + wood);
      if (stone > 0) System.out.println("Stone: " + stone);
      if (iron > 0) System.out.println("Iron: " + iron);
      if (gold > 0) System.out.println("Gold: " + gold);
      if (fiber > 0) System.out.println("Fiber: " + fiber);
  }
}