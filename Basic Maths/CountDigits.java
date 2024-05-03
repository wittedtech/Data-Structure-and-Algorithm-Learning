/* if the number of iteration depended over division then the time complexity of that iteration will be the 
"LOGARITHMIC VALUE".
 
For Example in case of *count* function iteration is depended upon variable N and N is reducced by 
dividing by 10 ; so that iteration is dependent over division and the tim ecomplexity will be log and number
 by which the loop variable is getting divided that will be the base of log 
 so here it will be log(base 10).
 * 
 * TIME COMPLEXITY of FUNCTION COUNT will be : Big Oh of log(base 10)(n) => O(log(base 10)(n));
 */

class CountDigits{
    int countUsingLog(int n){
        int count = (int)(Math.log10(n)+1);
        return count;
    }

    int count(int n){
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    int countWithDigitExtraction(int n){
        int count = (int)(Math.log10(n)+1);
        while (n>0){
            System.out.print(n%10+"  ");
            n=n/10;
        }
        System.out.println();
        return count;
    }
    public static void main (String [] args){
        CountDigits obj = new CountDigits();
        System.out.println(obj.countUsingLog(7789));
        System.out.println(obj.count(7789));
        System.out.println(obj.countWithDigitExtraction(7789));
    }
}