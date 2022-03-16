# lesson24 - Insertion sort

## Overview

In this lab you will write your own version of insertion sort and then write a set of tests to
ensure that your algorithm is correct. The insertion sort algorithm is given to you in the book,
however it is written to only use arrays of integers. Our implementation is going to use the
List interface and work with any object using generics!

## Videos

- [Lab Overview]()

## Task 1 - Write Unit tests

We will be sorting Lists of type **T** so it will be quite straight forward to construct a set of
tests that we can use to make sure our code is correct. Here is a list of cases that we should test.

- Array that is not sorted
- Array that is sorted
- Array that is partially sorted
- An empty array

For our Unit tests we will use the **String** class and the **Integer** class. We will have to use
a [comparator](https://docs.oracle.com/javase/10/docs/api/java/util/Comparator.html) to compare
our list elements because they will be generic.

## Task 2 - Complete the MySort Class

In your starter code there is a class named MySort that you will need to complete. The class
implements the **InsertionSort** interface. 

## Task 3 - Complete App.java

The **App.java** class will do the following:

- Parse in a set of integers from standard in.
- Output the unsorted array
- Perform an insertion sort on the array.
- Output the number of comparisons and swaps performed.
- Output the array at each step in the sort process

For your **App.java** class you can assume that the input will always be integers! You don't have
to worry about any other types.

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

## Task 4 - Complete the Retrospective

Once you have completed all the tasks open the file Retrospective.md and complete each section with
a TODO comment.

## Task 5 - Add, Commit, Push your code

Once you are finished you need to make sure that you have pushed all your code to GitHub for
grading!
