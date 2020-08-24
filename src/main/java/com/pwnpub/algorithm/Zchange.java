package com.pwnpub.algorithm;

/**
 * @author Giannis
 * @date 2020-07-09 00:29
 * @desc Z字形变换
 */
public class Zchange {
    /**
     * "PAYPALISHIRING"
     * P       A       H       N
     * A   P   L   S   I   I   G
     * Y       I       R
     */
    public static String convert(String s, int numRows) {
        int length = s.length();
        String[] builder = new String[length];
        StringBuilder returns = new StringBuilder(String.valueOf(s.charAt(0)));
        for (int i = 0, j = i; i < length && j <= numRows; i++) {
            if (j++ == numRows) {
                // i - 2 hardcode
                builder[i - 2] += String.valueOf(s.charAt(i));
                returns.append(s.charAt(i + 1));
                j &= 1;
            }
            builder[i] = String.valueOf(s.charAt(i));
        }

        for (int j = 1; j < builder.length; j += 4) {
            returns.append(builder[j]);
        }

        for (int k = 2; k < builder.length; k += 4) {
            returns.append(builder[k]);
        }

        return returns.toString();
    }

    public static void main(String... argc) {
        System.out.println(convert("LEETCODEISHIRING", 4));
    }

}
