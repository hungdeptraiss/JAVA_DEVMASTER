import java.util.Scanner;
public class Buoi2demo {
    String name;
    String address;
    int soLanThi;
    float diemJava;
    double lePhiThi;
    char gioiTinh;

    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Name: ");
        name=sc.nextLine();
        System.out.println("Nhap Address: ");
        address=sc.nextLine();
        System.out.println("Nhap So Lan thi: ");
        soLanThi=sc.nextInt();
        System.out.println("Nhap Diem Java: ");
        diemJava=sc.nextFloat();
        System.out.println("Nhap Le Phi Thi: ");
        lePhiThi=sc.nextFloat();
        System.out.println("Nhap Gioi Tinh: ");
        gioiTinh=sc.next().charAt(0);
    }
    public static void main(String[] args) {
        //khoi tao
        Buoi2demo sv = new Buoi2demo();
        sv.nhapThongTin();
        System.out.println(sv.address+" "+sv.name+" "+sv.diemJava+" "+sv.lePhiThi+" "+sv.gioiTinh);
    }
}
