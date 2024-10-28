import java.util.Scanner; 

public class ue02_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Jahrszahl ein: ");
        int year = s.nextInt();
        System.out.println("Bitte geben Sie einen Monatswert zwischen 1 und 12 ein: ");
        int month = s.nextInt();
        int days = 0;

        switch(month){
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if(year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 400 == 0){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Fehler. Geben Sie einen gueltigen Wert ein!!");
                break;
            }
        System.out.println("Der " +month+"te Monat hat: "+days+" Tage");
    }
}
