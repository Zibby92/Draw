import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    private final String square = "square";
    private final String rectangle = "rectangle";
    private final String three = "three";

    public static void main(String[] args) {
        Drawable chose;
        do {
            chose = chosen();
        }while(chosen()==null);
        chose.draw();
    }

    private static Drawable three() {
        System.out.println("jaka wysokość?");
        return new Tree(scanner.nextInt());
    }

    private static Drawable rectagle() {
        System.out.println("jaka dlugość ścian?");
        return new Rectangle(scanner.nextInt(), scanner.nextInt());
    }

    private static Drawable square() {
        System.out.println("jaka dlugość ściany?");
        return new Square(scanner.nextInt());
    }

    private static Drawable chosen() {
        System.out.println("Co chcesz narysować ? square/rectangle/tree");
        String chose = scanner.nextLine();
        switch (chose) {
            case "square":
                return square();
            case "rectangule":
                return rectagle();
            case "three":
                return three();
            default: {
                System.out.println("niewlasciwa komenda");
                return null;
            }
        }
    }
}
