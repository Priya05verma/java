import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        System.out.println("enter currency");
        Scanner sc = new Scanner(System.in);
        int currency = sc.nextInt();
        double usd;
        usd = (currency/84.04);
        System.out.println(usd );
    }
}
