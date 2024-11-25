import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen:");
        int n = sc.nextInt();
        System.out.println("Nhap so thuc");
        float m = sc.nextFloat();
        System.out.println("Nhap chuoi ki tu");
        sc.nextLine();
        String s = sc.nextLine();


        System.out.println("so nguyen la: " + n);
        System.out.println("so thuc la: " + m);
        System.out.println("chuoi la: " + s);
    }
}