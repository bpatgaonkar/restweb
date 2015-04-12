/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3.rest.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author 160665
 */
@XmlType(name="Borrower")
@XmlAccessorType(XmlAccessType.FIELD)
public class Borrower {
    @XmlTransient
    private Long Id;
    @XmlElement(name = "PersonalDetails")    
    private Person person;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id =Id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
