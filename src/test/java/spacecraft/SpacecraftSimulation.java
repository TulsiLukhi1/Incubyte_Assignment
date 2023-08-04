package spacecraft;

public class SpacecraftSimulation {

    public static void main(String[] args) {
        Chandrayaan3 spacecraft = new Chandrayaan3(0, 0, 0, Direction.NORTH);

        String[] commands = { "f", "r", "u", "b", "l" };

        System.out.println("Initial Position: (" + spacecraft.getX() + ", " + spacecraft.getY() + ", " +
                spacecraft.getZ() + ")");
        System.out.println("Initial Direction: " + spacecraft.getDirection());

        for (String command : commands) {
            executeCommand(spacecraft, command);
            System.out.println("Command: " + command);
            System.out.println("New Position: (" + spacecraft.getX() + ", " + spacecraft.getY() + ", " +
                    spacecraft.getZ() + ")");
            System.out.println("New Direction: " + spacecraft.getDirection());
            System.out.println();
        }
    }

    public static void executeCommand(Chandrayaan3 spacecraft, String command) {
        switch (command) {
            case "f":
                spacecraft.moveForward();
                break;
            case "b":
                spacecraft.moveBackward();
                break;
            case "r":
                spacecraft.moveRight();
                break;
            case "l":
                spacecraft.moveLeft();
                break;
            case "u":
                spacecraft.moveUp();
                break;
            case "d":
                spacecraft.moveDown();
                break;
            default:
                System.out.println("Invalid command: " + command);
                break;
        }
    }
}
