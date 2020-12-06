# Sprint 6 Deliverable Questions

## Description

Complete the following written questions. You can hand-write and then scan your answers or type them into a Word document. Upload your solutions to the assignment on Canvas.

## Warm-Up

Review the formal definition of Big-O notation. State the order of growth for the following functions.

- *f*(*n*) = 3*n*<sup>2</sup> + 2*n*

- *f*(*n*) = 3*n*<sup>.01</sup> + 2*n*

- *f*(*n*) = lg *n*  + sin *n* 

Tip: think about what happens to the log function and the sin function as *n* gets large

## Loops

What is the Big-O complexity of the following algorithm as a function of the length of the input array a?

```
input: array a
output: prod, a 2-D array of pairwise products of a’s elements
for (i = 0; i < a.length; i++) {
    for (j = 0; j < a.length; j++) {
        prod[i][j] = a[i] * a[j]
    }
}
```

How about this one?

```
input: array a
output: nothing
for (i = 0; i < a.length; i++) {
    for (j = 0; j < 1000000; j++) {
        // Run a simulation for 1 million steps using a[i] as a seed value
    }
}
```

Tips: identify the size of the input, then think about how many times each statement executes as a function of the input size. For example, a loop that touches each item once will execute N times. Constant factors, like adding or subtracting 1 or multiplying by a fixed value, don’t change the complexity analysis, so you don’t need to worry about them.


## Polynomials

Prove, using the formal definition of Big-O notation, that the *m*-degree polynomial

*f*(*n*) = *a*<sub>*m*</sub>*n*<sup>*m*</sup> + *a*<sub>*m - 1*</sub>*n*<sup>*m - 1*</sup> + *a*<sub>*m - 2*</sub>*n*<sup>*m - 2*</sup> + ... + *a*<sub>*2*</sub>*n*<sup>*2*</sup>+ *a*<sub>*1*</sub>*n*<sup>*1*</sup> + 1

is O(*n*). The *a* coefficients are constants that don't depend on *n* or *m*.

Tip: Get huge!

## [It's Better Than Bad, It's Good](https://www.youtube.com/watch?v=-fQGPZTECYs)

Prove that 

*f*(*n*) = lg (*n*!)

is O(*n* lg *n*).

Tip: One of the basic properties of logarithms is that 

lg (*a* *b*) = lg *a* + lg *b*


## Egg Problem

You have some eggs and a 100-story building. These eggs (laid, no doubt, by a genetically-engineered monster terror chicken) have a very strong shell. So strong, in fact, that if they are dropped from any floor lower than an unknown breaking floor *N* they will be completely unharmed.
Your challenge: develop an algorithm that finds the breaking floor *N* in an efficient number of drops without breaking too many eggs.

Consider a linear search approach to finding the breaking floor. Begin at floor 1 and drop an egg. If it breaks, *N* = 1 and you’re done. If it doesn’t break, move up to floor 2 and drop it again. Repeat until the egg finally breaks. This algorithm has the advantage of using only one egg, but the number of drops required is linear in *N*8.

Fewer drops are possible if you use a binary search. Drop the first egg from floor 50. If it breaks, binary search the floors from 1 to 49. If it survives, binary search the floors from 51 to 100. This will require only seven drops in the worst case, but may break more eggs.

Can you find an algorithm that is better than linear search and still uses only two eggs? How many worst-case drops does your method require?


