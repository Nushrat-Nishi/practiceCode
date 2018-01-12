package com.hackerrank.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(s.getBytes());
            byte[] b = md.digest();

            for (byte b1 : b) {
                System.out.printf("%02x", b1);
            }

        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
    }
}

//68e1 0 9f0f4 0 ca72a15e05cc22786f8e6   Output:
//68e1 0 9f0f4 0 ca72a15e05cc22786f8e6   My Output:


//2da2d1e0ce7b4951a858ed2d547ef485
//2da2d1e0ce7b4951a858ed2d547ef485