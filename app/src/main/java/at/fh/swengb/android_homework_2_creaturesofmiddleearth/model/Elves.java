package at.fh.swengb.android_homework_2_creaturesofmiddleearth.model;

import java.io.Serializable;

/**
 * Created by Dominik on 23.11.2016.
 */

public class Elves implements Serializable {

    //Attributes
    private String group;
    protected String name;
    protected String hairColor;
    protected int age;
    protected String origin;

    //default Consturctor
    public Elves() {
    }
    //Constructor
    public Elves(String name, String hairColor, int age, String origin, String group) {
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
        this.origin = origin;
        this.group = group;
    }

    //GETTER and SETTER
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    //String implementation
    @Override
    public String toString() {
        return "\nMy name is " + name
                + " and I am from " + origin + ". \n"
                + "I am " + age + " years old and the color of my hair is " + hairColor + ".\n"
                + "My folk is also known as " + group;
    }

    //EQUAL and HASH
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elves elves = (Elves) o;

        if (age != elves.age) return false;
        if (!name.equals(elves.name)) return false;
        if (!origin.equals(elves.origin)) return false;
        return group.equals(elves.group);

    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + origin.hashCode();
        result = 31 * result + group.hashCode();
        return result;
    }

    //business method
    public void greeting (String name){
        System.out.println("\n" + getName() + ": Mae Govannen, " + name + "!");
    }

}
