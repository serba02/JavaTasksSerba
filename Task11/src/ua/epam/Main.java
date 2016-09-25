package ua.epam;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot(13,45);
        Operator operator = new Operator("Ope", "Rator");
        operator.setRobot(robot);
        robot.setOperator(operator);
        robot.setCourse(15);
        robot.forward(25);
        robot.printCoordinates();
        robot.setCourse(30);
        robot.forward(27);
        robot.printCoordinates();
        robot.setCourse(80);
        robot.forward(43);
        robot.printCoordinates();
        robot.setCourse(15);
        robot.forward(21);
        robot.printCoordinates();
    }

}
