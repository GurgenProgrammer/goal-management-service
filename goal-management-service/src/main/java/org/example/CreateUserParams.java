package org.example;

public class CreateUserParams {
    private final String firstname;
    private final String lastname;
    private final String username;
    private final Integer age;

    public CreateUserParams(String firstname, String lastname,
                            String username, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.age = age;
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
