import java.util.Scanner;

public class Lab02_BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 3 số a, b, c
        System.out.print("Nhập vào số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập vào số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập vào số c: ");
        double c = scanner.nextDouble();

        // Kiểm tra điều kiện tạo thành tam giác
        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Ba số có thể tạo thành một tam giác.");

            // Tính chu vi
            double perimeter = a + b + c;
            System.out.println("Chu vi của tam giác: " + perimeter);

            // Tính diện tích
            double s = perimeter / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Diện tích của tam giác: " + area);
        } else {
            System.out.println("Ba số không thể tạo thành một tam giác.");
        }

        scanner.close();
    }
}
