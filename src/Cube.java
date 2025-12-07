public class Cube {
    private int side;

    //this is a getter method
    public int getSide() {
        return side;
    }
    //this is a setter method
    public void setSide(int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than  1!");
        }
        this.side = side;
    }

    public int calculateSurfaceArea(){
        double one = this.side;
        int exponent = 2;
        double sA = Math.pow(one, exponent);
        return (int) (sA * 6.0);
    }
    public int calculateVolume(){
        double base = this.side;
        int power = 3;
        double Vol = Math.pow(base, power);
        return (int) Vol;
    }
    public String toString(){
        return ("Cube{side=" + side + "}");
    }
    public Cube(){
        side = 1;
    }
    public Cube(int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than  1!");
        }
        this.side = side;
    }
}
