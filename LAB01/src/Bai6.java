import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n1:");
        int n1 = sc.nextInt();
        System.out.println("Nhap so nguyen m1");
        int m1 = sc.nextInt();

        System.out.println("Nhap so thuc n2:");
        int n2 = sc.nextInt();
        System.out.println("Nhap so thuc m2");
        int m2 = sc.nextInt();

        System.out.println("Tong 2 so nguyen: " +(n1+m1)) ;
        System.out.println("Tong 2 so thuc: " +(n2+m2)) ;
        System.out.println("Tong cua n1 + n2 la: " +(n1+n2));



    }
}