# U4S3

* Part A - Foundations 4.3
* Part B - Foundations Practice 
* Part C - Algorithm Challenge

## Part A
### Exercise 1
Go to the package `labs.partA.ex01` and open `ShoppingCart.java`
* Perform the following:
  * Use the indexOf method to get the index for the space
  character (" ") within custName
  * Assign it to spaceIdx
  * Use the substring method and spaceIdx to get the first name
  portion of custName
  * Assign it to firstName and print firstName
### Exercise 2
* Go to the package `labs.partA.ex02`, open `NameMaker.java`, and place your code in between the two comments
  * Perform the following:
    * Declare String variables: firstName, middleName, lastName,
    and fullName
    * Prompt users to enter their first, middle, and last names and
    read the names from the keyboard
    * Set and display the fullName as firstName+a blank
    char+middleName+a blank char+lastName

## Part B
### Exercise 01

#### Step 01

In the package `labs.partB.ex01` look at the file `IndexingExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.partB.ex01` complete the `Indexing` per the following:

        Utilizing index on the pre-defined String, start at the first e and locate the index of the very next e.

Your program is working correctly, if when run, the following is the output:
```
10
```

> Use IndexingExample for reference.

### Exercise 02

#### Step 01

In the package `labs.partB.ex02` look at the file `ConcatenateExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.partB.ex02` complete the `Concatenate` per the following:

    Create two different variables that hold text - a first name and a last name
    Create a third variable that combines both of the variables
    Print out the variable that contains the concatenation 

Your program is working correctly, if when run, the following is the output:
```
Abe Lincoln
```

> Use ConcatenateExample for reference.


### Exercise 03

#### Step 01

In the package `labs.partB.ex03` look at the file `ReplaceExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.partB.ex03` complete the `Replace` per the following:

    Utilizing the built in replace method, create a new String that holds an updated version of the sentence
    with every lowercase r transformed into uppercase. Print out this new string.

Your program is working correctly, if when run, the following is the output:
```
Using StRing Replace to Replace chaRacteR
```

> Use ReplaceExample for reference.

### Exercise 04

#### Step 01

In the package `labs.partB.ex04` look at the file `ExtractionExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.partB.ex04` complete the `Extraction` per the following:

    Utilizing the built in substring method on the predefined String, print out the results to satisfy the example below

Your program is working correctly, if when run, the following is the output:
```
Learn
g Ja
g Java is a good time!
```

> Use ExtractionExample for reference.

## Part C

#### Step 01

In the package `labs.partC` complete the `AlgoChallenge` per the following:

### Problem 01
The instructor provided you with a non-empty string and a number n.
The instructor wants you to remove the letter at index n and provide a new string.

Tip: Value of n should be a valid index of a given letter in the original string,
such as 0 or str.length()-1 inclusive

Example:
```java
missingLetter("kitten", 1) --> "ktten"
missingLetter("kitten", 0) --> "itten"
missingLetter("kitten", 4) --> "kittn"
```

### Problem 02
Given the word of the day, take the last letter and
return a new word of the day when you add the last letter to the front and back of the word.
For example, "founder" yields "rfounderr".

Tip: The word of the day will be a length 1 or more

Example:
```java
wordOfDay("cat") --> "tcatt"
wordOfDay("Hello" --> "oHelloo"
wordOfDay("a") --> "aaa"
```
