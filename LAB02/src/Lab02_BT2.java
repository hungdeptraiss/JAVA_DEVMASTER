import java.util.Scanner;

public class Lab02_BT2 {
    // Khai báo các thuộc tính
    private String ten;
    private String nhaSanXuat;
    private int soLuongBanhXe;

    // Hàm nhapThongTin() để nhập thông tin cho XeMay
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên xe: ");
        ten = scanner.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        nhaSanXuat = scanner.nextLine();
        System.out.print("Nhập số lượng bánh xe: ");
        soLuongBanhXe = scanner.nextInt();
    }

    // Hàm hienThiThongTin() để hiển thị thông tin của XeMay
    public void hienThiThongTin() {
        System.out.println("Thông tin xe máy:");
        System.out.println("Tên xe: " + ten);
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Số lượng bánh xe: " + soLuongBanhXe);
    }

    // Hàm main() để kiểm tra chương trình
    public static void main(String[] args) {
        Lab02_BT2 xeMay = new Lab02_BT2();
        xeMay.nhapThongTin();
        xeMay.hienThiThongTin();
    }
}
