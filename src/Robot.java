public class Robot {
    // Instance variables
    public String name;
    public Weapon weapon;

    // Constructor
    public Robot(Weapon weapon) {
        this.name = "K2SO";
        this.weapon = weapon;
    }

    //Methods
    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage.");
    }
}
