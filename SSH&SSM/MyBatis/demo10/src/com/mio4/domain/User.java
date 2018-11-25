package com.mio4.domain;

/**
 * create table tb_user(
 * 	id int(11) primary key auto_increment,
 * 	name varchar(20) default null,
 * 	sex char(2) default null,
 * 	age int(11) default null
 * );
 */
public class User {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;

    public User(){

    }

    public User(String name, String sex, Integer age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }
}