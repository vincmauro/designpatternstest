package com.finconsgroup.test.test3;

public class XmlWriter extends Writer {

    public String write(FullName fullName){
        return "<fullName><firstName>" + fullName.getFirstName() + "</firstName><lastName>"
                + fullName.getLastName() + "</lastName></fullname>";
    }

}
