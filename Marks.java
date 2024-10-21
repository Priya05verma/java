import java.util.Scanner;
public class Marks  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks ;
        marks = sc.nextInt();
        if(marks>=91 && marks<=100){
            System.out.println("you got grade AA");
        }
        else if(marks>=81 && marks<=90){
            System.out.println("you got grade AB");
        }
        else if(marks>=71 && marks<=80){
            System.out.println("you got grade BB");
        }
        else if (marks>=61 && marks<=70){
            System.out.println("you got grade BC");
        }
        else if (marks>=51 && marks<=60){
            System.out.println("you got grade CD");
        }
        else if (marks>=41 && marks<=50){
            System.out.println("you got grade DD");
        }
        else {
            System.out.println("you are fail ");
        }

    }
}
