package com.awb.awb.model;
import com.awb.awb.controller.*;

public class citizen {

    private Integer Id=1;
    private String Name;




    // Getter and Setter
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public citizen(int id, String name) {
        Id = id;
        Name = name;
    }
}
