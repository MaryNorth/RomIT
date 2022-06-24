import java.util.Scanner;

public class Privet {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш пол (м/ж): ");
        String gender = in.nextLine();
        String g = "м";
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        if (age > 18)
        {
            if (gender.equals(g))
            {
                System.out.print("Здравствуйте, уважаемый " + name);}
            else {System.out.print("Здравствуйте, уважаемая " + name);}
        }
        else {
            if (gender.equals(g))
            {
                System.out.print("Привет, чувак " + name);}
            else {System.out.print("Привет, подруга " + name);}
        }
    }


}
