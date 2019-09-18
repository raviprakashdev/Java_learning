public class SbiUser extends BankApp {

    public SbiUser(String name){
        super(name);
        System.out.println("i m cons from new class");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Name of tax info is: " +taxData);

    }
}

//multilevel inheritance

//public class NewBank extends BankApp{
//
//    public NewBank(String name){
//        super(name);
//    }
//}
