package jdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * JDK8新特性-java.util.function-Function接口
 */
public class FunctionTest {


    public FunctionTest(String string) {

    }

    public void print(String str) {
        System.out.println(str);
    }


    public static void function() {
        Function<Integer, Integer> add = t -> {
            System.out.println("参数T + 1");
            return t + 1;
        };
        System.out.println(add.apply(1));
        Function<Integer, Integer> multip = t -> {
            System.out.println("参数T * 10");
            return t * 10;
        };
        System.out.println(add.andThen(multip).apply(10));
        List<String> strLst = new ArrayList<>();
        strLst.forEach(FunctionTest::new);
    }

    public static void reduce() {
        List<Integer> list = Arrays.asList(1, 2, 2, 2, 3);
        Integer sum = list.stream().map(item -> item * 2)
                .reduce((a, b) -> a + b).get();
        System.out.println(sum);
    }

    /**
     * UnaryOperator
     */
    public static void unaryOperator() {
        UnaryOperator<String> unaryOperator = t -> {
            return t + "fdajfldjaljfldajfldajl";
        };
        System.out.println(unaryOperator.compose(t -> {
            return t + "：compose";
        }).apply("东汉"));
    }

    public static void main(String[] args) {
//        FunctionTest.function();
//        FunctionTest.unaryOperator();
//        FunctionTest.stream();
        FunctionTest.reduce();
    }

    public static void stream() {
        Collectors.groupingBy(t -> {
                    return null;
                }
        );
        List<Integer> list = Arrays.asList(1, 2, 2, 2, 3);
        Map<Integer, Integer> map = list.stream().map(item -> {
            return item * 3;
        }).filter(item -> item > 3)
//                .collect(Collectors.toList())
//                .forEach(item -> {
//                    System.out.println(" 输出结果：" + item);
//                });

                // 转map
                .collect(Collectors.toMap(item -> item,
                        item -> item * 3,
                        (p, c) -> {

                            // key重复-> 求和
                            System.out.println("P:" + p);
                            System.out.println("C:" + c);
                            return p + c;
                        }
                ));
        System.out.println(map);
    }
}
