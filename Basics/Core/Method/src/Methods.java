public class Methods {
    //    public  - visible to everyone
//    private  -  visible to only to class
//    protected   - visible to the packages and all
//    modifier return-type method-name(parameter-list){
//        body
//    }
    public static void main(String args[]){
        sayHello();
        int a=500;
        int b=88;
        int result=minNum(a,b);
        System.out.println(result);

    }

    public static void sayHello(){
        System.out.println("Hello Ravi Prakash");
    }
    public static int minNum(int a,int b){
        int min;
        if(a>b){
            min=b;
        }else{
            min=a;
        }
        return min;
    }




}
