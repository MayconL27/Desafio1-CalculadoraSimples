package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String nome = "Maycon Leandro da Silva";

        System.out.println(StringUtils.abbreviate(nome, 10));
    }
}