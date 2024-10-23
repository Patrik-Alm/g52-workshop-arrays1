package io.github.patrikalm;

import java.util.Arrays;

public class NameRepository {

    private static String [] names = /*new String[0];*/ {"Peter", "Hans","Tore"};

    public static void main(String[] args) {

        add("Lennart");

        System.out.println(Arrays.toString(names));
    }



    public static int getSize() {

        return names.length;

    }

    public static void setNames( String [] newNames) {

        names = newNames;

    }

    public static void clear() {

      names = new String[0];

    }


    public static String[] findAll() {

        return names.clone();

    }

    public static String find(final String fullName) {

        for (int i = 0; i < names.length; i++) {

            if (names[i].equals(fullName)) {

                return names[i];
            }

        }

        return null;
    }

    public static boolean add(final String fullName) {

        if (find(fullName) != null) {

            return false;

            }
        else {

            names = Arrays.copyOf(names, names.length + 1);

            names [names.length-1] = fullName;
            return true;

            }
        }
    }
