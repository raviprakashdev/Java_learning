public class Question1 {
    public static void main(String args[]) {

        //declare int Array
        int[] exerciseArray = {1,2,3,4,5};
        int sum=0;
        int avg;
        for (int i = 0; i < exerciseArray.length; i++) {
            System.out.println("Element is " + exerciseArray[i]);
            sum = sum + exerciseArray[i];
        }
        avg=sum/exerciseArray.length;
        System.out.println("length = "+exerciseArray.length);
        System.out.println("sum = "+sum);
        System.out.println("average= "+avg);
    }
}
