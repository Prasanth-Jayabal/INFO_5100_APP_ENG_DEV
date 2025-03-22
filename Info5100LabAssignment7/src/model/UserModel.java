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
    

private int userid;
private String name;
private String gender;
private String college;
private int age;
private String hobby;
private ImageIcon picture;
private Date dob;

   public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

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

public String getCollege() {
return college;
}

public void setCollege(String gender) {
this.college = gender;
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
