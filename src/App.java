import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);



        System.out.print("Type your name: ");
        String name = sc.nextLine();
        System.out.print("Type your note: ");
        Float note1 = sc.nextFloat();
        System.out.print("Type your second note: ");
        Float note2 = sc.nextFloat();
        sc.close();
        double average = (note1 + note2) / 2;
        System.out.print("Olá," + name + "!");
        System.out.print("Sua média é : " +average);
    }
}
