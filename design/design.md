# Pseudocode
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


  
