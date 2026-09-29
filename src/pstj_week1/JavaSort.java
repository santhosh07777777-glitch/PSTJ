package pstj_week1;

import java.util.*;

public class JavaSort {

    static class Student {
        int id;
        String name;
        double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            list.add(new Student(id, name, cgpa));
        }

        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.cgpa != b.cgpa)
                    return Double.compare(b.cgpa, a.cgpa);

                if (!a.name.equals(b.name))
                    return a.name.compareTo(b.name);

                return Integer.compare(a.id, b.id);
            }
        });

        for (Student s : list) {
            System.out.println(s.name);
        }

        sc.close();
    }
}