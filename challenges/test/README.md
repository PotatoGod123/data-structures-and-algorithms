# Data Structures and Algorithms

## Language: `Java`

### Reverse an Array

Take in an array and then return it in reversed order.

#### Challenge

Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

#### Approach & Efficiency

I took a for a loop approach while filling up a new array, as for the big 0 idk, fast i  guess?

#### Solution

![Whiteboard for Reverse Array](../../assets/aww-board.png)

# ####################################################################

### Add a value into the middle of an array

Puts something in the middle of arrray.

#### Challenge

Write a function called insertShiftArray which takes in an array and the value to be added.

#### Approach & Efficiency

It's efficient as it wil get, depends on how big the array is that gets put in the args

#### Solution


![Board for Shift Arrray](../../assets/shiftarrayboard.png)

# ####################################################################

### Finding a Matching value using binary search

Find the matching int in an array using binary search technique.

#### Challenge  

Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element.  

#### Approach & Efficiency  

The time needed to take scales with the space as it depends how big the array is, but the efficiency is insane since it take less steps to find the matching number than in an for loop.

#### Solution

![Board for Binary Search](../../assets/binarysearchboard.png)  

# ########################################################################  

### Singly Linked List  
Making a new linked list, with several methods of testing and reading.  

#### Challenge  

 Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.  
 Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.  
 Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
        "{ a } -> { b } -> { c } -> NULL"  


#### Approach & Efficiency  

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I just made a linklist and node class which will generate a new linklist, from there you able to use the methods to add new nodes to the list. Big o is 1 while space is 1 as well.

#### API  

nada()- This will check if your new linklist is empty.  

insert(int data)- this will insert your values into your fully form linklist. Warn, this will add the node to the beginning of the list! so you last insertion will always be first in the list.

printNode()- this will return a str that contains all your linkedlist values

toString()- will return a str of all the values in a fancy way

includes(int num)-will check if a certain values is inside the linkedlist and return a boolean.

firstNode()- will return the first value of your linked list