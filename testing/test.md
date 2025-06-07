# Testing

I have created the following tests for my system.

### Test 1 - Addition
This checks if the program can add two numbers.  
Input: ( 1 + 2 )  
Expected output: 3.0  
Actual output: 3.0  

### Test 2 - Subtraction
This checks if the program can subtract two numbers.  
Input: ( 4 - 3 )  
Expected output: 1.0  
Actual output: 1.0  

### Test 3 - Multiplication
This checks if the program can multiply two numbers.  
Input: ( 5 * 6 )  
Expected output: 30.0  
Actual output: 30.0  

### Test 4 - Division
This checks if the program can divide two numbers.  
Input: ( 14 / 7 )  
Expected output: 2.0  
Actual output: 2.0  

### Test 5 - Unsupported Operation
This checks if the program throws an error when an operator is not recognised.  
Input: ( 8 ^ 9 )  
Expected output: UnsupportedOperandException  
Actual output: UnsupportedOperandException  

### Test 6 - Non-numeric String
This checks if the program throws an error when the string is non-numeric.  
Input: "abc"  
Expected output: IllegalArgumentException  
Actual output: IllegalArgumentException  

### Test 7 - Multiple Brackets
This checks if the program can evaluate an expression containing multiple pairs of brackets.  
Input: ( ( ( 10 + 11 ) - ( 13 - 12 ) ) * ( 30 / 15 ) )  
Expected output: 40.0  
Actual output: 40.0  

### Test 8 - Right Bracket Check
This checks if the program throws an error when the expression does not contain a right bracket.  
Input: 16 + 17  
Expected output: IllegalArgumentException  
Actual output: IllegalArgumentException  
