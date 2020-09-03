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

The content for this sprint is not particularly difficult, although you will need to get started with JavA, which may be new for you. As you're working,
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

## Deliverable Questions

Write Java programs for each of the following. Create a separate `.class` file for each question and put your code in the `main` method of the class. Put all of your class files into one ZIP archive and submit the ZIP file through the assignment on Canvas.

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

- Put your code in a file named `Scottometers.class`. Remember that capitalization is important for class and file names.

- Use `double` variables to store the numbers of miles and Scottometers.

- Use the `Scanner`'s `nextDouble` method to read a `double` value from the console.

- Look at the `Smoots.java` example.

### Binet's Formula

This is one of my favorites.

You've heard of the famous Fibonacci sequence, where each term is caclulated by adding the two previous terms:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Suppose you would like to calculate the Nth Fibonacci number. How could you do that?

One way is to start at the base case and grind your way up through the sequence until you've calculated N total terms. This would be easy to do with a loop, but we haven't talked about those yet.

It turns out there is a single formula that will calculate the terms of the Fibonacci sequence. This is weird and suprising, because it seems unlikely that such a highly structured sequence, where each term depends on all the previous terms, could be represented in closed form.

The result is know as Binet's formula and it says that the Nth Fibonacci number *f*<sub>*n*</sub> is

<img src="https://latex.artofproblemsolving.com/8/6/d/86d486c560727727342090b432e23ba85ac098b1.png" width="30%"/>
