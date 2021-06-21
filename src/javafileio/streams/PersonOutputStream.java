package javafileio.streams;

import java.io.File;
import java.io.FileWriter;

import javafileio.classes.Person;

public final class PersonOutputStream {

    public static void writePerson(String strFich, Person person) throws Exception {
        File fich = new File(strFich);
        FileWriter fw = new FileWriter(fich, false);
        fw.write(person.getName()+System.lineSeparator());
        fw.write(person.getSurname()+System.lineSeparator());
        fw.write(person.getAge()+System.lineSeparator());
        fw.close();
    }
    
}
