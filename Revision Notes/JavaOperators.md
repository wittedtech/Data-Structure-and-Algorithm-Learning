
# Java Operators : 

| Operator   | Explanation                                        | Use Case                                           | Associativity | Type    | Sign   | Precedence | Notes                                                          |
|------------|----------------------------------------------------|----------------------------------------------------|---------------|---------|--------|------------|----------------------------------------------------------------|
| Assignment | Assigns a value to a variable                      | `int x = 5;`                                       | Right-to-left | Binary  | =      | Low        |                                                              |
| Arithmetic | Performs basic arithmetic operations                | `int result = 10 + 5;`                             | Left-to-right | Binary  | +, -, *, /, % | Medium | % is modulus (remainder) operator                               |
| Increment  | Increases the value of a variable by 1             | `int i = 5; i++;`                                  | N/A           | Unary   | ++     | High       | Can be pre-increment (++i) or post-increment (i++)             |
| Decrement  | Decreases the value of a variable by 1             | `int i = 5; i--;`                                  | N/A           | Unary   | --     | High       | Can be pre-decrement (--i) or post-decrement (i--)             |
| Comparison | Compares two values and returns a boolean result   | `int x = 5; int y = 10; boolean result = (x == y);` | N/A           | Binary  | ==, !=, >, <, >=, <= | High |                                                              |
| Logical    | Performs logical AND, OR, and NOT operations       | `boolean a = true; boolean b = false; boolean result = (a && b);` | Left-to-right | Binary  | &&, \|\|, ! | Medium | && and || use short-circuit evaluation                          |
| Conditional| Evaluates a boolean expression and returns a value | `int max = (x > y) ? x : y;`                       | Right-to-left | Ternary | ?:     | Low        | Also known as the ternary operator                             |
| Bitwise    | Performs bitwise operations on binary representations | `int result = 3 & 5;`                             | Left-to-right | Binary  | &, \|, ^, ~, <<, >>, >>> | Medium |                                                              |
| Shift      | Shifts the bits of a number left or right          | `int result = 8 << 2;`                             | Left-to-right | Binary  | <<, >>, >>> | Medium | << shifts left, >> shifts right, >>> shifts right with zero fill |
| Instanceof | Checks if an object is an instance of a class       | `boolean isString = obj instanceof String;`         | N/A           | Binary  | instanceof | High | Used for type checking in Java                                 |
| Ternary    | Conditional operator, similar to if-else            | `int max = (x > y) ? x : y;`                       | Right-to-left | Ternary | ?:     | Low        | Often used for compact conditional assignment                  |
