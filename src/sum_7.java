import java.util.Scanner;

public class sum_7 {

        public static void main(String [] args){
            int number;
            int sum=0;
            Scanner scanner =new Scanner(System.in);
            System.out.println("the program will sum number b/n 1 and agiven number");
            System.out.println("please enter any number...");
            number=scanner.nextInt();
            for(int i=1;i<=number;i++){
                sum=sum+i;
        }
            System.out.println("the sum of the number is "+sum);
    }
}
