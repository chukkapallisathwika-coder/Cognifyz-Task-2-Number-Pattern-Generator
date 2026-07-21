# Number Pattern Generator

**Cognifyz Technologies — Java Programming Internship**
**Task 2: Number Pattern Generator**

A simple, beginner-friendly Java console application that generates common
number patterns based on user input, using only loops and methods (no
arrays, recursion, or external libraries).

---

## 📋 Features

The program presents a menu with five options:

1. **Half Pyramid** — numbers increasing from `1` to the row number, left-aligned
2. **Inverted Pyramid** — the Half Pyramid printed upside down
3. **Floyd's Triangle** — consecutive numbers filling each row
4. **Number Square** — a square grid where every row repeats `1` to `N`
5. **Exit** — quit the application

Additional features:

- ✅ Input validation for both the menu choice and the number of rows
  (rejects letters, symbols, negative numbers, zero, and out-of-range values)
- ✅ Repeats the menu automatically so multiple patterns can be generated
  in a single run
- ✅ Fully commented, readable source code
- ✅ Uses only `for` / `while` loops — no arrays or recursion
- ✅ Organized into small, single-purpose methods

---

## 📁 Project Structure

```
PatternGenerator/
│
├── src/
│   └── PatternGenerator.java   → Complete source code
├── .vscode/
│   ├── launch.json             → VS Code run/debug configuration
│   └── settings.json           → VS Code Java project settings
├── Screenshots/                → Sample run screenshots (add your own)
├── README.md                   → This file
├── report.pdf                  → Professional internship report
├── Output.txt                  → Sample program output (all 4 patterns)
└── PatternGenerator.zip        → Zipped copy of the full project
```

---

## ▶️ How to Run

### Option A — Run in VS Code (recommended)

1. Install the **Extension Pack for Java** (by Microsoft) in VS Code.
2. Open the `PatternGenerator` folder in VS Code (`File → Open Folder…`).
3. Open `src/PatternGenerator.java`.
4. Click the **Run** ▶ button above the `main` method
   (or press `F5`, or use the pre-configured `.vscode/launch.json`).
5. Interact with the menu in the **Integrated Terminal / Debug Console**.

### Option B — Run from the command line

```bash
cd PatternGenerator/src
javac PatternGenerator.java
java PatternGenerator
```

---

## 🖥️ Sample Interaction

```
=================================================
   WELCOME TO THE NUMBER PATTERN GENERATOR
   Cognifyz Technologies - Java Internship Task 2
=================================================
-------------------------------------------------
Please choose a pattern to generate:
1. Half Pyramid
2. Inverted Pyramid
3. Floyd's Triangle
4. Number Square
5. Exit
-------------------------------------------------
Enter your choice (1-5): 1
Enter the number of rows (1-100): 5

--- Half Pyramid Pattern ---
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

See `Output.txt` for a complete sample run that demonstrates all four
patterns as well as invalid-input handling.

---

## 🧠 Design Notes

- **`displayMenu()`** — prints the menu options.
- **`readMenuChoice()`** — reads and validates the menu selection using a
  `while` loop that keeps re-prompting until a valid value (1–5) is entered.
- **`readRows()`** — reads and validates the number of rows (1–100).
- **`isPositiveInteger(String)`** — a small helper that manually checks
  every character of the input string to confirm it is a positive whole
  number (keeps the program beginner-friendly by avoiding regex).
- **`printHalfPyramid`, `printInvertedPyramid`, `printFloydsTriangle`,
  `printNumberSquare`** — each pattern is generated with a simple nested
  `for` loop (outer loop = rows, inner loop = columns).

---

## 🛠️ Requirements

- Java JDK 8 or higher
- VS Code with the **Extension Pack for Java** (optional, for the VS Code
  workflow)

---

## 👤 Author

**Developed by:** Sathwika Chukkapalli

Submitted as part of the **Cognifyz Technologies Java Programming Internship**, Task 2.