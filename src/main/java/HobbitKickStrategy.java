public class HobbitKickStrategy extends KickStrategy {
    
    @Override
    public void kick(Character main, Character enemy) {
        System.out.println(main.getClass().getSimpleName() + " cries: 'Cry a lot!'");
    }
}
