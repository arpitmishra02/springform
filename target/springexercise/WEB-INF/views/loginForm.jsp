<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <title>FormExercise</title>
</head>
<body>
 <h2>User Data</h2>
  <form:form action="addUser" modelAttribute="user" method="POST">
    <form:label path="userName">Name</form:label>
    <form:input path="userName" /> <br>
    <form:label path="userPassword">Password</form:label>
    <form:input path="userPassword" /><br>
    <form:label path="userContact">Contact</form:label>
    <form:input path="userContact" />

    <input type="submit" value="Submit"/>
   </form:form>
</body>
</html>
