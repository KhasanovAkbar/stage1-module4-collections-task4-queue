package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> temp = new PriorityQueue<>( Comparator.reverseOrder());
        PriorityQueue<String> result = new PriorityQueue<>( Comparator.reverseOrder());

        temp.addAll(firstList);
        temp.addAll(secondList);
        while (!temp.isEmpty()) {
            result.add(temp.poll());
        }
        return result;
    }
}
