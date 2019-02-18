package service;

import model.Class;
import model.Student;
import model.Teacher;

public class Verify {
    public void verify() {
        Class klassA = new Class("1902");
        Class klassB = new Class("1903");
        Student student1 = new Student("0901", "Peter", 22);
        Student student2 = new Student("0902", "Ben", 23);
        Student student3 = new Student("0903", "George", 23);
        Teacher teacher1 = new Teacher("0101", "Harry", 35);
        Teacher teacher2 = new Teacher("0102", "Helen", 32);


        student1.setKlass(klassA);
        klassB.appendMember(student2);
        klassA.assignLeader(student1);
        teacher2.setClasses("1902,1904");
        teacher2.studentIsAdd(klassA, student3);
        teacher2.studentIsLeader(klassA, student3);

        System.out.println(student1.getKlass().number);
        System.out.println(student1.introduce());
        System.out.println(student2.introduce());
        System.out.println(teacher1.introduce());
        System.out.println(teacher2.introduce());
        System.out.println(teacher2.isTeaching(student1));
        System.out.println(teacher2.isTeaching(student2));
        System.out.println(klassA.isIn(student2));
        System.out.println(klassA.isIn(student1));
    }
}