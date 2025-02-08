package model;

import java.io.File;

public class User {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String email;
    private String phone;
    private String hobbies;
    private File photo;  
    
    public User(String firstName, String lastName, String gender, int age, String email, String phone, String hobbies, File photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.hobbies = hobbies;
        this.photo = photo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "User Profile:\n" +
               "First Name: " + firstName + "\n" +
               "Last Name: " + lastName + "\n" +
               "Gender: " + gender + "\n" +
               "Age: " + age + "\n" +
               "Email: " + email + "\n" +
               "Phone: " + phone + "\n" +
               "Hobbies: " + hobbies + "\n" +
               "Photo: " + (photo != null ? photo.getName() : "No photo uploaded");
    }
}
