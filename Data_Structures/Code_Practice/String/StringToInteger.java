package Data_Structures.Code_Practice.String;
/* 8. String to Integer (atoi)
Medium

Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.

 

Example 1:

Input: s = "42"

Output: 42

Explanation:

The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
Example 2:

Input: s = " -042"

Output: -42

Explanation:

Step 1: "   -042" (leading whitespace is read and ignored)
            ^
Step 2: "   -042" ('-' is read, so the result should be negative)
             ^
Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
               ^
Example 3:

Input: s = "1337c0d3"

Output: 1337

Explanation:

Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
         ^
Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
             ^
Example 4:

Input: s = "0-1"

Output: 0

Explanation:

Step 1: "0-1" (no characters read because there is no leading whitespace)
         ^
Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
          ^
Example 5:

Input: s = "words and 987"

Output: 0

Explanation:

Reading stops at the first non-digit character 'w'.

 

Constraints:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 */
public class StringToInteger {
    public int myAtoi(String s) {
        final int n = s.length();
        if(n == 0) return 0;

        int i = 0;
        while(i<n && s.charAt(i)==' '){
            ++i;
        }
        boolean isNegative = false;
        if(i<n ){
            if(s.charAt(i) == '-'){
                isNegative = true;
                ++i;
            }else if(s.charAt(i)=='+'){
                ++i;
            }
        }
        int res=0;
        while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            int digit = s.charAt(i)-'0';

            if(res>(Integer.MAX_VALUE/10) || (res == (Integer.MIN_VALUE/10) && digit>7)){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = (res*10) + digit;
            if(res>Integer.MAX_VALUE){
                res -= 1;
            }else if(res < Integer.MIN_VALUE){
                res += 1;
            }
            ++i;
        }
        return isNegative ? -res: res;
    }

    public static void main(String[] args) {
        StringToInteger obj = new StringToInteger();
        String s = "2147483648";
        System.out.println(obj.myAtoi(s));

    }
}