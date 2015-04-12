/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.auth;

import java.io.IOException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 *
 * @author Patgaonkar
 */
public class RestAuthenticationEntryPoint extends org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint{
 
    @Override
    public void commence(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, AuthenticationException ae) throws IOException, javax.servlet.ServletException {
        super.commence(request, response, ae);
    }
    
}
