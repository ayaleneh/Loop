import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("please enter any whole number to get factorial");
        Scanner scanner=new Scanner(System.in);
        int number;
        int result=1;
        number=scanner.nextInt();
        if(number==0){
            System.out.println("the factoral of "+number+" is "+0);
        }else{
            while(number!=0){
                result=result*number;
                number--;
            }
            System.out.println("the factorial of "+number +" is "+result);
        }

    }
}
