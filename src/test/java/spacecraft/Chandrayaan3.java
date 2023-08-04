package spacecraft;

public class Chandrayaan3 {
    private int x, y, z;
    private Direction direction;

    public Chandrayaan3(int x, int y, int z, Direction direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Direction getDirection() {
        return direction;
    }
    
    
    public void moveForward() {
        switch (direction) {
            case NORTH :
            case SOUTH:
                y++;
                break;
            case EAST:
            case WEST:
                x++;
                break;
            case UP:
            case DOWN:
                z++;
                break;
        }  
    }
    
    public void moveBackward() {
        switch (direction) {
            case NORTH :
            case SOUTH:
                y--;
                break;
            case EAST:
            case WEST:
                x--;
                break;
            case UP:
            case DOWN:
                z--;
                break;
        }  
    }

    
    public void moveRight() {
        switch (direction) {
            case NORTH:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.NORTH;
                break;
            case UP:
            	direction = Direction.EAST;
            	break;
            case DOWN:
            	direction = Direction.WEST;
            	break;
            default:
                break;
        }
    }
    
    
    public void moveUp() {
        switch (direction) {
            case NORTH:
            case SOUTH:
            case EAST:
            case WEST:
            case DOWN:
                direction = Direction.UP;
                break;
            default:
                
                break;
        }
    }
    
    public void moveDown() {
        switch (direction) {
            case NORTH:
            case SOUTH:
            case EAST:
            case WEST:
            case UP:
                direction = Direction.DOWN;
                break;
            default:
                
                break;
        }
    }
    
    public void moveLeft() {
        switch (direction) {
            case NORTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.NORTH;
                break;
            case UP:
            	direction = Direction.WEST;
            	break;
            case DOWN:
            	direction = Direction.EAST;
            	break;
            default:
                break;
        }
    }




    
}
