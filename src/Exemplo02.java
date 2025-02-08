import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your age: ");
        int age = sc.nextInt();
        sc.close();
        if (age >= 18) {
            System.out.println("Overage");}
        else{
            System.out.println("You are underage");
        }
    }
}
