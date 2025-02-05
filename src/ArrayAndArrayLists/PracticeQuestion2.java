package ArrayAndArrayLists;

public class PracticeQuestion2 {
    //Sum of all elements of a given array
    public static void main(String[] args) {
        //Given array
        int[] marks = {12, 23, 54, 86, 92, 2, 7, 37, 34, 21, 87, 65, 46, 24, 36, 43, 23, 43, 75, 44};
        int count=0,n = marks.length, sum = 0;
        System.out.println("Marks of Student : ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i]+"\t");
            count++;
            if(count==10){//for line break after 10 elements
                count=0;
                System.out.println();
            }
        }
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        System.out.println("Sum of all marks = " + sum);

    }
}
