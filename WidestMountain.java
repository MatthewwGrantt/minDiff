public class WidestMountain {
    public static void main(String[] args) throws Exception {
        int[] intArray1 = {6, 3, 5, 2, 7}; 
        findWidestMountain(intArray1); // should output 3
        // which is the length of the array that is a mountain [3, 5, 2]

        int[] intArray2 = {2, 5, 7, 13};
        findWidestMountain(intArray2); // should output 0. 
        // There is no mountain in this trail as it is strictly increasing and never decreases.
        // Therefore, Sasha cannot run on this trail

        int[] intArray3 = {3, 8, 5, 4, 1, 5, 2};
        findWidestMountain(intArray3); // should output 5
        // as [3, 8, 5, 4, 1]'s length is 5
    }


    //Do not modify above this line 
    public static int findWidestMountain(int[] mountainRange) {
        return 0;
    }



}