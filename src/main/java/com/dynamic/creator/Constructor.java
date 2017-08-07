package com.dynamic.creator;

import java.util.List;

/**
 * Created by nuhma on 2017-07-04.
 */
public class Constructor {

    private List<String> signatures;

    private String name;

    private List<Argument> arguments;

    private List<String> body;

    public Constructor() {
    }

    public Constructor(String name) {
        this.name = name;
    }

    public Constructor(String name, List<String> body) {
        this.name = name;
        this.body = body;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(List<Argument> arguments) {
        this.arguments = arguments;
    }

    public List<String> getBody() {
        return body;
    }

    public void setBody(List<String> body) {
        this.body = body;
    }

    @Override
    public String toString() {
        String constructorString = "";
        for(String signatures:this.getSignatures()){
            constructorString += " "+signatures;
        }
        constructorString = constructorString+" "+this.getName()+"(";

        for(int i=0;i<this.getArguments().size();i++){

            constructorString += (i==0)?(this.getArguments().get(i)):(", "+this.getArguments().get(i));
        }

        constructorString += "){\r\n";

        for(String lines:body){
            constructorString += lines+"\r\n";
        }

        constructorString += "}";

        return constructorString;
    }
}
