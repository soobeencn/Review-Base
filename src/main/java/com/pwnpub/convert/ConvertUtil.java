package com.pwnpub.convert;

/**
 * @author pwnpub.tech
 * @date 2021-01-07 5:04 下午
 * @desc 进制转换
 **/
public class ConvertUtil {

    public static void main(String[] args) {
        String input = "0xc";
        int i = Integer.parseInt(input, 16);
        System.out.println(i);
    }
}
