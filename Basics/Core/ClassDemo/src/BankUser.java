public class BankUser {

    public static void main(String args[]){

        BankApp john = new BankApp("Ravi Prakash");

        john.accAge(45);
        john.accAmount(10000);

        john.getInfo();
        BankApp ravi = new BankApp("Sun light");

        ravi.accAge(25);
        ravi.accAmount(30000);

        ravi.getInfo();

        ravi.accAmount(200);
        john.accAmount(5000);
        john.getInfo();
        ravi.getInfo();

//        inheritance starts here

        SbiUser ram=new SbiUser("ram");
        ram.accAmount(30);
        ram.accTax("mytaxinfo");
        ram.getInfo();
    }
}
