import java.util.Scanner;

public class Lab02_BT1 {
    // Khai báo các thuộc tính
    private String name;
    private String address;
    private double salary;

    // Hàm input() để nhập thông tin cho Person
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();
        System.out.print("Nhập mức lương: ");
        salary = scanner.nextDouble();
    }

    // Hàm view() để hiển thị thông tin của Person
    public void view() {
        System.out.println("Thông tin của Person:");
        System.out.println("Tên: " + name);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Mức lương: " + salary);
    }

    // Hàm main() để kiểm tra chương trình
    public static void main(String[] args) {
        Lab02_BT1   person = new Lab02_BT1();
        person.input();
        person.view();
    }
}
