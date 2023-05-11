package com.hindischick.COVID19MS.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hindischick.COVID19MS.utils.Dates;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

import org.joda.time.LocalDate;
import java.util.Date;

import static com.hindischick.COVID19MS.model.Employee.EmployeeBuilder.aEmployee;

public class EmployeeIn implements Serializable {

    @NotNull
    @Column(nullable = false, updatable = false)
    private Date createdAt = Dates.nowUTC();

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

    private Date vaccine1Date;

    private String vaccine1Manufacturer;

    private Date vaccine2Date;

    private String vaccine2Manufacturer;

    private Date vaccine3Date;

    private String vaccine3Manufacturer;

    private Date vaccine4Date;

    private String vaccine4Manufacturer;
    private Date positiveResultDate;

    private Date recoveryDate;


    public Employee toEmployee() {
        return aEmployee().fullname(fullname).city(city).street(street).houseNumber(houseNumber).
                birthDate(birthDate.toDate()).telephone(telephone).mobilePhone(mobilePhone)
                .vaccine1Date(vaccine1Date).vaccine1Manufacturer(vaccine1Manufacturer)
                .vaccine2Date(vaccine2Date).vaccine2Manufacturer(vaccine2Manufacturer)
                .vaccine3Date(vaccine3Date).vaccine3Manufacturer(vaccine3Manufacturer)
                .vaccine4Date(vaccine4Date).vaccine4Manufacturer(vaccine4Manufacturer)
                .positiveResultDate(positiveResultDate).recoveryDate(recoveryDate)
                .build();
    }

    /*public void updateEmployee(Employee employee) {
        employee.setBirthDate(Dates.atUtc(birthDate));
        employee.setFullname(fullname);
        employee.setTelephone(telephone);
        employee.setMobilePhone(mobilePhone);
        employee.setCity(city);
        employee.setStreet(street);
        employee.setHouseNumber(houseNumber);
        employee.setVaccine1Date(vaccine1Date);
        employee.setVaccine1Manufacturer(vaccine1Manufacturer);
        employee.setVaccine2Date(vaccine2Date);
        employee.setVaccine2Manufacturer(vaccine2Manufacturer);
        employee.setVaccine3Date(vaccine3Date);
        employee.setVaccine3Manufacturer( vaccine3Manufacturer);
        employee.setVaccine4Date(vaccine4Date);
        employee.setVaccine4Manufacturer(vaccine4Manufacturer);
    }*/

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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

    public Date getVaccine1Date() {
        return vaccine1Date;
    }

    public void setVaccine1Date(Date vaccine1Date) {
        this.vaccine1Date = vaccine1Date;
    }

    public String getVaccine1Manufacturer() {
        return vaccine1Manufacturer;
    }

    public void setVaccine1Manufacturer(String vaccine1Manufacturer) {
        this.vaccine1Manufacturer = vaccine1Manufacturer;
    }

    public Date getVaccine2Date() {
        return vaccine2Date;
    }

    public void setVaccine2Date(Date vaccine2Date) {
        this.vaccine2Date = vaccine2Date;
    }

    public String getVaccine2Manufacturer() {
        return vaccine2Manufacturer;
    }

    public void setVaccine2Manufacturer(String vaccine2Manufacturer) {
        this.vaccine2Manufacturer = vaccine2Manufacturer;
    }

    public Date getVaccine3Date() {
        return vaccine3Date;
    }

    public void setVaccine3Date(Date vaccine3Date) {
        this.vaccine3Date = vaccine3Date;
    }

    public String getVaccine3Manufacturer() {
        return vaccine3Manufacturer;
    }

    public void setVaccine3Manufacturer(String vaccine3Manufacturer) {
        this.vaccine3Manufacturer = vaccine3Manufacturer;
    }

    public Date getVaccine4Date() {
        return vaccine4Date;
    }

    public void setVaccine4Date(Date vaccine4Date) {
        this.vaccine4Date = vaccine4Date;
    }

    public String getVaccine4Manufacturer() {
        return vaccine4Manufacturer;
    }

    public void setVaccine4Manufacturer(String vaccine4Manufacturer) {
        this.vaccine4Manufacturer = vaccine4Manufacturer;
    }

    public Date getPositiveResultDate() {
        return positiveResultDate;
    }

    public void setPositiveResultDate(Date positiveResultDate) {
        this.positiveResultDate = positiveResultDate;
    }

    public Date getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(Date recoveryDate) {
        this.recoveryDate = recoveryDate;
    }
}