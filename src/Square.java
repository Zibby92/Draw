public class Square implements Drawable {
    private int sideLengt;
    @Override
    public void draw() {
        for (int i = 0; i <sideLengt ; i++) {
            for (int j = 0; j <sideLengt ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public Square(int sideLengt) {
        this.sideLengt = sideLengt;
    }
}
