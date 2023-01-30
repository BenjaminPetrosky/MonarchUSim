public class Queen extends Character{
    public Queen(){
        weaponBehavior = new BowAndArrowBehavior();
    }

    public void display(){
        System.out.println("I am a queen! Beyonce got nothing on me!");
    }
}
