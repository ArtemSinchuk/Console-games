public class Axe {

  private String type;
  private int durability;
  private int efficiency;

  public Axe(String type, int durability, int efficiency) {
      this.type = type;
      this.durability = durability;
      this.efficiency = efficiency;
  }

  public String getType() {
      return type;
  }

  public int getDurability() {
      return durability;
  }

  public void reduceDurability() {
      durability--;
  }

  public int use() {
      if (durability > 0) {
          reduceDurability();
          return efficiency;
      }
      return 0;
  }
}
