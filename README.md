# Typing Test App

A console-based typing test written in Java.

The program displays a text that the user copies as quickly and accurately as possible.  
When the user presses Enter, the program calculates typing time, word count, words per minute, number of errors and accuracy.

The project is also a learning project where I practise Java fundamentals, algorithms and gradually improving the structure of an existing program.

## Current version

**v0.3**

The main focus of v0.3 was refactoring.

The program still behaves the same as in v0.2, but the code has been divided into smaller methods so that `main()` is easier to read and each method has a clearer responsibility.

---

## Features

The application currently:

- displays instructions before the test starts
- displays a fixed text for the user to copy
- measures typing time
- counts the number of words typed
- calculates words per minute (WPM)
- compares the original text with the user's text
- calculates errors using Levenshtein distance
- calculates the number of correct characters
- calculates typing accuracy as a percentage
- displays the result in a formatted console interface
- uses ANSI colours for the console output

---

## Example result

```text
               ╔════════════════════════════════╗
               ║            RESULTAT            ║
               ╠════════════════════════════════╣
               ║ Tid: 64.86 sekunder            ║
               ║ Antal ord: 46                  ║
               ║ Ord per minut: 43              ║
               ╚════════════════════════════════╝

╔══════════════════════╗    ╔═════════════════════╗
║ Korrekta tecken: 301 ║    ║ Totalt antal fel: 1 ║
╚══════════════════════╝    ╚═════════════════════╝

               ╔══════════════════════╗
               ║ Noggrannhet: 99.67 % ║
               ╚══════════════════════╝
```

---

## How it works

The program first displays the instructions and the text that should be copied.

Immediately before the user starts typing, the program starts a timer using:

```java
System.nanoTime();
```

When the user presses Enter, the timer stops.

The elapsed time is converted from nanoseconds to seconds.

The program then calculates:

1. number of words
2. typing speed in words per minute
3. Levenshtein distance between the original text and the user input
4. number of correct characters
5. accuracy percentage

Finally, the calculated values are displayed in the console.

---

## Word count

The user's input is divided into words using:

```java
userInput.trim().split("\\s+");
```

`\\s+` means one or more whitespace characters.

This means that several spaces between words do not incorrectly increase the word count.

Blank input is handled separately and gives:

```text
0 words
```

---

## Words per minute

Typing speed is calculated using:

```text
number of words / time in minutes
```

The result is rounded to the nearest whole number.

For example:

```text
46 words
1.07 minutes

46 / 1.07 ≈ 43 WPM
```

The timer measures real elapsed time.

Because of this, pasting the entire text into the console can produce extremely high WPM values. This is expected behaviour and does not represent realistic typing speed.

---

## Text comparison

### Levenshtein distance

From v0.2 onwards, the application uses the **Levenshtein distance algorithm** to compare the original text with the text entered by the user.

Levenshtein distance calculates the minimum number of changes required to transform one text into another.

The algorithm considers three types of changes:

- **Insertion** – an extra character has been added
- **Deletion** – a character is missing
- **Substitution** – one character has been replaced by another

Example:

```text
Original:
spricka

Input:
sprika
```

One character is missing, so the Levenshtein distance is:

```text
1
```

Another example:

```text
Original:
spricka

Input:
sproicka
```

One extra character has been inserted:

```text
Levenshtein distance = 1
```

And:

```text
Original:
spricka

Input:
sprikka
```

One character has been substituted:

```text
Levenshtein distance = 1
```

### Why Levenshtein distance?

The first version of the program compared characters only by their position.

That caused a problem when a character was inserted or deleted.

For example:

```text
Original:
abcdef

Input:
abXcdef
```

A simple index-based comparison would make several later characters appear incorrect because their positions had shifted.

Levenshtein distance handles this much better because it looks for the minimum number of edits needed between the complete strings.

---

## A limitation of the current comparison

The application currently uses standard Levenshtein distance.

A transposition is therefore not treated as one operation.

For example:

```text
Original:
slut

Input:
lsut
```

The `s` and `l` have changed places.

Standard Levenshtein distance normally represents this using two edits rather than one transposition.

This means the program may report:

```text
2 errors
```

for this type of typing mistake.

---

## Accuracy

The program uses the length of the longer text when calculating accuracy.

First:

```text
correct characters =
maximum text length - Levenshtein distance
```

Then:

```text
accuracy =
correct characters / maximum text length × 100
```

The final percentage is rounded to two decimal places.

Example:

```text
Maximum length: 302
Errors: 1

Correct characters:
302 - 1 = 301

Accuracy:
301 / 302 × 100 ≈ 99.67 %
```

---

## Program structure

In v0.3, the program was refactored so that `main()` no longer contains all of the application logic.

