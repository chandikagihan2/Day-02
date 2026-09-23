import java.util.*;

class Sample {

    public static void printName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Hello, Everyone!");
        printName();
    }
}
