package com.bulbakov.spring.mvc;

import javax.validation.constraints.*;

import com.bulbakov.spring.mvc.validation.CheckEmail;
import javax.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be minimum 2 symbols")
    private String name;

    @NotBlank(message = "surname is required field")
    private String surname;

    @Min(value = 500, message = "must be grater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int  salary;
    private String department;

    private Map<String, String> departments;

    private String carBrand;

    private Map<String, String> cars;

    private String[] languages;

    private Map<String, String> languageList;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String numberPhone;

   @CheckEmail
    private String email;

    public Employee() {
        departments  =new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("Sales", "Sales");
        departments.put("HR", "Human Resource");

        cars = new HashMap<>();
        cars.put("BMW", "BMW");
        cars.put("Audi", "Audi");
        cars.put("MB", "Mercedes-Benz");

        languageList = new HashMap<>();
        languageList.put("DE", "Deutch");
        languageList.put("EN", "English");
        languageList.put("FR", "France");
    }

 /*   public Employee(String name,String surname, int salary, String department) {
        this.name=name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }*/

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //for map
    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
