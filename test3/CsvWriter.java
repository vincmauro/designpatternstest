package com.finconsgroup.test.test3;

public class CsvWriter extends Writer {

    public String write(FullName fullName){
        return "FirstName;LastName\n" + fullName.getFirstName() + ";" + fullName.getLastName();
    }

}
