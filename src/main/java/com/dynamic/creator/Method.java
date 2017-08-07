package com.dynamic.creator;

import java.util.List;

/**
 * Created by nuhma on 2017-07-03.
 */
public class Method {

    private List<String> signatures;

    private String name;

    private List<Argument> arguments;

    private List<String> body;

    private Return returns;

    public Method() {
    }

    public Method(List<String> signatures, String name, List<Argument> arguments, List<String> body, Return returns) {
        this.signatures = signatures;
        this.name = name;
        this.arguments = arguments;
        this.body = body;
        this.returns = returns;
    }

    public Method(String name) {
        this.name = name;
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

    public Return getReturns() {
        return returns;
    }

    public void setReturns(Return returns) {
        this.returns = returns;
    }

    @Override
    public String toString() {
        String methodString = "";
        for(String signatures:this.getSignatures()){
            methodString += " "+signatures;
        }
        methodString = methodString+" "+this.getName()+"(";

        for(int i=0;i<this.getArguments().size();i++){

            methodString += (i==0)?(this.getArguments().get(i)):(", "+this.getArguments().get(i));
        }

        methodString += "){\r\n";

        for(String lines:body){
            methodString += lines+"\r\n";
        }

        if(returns != null){
            methodString += returns+"\r\n";
        }

        methodString += "}";

        return methodString;

    }
}
