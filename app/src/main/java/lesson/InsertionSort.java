package lesson;

import java.util.Comparator;
import java.util.List;

public interface InsertionSort<T> {

    /**
     * Sorts a list in the order determined by the comparator
     * @param list The list to sort
     * @param compare The comparator
     */
    public void sort(List<T> list, Comparator<T> compare );

     /**
     * @return The number of Swaps that we made in the sort
     */
    public int getNumSwaps();

    /**
     * @return The number of comparisons that we made during the sort
     */
    public int getNumComparisons(); 
    
}
