import java.util.Scanner;

public class Print_all5 {
    public static void main(String[] args) {
        int number;
        Scanner scanner =new Scanner(System.in);
        System.out.println("the program will print number b/n 1 and agiven number");
        System.out.println("please enter any number...");
        number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println("number "+i);
        }

    }
}
