package org.example;

public class Human {
    private int age;
    private int height;

    public Human(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public Human(int height){
        this.age = 0;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public boolean olderThan18(){
        return this.age >= 18;
    }
}
