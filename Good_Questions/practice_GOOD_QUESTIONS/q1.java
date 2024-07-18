package practice_GOOD_QUESTIONS;

import java.io.*;
import java.util.*;

public class q1 {

    static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
        List<Long> result = new ArrayList<>();

        List<Long> a = new ArrayList<>();
        List<Long> b = new ArrayList<>();

        a.add(0L);
        b.add(0L);


        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numbersCount; i++) {
            int numbersItem = Integer.parseInt(bufferedReader.readLine().trim());
            numbers.add(numbersItem);
        }

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int queriesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < queriesRows; i++) {
            List<Integer> queriesRowItems = Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .stream()
                    .map(Integer::parseInt)
                    .toList();
            queries.add(queriesRowItems);
        }

        List<Long> result = findSum(numbers, queries);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        for (Long value : result) {
            bufferedWriter.write(value + "\n");
        }
        bufferedWriter.close();

        bufferedReader.close();
    }
}

