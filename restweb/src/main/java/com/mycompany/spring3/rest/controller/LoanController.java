/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3.rest.controller;

import com.mycompany.spring3.rest.bean.LoanApplication;
import com.mycompany.spring3.rest.bean.LoanApplicationList;
import com.mycompany.spring3.rest.ds.LoanApplicationService;

import java.util.List;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author 160665
 */
@Controller
public class LoanController {
    private LoanApplicationService loanDao;
    private Jaxb2Marshaller jaxb2Mashaller;
    private static final String XML_VIEW_NAME = "employees";
    
    public void setJaxb2Mashaller(Jaxb2Marshaller jaxb2Mashaller) {
            this.jaxb2Mashaller = jaxb2Mashaller;
    }    
    @RequestMapping(method=RequestMethod.GET, value="/loan/get/{id}")
    public ModelAndView getLoanDetails(@PathVariable String id) {
            LoanApplication la = loanDao.getLoanApplication(Long.parseLong(id));
            System.out.println("loanApplicationId - "+la.getLoanApplicationId());
            System.out.println("loanAmount - "+la.getLoanAmount());
            return new ModelAndView(XML_VIEW_NAME, "object",la);
    }  

    @RequestMapping(method=RequestMethod.GET, value="/loan/findByState/{workflowcode}")
    public ModelAndView findLoansByWorkFlowState(@PathVariable String workflowcode) {
            List<LoanApplication> loanList = loanDao.findLoansByWorkFlowState(workflowcode);
            LoanApplicationList loans = new LoanApplicationList();
            loans.setLoans(loanList);
            loans.setNoOfLoanRecords(loanList.size());
            return new ModelAndView(XML_VIEW_NAME, "object",loans);
    }    
    public LoanApplicationService getLoanDao() {
        return loanDao;
    }

    public void setLoanDao(LoanApplicationService loanDao) {
        this.loanDao = loanDao;
    }    
}
