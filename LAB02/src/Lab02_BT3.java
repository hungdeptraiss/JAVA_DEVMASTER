import java.util.Scanner;
public class Lab02_BT3 {
    private String ten;
    private String maSinhVien;
    private double diemLyThuyet;
    private double diemThucHanh;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        ten = sc.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLine();
        System.out.println("Nhap diem ly thuyet: ");
        diemLyThuyet = sc.nextDouble();
        System.out.println("Nhap diem thuc hanh: ");
        diemThucHanh = sc.nextDouble();

    }
    public void  hienThiThongTin() {
        System.out.println("Ten sinh vien: "+ ten);
        System.out.println("Ma sinh vien: "+ maSinhVien);
        System.out.println("Diem ly thuyet: "+ diemLyThuyet);
        System.out.println("Diem thuc hanh: "+ diemThucHanh);
    }
    public void xepLoai(){
        if (this.diemLyThuyet <4){
            System.out.println("Thi lai ly thuyet");
        }
        if (this.diemThucHanh <4){
            System.out.println("Thi lai thuc hanh");
        }
        if ((this.diemLyThuyet + this.diemThucHanh)/2 < 4){
            System.out.println("Sinh vien phai hoc lai");
        }else if((this.diemLyThuyet + this.diemThucHanh)/2>=4 && (this.diemLyThuyet + this.diemThucHanh)/2 <=7){
            System.out.println("Sinh vien dat mon Java");
        }else {
            System.out.println("Sinh vien dat suat sac mon Java");
        }


        }
    public static void main(String[] args) {
        Lab02_BT3 sinhvien = new Lab02_BT3();
        sinhvien.nhapThongTin();
        sinhvien.hienThiThongTin();
        sinhvien.xepLoai();

    }
    }




