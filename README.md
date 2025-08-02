# Java Tutorials & Practice

This repository contains Java learning resources and code examples for core concepts:
- Classes & Objects
- Static methods and variables
- Interfaces
- Enums
- Collections (Lists, Sets, Maps)
- Inner/Outer Classes
- Exception Handling, etc.

## 🚀 How to Run

1. **Clone this repo:**
    ```bash
    git clone https://github.com/Griffins2005/java-tutorials.git
    cd java-tutorials
    ```

2. **Compile all Java files in a package (example: `objectsclasses`):**
    ```bash
    javac objectsclasses/*.java
    ```

3. **Run the main class:**
    ```bash
    java objectsclasses.Main
    ```

> **Tip:** Always compile before running, and make sure the package in the file matches the folder.

## 🔑 Common Issues & Fixes

- **FileNotFound/ClassNotFound**:  
  - Ensure the filename matches the class name (case-sensitive).
  - Compile from the parent directory, not inside the package folder.
  - Package name at the top matches the folder structure.

- **Extension errors (`.Java`)**:  
  - Use lowercase `.java` only.

- **Syntax errors (`;` expected, etc.)**:  
  - Double-check every line ends with `;`
  - Pay attention to curly braces `{ }` and parentheses `()`.

- **Running classes without `main` method:**  
  - Only `java packagename.Main` if `Main` has `public static void main(String[] args)`.

- **Changing packages or class names:**  
  - Always refactor both filename and `package`/`class` lines together.

## 🛠️ Editing & Troubleshooting

- Use `find . -name "*.class" -delete` to clean up old class files.
- Use `javac packagename/*.java` to batch-compile.
- Use `java packagename.Main` to run the main class.
- If you get errors, carefully read the first error message for hints.

---

## 🙌 Contributing

Pull requests are welcome. For significant changes, open an issue first to discuss what you would like to change.

---

## 📚 References

- [Official Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [Learn Java Online](https://www.learnjavaonline.org/)
- [Java Programming Cheatsheet (Princeton)](https://introcs.cs.princeton.edu/java/11cheatsheet/)

---

Happy coding!  
*Griffins Lelgut*


