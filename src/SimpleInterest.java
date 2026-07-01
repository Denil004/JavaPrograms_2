import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Time: ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;
        double amount = principal + si;

        System.out.println("Simple Interest = " + si);
        System.out.println("Amount = " + amount);
    }
}