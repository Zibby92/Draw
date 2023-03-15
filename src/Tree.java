public class Tree implements Drawable{
    private int height;
    @Override
    public void draw() {
        for (int i = 0,k =1; i <height ; i++,k+=2) {
            for (int j = height - i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
    }

    public Tree(int height) {
        this.height = height;
    }
}
