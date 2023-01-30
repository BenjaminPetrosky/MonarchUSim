public class Troll extends Character{

    public Troll(){
        weaponBehavior = new AxeBehavior();
    }
    public void display(){
        System.out.println("I'm an internet troll");
    }
}
