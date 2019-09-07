import java.util.Scanner;

public class BankApp {

    String name;
    int age;
    String taxData;
    double amount;

    //constructor
    public BankApp(String name){
        this.name = name;
    }
    //ask user for age

    public void accAge(int age){
        this.age = age;
    }
    public void accTax(String taxData){
        this.taxData = taxData;
    }
    public void accAmount(double amount){
        this.amount = amount;
    }

    public void getInfo(){
        System.out.println('Name of user');
    }
}

//Scanner in = new Scanner()
