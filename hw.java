import com.sun.org.apache.xpath.internal.axes.PredicatedNodeTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class hw {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Dog", "Cat", "BIrd", "Monkey", "Donkey");
             System.out.println(list1);
        List<Integer>len=
               list1.stream()
                        .map(x->x.length())
                        .collect(toList());
        

        System.out.println(len);


        List<String> flattenedLists=
                list1.stream()
                .flatMap(Stream::of)
                .collect(toList());
        System.out.println(flattenedLists);


        List<Character> result = list1.stream()

                .flatMap(word -> word.chars().mapToObj(i -> (char) i))

                .collect(toList());

        System.out.println(result); //outputs [D, o, g, C, a, t, B, i, r, d, M, o, n, k, e, y, D, o, n, k, e, y]



        List<String> startsWithD = list1.stream()

                .filter(x -> x.startsWith("D"))

                .collect(toList());

        System.out.println(startsWithD); //outputs [Dog, Donkey]



        int count1 = list1.stream()

                .map(String::length)

                .reduce(0,(m1,m2)->m1+m2);

        System.out.println(count1); //outputs 22 using reduce rather than the first way I used below





    }

}