package model;

public class Class {
    public String number;
    public String leader;

    public Class(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (this.equals(student.klass)) {
            setLeader(student.name);

        } else {
            System.out.println("It is not of us.");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public boolean isIn(Student student) {
        if (student.klass.number == this.number) {
            return true;
        } else {
            return false;
        }
    }
}
