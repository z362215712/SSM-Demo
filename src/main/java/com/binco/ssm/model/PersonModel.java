package com.binco.ssm.model;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/19 18:04
 * @description:
 */
public class PersonModel {
    //基本类型
    @Value("Binco")
    private String name;
    //可以写SpEL：#{}
    @Value("#{30-12}")
    private Integer age;
    //可以写${}，取出配置文件中的值
    //@Value("${person.nickname}")
    @Value("binco")
    private String nickname;

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
                ", nickname='" + nickname + '\'' +
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
