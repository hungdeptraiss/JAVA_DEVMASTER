import java.util.Scanner;

public class Bai3 {
    // Khai báo biến a, b, và c
    private double a;
    private double b;
    private double c;

    // Hàm nhập dữ liệu
    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
    }

    // Hàm giải phương trình bậc nhất
    public void giaiPhuongTrinhB1() {
        if (a == 0) {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = (c - b) / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }

    // Hàm main để kiểm thử
    public static void main(String[] args) {
        Bai3 ptb1 = new Bai3();
        ptb1.nhapDuLieu();
        ptb1.giaiPhuongTrinhB1();
    }
}
