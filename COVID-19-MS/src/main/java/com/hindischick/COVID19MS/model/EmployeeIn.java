package com.hindischick.COVID19MS.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


import org.joda.time.LocalDate;


import static com.hindischick.COVID19MS.model.Employee.EmployeeBuilder.aEmployee;

public class EmployeeIn implements Serializable {

    @NotEmpty
    @Length(max = 60)
    private String fullname;

    private String city;

    private String street;

    private int houseNumber;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDate;

    @Length(max = 20)
    private String telephone;

    @Length(max = 20)
    private String mobilePhone;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate vaccine1Date;

    private String vaccine1Manufacturer;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate vaccine2Date;

    private String vaccine2Manufacturer;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate vaccine3Date;

    private String vaccine3Manufacturer;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate vaccine4Date;

    private String vaccine4Manufacturer;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate positiveResultDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate recoveryDate;


    public Employee toEmployee() {
        return aEmployee().fullname(fullname).city(city).street(street).houseNumber(houseNumber).
                birthDate(birthDate.toDate()).telephone(telephone).mobilePhone(mobilePhone)
                .vaccine1Date(vaccine1Date.toDate()).vaccine1Manufacturer(vaccine1Manufacturer)
                .vaccine2Date(vaccine2Date.toDate()).vaccine2Manufacturer(vaccine2Manufacturer)
                .vaccine3Date(vaccine3Date.toDate()).vaccine3Manufacturer(vaccine3Manufacturer)
                .vaccine4Date(vaccine4Date.toDate()).vaccine4Manufacturer(vaccine4Manufacturer)
                .positiveResultDate(positiveResultDate.toDate()).recoveryDate(recoveryDate.toDate())
                .build();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public LocalDate getVaccine1Date() {
        return vaccine1Date;
    }

    public void setVaccine1Date(LocalDate vaccine1Date) {
        this.vaccine1Date = vaccine1Date;
    }

    public String getVaccine1Manufacturer() {
        return vaccine1Manufacturer;
    }

    public void setVaccine1Manufacturer(String vaccine1Manufacturer) {
        this.vaccine1Manufacturer = vaccine1Manufacturer;
    }

    public LocalDate getVaccine2Date() {
        return vaccine2Date;
    }

    public void setVaccine2Date(LocalDate vaccine2Date) {
        this.vaccine2Date = vaccine2Date;
    }

    public String getVaccine2Manufacturer() {
        return vaccine2Manufacturer;
    }

    public void setVaccine2Manufacturer(String vaccine2Manufacturer) {
        this.vaccine2Manufacturer = vaccine2Manufacturer;
    }

    public LocalDate getVaccine3Date() {
        return vaccine3Date;
    }

    public void setVaccine3Date(LocalDate vaccine3Date) {
        this.vaccine3Date = vaccine3Date;
    }

    public String getVaccine3Manufacturer() {
        return vaccine3Manufacturer;
    }

    public void setVaccine3Manufacturer(String vaccine3Manufacturer) {
        this.vaccine3Manufacturer = vaccine3Manufacturer;
    }

    public LocalDate getVaccine4Date() {
        return vaccine4Date;
    }

    public void setVaccine4Date(LocalDate vaccine4Date) {
        this.vaccine4Date = vaccine4Date;
    }

    public String getVaccine4Manufacturer() {
        return vaccine4Manufacturer;
    }

    public void setVaccine4Manufacturer(String vaccine4Manufacturer) {
        this.vaccine4Manufacturer = vaccine4Manufacturer;
    }

    public LocalDate getPositiveResultDate() {
        return positiveResultDate;
    }

    public void setPositiveResultDate(LocalDate positiveResultDate) {
        this.positiveResultDate = positiveResultDate;
    }

    public LocalDate getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(LocalDate recoveryDate) {
        this.recoveryDate = recoveryDate;
    }
}