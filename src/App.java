import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to enter?");
        int count = scanner.nextInt();
        
        double sum = 0;
        
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            double number = scanner.nextDouble();
            sum += number;
        }
        
        double average = sum / count;
        System.out.println("The average is: " + average);
        
        scanner.close();
    }
}