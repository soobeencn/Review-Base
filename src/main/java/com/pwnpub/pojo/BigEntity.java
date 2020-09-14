package com.pwnpub.pojo;

/**
 * @author Giannis
 * @date 2020-08-28 23:44
 * @desc
 */

public class BigEntity {

    private String id;

    private String name;

    private String age;

    private String sex;

    private String school;

    private String mom;

    private String dad;

    private String grandpa;

    public BigEntity() {
    }

    public BigEntity(String id, String name, String age, String sex, String school, String mom, String dad, String grandpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.school = school;
        this.mom = mom;
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

    public String getMom() {
        return mom;
    }

    public void setMom(String mom) {
        this.mom = mom;
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
