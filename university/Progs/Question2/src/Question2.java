public class Question2 {
    public static void main(String args[]) {

        //declare int Array
        int[] exerciseArray = {78,2,9,4,5};

        //print array elements
        for (int i = 0; i < exerciseArray.length; i++) {
            System.out.println("Element is " + exerciseArray[i]);
        }

        //find the largest number
        int largest = exerciseArray[0];
        for (int i = 0; i < exerciseArray.length; i++) {
            if (exerciseArray[i] > largest) {
                largest = exerciseArray[i];
            }
        }
        //find the smallest number
        int smallest = exerciseArray[0];
        for (int i = 0; i < exerciseArray.length; i++) {
            if (exerciseArray[i] < smallest) {
                smallest = exerciseArray[i];
            }
        }
        System.out.println("largest value is "+largest);
        System.out.println("smallest value is "+smallest);

    }
}
