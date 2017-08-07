package com.dynamic.creator;

/**
 * Created by nuhma on 2017-07-03.
 */
public class CreateClassRequest {


    private ClassModel classModel;

    private String location;

    public CreateClassRequest() {
    }

    public CreateClassRequest(ClassModel classModel, String location) {
        this.classModel = classModel;
        this.location = location;
    }

    public ClassModel getClassModel() {
        return classModel;
    }

    public void setClassModel(ClassModel classModel) {
        this.classModel = classModel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
