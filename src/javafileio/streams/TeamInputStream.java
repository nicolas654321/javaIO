package javafileio.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javafileio.classes.Person;

public final class TeamInputStream {

    public static List<Person> readPerson(String strFich) throws Exception {
        List<Person> mesPersons = new ArrayList<Person>();
        File fich = new File(strFich);
        FileReader fr = new FileReader(fich);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while ((line = br.readLine())!=null) {
            Person person = new Person();
            person.setName(line);
            person.setSurname(br.readLine());
            person.setAge(Integer.parseInt(br.readLine()));
            mesPersons.add(person);
        } 
        br.close();
        return mesPersons;
    }
    
}
