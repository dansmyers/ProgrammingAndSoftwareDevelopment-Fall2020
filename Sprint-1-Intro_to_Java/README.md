# Sprint 1 &ndash; Greatest Hits

## Starts Monday 9/14
## Deliverables and quiz are due on Wednesday 9/30

## Overview and Goals

This is it: the first sprint. We're going to do three things:

1. Get comfortable with the rhythms and practice of Scrumage.
2. Review the important elements of structured programming using Java.
3. Develop an appreciation for the ways that Java and Python are alike...and yet different.

At the end of the sprint, you'll have four things to complete:

1. The deliverables described in this project.
2. An individual quiz.
3. A short individual reflective write-up.
4. Reading from the ZyBook.

The content for this sprint will primarily be review from your previous class, although you will need to get started with Java, which may be new for you. As you're working,
focus on getting into the rhythm of Scrumage and developing good working habits with your teams that will carry you through the more content-heavy sprints that are coming up.

## Deliverables and Quiz

Complete the four problems in `Deliverables`. Remember that you may work freely with the members of your team and you may use any resources that you find helpful to
complete the project. **Please list the names of you collaborators in the project document**.

***ADD SUBMISSION INSTRUCTIONS***.

The quiz and reflective write-up will be done **online** on **Wednesday, September 30**, which will also be the release day for the next sprint's material. The quiz will be 
**individual** (not team) but will be **open everything**: you can use the sprint resources, your notes, and online resources. Remember to abide by the Honor Code 
and ask me if you have questions about what is an acceptable resource!

## Reading

Complete the **participation questions** for Chapters 2 and 3 of the ZyBook. You don't need to complete the challenge questions or any sections that are marked as optional.

## Deliverable Programs

Write Java programs for each of the following. Create a separate `.java` file for each question and put your code in the `main` method of the class. Put all of your Java files into one ZIP archive and submit the ZIP file through the assignment on Canvas.


### Unit of Measure

My son Scott has created a new unit of length called the **Scottometer**. The purpose of the Scottometer is, in his words, "to measure the size of the solar system". Confusingly, 1 Scottometer is defined to be 1 million miles.

Write a Java program that reads a number of miles from the console (using a `Scanner`) and prints the equivalent number of Scottometers. Here is a skeleton to help you get started.

```
/**
 * Scottometer Converter
 */
 
import java.util.Scanner;
 
public class Scottometers {

    public static void main(String[] args) {
    
        // Create a Scanner that reads from the standard input
        Scanner input = new Scanner(System.in);
        
        // Add your code here
    
    }

}
```

Tips:

- Put your code in a file named `Scottometers.java`. Remember that capitalization is important for class and file names.

- Use `double` variables to store the numbers of miles and Scottometers.

- Use the `Scanner`'s `nextDouble` method to read a `double` value from the console.

- Look at the `Smoots.java` example.


### Fake Internet Meme Money

Dogecoin, the favored cryptocurrency of shiba inus everywhere, currently trades for about $.003 per DOGE.

<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTNWsmvYusY2dEVGxw0fuXeKpFHBilq2UeLWQ&usqp=CAU" width="50%" />

Write a program that can take a value in dollars as input and output the equivalent number of dogecoins. Print your answers to two decimal places.

Tips:

- Use a `Scanner` and the `nextDouble` method to read from the console.

- To print to two decimal places, use `System.out.printf("%.2d", dogecoins)`, where `dogecoins` is the variable that holds the number of dogecoins you want to print.


### Binet's Formula

You've heard of the famous Fibonacci sequence, where each term is calculated by adding the two previous terms:

```
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
```

Suppose you would like to calculate the *n*<sup>th</sup> Fibonacci number. How could you do that?

One way is to start at the base case and grind your way up through the sequence until you've calculated *n* total terms.

It turns out, though, that there is a **single formula** that will calculate the terms of the Fibonacci sequence. This is weird and suprising, because it seems unlikely that such a highly structured sequence, where each term depends on all the previous terms, could be represented in closed form. The result is know as **Binet's formula**, and it says that the Nth Fibonacci number *f*<sub>*n*</sub> is

<img src="https://latex.artofproblemsolving.com/8/6/d/86d486c560727727342090b432e23ba85ac098b1.png" width="30%"/>

Gnarly.

The number `(1 + sqrt(5)) / 2` is the famous **golden ratio**, the most aesthetically pleasing of all proportions. It's sometimes denoted by the Greek letter φ (phi) after the ancient architect and sculptor Phidias, who used it in planning the design of the Parthenon.

<img src="https://upload.wikimedia.org/wikipedia/commons/d/da/The_Parthenon_in_Athens.jpg" width="50%" />

Write a Java program called `Binet.class` that prompts the user for a value of *n* and then uses Binet's formula to calcuate the *n*<sup>th</sup> Fibonacci number.

Tips:

- Again, use a `Scanner` to read from `System.in`. Use the `nextInt` method to read an `int` value from the console.

- Use `Math.sqrt()` to calculate square roots. For example,

```
double phi = (1 + Math.sqrt(5)) / 2;
```
