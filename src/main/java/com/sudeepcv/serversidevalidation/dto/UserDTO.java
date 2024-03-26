package com.sudeepcv.serversidevalidation.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class UserDTO {

    @NotNull
    @Min(1)
    String userName;
    @Positive
    @Min(0)
    @NotNull
    int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
