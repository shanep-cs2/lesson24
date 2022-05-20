package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MySortTest {

    @Test
    public void testSorted(){
        List<Integer> actual = Arrays.asList(1,2,3,4,5);

        InsertionSort<Integer> s = new MySort<Integer>();
        s.sort(actual, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        });
        List<Integer> expected = Arrays.asList(1,2,3,4,5);
        assertEquals(actual, expected);
    }

    @Test
    public void testReversed(){
        List<Integer> actual = Arrays.asList(5,4,3,2,1);

        InsertionSort<Integer> s = new MySort<Integer>();
        s.sort(actual, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        });

        List<Integer> expected = Arrays.asList(1,2,3,4,5);
        assertEquals(actual, expected);
    }

    @Test
    public void testZeroLength(){
        List<Integer> actual = Arrays.asList();

        InsertionSort<Integer> s = new MySort<Integer>();
        s.sort(actual, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        });

        List<Integer> expected = Arrays.asList();
        assertEquals(actual, expected);
    }

    @Test
    public void testOne(){
        List<Integer> actual = Arrays.asList(1);

        InsertionSort<Integer> s = new MySort<Integer>();
        s.sort(actual, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        });

        List<Integer> expected = Arrays.asList(1);
        assertEquals(actual, expected);
    }

    @Test
    public void testSort() {
        List<Integer> actual = Arrays.asList(6, 3, 2, 1, 5, 9, 8);

        InsertionSort<Integer> s = new MySort<Integer>();
        s.sort(actual, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        });

        List<Integer> expected = Arrays.asList(6, 3, 2, 1, 5, 9, 8);
        expected.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        });
        assertEquals(actual, expected);
        assertEquals(s.getNumSwaps(), 8);
    }

    @Test
    public void testRandom() {
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (int i = 0; i < 2000; i++) {
            Collections.shuffle(actual);
            InsertionSort<Integer> s = new MySort<Integer>();
            s.sort(actual, new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }

            });
            assertEquals(actual, expected);
        }
    }

    @Test
    public void testPrint() {
        List<Integer> actual = Arrays.asList(3, 2, 1, 5, 9, 8);

        InsertionSort<Integer> s = new MySort<Integer>();
        s.sort(actual, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }

        }, true);

        assertEquals(s.getNumSwaps(), 4);
    }

    @Test
    public void testString() {
        List<String> actual = Arrays.asList("6", "3", "2", "1", "5", "9", "8");

        InsertionSort<String> s = new MySort<String>();
        s.sort(actual, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });

        List<String> expected = Arrays.asList("6", "3", "2", "1", "5", "9", "8");
        expected.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });

        assertEquals(actual, expected);
    }

}
