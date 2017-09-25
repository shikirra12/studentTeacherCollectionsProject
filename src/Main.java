import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> firstGradeStudents = new ArrayList<Student>();

        Student student1 = new Student("Sarah", "Grey", 1, 1);
        firstGradeStudents.add(student1);
        Student student2 = new Student("Rashad", "Hill", 2, 1);
        firstGradeStudents.add(student2);
        Student student3 = new Student("Brittany", "Richards", 3, 1);
        firstGradeStudents.add(student3);
        Student student4 = new Student("Sierra", "Graves", 4, 1);
        firstGradeStudents.add(student4);
        Student student5 = new Student("Renee", "Steel", 5, 1);
        firstGradeStudents.add(student5);
        Student student6 = new Student("Miguel", "Rodgriez", 6, 1);
        firstGradeStudents.add(student6);
        Student student7 = new Student("Danely", "Diaz", 7, 1);
        firstGradeStudents.add(student7);
        Student student8 = new Student("Jerrell", "Giddins", 8, 1);
        firstGradeStudents.add(student8);
        Student student9 = new Student("Jen", "Benard", 9, 1);
        firstGradeStudents.add(student9);
        Student student10 = new Student("Tori", "Ling", 10, 1);
        firstGradeStudents.add(student10);
        Student student11 = new Student("Paul", "Pierce", 11, 1);
        firstGradeStudents.add(student11);
        Student student12 = new Student("Shikirra", "Grey", 12, 1);
        firstGradeStudents.add(student12);
        Student student13 = new Student("Henry", "Jackson", 13, 1);
        firstGradeStudents.add(student13);
        Student student14 = new Student("Sara", "Grey", 14, 1);
        firstGradeStudents.add(student14);
        Student student15 = new Student("Ming", "Ling", 15, 1);
        firstGradeStudents.add(student15);

        Set<Student> studentGroup1 = new HashSet<>();
        studentGroup1.add(student1);
        studentGroup1.add(student2);
        studentGroup1.add(student3);
        studentGroup1.add(student4);
        studentGroup1.add(student5);

        Set<Student> studentGroup2 = new HashSet<>();
        studentGroup2.add(student6);
        studentGroup2.add(student7);
        studentGroup2.add(student8);
        studentGroup2.add(student9);
        studentGroup2.add(student10);

        Set<Student> studentGroup3 = new HashSet<>();
        studentGroup3.add(student11);
        studentGroup3.add(student12);
        studentGroup3.add(student13);
        studentGroup3.add(student14);
        studentGroup3.add(student15);


        List<Teacher> firstGradeTeachers = new ArrayList<Teacher>();

        Teacher teacher1 = new Teacher("Angela", "Gibbs", 20, 1);
        firstGradeTeachers.add(teacher1);
        Teacher teacher2 = new Teacher("John", "Hopkins", 21, 1);
        firstGradeTeachers.add(teacher2);
        Teacher teacher3 = new Teacher("Lucille", "Weeks", 22, 1);
        firstGradeTeachers.add(teacher3);

        Map<Teacher, Set<Student>> school = new HashMap<>();
        school.put(teacher3, studentGroup1);
        school.put(teacher2, studentGroup2);
        school.put(teacher1, studentGroup3);

//        Set<Teacher> teachers = school.keySet();
//        System.out.println(teachers);

        for (Teacher teacher: school.keySet()) {
            String allTeachers = school.keySet().toString();
            System.out.println(allTeachers);
        }

//        for ( student:school.values()) {
//        school.get(teacher);
//            System.out.println(school.values());
//        }
    }
}
