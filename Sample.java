import java.util.*;

class Sample {

    public static void printName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        name = null; // Clear the reference to the name variable
    }

    public static void main(String[] args) {
        System.out.println("Hello, Everyone!");
        printName();
    }
}
