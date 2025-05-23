**Analysis**
---
The input is an expression consisting of numbers, operations and brackets. My program will evaluate this expression using the Dijkstra Two-Stack Algorithm:  
* Iterate through the expression.
  1. If the item is an `operand`, push it to the `operand stack`.
  2. If the item is an `operator`, push it to the `operator stack`.
  3. If the item is a `)`, pop two `operand`s and an `operator` and execute the operation. Push the result to the `operand stack`.
