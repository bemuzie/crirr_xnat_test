<%@ page contentType="text/html; charset=utf-8" %>

<%@ taglib uri="/WEB-INF/tld/struts-bean-1.1.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html-1.1.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic-1.1.tld" prefix="logic" %>

<html:html xhtml="true">
<head>
	<html:base/>
	<title><bean:message key="title.page"/></title>
</head>

<body>
	<p>The name is <bean:write name="TestForm"  property="familyName"/>, <bean:write name="TestForm"  property="givenName"/> on <bean:write name="TestForm"  property="theDate"/></p>
	<html:form action="/TestInput">
	 <html:text  property="givenName" size="16"/>
	 <html:text  property="familyName" size="16"/>
	 <html:submit/>
	</html:form>
</body>
</html:html>
