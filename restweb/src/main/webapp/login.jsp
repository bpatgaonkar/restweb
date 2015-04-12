<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix='spring' uri='http://www.springframework.org/tags' %>
<html>
    <head>
    <title><spring:message code="loginPage.title" /></title>
    </head>

<c:if
    test="${not empty param.error}">
  <font color='red'>  
    <spring:message code="login.error" /> <br />  
    Reason : <spring:message code="${param.error}" />
  </font>    
</c:if>
<c:if
    test="${not empty param.logout}">
  <font color='green'>  
  <spring:message code="logout.success" /> <br /> 
  </font>    
</c:if>  
<body>
<form method="post" action="/<spring:message code='application.context.name' />/j_spring_security_check">
        <div id="passwordLoginOption" class="form">
            <div class="row">
                    <label for="j_username"><spring:message code="login.label" /></label>
                    <input type="text" name="userName"/>
            </div>
            <div class="row">
                    <label for="j_password"><spring:message code="password.label" /></label>
                    <input type="password" name="password"/>
             </div>
            <div class="row">
                <div class="right">
                    <label class="forCheckbox" for='_spring_security_remember_me'>
                        <spring:message code="rememberMe.label" />
                        <input type='checkbox' name='_spring_security_remember_me'/>
                    </label>
                </div>
                <div class="cl"></div>
            </div>
            <div class="buttons">
                <input type="submit" value="<spring:message code='loginButton.label' />"/>
            </div>
        </div>
    </form>
</html>
