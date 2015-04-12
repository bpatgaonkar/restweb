package com.mycompany.spring3.rest.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 *
 * @hibernate.class table="T_LOANPURPOSETYPE">
 *
 */
@XmlType(name = "LoanPurpose")
@XmlAccessorType(XmlAccessType.FIELD)
public class LoanPurposeType {
    @XmlTransient
    private String typeCode;
    @XmlTransient
    private Integer displayOrder;
    @XmlValue
    private String description;

    public LoanPurposeType() {
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof LoanPurposeType)) {
            return false;
        }
        LoanPurposeType castOther = (LoanPurposeType) other;

        return ((this.getTypeCode() == castOther.getTypeCode()) || (this.getTypeCode() != null && castOther.getTypeCode() != null && this.getTypeCode().equals(castOther.getTypeCode())));
    }

    public int hashCode() {
        int result = 17;
        result = 37 * result + (getTypeCode() == null ? 0 : this.getTypeCode().hashCode());
        return result;
    }
}
