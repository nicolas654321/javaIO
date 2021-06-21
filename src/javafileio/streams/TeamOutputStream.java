package javafileio.streams;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import javafileio.classes.Person;

public final class TeamOutputStream {

    public static void writePerson(String strFich, List<Person> lstPerson) throws Exception {
        File fich = new File(strFich);
        FileWriter fw = new FileWriter(fich, false);
        for (Person person : lstPerson) {
            fw.write(person.getName()+System.lineSeparator());
            fw.write(person.getSurname()+System.lineSeparator());
            fw.write(person.getAge()+System.lineSeparator());
        }
        fw.close();
    }
}
