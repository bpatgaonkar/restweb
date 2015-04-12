/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.resource;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 160665
 */
@XmlRootElement(name = "user")
public class User implements Serializable{
 private Long id;
 private String firstName;
 private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @XmlAttribute
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
}
