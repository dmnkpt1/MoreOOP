public class GameManager {
    public void  fight(Character c1, Character c2) {
        System.out.println("The fight begins in");
        System.out.println("3 ... 2 ... 1 ");
        System.out.println("Fighter 1:   " + c1);
        System.out.println("Fighter 2:   " + c2);
        String name1 = c1.getClass().getSimpleName();
        String name2 = c2.getClass().getSimpleName();

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Now  " + name1  + " attacks  " + name2 );

            c1.kick(c2);

            if (c2.isAlive()) {
                System.out.println( name2  + "   attacks  " + name1 );
                c2.kick(c1);
                System.out.println(c1.getClass().getSimpleName() + " status: " + c1);
            }
        }
        System.out.println("Fight end");

        if (c1.isAlive()) {
            System.out.println("The winner is : ");
            System.out.println(c1.getClass().getSimpleName() + 
                " with " + "{" + c1.getHp() + "hp"+ "");
        } else {
            System.out.println("The winner is : ");
            System.out.println(c2.getClass().getSimpleName() + 
                " with " + "{" + c2.getHp() + "hp"+ "}");


    }
}
}