package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    //  -c name1 sex1 bd1 name2 sex2 bd2 ...
    //  -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
    //  -d id1 id2 id3 id4 ...
    //  -i id1 id2 id3 id4 ...

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        /*
        String[] _args = { null, null, null, null, null, null, null, null, null };
        _args[0] = "-c";
        _args[1] = "0";
        _args[2] = "Миронов И";
        _args[2] = "1";
        _args[4] = "01/01/1995";
        _args[3] = "2";
        _args[6] = "Миронова М";
        _args[4] = "3";
        _args[8] = "01/04/1991";
         */

        switch ( args[0] ) {
            case "-c" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if ( args[i + 1].equals("м"))
                            allPeople.add(Person.createMale( args[i], dateFormat.parse( args[i + 2])));
                        else if ( args[i + 1].equals("ж"))
                            allPeople.add(Person.createFemale( args[i], dateFormat.parse( args[i + 2])));
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }

            case "-u" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i+=4) {
                        allPeople.get(Integer.parseInt( args[i])).setName( args[i + 1]);
                        if ( args[i + 2].equals("м"))
                            allPeople.get(Integer.parseInt( args[i])).setSex(Sex.MALE);
                        else if ( args[i + 2].equals("ж"))
                            allPeople.get(Integer.parseInt( args[i])).setSex(Sex.FEMALE);
                        allPeople.get(Integer.parseInt( args[i])).setBirthDate(dateFormat.parse( args[i + 3]));
                    }
                    break;
                }

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get( Integer.parseInt( args[i] ) ).setName( null );
                        allPeople.get(Integer.parseInt( args[i])).setSex(null);
                        allPeople.get(Integer.parseInt( args[i])).setBirthDate(null);
                    }
                    break;
                }

            case "-i":
                synchronized (allPeople) {
                    SimpleDateFormat dateFormat1 = new SimpleDateFormat(" dd-MMM-yyyy", Locale.ENGLISH);
                    //System.out.println(args.length);
                    for (int i = 1; i < args.length; i++) {
                        Person current = allPeople.get( Integer.parseInt( args[i] ) );
                        System.out.println(current.getName() + " "
                                + (current.getSex().equals(Sex.MALE) ? "м" : current.getSex().equals(Sex.FEMALE) ? "ж" : null)
                                + dateFormat1.format(current.getBirthDate()));
                    }
                    break;
                }
        }

    }

}
