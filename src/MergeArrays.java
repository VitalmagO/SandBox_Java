public class MergeArrays {
    public static void main(String[] args) {
        int[] a1 = {0, 1, 3};
        int[] a2 = {1, 3, 5};

        for (int i:
        mergeArrays(a1,a2)) {
            System.out.println(i);
        }
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        for (int i1 = 0, i2 = 0,i3 = 0;i3 < a3.length;){
            if (i1 == a1.length){
                a3[i3] = a2[i2];
                i3++;
                i2++;
                continue;
            }
            if (i2 == a2.length){
                a3[i3] = a1[i1];
                i3++;
                i1++;
                continue;
            }
            if (a1[i1] < a2[i2]) {
                a3[i3] = a1[i1];
                i3++;
                i1++;
            } else {
                a3[i3] = a2[i2];
                i3++;
                i2++;
            }
        }
        return a3; // your implementation here
    }
}