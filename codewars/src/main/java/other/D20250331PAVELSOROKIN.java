// 2025.03.31 Найти все носки у которых нет пары
package other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class D20250331PAVELSOROKIN {
    //private static final List<String> SOCKS = List.of("green", "red", "green", "gray", "blau", "white", "yellow", "red", "green", "gray", "blau", "white", "yellow", "blau");
    private static final int PAIRS = 1_000_000;
    private static final int WITH_OUT_PAIRS = 10;
    private static final List<String> SOCKS = getSocks(PAIRS, WITH_OUT_PAIRS);

    public static void main(String[] args) throws Exception {
        System.out.printf("We have socks: %d, pairs: %d, with out pairs: %d%n%n", SOCKS.size(), PAIRS, WITH_OUT_PAIRS);
        timer(() -> getSocksWithOutPairsMap(), "getSocksWithOutPairsMap()");
        timer(() -> getSocksWithOutPairsStreamMap(), "getSocksWithOutPairsStreamMap()");
        timer(() -> getSocksWithOutPairsStreamGroupingBy(), "getSocksWithOutPairsStreamGroupingBy()");
    }

    private static List<String> getSocksWithOutPairsList() {
        List<String> copyOfSocks = new ArrayList<>(SOCKS);
        List<String> resulteSocks = new ArrayList<>();


        return resulteSocks;
    }

    private static List<String> getSocksWithOutPairsMap() {
        Map<String, Integer> socksByColor = new HashMap<>();
        for (String  sock : SOCKS) {
            socksByColor.merge(sock, 1, Integer::sum);
        }

        return socksByColor.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .toList();
    }

    private static List<String> getSocksWithOutPairsStreamMap() {
        return SOCKS.stream()
                .collect(Collectors.toMap(sock -> sock, sock -> 1, Integer::sum))
                .entrySet().stream()
                .filter(entry -> entry.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .toList();
    }

    private static List<String> getSocksWithOutPairsStreamGroupingBy() {
        return SOCKS.stream()
                .collect(Collectors.groupingBy(sock -> sock))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() % 2 == 1)
                .map(Map.Entry::getKey)
                .toList();
    }

    private static void timer(Callable<List<String>> method, String info) throws Exception {
        System.out.printf("(i) %s: ", info);
        long begin = System.currentTimeMillis();
        List<String> result = method.call();
        long dauert = System.currentTimeMillis() - begin;

        System.out.printf(" it took %d millisecond%n", dauert);
        System.out.println("     -> result: " + result);
    }

    private static List<String> getSocks(int pairs, int withOutPairs) {
        List<String> socks = new ArrayList<>(pairs * 2 + withOutPairs);
        List<String> halfOfSocks = new ArrayList<>(pairs * 2 + withOutPairs);

        List<String> colorsDictionary = List.of("red", "orange", "yellow", "green", "blue", "black", "white");
        int countOfColorsInDictionary = colorsDictionary.size();
        int countOfColorsWeNeed = countOfColorsInDictionary * withOutPairs;
        List<String> colorsWeHave = new ArrayList<>(countOfColorsWeNeed);
        String suffix = "";
        for (int i = 0; i < countOfColorsWeNeed; i ++) {
            int mal = i / countOfColorsInDictionary;
            if (mal != 0) {
                suffix = "-" + mal;
            }
            colorsWeHave.add(String.format("%s%s", colorsDictionary.get(i % countOfColorsInDictionary), suffix));
        }

        for (int i = 0; i < pairs; i++) {
            String color = colorsWeHave.get(i % countOfColorsWeNeed);
            halfOfSocks.add(color);
        }
        socks.addAll(halfOfSocks);
        Collections.reverse(halfOfSocks);
        socks.addAll(halfOfSocks);

        for (int i = 0; i < withOutPairs; i++) {
            String color = colorsWeHave.get(i % countOfColorsWeNeed);
            socks.add(socks.size() / 2, color);
        }

        return socks;
    }

}
