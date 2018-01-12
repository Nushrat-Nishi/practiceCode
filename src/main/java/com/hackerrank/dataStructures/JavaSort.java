package com.hackerrank.dataStructures;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
//Complete the code


public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

//-------------------------------------------
        studentList.sort(new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                int compare = (int) ((o2.getCgpa() - o1.getCgpa()) * 1000);

                if (compare == 0) {
                    compare = o1.getFname().compareTo(o2.getFname());
                }
                if (compare == 0) {
                    compare = o1.getId() - o2.getId();
                }
                return compare;
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
//https://www.hackerrank.com/challenges/java-sort/problem
/*
Sample Input
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76

Sample Output
Ashis
Fahim
Samara
Samiha
Rumpa



5
33 Rumpa 3.68
85 Ashis 3.85
56 Samara 3.75
19 Samara 3.75
22 Fahim 3.76

*/