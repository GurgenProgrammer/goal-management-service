package org.example;

public class CreateUserRequestDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String username;
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
