<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>

<br>

<h2>Dear Employee, WELCOME</h2>

<br>
<br>
<br>
<br>

<%--Your name: ${param.employeeName}--%>
<%--We point name of attribute witch we mentiones in method showDetails--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}

<br>
Your car: ${employee.carBrand}
<br>
Language(s):
<ul>

    <c:forEach var="lang" items="${employee.languages}">

        <li> ${lang}</li>

    </c:forEach>

</ul>

Phone number: ${employee.numberPhone}
Email: ${employee.email}

</body>
</html>