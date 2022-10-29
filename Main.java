import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = 0;
        lastNum(a, b, c);


    }

    public static void lastNum(int a, int b, double c){
        c = (a * a) + (b * b);
        c = (double) Math.sqrt(c);
        System.out.println(c);
    }

}