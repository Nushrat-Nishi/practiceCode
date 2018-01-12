//Finish it later
package com.hackerrank.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * Create the Student and Priorities classes here.
 */
//--------------------------------------------------------------------------------
class Students implements Comparable<Students> {
    int id = 0;
    String name = null;
    double cgpa = 0;

    public Students(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Students other) {
        String a = this.getName();
        String b = other.getName();

        if (this.getCgpa() == other.getCgpa()) {
            if (a.compareTo(b) == 0) { //a=b
                if (this.getId() == other.getId())
                    return 0;
                else if (this.getId() < other.getId())
                    return 1;
                else return -1;
            } else if (a.compareTo(b) > 0)
                return 1;
            else return -1;
        } else if (getCgpa() < other.getCgpa())
            return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

class Priorities {
    List<Students> getStudents(List<String> events) {

        PriorityQueue<Students> priorityQueue = new PriorityQueue<Students>();

        int sizeOfEevents = events.size();

        for (int i = 0; i < sizeOfEevents; i++) {
            String event = events.get(i);
            String[] subStringsOfEvent = event.split(" ");

            if ("ENTER".equals(subStringsOfEvent[0])) {
                Students student = new Students(subStringsOfEvent[1], Double.parseDouble(subStringsOfEvent[2]), Integer.parseInt(subStringsOfEvent[3]));
                priorityQueue.add(student);
            }

            if ("SERVED".equals(subStringsOfEvent[0])) {
                priorityQueue.poll();
            }
            System.out.println(priorityQueue);
        }
        List<Students> list = new ArrayList<>(priorityQueue);
        return list;
    }
}
//--------------------------------------------------------------------------------
public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Students> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Students st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

/*
Sample Input 0
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

Sample Output 0
Dan
Ashley
Shafaet
Maria
*/