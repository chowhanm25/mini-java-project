# Mini Java Project

A simple Java-based calculator application demonstrating basic programming concepts and project structure.

## Features

- **Basic Calculator Operations**: Addition, subtraction, multiplication, and division
- **Interactive Console Interface**: User-friendly command-line interaction
- **Error Handling**: Proper exception handling for invalid inputs and operations
- **Utility Functions**: Helper methods for common operations
- **Clean Code Structure**: Well-organized packages and classes

## Project Structure

```
src/
└── main/
    └── java/
        └── com/
            └── miniproject/
                ├── Main.java          # Entry point of the application
                ├── Calculator.java    # Core calculation logic
                └── Utils.java         # Utility helper functions
```

## How to Run

### Prerequisites
- Java 8 or higher installed on your system
- Command line access

### Compilation and Execution

1. **Clone the repository**:
   ```bash
   git clone https://github.com/chowhanm25/mini-java-project.git
   cd mini-java-project
   ```

2. **Compile the Java files**:
   ```bash
   javac -d out src/main/java/com/miniproject/*.java
   ```

3. **Run the application**:
   ```bash
   java -cp out com.miniproject.Main
   ```

### Alternative: Direct compilation from src directory
```bash
cd src/main/java
javac com/miniproject/*.java
java com.miniproject.Main
```

## Usage Example

```
=== Welcome to Mini Java Calculator ===
Enter first number: 15.5
Enter operation (+, -, *, /): *
Enter second number: 2.5
Result: 15.50 * 2.50 = 38.75
```

## Code Features

### Main.java
- Application entry point
- User input handling with Scanner
- Exception handling and resource management

### Calculator.java
- Core mathematical operations
- Input validation
- Error handling for edge cases (division by zero)

### Utils.java
- Timestamp generation
- Number validation utilities
- Number formatting helpers

## Error Handling

The application handles various error scenarios:
- **Invalid Operations**: Unsupported mathematical operations
- **Division by Zero**: Prevents mathematical errors
- **Invalid Input**: Handles non-numeric inputs gracefully

## Future Enhancements

- [ ] Add more advanced mathematical operations (power, square root, etc.)
- [ ] Implement calculation history
- [ ] Add unit tests
- [ ] Create a GUI interface
- [ ] Support for complex numbers

## Contributing

Feel free to fork this project and submit pull requests for any improvements!

## License

This project is open source and available under the MIT License.