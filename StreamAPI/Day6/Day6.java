package StreamAPI.Day6;

import java.util.List;
import java.util.stream.Stream;

public class Day6 {
    static List<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(100000).toList();
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        numbers.stream().map(n -> n * 2).filter(n -> n % 3 == 0).count();
        long endTime = System.nanoTime();
        System.out.println("Time taken: (default stream): " + (endTime - startTime) / 1000000 + " миллисекунд");
        long startTime2 = System.nanoTime();
        numbers.stream().map(n -> n * 2).filter(n -> n % 3 == 0).count();
        long endTime2 = System.nanoTime();
        System.out.println("Time taken (parallel stream): " + (endTime2 - startTime2) / 1000000 + " миллисекунд");
        /*
        Мини конспект -
        На самом деле использовать параллельные стримы очень выгодно при больших обьемах данных и тяжелых громостких операций
        например reduce - с ним разница в производительности в списке с 10млн элементов более чем в 7 раз!
        2000мс - обычный
        500мс - параллельный
       Но, если операция негромосткая например просто фильтрация и преобразование, тогда ситуация становится куда интересней,
       например
       2626мс - обычный
       1751мс - параллельный
       как видите, разница невысокая, всего 50% по сравнению с прошлыми 700%
       поэтому применение параллельных стримов не всегда необходимо, он необходимен только для громостких операций и больших объемов данных
        а вот если уменьшить количество элементов до 100000,
        будут такие результаты при фильтрации и преобразовании
        Time taken: (default stream): 13 миллисекунд
        Time taken (parallel stream): 13 миллисекунд
        или
        Time taken: (default stream): 14 миллисекунд
        Time taken (parallel stream): 11 миллисекунд
        или
        Time taken: (default stream): 10 миллисекунд
        Time taken (parallel stream): 15 миллисекунд
        как видите в среднем, параллельный стрим либо одинаков или дольше чем обычный, а преимущества в скорости почти нету
        но при этом увеличивается затрата ресурсов на работу процессора
        так как параллеьный стрим использует сразу несколько ядер для большей скорости
        */

    }
}
