import java.util.Scanner;  

public class ue02_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int biggestValue = 0;
        int currentValue = 0;
        int i = 0;
        while(i < 3){
            System.out.println("Please enter an integer");
            currentValue = s.nextInt();
            if(currentValue > biggestValue) {
                biggestValue = currentValue;
            }
            i = i + 1;
        }

        System.out.println("The biggest of the 3 values is: " +biggestValue);
    }
}
