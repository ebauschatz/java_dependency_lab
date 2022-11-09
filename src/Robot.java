public class Robot implements Attacker {
    // Instance variables
    public String name;
    public Weapon weapon;

    // Constructor
    public Robot(Weapon weapon, String name) {
        this.name = name;
        this.weapon = weapon;
    }

    //Methods
    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage.");
    }
}
