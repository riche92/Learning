package org.example;

import com.google.common.collect.Streams;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    //Count the number of names starting with alphabet A in list
    public void regular() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aaron");
        names.add("Don");
        names.add("Alec");
        names.add("Adam");
        names.add("Ram");
        int count = 0;

        for(int i = 0; i < names.size(); i++){
            String actual = names.get(i);
            if (actual.startsWith("A")){
                System.out.println(names.get(i));
               count++;
            }
        }
        System.out.println(count);
    }


    @Test
    public void streamFilter(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aaron");
        names.add("Don");
        names.add("Alec");
        names.add("Adam");
        names.add("Ram");
        names.add("Aredia");
        long c = names.stream().filter(s->s.startsWith("A")).count();
        System.out.println(c);
        //Create a stream
        //Perform intermediate operation on initial stream and transform it.
        //Perform terminal operation
        //terminal operation will execute only if intermediate op (filter) returns true
        //We can create stream with stream package
        //how to use filter in stream API

       long d = Stream.of("Aaron","Don","Alec","Adam","Ram").filter(f->f.startsWith("A")).count();
       //names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
       names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
       //We are extracting with the filter and then foreach is doing an action in this case the print.
    }

    @Test
    public void streamMap(){
        //print names of last name ends with n with uppercase
        ArrayList<String> names = new ArrayList<String>();
        names.add("Amy");
        names.add("Don");
        names.add("Alec");
        names.add("Alan");
        names.add("Ram");
        Stream.of("Aaron","Frederick","Alec","Adam","Ram","Antonio","Norman").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        List<String> People = Arrays.asList("Jacob","Fred","Aaron","Simon","Sally");
        People.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        //Merging two different lists
        Stream newStream = Streams.concat(names.stream(), People.stream());
        //newStream.sorted().forEach(s-> System.out.println(s));
        boolean flag = newStream.anyMatch(b->b.equals("Alec"));
        Assert.assertTrue(flag);
    }
    @Test
    public void streamCollect(){
        //list
        //new list
        List<String> Is = Stream.of("Aaron","Frederick","Alec","Adam","Ram","Antonio","Norman").filter(s->s.endsWith("m")).map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(Is.get(0));

        List<Integer> num = Arrays.asList(1,3,4,6,3,6,7);
        //Print unique number from array
        // Sort the array
        //num.stream().distinct().sorted().forEach(s->System.out.println(s));
        List<Integer> nooms = num.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(nooms.get(3));

    }
}
