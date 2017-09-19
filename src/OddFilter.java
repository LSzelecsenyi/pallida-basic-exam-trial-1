        // Create a function that takes a list as a parameter,
        // and returns a new list with every odd element from the orignal list
        // System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));
        // should print [1, 3, 5]

import java.util.ArrayList;

    public class OddFilter {

        public static void main(String[] args) {

            int[] numberArray = {1, 2, 3, 4, 5};
            System.out.println(oddFilter(numberArray));

        }

        static ArrayList<Integer> oddFilter(int[] numberArray) {
            ArrayList<Integer> oddList = new ArrayList<>();
            for (int i = 0; i < numberArray.length; i++) {
                if (numberArray[i] % 2 != 0) {
                    oddList.set(i, numberArray[i]);
                }
            }
            return oddList;
    }
}