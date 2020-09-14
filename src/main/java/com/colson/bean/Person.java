package com.colson.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("zhangsan")
    private String name;
    @Value("#{12}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;

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

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    /**
     * 获取
     *
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * 设置
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
