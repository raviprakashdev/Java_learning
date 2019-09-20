import java.util.Scanner;

public class Factorial {

    public static void main(String args[]){

        int number;
        int factorial=1;

        System.out.println("Enter the number");

        Scanner in = new Scanner(System.in);

        number= in.nextInt();

        if(number<0){
            System.out.println("please enter no > 0");
        }
        else{
            for (int i=1;i<=number;i++){
                factorial *= i;
            }
        }
        System.out.println("factorial is: "+factorial);
    }
}
