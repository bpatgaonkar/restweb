/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3.rest.ds;

import com.mycompany.spring3.rest.bean.LoanApplication;

import java.util.List;

/**
 *
 * @author 160665
 */
public interface LoanApplicationService {
    public LoanApplication getLoanApplication(long loanId);
    public List<LoanApplication> findLoansByWorkFlowState(String workFlowState);
}
