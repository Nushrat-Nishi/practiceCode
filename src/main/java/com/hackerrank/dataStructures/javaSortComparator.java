package com.hackerrank.dataStructures;

import java.util.Comparator;

public class javaSortComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        int compare = 0;
        compare = o1.getFname().compareTo(o2.getFname());
        if (compare == 0){
           // compare = o1.getCgpa().compareTo(o2.getCgpa());
        }
        return compare;
    }

}

