package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    List<Integer> list;
    ListAggregator aggregator;

    @BeforeEach
    public void helper(){
        list = Arrays.asList(1,2,4,2,5);
        aggregator = new ListAggregator();
    }
    @Test
    public void sum() {
        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        List<Integer> list2 = Arrays.asList(-1,-2,-3,-4,-5);
        ListAggregator aggregator2 = new ListAggregator();

        int max = aggregator.max(list);
        int max2 = aggregator2.max(list2);

        Assertions.assertEquals(5, max);
        Assertions.assertEquals(-1, max2);
    }

    @Test
    public void min() {
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        int distinct = aggregator.distinct(list);

        Assertions.assertEquals(4, distinct);
    }
}
