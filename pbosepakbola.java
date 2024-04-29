import java.util.Scanner;

public class pbosepakbola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nomor pemain (1-11):");
        int playerNumber = scanner.nextInt();
        
        String bestPlayer;
        
        if (playerNumber >= 1 && playerNumber <= 11) {
            switch (playerNumber) {
                case 1:
                    bestPlayer = "Enzo Fernandes";
                    break;
                case 2:
                    bestPlayer = "Sergio Agüero";
                    break;
                case 3:
                    bestPlayer = "Ángel Di María";
                    break;
                case 4:
                    bestPlayer = "Paulo Dybala";
                    break;
                case 5:
                    bestPlayer = "Giovani Lo Celso";
                    break;
                case 6:
                    bestPlayer = "Nicolás Otamendi";
                    break;
                case 7:
                    bestPlayer = "Rodrigo De Paul";
                    break;
                case 8:
                    bestPlayer = "Emiliano Martínez";
                    break;
                case 9:
                    bestPlayer = "Marcos Acuña";
                    break;
                case 10:
                    bestPlayer = "Lionel Messi";
                    break;
                case 11:
                    bestPlayer = "Gonzalo Montiel10";
                    break;
                default:
                    bestPlayer = "Pemain tidak valid";
            }
        } else {
            bestPlayer = "Pemain tidak valid";
        }
        
        System.out.println("Pemain terbaik dengan nomor " + playerNumber + " adalah: " + bestPlayer);
    }
}
