import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        switch (str) {
            case"January":
                System.out.println("一月");
                break;
            case"February":
                System.out.println("二月");
                break;
            case"March":
                System.out.println("三月");
                break;
            case "April":
                System.out.println("四月");
                break;
            case"May":
                System.out.println("五月");
                break;
            case"June":
                System.out.println("六月");
                break;
            case"July":
                System.out.println("七月");
                break;
            case"August":
                System.out.println("八月");
                break;
            case"Srptember":
                System.out.println("九月");
                break;
            case"October" :
                System.out.println("十月");
                break;
            case"November":
                System.out.println("十一月");
                break;
            case"December":
                System.out.println("十二月");
                break;
        }
    }
}
