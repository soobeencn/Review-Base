package com.pwnpub.pojo;

/**
 * @author Giannis
 * @date 2020-08-28 23:44
 * @desc
 */

public class SmallEntity {

    private String id;

    private String name;

    private String age;

    private String sex;

    private String school;

    private String dad;

    private String grandpa;

    public SmallEntity() {
    }

    public SmallEntity(String id, String name, String age, String sex, String school, String dad, String grandpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.school = school;
        this.dad = dad;
        this.grandpa = grandpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDad() {
        return dad;
    }

    public void setDad(String dad) {
        this.dad = dad;
    }

    public String getGrandpa() {
        return grandpa;
    }

    public void setGrandpa(String grandpa) {
        this.grandpa = grandpa;
    }
}
