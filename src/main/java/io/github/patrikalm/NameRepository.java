package io.github.patrikalm;

import java.sql.SQLOutput;
import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];


        public static int getSize () {

            return names.length;

        }

        public static void setNames (String[]newNames){

            names = Arrays.copyOf(newNames, newNames.length);

        }

        public static void clear () {

            names = new String[0];

        }


        public static String[] findAll () {

            return Arrays.copyOf(names, names.length);

        }

        public static String find ( final String fullName){

            for (int i = 0; i < names.length; i++) {

                if (names[i].equals(fullName)) {

                    return names[i];
                }

            }

            return null;
        }

        public static boolean add ( final String fullName){

            if (find(fullName) != null) {

                return false;

            } else {

                names = Arrays.copyOf(names, names.length + 1);

                names[names.length - 1] = fullName;

                return true;

            }
        }

        public static String[] findByFirstName(final String firstName) {

            String[] localNames = new String[0];

            String localFirstName = null;

            for (int i = 0; i < names.length; i++) {

                localFirstName = names[i].split(" ")[0];

                if (localFirstName.equals(firstName)) {

                    localNames = Arrays.copyOf(localNames, localNames.length + 1);
                    localNames[localNames.length - 1] = names[i];

                    }
                 }

            return localNames;

        }

        public static String[] findByLastName ( final String lastName){

            String[] localNames = new String[0];

            String localLastName = null;

            for (int i = 0; i < names.length; i++) {

                localLastName = names[i].split(" ")[1];

                if (localLastName.equals(lastName)) {

                    localNames = Arrays.copyOf(localNames, localNames.length + 1);
                    localNames[localNames.length - 1] = names[i];

                    }
                }

            return localNames;

        }

        public static boolean update (final String original, final String updatedName) {

            for (int i = 0; i < names.length; i++) {

                if (names[i].equals(original)) {

                    names[i] = updatedName;

                    return true;
                }
            }
            return false;
        }

        public static boolean remove(final String fullName) {

            String [] localNames = new String[names.length-1];
            int counter=0;

            for (int i = 0; i < names.length; i++) {

                if (names[i].equals(fullName)) {

                    for (int j = 0; j < names.length; j++) {

                        if (i != j) {

                            System.out.println(counter);
                            localNames[counter] = names[j];
                            counter++;

                        }



                    }

                    names = Arrays.copyOf(localNames, localNames.length);
                    return true;
                }

            }

            return false;
        }

}