# Welcome to the Learning Outcomes Evaluation

Dear students,

Welcome to this Learning Outcomes Evaluation session. Over the next two hours, we will be assessing your understanding and mastery of the learning outcomes for this semester. This evaluation is an important opportunity for you to showcase your knowledge and skills.

Please take this evaluation seriously and demonstrate your best work from the last two weeks by using your personal git account as proof. Remember to answer each question thoroughly and provide clear explanations where necessary.

Best regards,
Ghada Hassan and Kay Berkling

## Ethics Section regarding generative and other forms of AI

The student acknowledges and agrees that the use of AI is strictly prohibited during this evaluation. By submitting this report, the student affirms that they have completed the assessment independently and without the assistance of any AI technologies. This agreement serves to ensure the integrity and authenticity of the student's work, as well as their understanding of the learning outcomes.


## Checklist before handing in your work

- [ ] Review the assignment requirements to ensure you have completed all the necessary tasks.
- [ ] Pay careful attention to the requested links that must come from your project.
- [ ] Double-check your links and make sure that links lead to where you intended. Each answer should have links to work done by you in your own git repository
- [ ] Make sure you have at least 10 references to your project code (This is important evidence to prove that your project is substantial enough to support the learning outcome of object oriented design and coding within a larger piece of code.)
- [ ] Include comments to explain your referenced code and why it supports the learning outcome
- [ ] Proofread any accompanying documentation or comments for grammar and clarity.
- [ ] Commit and push this markup file to your personal git repository and hand in the link and a hard-copy via email at the end of the exam.

Remember, this checklist is not exhaustive, but it should help you ensure that your work is complete, well-structured, and meets the required standards.

Good luck with your evaluation!


## Learning Outcomes

| Exam Question | Total Achievable Points | Points Reached During Grading |
|---------------|------------------------|-------------------------------|
| Algorithms    |           4            |                               |
| Data types    |           4            |                               |
| Complex Data Structures |  4            |                               |
| Concepts of OOP |          6            |                               |
| OO Design     |           6            |                               |
| Class concepts |            8           |                               |
| Testing       |           6            |                               |
| Operator/Method Overloading | 6 |                               |
| Templates/Generics |       6            |                               |
| Class libraries |          6            |                               |
| Multi-threading |          6            |                               |
| Lambda expressions |       6            |                               |
| Serialization |            6           |                               |
| Database connectivity |   6            |                               |
| Total        |           80          |                               |



## Evaluation Questions

Please answer the following questions to the best of your ability to show your understanding of the learning outcomes. Please provide examples from your project code to support your answers. Only links to your own git will count. When you explain what you did make sure to explain why you did it this way with clear reasoning relating to your own work and not generic statements that anyone could make. 

## Evaluation Material


### Algorithms

Algorithms are manyfold and Java can be used to program these. Examples are sorting or search strategies but also mathematical calculations. Please refer to **two** areas in either your regular coding practice or within your project, where you have coded an algorithm. Do not make reference to code written for other classes, like theoretical informatics.


*your text*
I have coded algorithms in folder Algorithem, BubbleSort.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Algorithem/BubbleSort.java) and QuickSort.java (https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Algorithem/QuickSort.java). These 2 classic ways of sorting is the fundamantal and the first 2 sorting algorithm that I have learned. In my project "The Fish game", you can see in GameWindow.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Java%20project/Fish/GameWindow.java) under the logic method. I control the level, fish number , fish movement and speed, collision there using a algorithm. 

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |


### Data types

Please explain the concept of data types and provide examples of different data types in Java.
Typical data types in java are int, double, float, char, boolean, long, short, byte, String, and arrays. Please provide one example for each of the **three** following data types in your code. One of these links must be to your project.
* Array
* Strings
* boolean

Regarding the link to your project, explain the context in which you have used this data type being specific to your project. 

*your text*
Array is a data structure that holds a fixed number of values of a single type.
String is a chain of charactors that is within the "" sign.
Boolean is a type that only have 2 answer, either a true or a false.
In the project GameUtils.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Java%20project/Fish/GameUtils.java), boolean is used for direction declaration, set to be false for default. Array(in fact ArrayList) is used to add enermy fish into the game.
In MyProfile.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Data%20type/MyProfile.java), string is used to for my name "Zelong".

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           1            |                               |
|           1           |                               |
|           2 (project link)          |                               |



### Complex Data Structures

Examples of complex data structures in Java are ArrayList, HashMap, HashSet, LinkedList, and TreeMap. Please provide an example of how you have used **two** of these complex data structures in your code and explain why you have chosen these data structures. Examples do not have to come from the project.

*your text*
In the project GameUtils.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Java%20project/Fish/GameUtils.java), ArrayList is used to group all enermy fish into the same type, easier for the logic to add enermy fish into the game with one variable name instead of declaring 3 types of enermy fishes.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |



### Concepts of OOP
Concepts of OOP are the basic building blocks of object-oriented programming, such as classes, objects, methods, and attributes. 
Explain HOW and WHY your **project** demonstrates the use of OOP by using all of the following concepts:
* Classes/Objects
* Methods
* Attributes 
Link to the code in your project that demonstrates what you have explained above.

*your text*
In the project MyFish.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Java%20project/Fish/MyFish.java), the object MyFish is created for the purpose of attributes differents from the enermy fishes and it has unique attributes such as level. It needs to listen to keyboard input therefore need additional method called logic.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|          2              |                               |
|          2              |                               |
|          2              |                               |



