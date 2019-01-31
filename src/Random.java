import java.util.*;
public class Random {
    public static void main(String[] args) {
        int geusss_number=0;
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

        int random = (int)((Math.random() * 10) + 1);
        //System.out.println(random);
        while(geusss_number!=random){
            System.out.println("Try to guess b/n 1 and 10");
            Scanner scanner=new Scanner(System.in);
            geusss_number=scanner.nextInt();
            if(geusss_number==random){
                System.out.println("you get it and you win");
                System.exit(0);
            }

        }
    }
}
