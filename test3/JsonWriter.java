package com.finconsgroup.test.test3;

public class JsonWriter extends Writer {

    public JsonWriter(){
    }

    public String write(FullName fullName){
        return "{ firstName:\"" + fullName.getFirstName() + "\", lastName:\"" + fullName.getLastName() + "\" }";
    }

}
