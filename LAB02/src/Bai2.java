import java.util.Scanner;
public class Bai2{
    public static void main(String[] args) {
        int soA, soB;
      float ketQua;
        String phepTinh;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter so A: ");
        soA = sc.nextInt();
        System.out.print("Enter so B: ");
        soB= sc.nextInt();
        System.out.println("Phap tinh");
        phepTinh = sc.nextLine();

        //thuc hien tinh toan
        switch (phepTinh){
            case "+":
                ketQua = soA+soB;
                break;

            case "-":
                ketQua = soA-soB;
                break;

            case "*":
                ketQua = soA*soB;
                break;

            case "/":
                ketQua =(float) soA/soB;
                break;

            case "%":
                ketQua = soA%soB;
                break;

        }
        System.out.println(phepTinh);
    }
}
