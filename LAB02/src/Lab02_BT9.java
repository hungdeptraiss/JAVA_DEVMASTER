import java.util.Scanner;

public class Lab02_BT9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Người chơi 1 (B/K/G): ");
        char player1 = scanner.next().toUpperCase().charAt(0);
        System.out.print("Người chơi 2 (B/K/G): ");
        char player2 = scanner.next().toUpperCase().charAt(0);


        switch (player1) {
            case 'B':
                switch (player2) {
                    case 'B':
                        System.out.println("Hòa!");
                        break;
                    case 'K':
                        System.out.println("Người chơi 1 thắng!");
                        break;
                    case 'G':
                        System.out.println("Người chơi 2 thắng!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ từ người chơi 2.");
                }
                break;
            case 'K':
                switch (player2) {
                    case 'B':
                        System.out.println("Người chơi 2 thắng!");
                        break;
                    case 'K':
                        System.out.println("Hòa!");
                        break;
                    case 'G':
                        System.out.println("Người chơi 1 thắng!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ từ người chơi 2.");
                }
                break;
            case 'G':
                switch (player2) {
                    case 'B':
                        System.out.println("Người chơi 1 thắng!");
                        break;
                    case 'K':
                        System.out.println("Người chơi 2 thắng!");
                        break;
                    case 'G':
                        System.out.println("Hòa!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ từ người chơi 2.");
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ từ người chơi 1.");
        }

        scanner.close();
    }
}
