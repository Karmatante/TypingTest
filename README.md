# Typing Test

A console-based typing test written in Java.

The program displays a text that the user types as quickly and accurately as possible. When the user presses Enter, the program calculates the typing speed and compares the entered text with the original.

This is a learning project that I am building step by step while studying Java.

## Current version: 0.2

Version 0.2 improves the way typing errors and accuracy are calculated.

The program now uses **Levenshtein distance** to compare the original text with the user's input. This allows the program to handle inserted, deleted and substituted characters without causing the rest of the text to be counted incorrectly.

### Version 0.2 includes

- Timing with `System.nanoTime()`
- Word counting
- Typing speed shown as words per minute
- Detection of blank input
- Correct handling of multiple spaces between words
- Levenshtein distance for text comparison
- Detection of:
  - insertions
  - deletions
  - substitutions
- Improved accuracy calculation
- Correct character count
- Total error count
- Accuracy percentage rounded to two decimal places
- Styled console output using ANSI colours

## Example result

```text
               ╔════════════════════════════════╗
               ║            RESULTAT            ║
               ╠════════════════════════════════╣
               ║ Tid: 58.14 sekunder            ║
               ║ Antal ord: 46                  ║
               ║ Ord per minut: 47              ║
               ╚════════════════════════════════╝

╔══════════════════════╗    ╔═════════════════════╗
║ Korrekta tecken: 301 ║    ║ Totalt antal fel: 1 ║
╚══════════════════════╝    ╚═════════════════════╝

               ╔══════════════════════╗
               ║ Noggrannhet: 99.67 % ║
               ╚══════════════════════╝
```

## How text comparison works in v0.2

Version 0.2 uses **Levenshtein distance**.

Levenshtein distance calculates the minimum number of changes needed to transform one text into another.

The algorithm works with three types of changes:

- **Insertion** – an extra character has been added
- **Deletion** – a character is missing
- **Substitution** – one character has been replaced with another

For example:

```text
Original: spricka
Input:    sproicka
```

The input contains one extra `o`.

In version 0.1, this extra character caused many of the following characters to be counted as incorrect because the program compared characters at the same index.

Version 0.2 instead recognises that only one insertion is required.

```text
Levenshtein distance: 1
```

Another example:

```text
Original: spricka
Input:    sprica
```

One character is missing, so the distance is also:

```text
1
```

And:

```text
Original: spricka
Input:    sprikka
```

contains one substitution:

```text
c → k
```

Again:

```text
Levenshtein distance: 1
```

## Accuracy calculation

The program uses the length of the longer text together with the Levenshtein distance.

For example:

```text
Original: spricka   = 7 characters
Input:    sproicka  = 8 characters
Errors:             = 1
```

The program uses the longest length:

```text
maxLength = 8
```

Then:

```text
correctChars = 8 - 1
             = 7
```

Accuracy:

```text
7 / 8 × 100 = 87.5 %
```

This gives a more realistic result than the character-by-character comparison used in version 0.1.

## Word counting

Version 0.2 also improves word counting.

Blank input is handled separately so that pressing Enter without typing anything gives:

```text
Antal ord: 0
```

The program also handles multiple spaces between words.

For example:

```text
Det   regnade
```

is still counted as two words.

This is done using:

```java
split("\\s+")
```

where `\\s+` represents one or more whitespace characters.

## Version history

### Version 0.1

The first working version included:

- A fixed text to copy
- Timing
- Word counting
- Words per minute
- Character-by-character comparison
- Correct and incorrect character counting
- Missing and extra character detection
- Basic accuracy calculation
- ANSI-coloured console output

#### Limitation in v0.1

Version 0.1 compared characters using their index.

For example:

```text
Original: spricka
Input:    sproicka
```

Adding one extra character shifted the following characters to different indexes.

As a result, many correctly typed characters could be counted as incorrect.

This was the main limitation that version 0.2 was created to solve.

### Version 0.2

Version 0.2 replaces the old index-based comparison with Levenshtein distance.

It also adds:

- Improved handling of insertions
- Improved handling of deletions
- Improved handling of substitutions
- Better accuracy calculation
- Blank input handling
- Improved word counting with multiple spaces

## Built with

- Java 26
- IntelliJ IDEA
- Java console input/output
- ANSI escape codes for colours

No GUI framework or web framework is currently used.

## What I practised in this project

This project has helped me practise:

- Variables and data types
- Strings
- Arrays
- Two-dimensional arrays
- `for` loops
- Nested `for` loops
- `if / else`
- `charAt()`
- `String.length()`
- `isBlank()`
- `split()`
- Regular expressions with `\\s+`
- `Math.min()`
- `Math.max()`
- `Math.round()`
- Type casting
- Time calculations
- Percentage calculations
- Console formatting
- Breaking a larger problem into smaller steps
- Testing edge cases
- Implementing the Levenshtein distance algorithm

## Current limitations

The program is still a console application and currently uses one fixed typing text.

The user also has to enter the entire text on one line because pressing Enter finishes the test.

ANSI colours may display differently depending on the terminal being used.

## Next version

Future versions may continue improving the structure and user experience of the program.

Possible next steps include:

- Refactoring the program into smaller methods
- Moving responsibilities out of `Main`
- Adding more typing texts
- Allowing the user to choose a text or difficulty level
- Improving the result presentation

The project will continue to be developed step by step as I learn more Java.
