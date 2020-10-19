package com.everis.bootcamp;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DateTime dt = DateTime.now();
    	DateTimeFormatter dtfOut = DateTimeFormat.forPattern("dd/MM/yyy");
        System.out.println(dtfOut.print(dt));
    }
}
