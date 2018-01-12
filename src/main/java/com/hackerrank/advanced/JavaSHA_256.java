package com.hackerrank.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA_256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

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