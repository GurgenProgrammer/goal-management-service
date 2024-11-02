package org.example;

import jakarta.persistence.criteria.CriteriaBuilder;

public class CreateUserParams {
    private final Long id;
    private final String firstname;
    private final String lastname;
    private final String username;
    private final Integer age;

    public CreateUserParams(Long id, String firstname, String lastname,
                            String username, Integer age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}
