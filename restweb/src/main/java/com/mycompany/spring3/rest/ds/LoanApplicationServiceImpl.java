/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3.rest.ds;

import com.mycompany.spring3.rest.bean.IdentityInfo;
import com.mycompany.spring3.rest.bean.LoanApplication;
import com.mycompany.spring3.rest.bean.Person;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author 160665
 */
public class LoanApplicationServiceImpl extends HibernateDaoSupport  implements LoanApplicationService{
    private SessionFactory sessionFactory;
    
    public LoanApplication getLoanApplication(long loanId) {
       LoanApplication emp = new LoanApplication();
       //emp = (LoanApplication)getSessionFactory().openSession().get(LoanApplication.class,loanId);
       //Hibernate.initialize(emp);
       Session session=getSessionFactory().openSession();
       Person p = new Person();
       p.setBirthDate(new Date());
       p.setId(new Long(1));
       IdentityInfo info = new IdentityInfo();
       info.setPerson(p);
       session.save(p);
       session.save(info);
       session.flush();
       return emp;
    }

    public List<LoanApplication> findLoansByWorkFlowState(String workFlowState) {
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        Criteria search = session.createCriteria(LoanApplication.class);
        search.add(Restrictions.like("workflowStateCode", workFlowState));
        return search.list();
    }
    
}
