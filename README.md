# Typing Test

A console-based typing test written in Java.

The program displays a text that the user types as quickly and accurately as possible. When the user presses Enter, the program calculates the typing speed and compares the entered text with the original.

This is a learning project that I am building step by step while studying Java.

## Version 0.1

The first working version includes:

- A text for the user to copy
- Timing with `System.nanoTime()`
- Word counting
- Typing speed shown as words per minute
- Character-by-character comparison
- Correct character count
- Incorrect character count
- Detection of missing characters
- Detection of extra characters
- Accuracy percentage
- Styled console output using ANSI colours

## Example result

```text
               ╔════════════════════════════════╗
               ║            RESULTAT            ║
               ╠════════════════════════════════╣
               ║ Tid: 56.22 sekunder            ║
               ║ Antal ord: 46                  ║
               ║ Ord per minut: 49              ║
               ╚════════════════════════════════╝

╔══════════════════════╗    ╔══════════════════════╗
║ Korrekta tecken: 297 ║    ║ Totalt antal fel: 5  ║
╚══════════════════════╝    ╚══════════════════════╝

               ╔═══════════════════════╗
               ║ Noggrannhet: 98.34 % ║
               ╚═══════════════════════╝
How accuracy works in v0.1

Version 0.1 uses a simple character-by-character comparison.

The program compares the character at each position in the original text with the character at the same position in the user's text.

For example:

Original: Java
Input:    Jxva

The program can correctly detect that one character is different.

The program also checks whether the user's text is shorter or longer than the original and counts missing or extra characters as errors.

Known limitation in v0.1

The current accuracy system does not understand when a character has been inserted or removed in the middle of the text.

For example:

Original: spricka
Input:    sproicka

Only one extra character was added, but all characters after that point move one position.

Because v0.1 compares characters using their index, many of the following characters may then be counted as incorrect even though they were typed correctly.

This means that the accuracy percentage can sometimes be much lower than expected after a single inserted or missing character.

This is a known limitation of version 0.1 and something I plan to improve in a later version.

Built with
Java 26
IntelliJ IDEA
Java console input/output
ANSI escape codes for colours

No GUI framework or web framework is used in version 0.1.

What I practised in this project

This project helped me practise:

Variables and data types
Strings
Arrays
for loops
if / else if
Character comparison with charAt()
Math.min()
Math.round()
Type casting
Time calculations
Percentage calculations
Console formatting
Breaking a larger programming problem into smaller steps
Next version

For version 0.2 I want to continue improving the program, especially the way typing errors are compared.

The current version will remain as a snapshot of my first working implementation.
