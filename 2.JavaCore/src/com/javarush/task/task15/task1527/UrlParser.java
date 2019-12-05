package com.javarush.task.task15.task1527;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlParser {

    private static int loopCount=10000;
    private static Set<String> values,stateValues;
    private static long regexTime;
    private static long stateMachineTime;

    public static void main(String args[]) throws MalformedURLException {

        if(args!=null && args.length==1) {
            String url=String.valueOf(args[0]);
            regexTime=runRegexLoop(loopCount, url);
            stateMachineTime=runStateMachineLoop(loopCount, url);
            printValues();
        }
        else
            System.out.println("Invalid arguments.");
    }

    private static void printValues() {

        System.out.println("Output from RegEx:");
        for(String s:values)
            System.out.println(s);

        System.out.println("\nOutput from StateMachine:");
        for(String s: stateValues)
            System.out.println(s);
        System.out.println("\nPerformance of Two Algorithms:\n"+"Regex:"+regexTime+"msec");
        System.out.println("State:"+stateMachineTime+"msec");

    }


    private static long runRegexLoop(int loopCount,String url) {

        /*
         * Here in the Regex I have divided into groups and I am assuming the URL is valid
         * it'll have these mandatory parameters SCHEME,HOST,PORT and PATH and these will be provided
         *
         */
        Pattern p = Pattern.compile("(\\w+)://([a-zA-Z0-9\\.-_]+?):?(\\d+)?/([^?]+)\\??(.*)?");

        //Using LinkedHashSet for storing the matches
        values=new LinkedHashSet<>();

        long t=System.currentTimeMillis();

        for(int i=0;i<loopCount;i++)
            regexParse(p,url);

        return System.currentTimeMillis()-t;

    }

    private static long runStateMachineLoop(int loopCount,String url) throws MalformedURLException {

        stateValues=new LinkedHashSet<>();
        /*
         * I had tried this way also of creating a constant object but it
         * was all the time giving me 1ms
         */

        //		URL urlObj = new URL(url);

        long t=System.currentTimeMillis();

        for(int i=0;i<loopCount;i++)
            /* In every loop of iteration this ,,stateParse(0,new URL(url))" will
             * create a new object and it'll take some clock ticks in creation and because of that
             * we'll see change in the performance.
             */
            stateParse(0,new URL(url));

        return System.currentTimeMillis()-t;

    }

    public static void regexParse(Pattern p,String url) {

        Matcher matcher = p.matcher(url);//creating a matcher object which is accepting text value
        matcher.find(); //getting the Stings based on groups

        String s=matcher.group(1);	//s="http"
        if(s!=null&&!s.isEmpty())
            values.add(s);     // Appending "http" to s

        s=matcher.group(2);			//s= "host"
        if(s!=null&&!s.isEmpty())
            values.add(s);

        s=matcher.group(3);			//s=port
        if(s!=null&&!s.isEmpty())
            values.add(s);

        s=matcher.group(4);			//s=path
        if(s!=null&&!s.isEmpty())
            values.add(s);

        s=matcher.group(5);			//s="params"
        if(s!=null&&!s.isEmpty())
            values.add(s);
    }

    public static void stateParse(int state, URL url) {
        /*
         * In this state=0 is starting state and state=-1 is termination state
         *
         */
        if (state < 0)
            return;

        switch (state) {
            case 0:// get scheme here
                stateValues.add(url.getProtocol());
                //url.getProtocol();
                state = 1;
                break;

            case 1:// get host here
                stateValues.add(url.getHost());
                //url.getHost();
                state = 2;
                break;

            case 2:// get port here
                stateValues.add(url.getPort()+"");
                //url.getPort();
                state = 3;
                break;
            case 3:// get path here
                stateValues.add(url.getPath());
                //url.getPath();
                state = 4;
                break;
            case 4:// get parameters here
                stateValues.add(url.getQuery());
                //url.getQuery();
                state = -1;
                break;

            default:
                state = -1;
                break;
        }

        stateParse(state, url); //calling it recursively
    }

}


/*
 * References:
 *
 * 1)http://tutorials.jenkov.com/java-regex/matcher.html#java-matcher-example
 * 2)http://www.vogella.com/tutorials/JavaRegularExpressions/article.html#pattern-and-matcher
 * 3)https://docs.oracle.com/javase/7/docs/api/java/net/URL.html
 */