### OO Design
Please showcase **two** areas **where** you have used object orientation in your project. (How and why you use it will be the next question below.)
Examples in Java of good oo design are composition, encapsulation, inheritance, polymorphism, and abstraction. 

*your text*
In project EnermyFish.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Java%20project/Fish/EnermyFish.java), fish for different direction has different class. The main class is EnermyFish. EnermyFish_L(stands for going left direction) is a extension of EnermyFish.
In project GameWindow.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Java%20project/Fish/GameWindow.java), mouseClicked is a override of the method from the method from the imported class.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|              3         |                               |
|              3         |                               |



### Advanced Class Concepts
Advanced class concepts include constructors, abstract classes, interfaces, access modifiers, static methods, and variables. Please provide an example of how you have used **two** of these class concepts in your **project** code and explain why you have chosen these class concepts and how they work within your code.

*your text*
In project GameWindow.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Java%20project/Fish/GameWindow.java), I declared a new variable and creating a new instance of the EnermyFish class.
For the method launch, I used the constructors that I declared at the begainning of the this class.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|            4           |                               |
|            4           |                               |

### Testing
Java code is tested by using JUnit. Please explain how you have used JUnit in your project and provide a link to the code where you have used JUnit. Links do not have to refer to your project and can refer to your practice code. If you tested without JUnit, please explain how you tested your code.
Be detailed about what you are testing and how you argue for your test cases. 
Test cases usually cover the following areas:
* boundary cases
* normal cases
* error cases / catching exceptions 

*your text*
In Debugging.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Debugging/Main.java), I catch the error of ArithmeticException and print it out. If the code cannot be executed, it will print out the error message.


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Operator/Method Overloading
An example of operator overloading is the "+" operator that can be used to add two numbers or concatenate two strings. An example of method overloading is having two methods with the same name but different parameters. Please provide an example of how you have used operator or method overloading in your code and explain why you have chosen this method of coding.
The link does not have to be to your project and can be to your practice code.

*your text*
In project MyFish.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Java%20project/Fish/MyFish.java) and EnermyFish.java(https://github.com/Zelong-Xu/Java-Learning/blob/8ed87b7ad6cf9188209583e083fef7597d016068/Java%20project/Fish/EnermyFish.java), they both has the same method paintSelf but they takes different parameters as they are different types of fishes.



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



### Generics
Generics in java are used to create classes, interfaces, and methods that operate on objects of specified types. Please provide an example of how you have used generics in your code and explain why you have chosen to use generics. The link does not have to be to your project and can be to your practice code.

*your text*
In Box.java(https://github.com/Zelong-Xu/Java-Learning/blob/b5b24a44b3b3aa4354d855a0ad42b718b2266a09/Generic/Box.java), I showed how to set T as type for content. Its value can be gotten and reset.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Class Libraries
Examples of class libraries in java are the Java Standard Library, JavaFX, Apache Commons, JUnit, Log4j, Jackson, Guava, Joda-Time, Hibernate, Spring, Maven, and many more. Please provide an example of how you have used a class library in your **project** code and explain why you have chosen to use this class library. 

*your text*
In project GameWindow.java(https://github.com/Zelong-Xu/Java-Learning/blob/b5b24a44b3b3aa4354d855a0ad42b718b2266a09/Java%20project/Fish/GameWindow.java), I imported many libraries. Swing is used to create game window. Awt is for image and graphic type implementation. Event.KeyEvent, KeyAdapter, MouseAdapter and MouseEvent are to take in mouse and keyboard input for the player to control the fish in game.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6           |                               |

### Multi-threading
multi-threading is the ability of a CPU to execute multiple processes or threads concurrently. Please explain the concept of multi-threading and provide an example of how you have used multi-threading in your code. The link does not have to be to your project and can be to your practice code.

*your text*
In Main.java(https://github.com/Zelong-Xu/Java-Learning/blob/b5b24a44b3b3aa4354d855a0ad42b718b2266a09/Multithreading/Main.java), I have set 2 thread to start and run at the same time. 
The purpose of Multi-threading is to have multiple threads to run within a single process so that they can perform multiple operations at the same time. By collaborating, it can improve the performance and responsiveness of app such as when handling multiple user interaction.

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |


### Lambda Expressions
An example of a lambda expression is the following code: 
```java
List<String> list = new ArrayList<>();
list.forEach((String s) -> System.out.println(s));
```
Please explain the concept of lambda expressions and provide an example of how you have used lambda expressions in your code. The link does not have to be to your project and can be to your practice code.

*your text*
Lambda in this case iterated through a ArrayList which prints out every elements in the list. It provide a more readable expression of the code to represent instances of functional interface (one method interface).It makes it easier to work with API and frameworks.
In Main.java(https://github.com/Zelong-Xu/Java-Learning/blob/b5b24a44b3b3aa4354d855a0ad42b718b2266a09/Lambda/Main.java), I have print a massage with lambda expression by providing name and title


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|           6            |                               |


### Serialization

Serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file. Please explain why you would use serialization and provide an example of how you have used serialization in your code. The link does not have to be to your project and can be to your practice code.


*your text*
Serialization enables the object to be easily stored and transmitted and reconstructed. It maintain the state of the object for different executions. It is also importent for communication over network

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6          |                               |


### Database Connectivity
Web applications use databases to store data. Please explain how you have connected to a database in your project and provide an example of how you have used database connectivity in your code. The link does not have to be to your project and can be to your practice code. Do not use code from other classes, like database programming, Web Engineering, or theoretical informatics.
This topic appeared in your learning agreement as the last point in the table under advanced topics.

*your text*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



