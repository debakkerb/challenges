# Grokking Algorithms

## Coding Exercises

* Binarh Search - [Solution](./src/main/java/com/bdb/algorithms/BinarySearch.java)
  , [Tests](./src/test/java/com/bdb/algorithms/BinarySearchTest.java)
* QuickSort - [Solution](./src/main/java/com/bdb/algorithms/sort/QuickSort.java)
  , [Test](./src/test/java/com/bdb/algorithms/QuickSortTest.java)

## Exercises

### Chapter 1

1.1 Suppose you have a list of 128 names, and you're searching through it with binary search. What's the max number of
steps? **7, 2 ^ 7 = 128**
1.2 Suppose you double the list?  **8, 2 ^ 8 = 256**
1.3 You have a name, and you want to find the person's phone number in a phone book?  **O(logN)**
1.4 You have a phone number and want to find the person's name?  **O(N), as you have to search the entire phonebook**
1.5 You want to read the numbers of every person in the phonebook? **O(N), same as before**
1.6 You want to read the numbers of just the A-persons? **O(N), because the runtime grows when more people are added.**

### Chapter 2

2.1 Lots of inserts, small number of reads = Linked List 
2.2 LinkedList. You add at the back of the queue each time, which is fast and you don't rely on memory addresses. 
2 .3 Array, as you need many reads and a low number of inserts. 
2.4 Arrays have to be sorted on each insert, which is slow.  
2.5 Searching is slower than arrays, but faster than linkedlists. Inserting is faster than arrays, but slower than
linkedlists.

# Coding Challenges

* String to Integer (atoi) - [Leetcode](https://leetcode.com/problems/string-to-integer-atoi/)
  , [Solution](./src/main/java/com/bdb/challenges/Atoi.java), [Tests](./src/test/java/com/bdb/challenges/AtoiTests.java)
* Transpose File - [Leetcode](https://leetcode.com/problems/transpose-file/)
  , [Solution](./src/main/java/com/bdb/challenges/TransposeFile.java)
* Extra long factorial - [HackerRank](https://www.hackerrank.com/challenges/extra-long-factorials/problem)
  , [Solution](./src/main/java/com/bdb/challenges/ExtraLongFactorial.javaw)
