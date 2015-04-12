/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3.rest.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author 160665
 */
@XmlRootElement(name="Loan")
@XmlType(name = "Loan",propOrder = {"fiLoanId","applicationReceivedDate","loanAmount","borrowers"})
@XmlAccessorType(XmlAccessType.FIELD)
public class LoanApplication {
    @XmlAttribute(name="loanId")
    private long loanApplicationId;
    @XmlElement(name="loanAmount")
    private Double loanAmount;
    @XmlElement(name = "Borrower")
    @XmlElementWrapper    
    private Set<Borrower> borrowers = new HashSet<Borrower>(0);
    @XmlAttribute(name = "LoanPurpose")
    private LoanPurposeType loanPurposeType;
    @XmlAttribute
    private String workflowStateCode;
    @XmlElement(name = "LenderCaseId")
    private String fiLoanId;
    @XmlElement
    private Date applicationReceivedDate;
    
    public long getLoanApplicationId() {
        return loanApplicationId;
    }

    public void setLoanApplicationId(long loanApplicationId) {
        this.loanApplicationId = loanApplicationId;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public Set<Borrower> getBorrowers() {
        return this.borrowers;
    }

    public void setBorrowers(Set<Borrower> borrowers) {
      	this.borrowers = borrowers;
    }    

    public LoanPurposeType getLoanPurposeType() {
        return loanPurposeType;
    }

    public void setLoanPurposeType(LoanPurposeType loanPurposeType) {
        this.loanPurposeType = loanPurposeType;
    }

    public String getWorkflowStateCode() {
        return workflowStateCode;
    }

    public void setWorkflowStateCode(String workflowStateCode) {
        this.workflowStateCode = workflowStateCode;
    }

    public String getFiLoanId() {
        return fiLoanId;
    }

    public void setFiLoanId(String fiLoanId) {
        this.fiLoanId = fiLoanId;
    }

    public Date getApplicationReceivedDate() {
        return applicationReceivedDate;
    }

    public void setApplicationReceivedDate(Date applicationReceivedDate) {
        this.applicationReceivedDate = applicationReceivedDate;
    }
    
}
