package com.pwnpub.lambda.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Giannis
 * @date 2020-09-07 23:11
 * @desc course data structure
 */
public class Course implements Serializable {

    private static final long serialVersionUID = 2896201730223729591L;

    /**
     * 课程 ID
     */
    public Long id;

    /**
     * 课程 name
     */
    public String name;

    public Course(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // 初始化数据
    public final List<StudentDTO> students = new ArrayList<StudentDTO>() {
        {
            // 添加学生数据
            add(new StudentDTO(1L, "W199", "小美", "WM", 100D, new ArrayList<Course>() {
                {
                    // 添加学生学习的课程
                    add(new Course(300L, "语文"));
                    add(new Course(301L, "数学"));
                    add(new Course(302L, "英语"));
                }
            }));
            add(new StudentDTO(2L, "W25", "小美", "WM", 100D, new ArrayList<>()));
            add(new StudentDTO(3L, "W3", "小名", "M", 90D, new ArrayList<Course>() {
                {
                    add(new Course(300L, "语文"));
                    add(new Course(304L, "体育"));
                }
            }));
            add(new StudentDTO(4L, "W1", "小蓝", "M", 10D, new ArrayList<Course>() {
                {
                    add(new Course(301L, "数学"));
                    add(new Course(305L, "美术"));
                }
            }));
        }
    };

}