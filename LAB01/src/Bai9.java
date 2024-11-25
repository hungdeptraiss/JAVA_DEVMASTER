import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a:");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen b");
        int b = sc.nextInt();
        int x ;
      if (a==0){
          if(b==0){
          System.out.println("Pt vo so nghiem");}
          else{
              System.out.println("Pt vo nghiem");
          }


      }
      if (a!=0){
          System.out.println("Pt co nghiem duy nhat"+ (x=(-b/a)));
      }

    }
}
