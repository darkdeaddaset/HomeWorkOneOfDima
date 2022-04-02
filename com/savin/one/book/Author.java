package com.savin.one.book;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(){}

    public Author(String name,
                  String email,
                  char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(this.getClass().equals(object.getClass()))) return false;

        Author author = (Author) object;
        return this.gender == author.gender && name.equals(author.name) && email.equals(author.email);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + (name == null? 0 : name.hashCode());
        result = 31 * result + (email == null? 0 : email.hashCode());
        result = 31 * result + (int) gender;

        return result;
    }
}