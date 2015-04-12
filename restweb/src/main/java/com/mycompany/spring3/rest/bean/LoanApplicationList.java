/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3.rest.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 160665
 */
@XmlRootElement(name = "Loans")
@XmlAccessorType(XmlAccessType.FIELD)
public class LoanApplicationList {
    @XmlElement(name = "LoanRecord")
    private List <LoanApplication> loans;
    @XmlAttribute
    private int noOfLoanRecords;

    public List<LoanApplication> getLoans() {
        return loans;
    }

    public void setLoans(List<LoanApplication> loans) {
        this.loans = loans;
    }

    public int getNoOfLoanRecords() {
        return noOfLoanRecords;
    }

    public void setNoOfLoanRecords(int noOfLoanRecords) {
        this.noOfLoanRecords = noOfLoanRecords;
    }
    
}
