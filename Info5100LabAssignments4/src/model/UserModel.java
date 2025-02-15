/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
import javax.swing.ImageIcon;
/**
 *
 * @author prasanthj
 */
public class UserModel {
    


private String name;
private String gender;

private int age;
private String hobby;
private ImageIcon picture;
private Date dob;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public ImageIcon getPicture() {
        return picture;
    }

    public void setPicture(ImageIcon picture) {
        this.picture = picture;
    }



public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
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

public String getHobby() {
return hobby;
}

public void setHobby(String hobby) {
this.hobby = hobby;
}

@Override
public String toString() {
return "User{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", hobby=" + hobby + ", Date of Birth=" + dob + '}';
}
    
    
}
