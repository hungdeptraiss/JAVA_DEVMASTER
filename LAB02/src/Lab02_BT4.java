import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Lab02_BT4 {
    private float a;
    private float b;
    private float c;


    public void nhapSo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
         a = sc.nextInt();
        System.out.println("Nhap b: ");
         b = sc.nextInt();
        System.out.println("Nhap c: ");
         c = sc.nextInt();

    }
    public void giaiPhuongTrinh(){
        if ( a==0){
            if ( b==0){
                if ( c==0){
                    System.out.println("pt luon dung");
                }
                else {
                    System.out.println("Pt vo nghiem");
                }

            }
            else {
                System.out.println("pt co nghiem x="+((-c)/b));
            }

        }else {
            float delta = ((float)pow(b,2))-4*c;
            if( delta==0){
                System.out.println("Pt co nghiem kep"+((-b)/2*a));
            }
            else if( delta>0){
                System.out.println("Pt co 2 nghiem phan biet" +"x1="+((-b+sqrt(delta))/2*a) + "x2=" + ((-b-sqrt(delta))/2*a));
            }

            else {
                System.out.println("pt vo nghiem");
            }
        }
    }
    public static void main(String[] args) {
    Lab02_BT4 pheptinh = new Lab02_BT4();
    pheptinh.nhapSo();
    pheptinh.giaiPhuongTrinh();
    }
}
