/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.management.system;

/**
 *
 * @author AKRAMUL
 */
public class Employees {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String department;
    private int shif;
    private int employeegp;
    private String division;
    private byte[] image;

    public Employees(int id, String name, String surname, int age, String gender, String department, int shif, int employeegp, String division, byte[] image) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.shif = shif;
        this.employeegp = employeegp;
        this.division = division;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getShif() {
        return shif;
    }

    public void setShif(int shif) {
        this.shif = shif;
    }

    public int getEmployeegp() {
        return employeegp;
    }

    public void setEmployeegp(int employeegp) {
        this.employeegp = employeegp;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

   
}
