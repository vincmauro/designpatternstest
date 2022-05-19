package com.finconsgroup.test.test3;

public class Client {

    public static void main(String[] args){

        FullName fullName = new FullName("Mario", "Rossi");

        JsonWriter jsonWriter = new JsonWriter();
        System.out.println(jsonWriter.write(fullName));

        XmlWriter xmlWriter = new XmlWriter();
        System.out.println(xmlWriter.write(fullName));

        CsvWriter csvWriter = new CsvWriter();
        System.out.println(csvWriter.write(fullName));

    }

}
