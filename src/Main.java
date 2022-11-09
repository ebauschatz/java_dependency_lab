public class Main {
    public static void main(String[] args) {
        Spear spear = new Spear();
        Robot robot_one = new Robot(spear);
        System.out.println(robot_one.name);
        robot_one.Attack();
    }
}