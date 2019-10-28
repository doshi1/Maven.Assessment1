package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {

    public static final String cName = "Cat name";
   // public static final int age = 0;

    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        super(name,age);

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        super(cName, age);

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {

         super(cName);

    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
