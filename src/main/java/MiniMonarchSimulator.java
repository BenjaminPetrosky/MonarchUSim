public class MiniMonarchSimulator {

    public static void main(String[] args){
        Character characterKing = new King();
        Character characterTroll = new Troll();

        characterKing.display();
        characterKing.fight();
        characterTroll.display();
        characterTroll.fight();
        characterKing.setWeaponBehavior(new KnifeBehavior());
        characterKing.display();
        characterKing.fight();
    }
}
