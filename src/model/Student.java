package model;

public class Student extends Person {
    public Class klass;

    public Student(String id, String name, int age) {
        super(id, name, age);

    }

    public Class getKlass() {
        return this.klass;
    }

    public void setKlass(Class klass) {
        this.klass=klass;
    }

    @Override
    public String introduce() {
        if (getKlass().leader==null) {
            return super.introduce() + " I am a model.Student. I am at model.Class " + this.klass.number;
        } else if(getKlass().leader.equals(this.name)){
            return super.introduce() + " I am a model.Student. I am Leader of model.Class " + this.klass.number;
        } else {
            return super.introduce() + " I am a model.Student. I am at model.Class " + this.klass.number;

        }
    }
}