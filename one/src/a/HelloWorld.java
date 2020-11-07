package a;

import com.example.person.Person;

import java.util.logging.Logger;

public class HelloWorld {

    private static final Logger  LOGGER =  Logger.getLogger("HelloWorld");
    public static void main(String[] args) {
        System.out.println(new Person("pet"));
    }
}
