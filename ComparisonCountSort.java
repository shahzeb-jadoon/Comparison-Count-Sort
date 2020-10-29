import java.util.ArrayList;
import java.util.Random; 

public class ComparisonCountSort {

    public static ArrayList<Integer> comparisonCountSortIntList(ArrayList<Integer> unorderedList) {
        /**
         * Returns a sorted integer ArrayList by using comparison counting algorithm
         *  Not an in-place sort
         * 
         * @param  unorderedList is an unordered ArrayList of integers
         * @return sortedList which comprises of unorderedList's elements
         *          sorted in an increasing order
        */
        
        int listSize = unorderedList.size();

        //create a list of counts, and a list to create a sorted list
        ArrayList<Integer> countList = new ArrayList<Integer>();
        ArrayList<Integer> sortedList = new ArrayList<Integer>();

        //append zeros to count_lst and sorted_lst to make them of lst_size
        for (int count = 0; count < listSize; count++) {
            countList.add(0);
            sortedList.add(0);
        }

        //count how many items are smaller/greater for each item
        for (int outerLoopIndex = 0; outerLoopIndex < listSize - 1; outerLoopIndex++) {

            for (int innerLoopIndex = outerLoopIndex + 1; innerLoopIndex < listSize; innerLoopIndex++) {

                //increase count of item which is larger
                if (unorderedList.get(outerLoopIndex) < unorderedList.get(innerLoopIndex)) {
                    countList.set(innerLoopIndex, countList.get(innerLoopIndex) + 1);
                } 
                
                else {
                    countList.set(outerLoopIndex, countList.get(outerLoopIndex) + 1);
                }
            }
        }

        //assign values to sortedList by index based on their countList values
        for (int index = 0; index < listSize; index++) {
            sortedList.set(countList.get(index), unorderedList.get(index));
        }

        return sortedList;
    }


    public static ArrayList<Long> comparisonCountSortLongList(ArrayList<Long> unorderedList) {
        /**
         * Returns a sorted long integer ArrayList by using comparison counting algorithm
         *  Not an in-place sort
         * 
         * @param  unorderedList is an unordered ArrayList of long integers
         * @return sortedList which comprises of unorderedList's elements
         *          sorted in an increasing order
        */
        
        int listSize = unorderedList.size();

        //create a list of counts, and a list to create a sorted list
        ArrayList<Integer> countList = new ArrayList<Integer>();
        ArrayList<Long> sortedList = new ArrayList<Long>();

        //append zeros to count_lst and sorted_lst to make them of lst_size
        for (int count = 0; count < listSize; count++) {
            countList.add(0);
            sortedList.add(0L);     //Add (long) 0 to the list each iteration
        }

        //count how many items are smaller/greater for each item
        for (int outerLoopIndex = 0; outerLoopIndex < listSize - 1; outerLoopIndex++) {

            for (int innerLoopIndex = outerLoopIndex + 1; innerLoopIndex < listSize; innerLoopIndex++) {

                //increase count of item which is larger
                if (unorderedList.get(outerLoopIndex) < unorderedList.get(innerLoopIndex)) {
                    countList.set(innerLoopIndex, countList.get(innerLoopIndex) + 1);
                } 
                
                else {
                    countList.set(outerLoopIndex, countList.get(outerLoopIndex) + 1);
                }
            }
        }

        //assign values to sortedList by index based on their countList values
        for (int index = 0; index < listSize; index++) {
            sortedList.set(countList.get(index), unorderedList.get(index));
        }

        return sortedList;
    }
    

    public static ArrayList<Double> comparisonCountSortDoubleList(ArrayList<Double> unorderedList) {
        /**
         * Returns a sorted double type ArrayList by using comparison counting algorithm
         *  Not an in-place sort
         * 
         * @param  unorderedList is an unordered ArrayList of double type numbers
         * @return sortedList which comprises of unorderedList's elements
         *          sorted in an increasing order
        */
        
        int listSize = unorderedList.size();

        //create a list of counts, and a list to create a sorted list
        ArrayList<Integer> countList = new ArrayList<Integer>();
        ArrayList<Double> sortedList = new ArrayList<Double>();

        //append zeros to count_lst and sorted_lst to make them of lst_size
        for (int count = 0; count < listSize; count++) {
            countList.add(0);
            sortedList.add(0.0);
        }

        //count how many items are smaller/greater for each item
        for (int outerLoopIndex = 0; outerLoopIndex < listSize - 1; outerLoopIndex++) {

            for (int innerLoopIndex = outerLoopIndex + 1; innerLoopIndex < listSize; innerLoopIndex++) {

                //increase count of item which is larger
                if (unorderedList.get(outerLoopIndex) < unorderedList.get(innerLoopIndex)) {
                    countList.set(innerLoopIndex, countList.get(innerLoopIndex) + 1);
                } 
                
                else {
                    countList.set(outerLoopIndex, countList.get(outerLoopIndex) + 1);
                }
            }
        }

        //assign values to sortedList by index based on their countList values
        for (int index = 0; index < listSize; index++) {
            sortedList.set(countList.get(index), unorderedList.get(index));
        }

        return sortedList;
    }

    public static void main(String args[]) { 
        //Create instance of Random class
        Random rand = new Random();
        ArrayList<Integer> unorderedList1 = new ArrayList<Integer>();
        ArrayList<Long> unorderedList2 = new ArrayList<Long>();
        ArrayList<Double> unorderedList3 = new ArrayList<Double>();
        int lst_size = 10;

        for (int i = 0; i < lst_size; i++) {
            unorderedList1.add(rand.nextInt(1000));
            unorderedList2.add(rand.nextLong());
            unorderedList3.add(rand.nextDouble());
        }

        System.out.println("The initial integer list is:" + unorderedList1);
        System.out.println();
        System.out.println("The ordered integer list is:" + comparisonCountSortIntList(unorderedList1));
        System.out.println();
        System.out.println("The initial long integer list is:" + unorderedList2);
        System.out.println();
        System.out.println("The ordered long integer list is:" + comparisonCountSortLongList(unorderedList2));
        System.out.println();
        System.out.println("The initial doublle number list is:" + unorderedList3);
        System.out.println();
        System.out.println("The ordered double number list is:" + comparisonCountSortDoubleList(unorderedList3));
    }
}