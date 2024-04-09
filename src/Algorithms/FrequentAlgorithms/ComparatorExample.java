package Algorithms.FrequentAlgorithms;

import java.util.Comparator;
import java.util.TreeMap;

class UsingComparable implements Comparable<UsingComparable>{

    @Override
    public int compareTo(UsingComparable o) {
        // do whatever you want here
        // o.something-this.something
        return 0;
    }
}

class Student{

}

// always declare comp class outside other class
// as it may cause it gives static error, not sure why
class Comp implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // do whatever you want here
        // o1.something - o2.something
        return 0;
    }
}

public class ComparatorExample {

    // two ways
    // comparable interface
    // comparator interface

    TreeMap<UsingComparable,Integer> mp = new TreeMap<>();  // no need to pass the custom comparator
                                                            // as it is provided in the key class itself
    TreeMap<Student,Integer> _mp = new TreeMap<>(new Comp()); // custom comparator is passed here

}
