# Design

Here is the pseudocode for my program.

`CLASS Main`  

`FUNCTION executeOperation(operand1, operand2, operator)`  

`  IF operator = “+” THEN`  
`    result = operand1 + operand2`  

`  ELSEIF operator = “-” THEN`  
`    result = operand1 - operand2`  

`  ELSEIF operator = “*” THEN`  
`    result = operand1 * operand2`  

`  ELSEIF operator = “/” THEN`  
`    result = operand1 / operand2`  

`  ELSE`  
`    THROW EXCEPTION`  
`  ENDIF`  

`  RETURN result`  
`ENDFUNCTION`  

`expression = INPUT()`  
`size = expression.length()`  
`operandStack = new Stack(size)`  
`operatorStack = new Stack(size)`  

`FOR i = 0 TO size`  
`  character = expression[i]`  

`  IF character is operand THEN`  
`    operandStack.push(character)`  

`  ELSEIF character is operator THEN`  
`    operatorStack.push(character)`  

`  ELSEIF character == “)” THEN`  
`    secondOperand = operandStack.pop()`  
`    firstOperand = operandStack.pop()`  
`    operation = operatorStack.pop()`  
`    operandStack.push(executeOperation(firstOperand, secondOperand, operation))`  

`  ENDIF`  
`NEXT i`  

`PRINT(operandStack.pop())`  
`ENDCLASS`  

`CLASS Stack`  

`  private stack`  
`  private maxSize`  
`  private top` 

`  public PROCEDURE Stack(maxSize)`  
`    this.maxSize = maxSize`  
`    stack = new String[maxSize]`  
`    top = -1`  
`  ENDPROCEDURE`

`  public FUNCTION isEmpty()`  
`    RETURN top == -1`  
`  ENDFUNCTION`  

`  public FUNCTION isFull()`  
`    RETURN top == maxSize`  
`  ENDFUNCTION`  

`  public PROCEDURE push(item)`  

`    IF isFull() THEN`  
`      THROW EXCEPTION`  

`    ELSE`  
`      top = top + 1`  
`      stack[top] = item`  

`    ENDIF`  
`  ENDPROCEDURE`  

`  public FUNCTION pop()`  

`    IF isEmpty() THEN`  
`      THROW EXCEPTION`  

`    ELSE`  
`      item = stack[top]`  
`      top = top - 1`    

`    ENDIF`  
`    RETURN item`  

`  ENDFUNCTION`  
`ENDCLASS`  
