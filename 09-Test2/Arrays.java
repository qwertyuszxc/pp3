public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2){
        int counter1=0;
        int counter2=0;
        for (int i : arr1){
            if (i >= 10 && i < 100) {
                counter1+=1;
            }
        }
        for (int i : arr2){
            if (i >= 10 && i < 100) {
                counter2+=1;
            }
        }
        if (counter1 == counter2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        int[] a1 = { 18, 4, 5, 37, 49, 177 };
        int[] a2 = { 9, 6, 7, 12, 4, 4, 6, 90, 6, 7, 8, 4 };
        System.out.println(Arrays.arr(a1, a2));
     }
}
