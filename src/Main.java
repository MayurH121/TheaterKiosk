import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        System.out.println("Please enter your age: ");
        age =in.nextInt();
        if (age > 20) {
            System.out.println("You get a wrist band!");
        }
    }
}