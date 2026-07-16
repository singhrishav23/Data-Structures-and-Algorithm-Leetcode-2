//Passing array as arguement --> Arrays me Pass by reference hota hai

public class Arrays2 {

    public static void update (int marks[], int nonchangable) {

        nonchangable = 10;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {

        int nonchangable = 5; //Variable me Pass by value hi hota hai
        int marks[] = {97, 98, 99};
        
        update(marks , nonchangable); // Arrays me pass by reference hota hai

        System.out.println(nonchangable);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

}
