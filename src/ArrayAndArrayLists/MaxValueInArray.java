package ArrayAndArrayLists;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] marks = {12, 23, 54, 86, 92, 2, 7, 37, 34, 21, 87, 65, 46, 24, 36, 43, 23, 43, 75, 44};
        int n = marks.length;
        System.out.println("Array Elements List : ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        //Maximum Element in the Array finding
        int max = marks[0];
        for (int i = 0; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Maximum Vlaue in the Array is : " + max);

    }
}
