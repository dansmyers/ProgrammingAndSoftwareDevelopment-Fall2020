# Variable Types in Java

## Primitive Types

As we discussed in class, Java supports eight basic data types that are called the **primitive types**. Each type correspond to a certain kind of data
which has an underlying representation in the computer's memory.



| Type    | Description           | Range |                               | Typical Use               |
| ------- | --------------------- | ------------------------------------- | ------------------|
| `int`   | 32-bit signed integer | -2<sup>31</sup> to 2<sup>31</sup> - 1 | Primary type for integer data |
| `short` | 16-bit signed integer | -32768 to 32767                       | Rarely used unless you need to minimize memory usage |
| `long` | 64-bit signed integer | -2<sup>64</sup> to 2<sup>64</sup> - 1 | Integer data that doesn't fit into the range of an `int` |
| `byte` | A single 8-bit byte   | -128 to 127                           | Working with byte-level data in files or networks |
| `double` | 64-bit floating point number | About 14 digits of precision after the decimal point | Primary type for decimal values |
| `float` | 32-bit floating point number |  About 7 digits of precision after the decimal point | Rarely used unless you need to minimize memory usage |
| `char` | A single character |     | Working with individual characters that are part of a `String` |
| `boolean` | Logical true or false | `true` or `false` | Tests results, controlling `while` loops, flags |
