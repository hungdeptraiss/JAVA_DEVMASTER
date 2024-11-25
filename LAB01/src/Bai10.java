import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a:");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen b");
        int b = sc.nextInt();
        System.out.println("Nhap so nguyen c");
        int c = sc.nextInt();
        int x ;
        int delta;
        delta = (b*b- 4*a*c);
        if (a==0){
            if(b==0&&c==0){
                System.out.println("Pt vo so nghiem");}
            else{
                System.out.println("Pt vo nghiem");
            }

        }
        if (a!=0){
            System.out.println("Pt co nghiem duy nhat"+ (x=(-b/a)));
        }
        if (delta<0){

                System.out.println("Pt vo nghiem");}
        if (delta==0){
            System.out.println("Pt co 1 nghiem duy nhat la"+"x1 = x2 =" +((-b)/(2*a) ));
        }
        if (delta>0){
            System.out.println("pt co 2 nghiem phan biet la" +"x1="+(-b+ Math.sqrt(delta))/(2*a) +"va "+ "x2="+(-b- Math.sqrt(delta))/(2*a)) ;
        }







    }
}
