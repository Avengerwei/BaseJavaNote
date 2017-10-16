package com.zgwei.Collection;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by zgwei on 2017/8/22.
 */
public class OptionalNote {

    public static void main(String[] args){

        Optional<String> name = Optional.of("Sanaulla");
        Optional empty = Optional.ofNullable(null);
        if(name.isPresent()){
            System.out.println(name.get());
        }
        try{
            System.out.println(empty.get());
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        name.ifPresent(value -> System.out.println("The length of the value is: " + value.length()));
        System.out.println(empty.orElse("There is no value present!"));
        System.out.println(name.orElse("There is some value!"));

        Optional<String>  uperName = name.map(value -> value.toUpperCase());
        System.out.println(uperName.orElse("No value found"));

        uperName = name.flatMap(value -> Optional.of(value.toUpperCase()));
        System.out.println(uperName.orElse("No value found"));

        Optional<String> longName = name.filter(value -> value.length()>6);
        System.out.println(longName.orElse("The name is less than 6 characters"));


    }




}
