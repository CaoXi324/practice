package model;

public class Person {
    public String id;
    public String name;
    public int age;

    public Person(String id, String name, int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }
}
