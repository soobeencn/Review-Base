package com.pwnpub.lambda.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author Giannis
 * @date 2020-09-07 22:59
 * @desc 学生数据结构
 */
public class StudentDTO implements Serializable {

    private static final long serialVersionUID = -7716352032236707189L;

    public StudentDTO() {
    }

    public StudentDTO(Long id, String code, String name, String sex, Double scope,
                      List<Course> learningCources) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.scope = scope;
        this.learningCources = learningCources;


    }

    /**
     * id
     */
    private Long id;
    /**
     * 学号 唯一标识
     */
    private String code;
    /**
     * 学生名字
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 分数
     */
    private Double scope;

    /**
     * 要学习的课程
     */
    private List<Course> learningCources;

}

