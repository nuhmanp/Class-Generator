package com.dynamic.creator;

import java.util.List;

/**
 * Created by nuhma on 2017-07-04.
 */
public class ClassModel {

    private String packages;

    private List<String> imports;

    private List<String> accessModifiers;

    private String name;

    private List<Variable> variables;

    private List<Constructor> constructors;

    private List<Method> methods;

    private List<MethodSignature> methodSignatures;

    public ClassModel() {
    }

    public ClassModel(String packages, String name) {
        this.packages = packages;
        this.name = name;
    }

    public ClassModel(String packages, List<String> accessModifiers, String name) {
        this.packages = packages;
        this.accessModifiers = accessModifiers;
        this.name = name;
    }

    public ClassModel(String packages, List<String> accessModifiers, String name, List<Variable> variables) {
        this.packages = packages;
        this.accessModifiers = accessModifiers;
        this.name = name;
        this.variables = variables;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    public List<String> getAccessModifiers() {
        return accessModifiers;
    }

    public void setAccessModifiers(List<String> accessModifiers) {
        this.accessModifiers = accessModifiers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }

    public List<Constructor> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<Constructor> constructors) {
        this.constructors = constructors;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public List<MethodSignature> getMethodSignatures() {
        return methodSignatures;
    }

    public void setMethodSignatures(List<MethodSignature> methodSignatures) {
        this.methodSignatures = methodSignatures;
    }
}
