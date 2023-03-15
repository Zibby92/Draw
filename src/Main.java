import java.util.Scanner;

public class Main {
    private final String square = "square";
    private final String rectangle = "rectangle";
    private final String three = "three";
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Co chcesz narysować ? square/rectangle/tree");
        String chose = scanner.nextLine();
        switch (chose) {
            case "square":{
                System.out.println("jaka dlugość ściany?");
                 Drawable square = new Square(scanner.nextInt());
                 square.draw();
            }
            case "rectangule":{
                System.out.println("jaka dlugość ścian?");
                Drawable rectangle = new Rectangle(scanner.nextInt(),scanner.nextInt());
                rectangle.draw();
            }
            case "three":{
                System.out.println("jaka wysokość?");
                Drawable three = new Tree(scanner.nextInt());
                three.draw();
            }
        }
    }
    void
}