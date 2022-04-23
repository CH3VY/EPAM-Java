package javaExceptions;

import java.util.List;

public class Faculty {
    private String name;
    List<Group> groups;

    public Faculty(String name, List<Group> groups){
        this.name = name;
        this.groups = groups;
    }

    public List<Group> getGroups(){
        return groups;
    }

    public String getName(){
        return name;
    }
}
