package Data_Structures.Code_Practice.Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeprateOddAndEvenNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> oddList = listOfIntegers.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        List<Integer> evenList = listOfIntegers.stream().filter(i -> i%2 != 0).collect(Collectors.toList());

        Map<Boolean,List<Integer>> oddEvenNumberMap = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
        Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumberMap.entrySet();

        for(Entry<Boolean, List<Integer>> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for(Entry<Boolean,List<Integer>> entry : listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i%2 == 0)).entrySet()){
            
            if(entry.getKey()){
                System.out.println("Even Numbers");
                System.out.println(entry.getValue());
            }else{
                System.out.println("Odd Numbers");
                System.out.println(entry.getValue());
            }
        }
        
    }
}
