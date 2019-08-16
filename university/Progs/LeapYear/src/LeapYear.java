public class LeapYear {

    public static void main(String arg[]){

        int year = 2008;

        if((year % 400==0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a year");
        }
    }
}
