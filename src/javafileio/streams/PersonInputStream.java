package javafileio.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafileio.classes.Person;

public final class PersonInputStream {

    public static Person readPerson(String strFich) throws Exception {
        Person person = new Person();
        File fich = new File(strFich);
        FileReader fr = new FileReader(fich);
        BufferedReader br = new BufferedReader(fr);
        person.setName(br.readLine());
        person.setSurname(br.readLine());
        person.setAge(Integer.parseInt(br.readLine()));
        br.close();
        return person;
    }
    
}
