package javafileio.main;

import java.util.ArrayList;
import java.util.List;

import javafileio.classes.Person;
import javafileio.streams.PersonInputStream;
import javafileio.streams.PersonOutputStream;
import javafileio.streams.TeamInputStream;
import javafileio.streams.TeamOutputStream;

public class Main {

    public static void main(String[] args) {
        
        try {
            
            String monFich = "c:/work/dev/maPerson.txt"; 
            Person maPerson = new Person("dupond", "alfred", 44);
            
            PersonOutputStream.writePerson(monFich, maPerson);
            Person maPersonRead = PersonInputStream.readPerson(monFich);
            System.out.println(maPersonRead);
            
            
            monFich = "c:/work/dev/mesPersons.txt";
            List<Person> mesPersons = new ArrayList<Person>();
            mesPersons.add(new Person("toto", "rené", 40));
            mesPersons.add(new Person("tata", "do", 50));
            mesPersons.add(new Person("titi", "mi", 10));
            TeamOutputStream.writePerson(monFich, mesPersons);
            
            List<Person> mesPersonsRead = TeamInputStream.readPerson(monFich);
            for (Person person : mesPersonsRead) {
                System.out.println(person);
            }
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        

    }

}
