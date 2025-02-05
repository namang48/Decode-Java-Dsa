package ArrayAndArrayLists;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] marks = {12, 23, 54, 86, 92, 2, 7, 37, 34, 21, 87, 65, 46, 24, 36, 43, 23, 43, 75, 44};
        int n = marks.length;
        System.out.println("Array Elements List : ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        //SecondLargest Element in the Array finding
        int max = marks[0];
        int secondMax = Math.min(marks[0],marks[1]);

        for (int i = 0; i < n; i++) {
            if (marks[i]>max){
                secondMax=max;
                max=marks[i];
            }else if(marks[i]>secondMax && marks[i]<max){
                secondMax=marks[i];
            }
        }
        System.out.println("Maximum Value in the Array is : " + max);
        System.out.println("Second Largest Element in the Array is : " + secondMax);

    }
}
