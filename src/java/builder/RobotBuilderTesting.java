package builder;

public class RobotBuilderTesting {

    public static void main(String[] args) {

        RobotBuilder robotBuilder = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);

        robotEngineer.makeRobot();

        Robot robot = robotEngineer.getRobot();

        System.out.println("Robot built.");

        System.out.println("Robot head : " + robot.getRobotHead());
        System.out.println("Robot torso: " + robot.getRobotTorso());
        System.out.println("Robot arms : " + robot.getRobotArms());
        System.out.println("Robot legs : " + robot.getRobotLegs());


    }

}
