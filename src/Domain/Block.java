package Domain;

public class Block {
    private int xCoor;
    private int yCoor;

    public Block(int xCoor, int yCoor) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
    }

    public int getxCoor() {
        return xCoor;
    }

    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public int getyCoor() {
        return this.yCoor;
    }

    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }
}
