public class MaximumValueInArray {
    public static void main(String[] args) {
        int [] arr = {1,21,3,4433,433,443,2211};
        int max = 0;
        for (int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("the value of the maximum element in this array is :" + max);
    }
 
}
