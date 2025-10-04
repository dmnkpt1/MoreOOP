import java.util.Random;

public class CharacterFactory {
    private static final Random RANDOM = new Random();
        public static Character createRandomCharacter() {
            int choice = RANDOM.nextInt(4);
        
            switch (choice) {
                case 0:
                    return new Hobbit();
                case 1:
                    return new Elf();
                case 2:
                    return new Knight();
                case 3:
                    return new King();
                default:
                    return null;
            }
    }
}