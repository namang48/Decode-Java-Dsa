package ArrayAndArrayLists;

public class PracticeQuestion {
    /*Q1: Given an array of marks of students, if the mark of any
    student is less than 35 print its roll number. [roll number
    here refers to the index of the array.
     */
    public static void main(String[] args) {
        //Given Array of marks
        int[] marks= {12,23,54,86,92,2,7,37,34,21,87,65,46,24,36,43,23,43,75,44};
        int n=marks.length;
        for (int i = 0; i < n; i++) {
            if(marks[i]<35) System.out.print(i+"\t");
        }
    }
}
