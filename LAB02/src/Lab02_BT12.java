import java.util.Scanner;

public class Lab02_BT12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Math score: ");
        int math = scanner.nextInt();
        System.out.print("Enter Physics score: ");
        int physics = scanner.nextInt();
        System.out.print("Enter Chemistry score: ");
        int chemistry = scanner.nextInt();


        int total = math + physics + chemistry;

        // Check conditions
        if (total >= 15 && math >= 4 && physics >= 4 && chemistry >= 4) {
            if (math > 5 && physics > 5 && chemistry > 5) {
                System.out.println("Học đều các môn");
            } else {
                System.out.println("Học chưa đều các môn");
            }
        } else {
            System.out.println("Thi hỏng");
        }

        scanner.close();
    }
}
