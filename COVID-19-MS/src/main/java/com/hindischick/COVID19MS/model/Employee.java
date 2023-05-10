package com.hindischick.COVID19MS.model;

import com.hindischick.COVID19MS.utils.Dates;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    @Column(nullable = false, updatable = false)
    private Date createdAt = Dates.nowUTC();

    @NotEmpty
    @Length(max = 60)
    private String fullname;

    private String city;

    private String street;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Date birthDate;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
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

    private Date positiveResultDate;

    private Date recoveryDate;

    public static final class EmployeeBuilder {
        private @NotNull Date createdAt;
        private @NotEmpty @Length(max = 60) String fullname;
        private String city;
        private String street;
        private Long id;
        private Date birthDate;
        private @Length(max = 20) String telephone;
        private @Length(max = 20) String mobilePhone;
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

        private EmployeeBuilder() {
        }

        public static EmployeeBuilder anEmployee() {
            return new EmployeeBuilder();
        }

        public EmployeeBuilder createdAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public EmployeeBuilder fullname(String fullname) {
            this.fullname = fullname;
            return this;
        }

        public EmployeeBuilder city(String city) {
            this.city = city;
            return this;
        }

        public EmployeeBuilder street(String street) {
            this.street = street;
            return this;
        }

        public EmployeeBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder birthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public EmployeeBuilder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public EmployeeBuilder mobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public EmployeeBuilder vaccine1Date(Date vaccine1Date) {
            this.vaccine1Date = vaccine1Date;
            return this;
        }

        public EmployeeBuilder vaccine1Manufacturer(String vaccine1Manufacturer) {
            this.vaccine1Manufacturer = vaccine1Manufacturer;
            return this;
        }

        public EmployeeBuilder vaccine2Date(Date vaccine2Date) {
            this.vaccine2Date = vaccine2Date;
            return this;
        }

        public EmployeeBuilder vaccine2Manufacturer(String vaccine2Manufacturer) {
            this.vaccine2Manufacturer = vaccine2Manufacturer;
            return this;
        }

        public EmployeeBuilder vaccine3Date(Date vaccine3Date) {
            this.vaccine3Date = vaccine3Date;
            return this;
        }

        public EmployeeBuilder vaccine3Manufacturer(String vaccine3Manufacturer) {
            this.vaccine3Manufacturer = vaccine3Manufacturer;
            return this;
        }

        public EmployeeBuilder vaccine4Date(Date vaccine4Date) {
            this.vaccine4Date = vaccine4Date;
            return this;
        }

        public EmployeeBuilder vaccine4Manufacturer(String vaccine4Manufacturer) {
            this.vaccine4Manufacturer = vaccine4Manufacturer;
            return this;
        }

        public EmployeeBuilder positiveResultDate(Date positiveResultDate) {
            this.positiveResultDate = positiveResultDate;
            return this;
        }

        public EmployeeBuilder recoveryDate(Date recoveryDate) {
            this.recoveryDate = recoveryDate;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.setCreatedAt(createdAt);
            employee.setFullname(fullname);
            employee.setCity(city);
            employee.setStreet(street);
            employee.setId(id);
            employee.setBirthDate(birthDate);
            employee.setTelephone(telephone);
            employee.setMobilePhone(mobilePhone);
            employee.setVaccine1Date(vaccine1Date);
            employee.setVaccine1Manufacturer(vaccine1Manufacturer);
            employee.setVaccine2Date(vaccine2Date);
            employee.setVaccine2Manufacturer(vaccine2Manufacturer);
            employee.setVaccine3Date(vaccine3Date);
            employee.setVaccine3Manufacturer(vaccine3Manufacturer);
            employee.setVaccine4Date(vaccine4Date);
            employee.setVaccine4Manufacturer(vaccine4Manufacturer);
            employee.setPositiveResultDate(positiveResultDate);
            employee.setRecoveryDate(recoveryDate);
            return employee;
        }
    }
}