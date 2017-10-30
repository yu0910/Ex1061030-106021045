import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        if (v1 <= 7 && v1 > 0){
            if(v1 == 1) {
                System.out.println("Monday");
            }else if (v1 == 2) {
                System.out.println("Tuesday");
            }else if (v1 == 3) {
                System.out.println("Wednesday");
            }else if (v1 == 4) {
                System.out.println("Thursday");
            }else if (v1 == 5 ) {
                System.out.println("Friday");
            }else if (v1 == 6) {
                System.out.println("Saturday");
            }else {
                System.out.println("Sunday");
            }}else {
            System.out.println("Error");
        }
    }
}
