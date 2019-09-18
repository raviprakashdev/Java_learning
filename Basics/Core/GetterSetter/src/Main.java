public class Main {

    public static void main(String[] args){
        Myclass ravi = new Myclass("myNmae",20,123456);

//        ravi.name= "ravi";

//        System.out.println(ravi.name);
        ravi.setName("raviprakashdev");
        ravi.setAge(20);
        System.out.println(ravi.getAge());
        System.out.println(ravi.getName());

    }
}


class Myclass{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    private String name = "prakash";
    private int age;
    private int accNo;

    //getter
    public int getAge(){
        return age;
    }

    //setter
    public void setAge(int myAge){
        age = myAge + 3;
    }

    public Myclass(String name, int age, int accNo) {
        this.name = name;
        this.age = age;
        this.accNo = accNo;
    }


}
