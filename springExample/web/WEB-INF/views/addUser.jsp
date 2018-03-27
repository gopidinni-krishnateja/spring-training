<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: semanticbits
  Date: 27/3/18
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>

<head>

    <title>Spring Example</title>

    <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">

</head>

<body>

<h1>Registration Form</h1><br />

<form:form action="/save" commandName="User">
    <table>
        <tr><td>First Name : </td><td><form:input path="firstName" /></td></tr>
        <tr><td>Last Name : </td><td><form:input path="lastName" /></td></tr>
        <tr><td>Age : </td><td><form:input path="age" /></td></tr>
        <tr><td colspan="2"><input type="submit" value="Save Changes" /></td></tr>
    </table>
</form:form>
</body>
</html>
