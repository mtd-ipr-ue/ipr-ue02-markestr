import java.util.Scanner; 

public class ue02_3 {
    public static void main(String[] args) {
        /*  Rand des Quadrats wird bei meiner Implementierung NICHT zum Quadrat gezaehlt
            Rand es Kreises wird bei meiner Implementierung NICHT zum Quadrat gezaehlt 
        */

        Scanner s = new Scanner(System.in);

        final int r = 4;

        System.out.println("Bitte geben Sie eine X-Koordinate ein!");
        double x = s.nextDouble();
        System.out.println("Bitte geben Sie eine Y-Koordinate ein!");
        double y = s.nextDouble();
        
        boolean inside = true;

        if(x < r && x > 0) {
            if(y < r && y > 0) {
                if(Math.sqrt((x*x) + (y*y)) > r) {
                    System.out.println("Der Punkt: {"+x+"} {"+y+"} liegt innerhalb des gruenen Bereichs");
                } else {
                    inside = false;
                }
                
            } else {
                inside = false;
            }
           
        } else {
            inside = false;
        }

        if(!inside) {
            System.out.println("Der Punkt: {"+x+"} {"+y+"} liegt AUSSERHALB des gruenen Bereichs!!!!!");
        }
        
    }
}
