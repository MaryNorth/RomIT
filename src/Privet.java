import java.util.Scanner;

public class Privet {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("������� ��� ��� (�/�): ");
        String gender = in.nextLine();
        String g = "�";
        System.out.print("������� ���: ");
        String name = in.nextLine();
        System.out.print("������� �������: ");
        int age = in.nextInt();
        if (age > 18)
        {
            if (gender.equals(g))
            {
                System.out.print("������������, ��������� " + name);}
            else {System.out.print("������������, ��������� " + name);}
        }
        else {
            if (gender.equals(g))
            {
                System.out.print("������, ����� " + name);}
            else {System.out.print("������, ������� " + name);}
        }
    }


}
