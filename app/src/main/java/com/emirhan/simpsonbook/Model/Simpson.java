package com.emirhan.simpsonbook.Model;

import java.io.Serializable;

public class Simpson implements Serializable {
    private String name;
    private String job;
    private int age;
    private int imageId;

    public Simpson(String name, String job, int age, int imageId) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public int getImageId() {
        return imageId;
    }
}
