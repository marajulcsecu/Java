package Challenges;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade()-o2.getGrade();

            }
        });
        queue.offer(new Student("sharifa",'C'));
queue.offer(new Student("marajul",'A'));
        queue.offer(new Student("aas",'F'));
        queue.offer(new Student("soreful",'B'));

        queue.offer(new Student("hafsa",'D'));

        queue.offer(new Student("aar",'E'));

        System.out.println("Queue is :"+queue);

        System.out.println("Got "+queue.poll());
        System.out.println("Got "+queue.poll());
        System.out.println("Got "+queue.poll());
        System.out.println("Got "+queue.poll());
        System.out.println("Got "+queue.poll());
        System.out.println("Got "+queue.poll());
    }
    public static class Student {

        private final String name;

        public char getGrade() {
            return grade;
        }

        public String getName() {
            return name;
        }

        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }
}
