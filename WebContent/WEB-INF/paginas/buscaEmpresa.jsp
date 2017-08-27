<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
    Resultado da busca:
    <ul>
        <c:forEach var="empresa" items="${empresas}"><!-- for para mostrar todos as empresas da busca -->
            <li>${empresa.id}: ${empresa.nome}</li>
        </c:forEach>
    </ul>
</body>
</html>