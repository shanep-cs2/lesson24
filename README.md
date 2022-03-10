# lesson24 - Insertion sort

## Overview

In this lab you will write your own version of insertion sort and then write a set of tests to
ensure that your algorithm is correct. The insertion sort algorithm is given to you in the book
your task is to write tests and make the required modifications.

## Videos

- [Lab Overview]()

## Task 1 - Write Unit tests

We will be sorting arrays of integers so it will be quite easy to construct a set of tests that we
can use to make sure our code is correct. Here is a list of cases that we should test.

- Array that is not sorted
- Array that is sorted
- Array that is partially sorted
- An empty array

## Task 2 - Complete the MySort Class

In your starter code there is a class named MySort that you will need to complete. The class 
will consist of only static methods as it doesn't really make any sense to construct a new object
as there is no state to maintain.

Your MySort class will do the following:

- Parse in a set of integers from standard in.
- Output the unsorted array
- Perform an insertion sort on the array.
- Output the number of comparisons and swaps performed.
- Output the array at each step in the sort process


## Example

Input:

```
6 3 2 1 5 9 8
```

Output:

```
3 2 1 5 9 8

2 3 1 5 9 8
1 2 3 5 9 8
1 2 3 5 9 8
1 2 3 5 9 8
1 2 3 5 8 9

comparisons: 7
swaps: 4
```

