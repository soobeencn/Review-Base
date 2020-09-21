package com.pwnpub.review;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReviewApplicationTests {

    @Test
    public void contextLoads() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //list.forEach(System.out::println);

        System.out.println(Stream.of(list));
    }

}
