package com.dynamic.creator;

import java.util.List;

/**
 * Created by nuhma on 2017-07-03.
 */
public class MethodSignature {

    public List<String> signatures;

    public List<Argument> arguments;

    public MethodSignature() {
    }

    public MethodSignature(List<String> signatures, List<Argument> arguments) {
        this.signatures = signatures;
        this.arguments = arguments;
    }

    public MethodSignature(List<String> signatures) {
        this.signatures = signatures;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(List<Argument> arguments) {
        this.arguments = arguments;
    }
}
