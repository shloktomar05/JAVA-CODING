package LamdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.RuntimeErrorException;

public class AverageSalary {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1,"Anuj",  5000,"Enginner","24"),
            new Employee(2,"aman",  6000,"Enginner","24"),
            new Employee(3,"karan",  3000,"Enginner","24"),
            new Employee(4,"aujla",  2000,"Enginner","24")
        );


    double avgSalary = employees.stream().mapToInt(t->(t.getSalary())).average().orElse(0.0);
    double maxSlary = employees.stream().mapToInt(t->(t.getSalary())).max().orElseThrow(()-> new RuntimeException("dfghj"));
    double secondHigestSal = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).map(Employee::getSalary).findFirst().orElseThrow(()-> new RuntimeException("dfghj"));
    Employee secondHigestSal2 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElseThrow(()-> new RuntimeException("dfghj"));
    



    System.out.println("The salary fractions are ");
    System.out.println("average : " + avgSalary);
    System.out.println("Maximum : " + maxSlary);
    System.out.println("Second highest : " + secondHigestSal);
    System.out.println("Second highest sal Obj : " + secondHigestSal2);

   List<String> list = Arrays.asList("a", "b", "c","abc","bcd","ab");
    Stream<String> stream2 = list.stream();
    // String result = stream.collect(Collectors.joining(", "));

    System.out.println("List : "+list);
    // System.out.println("Stream : "+ stream.collect(Collectors.joining(", ")));
    System.out.println("Printing stream with for each ");
    //  stream2.forEach(System.out::println);

    // filter the element
     List<String> filtered = stream2.filter(t->t.startsWith("a")).collect(Collectors.toList());
     System.out.println("Filtered List : "+filtered);

    //  Length of each element
     List<Integer> length = list.stream().map(String::length).collect(Collectors.toList());
     System.out.println("Length List : "+length);

    

     //combined list

     List<List<String>> listOfList = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("a","b","c"));

     List<String> combindeList = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
     System.out.println("The Combined list "+ combindeList);

     // List of Integer

     List<Integer> listInt = Arrays.asList(1, 2, 3,4,5,1,3,3,6,7,7,9);

    //  List od distinct integers



     List<Integer> distinctIntList = listInt.stream().distinct().collect(Collectors.toList());
     System.out.println("Distinct List "+ distinctIntList);
 
    }

}
