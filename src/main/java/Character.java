public abstract class Character {
   private int power;
   private int hp;
   private KickStrategy kickStrategy;


    public Character(int power, int hp, KickStrategy kickStrategy) {
        this.power = power;
        this.hp = hp;
        this.kickStrategy = kickStrategy;
    }

   public boolean isAlive() {
      return this.hp > 0;
   }

   public void kick(Character enemy) {
      this.kickStrategy.kick(this, enemy);
   }

    public int getPower() {
        return this.power;
    }

    public int getHp() {
        return this.hp;
    }

   public KickStrategy getKickStrategy() {
      return this.kickStrategy;
   }

   public void setPower(int power) {
      this.power = power;
   }

   public void setHp(int hp) {
      this.hp = Math.max(0, hp);
   }

   public void setKickStrategy(KickStrategy kickStrategy) {
      this.kickStrategy = kickStrategy;
   }

   public String toString() {
    return this.getClass().getSimpleName() + "{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
   }

}


