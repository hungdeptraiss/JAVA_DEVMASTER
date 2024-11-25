import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat m");
        int m = sc.nextInt();
        System.out.println("Nhap so thu hai n");
        int n = sc.nextInt();
        System.out.println("Nhap so thu ba y");
        int y = sc.nextInt();
        int max;
        max = m;


        if (n>max){
            max = n;

        }
        if (y>max){
            max = y;

        }
        System.out.println("max"+max);
        int min;
        min = m;
        if (n<min){
            min = n;

        }
        if (y<min){
            min = y;


        }
        System.out.println("min"+min);
    }

}
