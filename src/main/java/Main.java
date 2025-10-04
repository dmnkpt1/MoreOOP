public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        Character c1 = CharacterFactory.createRandomCharacter();
        Character c2 = CharacterFactory.createRandomCharacter();

        gameManager.fight(c1, c2);
    }
}
