package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserRequestDto {
    @JsonProperty("firstname")
    private String firstname;

    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("username")
    private String username;

    @JsonProperty("age")
    private Integer age;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }
}