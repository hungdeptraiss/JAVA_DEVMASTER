import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat m");
        int m = sc.nextInt();
        System.out.println("Nhap so thu hai n");
        int n = sc.nextInt();



        if (m-n>0){
            System.out.println("so m la max, n la min");

        }
        else {
            System.out.println("so n la max, m la min");
        }
    }

}
