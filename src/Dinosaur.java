public class Dinosaur implements Attacker {
    // Instance variables
    public String name;
    public int attackPower;
    public int age;

    // Constructor
    public Dinosaur(String name, int attackPower, int age) {
        this.name = name;
        this.attackPower = attackPower;
        this.age = age;
    }

    // Methods
    @Override
    public void Attack() {
        System.out.printf(this.name + " attacks for " + this.attackPower + " damage.");
    }
}
