CS150 - Introduction to Computing II

mp08 (JCF) - 50 pts 

Due: 5:00 pm Friday, April 21, 2017
==========================================================================================
Electronic submission:
You must submit a single .zip archive file of your BlueJ project folder. Use
a utility that produces .zip files (Windows: right click | Send to | compress,
Mac: right click | compress). No other formats will be accepted.
==========================================================================================
Objectives:
    - To implement a bi-directional linked list, using head/tail dummy nodes.
==========================================================================================
Project setup options:

Existing project:
Rename the project to mp<n>.<FirstLast>

New project: 
Using BlueJ, create the project mp<n>.<FirstLast>

Either project:
Replace <n> with the mp's number and <FirstLast> with your name. Do not include the <> brackets. 
For instance, mp08.SocratisTornaritis. 

This is the only acceptable name, so please be careful. Any other variation 
of this will not be graded.

Refer to the appropriate "how to" tutorials available on the course website, 
for instructions on how to create a BlueJ project and manage its files.
==========================================================================================
Language features used:
    - JCF - Linked List
==========================================================================================
Problem Description:
    In this mp you are going to implement a bi-directional linked list that uses a head
    and tail dummy nodes.
==========================================================================================
Program requirements:
    
    (1) Add the Student class.
    
                                Student
    ---------------------------------------------------------------------
    -first: String
    -last: String
    -gpa: double
    ---------------------------------------------------------------------
    +Student(first: String, last: String, gpa: double)
    
    +getFirst(): String <<final>>
    +getLast(): String <<final>>
    +getName(): String <<final>>
    +getGpa(): double << final>>
    
    +setFirst(first: String): void <<final>>
    +setLast(last: String): void <<final>>
    +setName(first: String, last: String): void <<final>>
    +setGpa(gpa: double): void <<final>>
    
    +toString(): String <<override>>
    ---------------------------------------------------------------------
    
    Note: The getName() method should return the string: <last>, <first>
          The toString() should return the string: [<last>, <first>, <gpa>]
          
    (2) Implement the linked list provided.
    Follow the comments within the class as a guideline.
    
    (3) Add the Main class. Use the output below to populate the list with the
    shown students, and display the original empty, populated and reverse lists as shown.
==========================================================================================    
Output:
      
Original empty list: [
]

Populated list: [
	[Apple, Adam, 3.3]
	[Pumpkin, Peter, 2.5]
	[Kasava, Kay, 4.3]
	[Jalopeno, Jane, 4.5]
	[Guava, Gary, 1.3]
]

Reverse list: [
	[Guava, Gary, 1.3]
	[Jalopeno, Jane, 4.5]
	[Kasava, Kay, 4.3]
	[Pumpkin, Peter, 2.5]
	[Apple, Adam, 3.3]
]
==========================================================================================    
Grading Rubric:
==========================================================================================
Feature:                                                            Points
Reward submission (5:00p Wed)                                           +5
Penalized submission (5:00p Sat)                                       -25
Late submission (> 5:00p Sat)                                          -50
--------------------------------------------------------------------------------
Project file not named properly                                         -5
--------------------------------------------------------------------------------
Program does not compile or run                                         -6
--------------------------------------------------------------------------------
Coding style:
 - no comments, bad variable names, no code structure                   -5
--------------------------------------------------------------------------------
Main class                                                               5
--------------------------------------------------------------------------------
Student class                                                           15
--------------------------------------------------------------------------------
LinkedList class                                                        30
--------------------------------------------------------------------------------