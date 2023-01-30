public class King extends Character{
    public King(){
        weaponBehavior = new AxeBehavior();
    }

    public void display(){
        System.out.println("I am a King!");
    }
}
