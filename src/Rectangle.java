public class Rectangle implements Drawable {
    private int oneSide;
    private int secondSide;
    @Override public void draw() {
        for (int i = 0; i <secondSide ; i++) {
            for (int j = 0; j <oneSide ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public Rectangle(int oneSide, int secondSide) {
        this.oneSide = oneSide;
        this.secondSide = secondSide;
    }
}
