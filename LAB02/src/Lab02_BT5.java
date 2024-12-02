import java.util.Scanner;
public class Lab02_BT5 {
    private int n;

    public void nhapSo(){
        Scanner sc = new Scanner(System.in);
        n  = sc.nextInt();


    }
    public void chanLe(){
        if (n%2==0){
            System.out.println("n la so chan");

        }else {
            System.out.println("n la so le");
        }
    }
    public static void main(String[] args) {
        Lab02_BT5 obj = new Lab02_BT5();
        obj.nhapSo();
        obj.chanLe();

    }
}