package com.javarush.task.task17.task1710;

import javax.xml.crypto.Data;
import java.sql.ClientInfoStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        /*
        String[] _args = { null, null, null, null, null};
        _args[0] = "-c";
        _args[1] = "Миронов V";
        _args[2] = "м";
        _args[3] = "15/04/1991";
         */
        SimpleDateFormat oldFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat newFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        //System.out.println(_args[0] + " " + _args[1] + " " + _args[2] + " " + _args[3] + " " + _args[4]);
        if(args[0].equals("-c")) {
            Person person;
            //System.out.println(_args[3]);
            if(args[2].equals("м")) {
                person = Person.createMale( args[1], oldFormat.parse( args[3]) );
            }else {
                person = Person.createFemale( args[1], oldFormat.parse( args[3]) );
            }
            allPeople.add(person);
            // выводим индекс добавленной персоны
            System.out.println(allPeople.indexOf(person));

        }else if( args[0].equals("-u") ) {
            Person person;
            if( args[3].equals("м") ) {
                person = Person.createMale( args[2], oldFormat.parse( args[4]) );
            }else {
                person = Person.createFemale( args[2], oldFormat.parse( args[4]) );
            }
            allPeople.set(Integer.parseInt( args[1]),person );

        }else if( args[0].equals("-d") ) {
            int index = Integer.parseInt( args[1] );
            Person person = allPeople.get(index);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);

        }else if( args[0].equals("-i") ) {
            int index = Integer.parseInt( args[1] );
            Person person = allPeople.get(index);
            String newDate = newFormat.format(person.getBirthDate());
            System.out.println(person.getName() + " " + sex( person.getSex() ) + " " + newDate);

        }
        /*
        for ( Person person : allPeople ) {
            System.out.println( person.getName() + " " + sex( person.getSex() ) + " " + person.getBirthDate() );
        }
        */
    }

    public static String sex(Sex sex){
        String pol = null;
        if (sex == sex.MALE ) {
            pol = "м";
        }else if (sex == sex.FEMALE ){
            pol = "ж";
        }
        return pol;
    }
}
