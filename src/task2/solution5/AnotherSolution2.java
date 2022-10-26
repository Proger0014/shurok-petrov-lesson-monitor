package task2.solution5;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * ref: https://www.codewars.com/kata/reviews/5b6bac5fecd097af73000cbe/groups/5eef741f8e66be0001cfbcd4
 */
public class AnotherSolution2 extends AbstractSolutionTemplate {
    @Override
    protected boolean isAscOrder(int[] arr) {
        return Arrays.equals(
                arr,
                IntStream
                        .of(arr) // каждое число прогоняет по циклу
                        .sorted() // делает их сортировку
                        .toArray()); // затем добавляет в массив и возвращает его?
    }
}
