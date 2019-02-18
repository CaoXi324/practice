package model;

public class Teacher extends Person {

    public String classes;

    public Teacher(String id, String name, int age) {

        super(id, name, age);
    }

    public String getClasses() {

        return classes;
    }

    public void setClasses(String classes) {

        this.classes = classes;
    }

    @Override

    public String introduce() {

        if (getClasses() == null) {
            return super.introduce() + " I am a model.Teacher. I teach No model.Class.";
        } else {
            return super.introduce() + " I am a model.Teacher. I teach model.Class " + classes;

        }
    }

    public boolean isTeaching(Student student) {

        if(classes.indexOf(student.klass.number) ==-1) {
            return false;
        } else {
            return true;
        }

    }

    public void studentIsAdd(Class klass, Student student) {
        if (classes.indexOf(klass.number) != -1) {
            student.setKlass(klass);
            System.out.println("I am " + name + " I know " + student.name + " has joined model.Class " + klass.number);
        }
    }

    public void studentIsLeader(Class klass, Student student) {
        if (classes.indexOf(klass.number) != -1 ) {
            klass.assignLeader(student);
            System.out.println("I am " + name + " I know " + student.name + " has become Leader of model.Class " + klass.number);
        }
    }

}
