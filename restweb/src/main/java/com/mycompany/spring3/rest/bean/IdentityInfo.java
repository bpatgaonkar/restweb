/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3.rest.bean;

/**
 *
 * @author Patgaonkar
 */
public class IdentityInfo {
    private Long id;
    private Person person;
    private String identityIdNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getIdentityIdNumber() {
        return identityIdNumber;
    }

    public void setIdentityIdNumber(String identityIdNumber) {
        this.identityIdNumber = identityIdNumber;
    }
    
}
