import java.util.Random;

public class NobleStrategy extends KickStrategy {
    private static final Random RANDOM = new Random();

    public void kick(Character main, Character enemy) {
      int enemyHp = enemy.getHp();
      System.out.println(main.getClass().getSimpleName() + " strikes " 
      + enemy.getClass().getSimpleName() + " for " + RANDOM.nextInt(main.getPower()) + 1 + " damage");
      enemy.setHp(enemyHp - RANDOM.nextInt(main.getPower()));
   }
}
