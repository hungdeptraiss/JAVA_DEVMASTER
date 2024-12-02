
import java.util.Scanner;

public class Lab02_BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào số c: ");
        int c = scanner.nextInt();
        System.out.print("Nhập vào số d: ");
        int d = scanner.nextInt();

        int max1 = (a > b) ? a : b;


        int max2 = (c > d) ? c : d;


        int max = (max1 > max2) ? max1 : max2;


        System.out.println("Số lớn nhất trong 4 số là: " + max);

        scanner.close();
    }
}
