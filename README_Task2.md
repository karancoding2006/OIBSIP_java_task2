# Task 2 - Number Guessing Game

**Internship Program:** AICTE OASIS Infobyte Java Programming Internship  
**Task:** Number Guessing Game  
**Language:** Java  

---

## Objective

To build a console-based Number Guessing Game in Java where the system generates a random number between 1 and 100, accepts user guesses, and provides high/low feedback until the correct number is found. The game supports multiple rounds and tracks a running score across all rounds.

---

## Steps Performed

1. **Designed the class structure** — separated game logic into two classes for clean OOP design.
2. **Implemented `Game.java`:**
   - Used `Random` to generate a number between 1 and 100.
   - Built a guess loop that provides "Too low" / "Too high" / "Correct" feedback.
   - Added input validation to handle non-integer inputs gracefully.
   - Implemented a scoring formula based on number of attempts.
3. **Implemented `NumberGuessingGameMain.java`:**
   - Built a multi-round loop that continues until the user chooses to quit.
   - Tracked and displayed score after each round.
   - Displayed the final total score at the end of the game.
4. **Tested the program** for correct feedback, score calculation, and input validation.

---

## Tools Used

| Tool | Purpose |
|------|---------|
| Java (JDK) | Core programming language |
| `java.util.Random` | Generating random target numbers |
| `java.util.Scanner` | Reading console input from the user |
| VS Code / IntelliJ IDEA | Code editor / IDE |
| Terminal / Command Prompt | Compiling and running the program |

---

## Project Structure

```
NumberGuessingGame/
│
├── Game.java                  # Game logic — single round, scoring, input validation
└── NumberGuessingGameMain.java # Entry point — multi-round loop, total score tracking
```

---

## How to Run

```bash
# Step 1: Compile
javac Game.java NumberGuessingGameMain.java

# Step 2: Run
java NumberGuessingGameMain
```

---

## Outcome

A fully functional console-based Number Guessing Game was successfully built in Java. The program randomly generates a number between 1 and 100 and guides the user with hints after every guess. It supports multiple rounds, tracks the total score across all rounds, and validates user input to prevent crashes. The scoring system rewards fewer attempts with higher points (starting at 100, decreasing by 10 per wrong guess, minimum 10). The project demonstrates core Java concepts including OOP, control flow, random number generation, and input handling.

---

*Submitted as part of AICTE OASIS Infobyte Java Programming Internship — Task 2*
