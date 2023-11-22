package com.project.schoolmanagment.entity.enums;
//haftanın günleri gibi değişme ihtimali olmayan roller için enum kullanırız
public enum RoleType {

    ADMIN("Admin"),
    TEACHER("Teacher"),
    STUDENT("Student"),
    MANAGER("Dean"),
    ASSISTANT_MANAGER("Vice Dean");

    public final String name;

    //constructor yapmazsak kızarır
    RoleType(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return name;
    }



}
