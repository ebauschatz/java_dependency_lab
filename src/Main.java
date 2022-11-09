public class Main {
    public static void main(String[] args) {
        Spear spear = new Spear();
        Attacker robot_one = new Robot(spear, "k2SO");
        robot_one.Attack();

        Bow bow = new Bow();
        Attacker robot_two = new Robot(bow, "Terminator");
        robot_two.Attack();

        Sword sword = new Sword();
        Attacker robot_three = new Robot(sword, "Android 13");
        robot_three.Attack();

        Attacker dinosaur_one = new Dinosaur("Sue", 75, 28);
        dinosaur_one.Attack();
    }
}