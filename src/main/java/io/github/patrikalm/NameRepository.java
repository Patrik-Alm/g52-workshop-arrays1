package io.github.patrikalm;

import java.util.Arrays;

public class NameRepository {

    private static String [] names = new String[0];





    public static int getSize() {

        return names.length;

    }

    public static void setNames( String [] names) {



    }

    public static void clear() {

      names = new String[0];

    }


    public static String[] findAll() {

        String [] newArray = new String[names.length];

        newArray = Arrays.copyOf(names, names.length);

    return newArray;

    }



}
