import java.util.Scanner;
public class Bth1 {
    int status;
        public void nhaDuLieu(){
            System.out.println("Chuong trinh du bao thoi tiet chuon chuon");
            System.out.println( "1. Bay thap");
            System.out.println( "2. Bay cao");
            System.out.println( "3. Bay vua");
            System.out.println( "4. Say ruou cmnr");
            System.out.println( "Moi nhap tu 1-->4");

            Scanner sc = new Scanner(System.in);
            status = sc.nextInt();
            System.out.println("Cam on da nhap");
        }

    public void hienThiDuBao() {
       switch(status){
           case 1:
               System.out.println("Du bao mua, ra khoi nha nho mang ao mua");
               break;
           case 2:
               System.out.println("Du bao nag");
               break;
           case 3:
               System.out.println("Du bao ram");
               break;
           case 4:
               System.out.println("OMG");
               break;

       }

    }
    public static void main(String[] args) {
            Bth1 b = new Bth1();
            b.nhaDuLieu();
            b.hienThiDuBao();
    }
}

