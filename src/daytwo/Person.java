
package daytwo;

import java.util.ArrayList;

public class Person {
    private String name;
    private String gender;
    private String image;
    private String nationality;
    private ArrayList<Role> roles;

    public Person(String name, String gender, String image, String nationality, ArrayList<Role> roles) {
        this.name = name;
        this.gender = gender;
        this.image = image;
        this.nationality = nationality;
        this.roles = roles;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }
    
    
    
    
}
