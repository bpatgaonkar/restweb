/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3.rest.bean;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author 160665
 */
@XmlType(name="Person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @XmlTransient
    private Long Id;
    @XmlAttribute
    private Date birthDate;
    @XmlAttribute
    private String firstName;
    @XmlAttribute
    private String lastName;
    @XmlAttribute
    private String middleName;
    @XmlAttribute
    private String email;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
