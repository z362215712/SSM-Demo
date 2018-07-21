package com.binco.ssm.model;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/19 18:04
 * @description:
 */
public class PersonModel {
    private String name;
    private Integer age;

    public PersonModel() {
    }

    public PersonModel(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
