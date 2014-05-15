package edu.dio.lesson6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Vladimir V. Kravchenko on 14.05.2014.
 */
public class ArrayWrapper {
    public static <T extends Person> List<T> union(List<T> list1, List<T> list2) {
        Set<T> personsSet=new HashSet<T>(list1);
        personsSet.addAll(list2);
        return new ArrayList<T>(personsSet);
    }

    public static <T extends Person> List<T> intersect(List<T> list1, List<T> list2) {
        Set<T> personsSet = new HashSet<T>(list1);
        personsSet.retainAll(new HashSet<T>(list2));
        return new ArrayList<T>(personsSet);
    }

    public static <T extends Person> List<T> nonOverlap(List<T> list1, List<T> list2) {
        Set<T> personsSet = new HashSet<T>(ArrayWrapper.union(list1, list2));
        personsSet.removeAll(ArrayWrapper.intersect(list1, list2));
        return new ArrayList<T>(personsSet);
    }
}