The program now uses several helper methods with separate responsibilities:

```text
main()
│
├── showIntroduction()
├── showReadingText()
├── countWords()
├── calculateWpm()
├── calculateLevenshteinDistance()
├── calculateAccuracy()
└── showResults()
```

### `showIntroduction()`

Displays the introduction and instructions.

### `showReadingText()`

Displays the text that should be copied and returns the original text so that it can later be compared with the user's input.

### `countWords()`

Counts the words entered by the user.

### `calculateWpm()`

Calculates and returns the user's words per minute.

### `calculateLevenshteinDistance()`

Builds a two-dimensional Levenshtein table and returns the minimum number of edits between the two texts.

### `calculateAccuracy()`

Calculates the accuracy percentage and rounds it to two decimal places.

### `showResults()`

Displays all calculated results in the console.

This refactoring makes `main()` responsible mainly for controlling the flow of the program rather than performing every calculation itself.

---

## Levenshtein table

The Levenshtein algorithm uses a two-dimensional array:

```java
int[][] distance =
        new int[text1.length() + 1][userInput.length() + 1];
```

The first row and first column represent comparisons with an empty string.

The rest of the table is filled by comparing characters and calculating the cost of:

```text
deletion
insertion
substitution
```

For each position, the algorithm saves the cheapest alternative.

The value in the bottom-right corner of the table is the final Levenshtein distance.

---

## Technologies

- Java 26
- IntelliJ IDEA
- Git
- GitHub
- ANSI escape codes for console styling

The application is currently a console application and does not use a graphical user interface or external framework.

---

## Project structure

```text
src
└── se
    └── iths
        └── katharina
            └── typingtestapp
                ├── Main.java
                └── model
                    └── Ansi.java
```

`Main.java` contains the program flow and typing-test logic.

`Ansi.java` contains ANSI values used to style the console output.

---

## Version history

### v0.1 – Basic typing test

Initial working version.

Included:

- fixed typing text
- timer
- word count
- WPM calculation
- basic character comparison
- number of correct and incorrect characters
- accuracy percentage
- formatted console output
- ANSI colours

The first comparison algorithm compared characters by index.

This worked for substitutions but produced inaccurate results when characters were inserted or deleted because all following character positions could become shifted.

### v0.2 – Improved text comparison

Replaced the original index-based comparison with Levenshtein distance.

Changes included:

- support for insertions
- support for deletions
- support for substitutions
- more reliable error counting
- improved word counting
- blank input returns zero words
- multiple spaces between words are handled correctly
- accuracy calculation updated to use the Levenshtein result

### v0.3 – Refactoring

Refactored the program without intentionally changing its behaviour.

Changes included:

- extracted introduction output into `showIntroduction()`
- extracted reading text into `showReadingText()`
- extracted word counting into `countWords()`
- extracted WPM calculation into `calculateWpm()`
- extracted Levenshtein calculation into `calculateLevenshteinDistance()`
- extracted accuracy calculation into `calculateAccuracy()`
- extracted result output into `showResults()`
- simplified `main()`
- reorganised methods to follow the program flow
- updated comments to explain the less obvious parts of the code
- tested insertion, deletion and substitution after refactoring

---

## Tested cases

The current version has been tested with:

```text
Exact text
→ 0 errors
→ 100% accuracy
```

```text
Missing character
spricka → sprika

→ 1 error
```

```text
Extra character
spricka → sproicka

→ 1 error
```

```text
Changed character
spricka → sprikka

→ 1 error
```

The program has also been tested with:

- blank input
- multiple spaces between words
- normal typing input
- pasted input

---

## What I am practising with this project

This project is being developed while learning Java.

Concepts currently used in the project include:

- variables and data types
- strings
- methods
- parameters and arguments
- return values
- `if` statements
- `for` loops
- nested loops
- arrays
- two-dimensional arrays
- type casting
- `Math.round()`
- `Math.min()`
- `Math.max()`
- string methods
- timing with `System.nanoTime()`
- separating responsibilities into methods
- refactoring existing code
- Git and version control

One goal of the project is not only to make the typing test work, but also to improve the structure of the code as my Java knowledge develops.

---

## Possible future improvements

Possible future versions could include:

- several different typing texts
- difficulty levels
- choosing a text before starting
- repeated typing tests
- personal best scores
- improved handling of transposed characters
- more detailed error feedback
- highlighting incorrect characters
- storing previous results
- separating more application logic into dedicated classes
- a graphical interface in a later version

These are possible ideas rather than features currently implemented.

---

## Status

**Current version: v0.3**

The console version is functional.

The current focus has been:

```text
correctness
→ improved text comparison
→ cleaner program structure
```

Further features will be added gradually as the project develops.
