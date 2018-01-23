<%-- 
    Document   : frmListarLibro
    Created on : 22/01/2018, 10:49:07 PM
    Author     : DS
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="dist/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="dist/js/bootstrap.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Libro Listado</title>
    </head>
    <body>
        <jsp:include page="menuNavBar.jsp"></jsp:include>
        <jsp:useBean class="daoImpl.LibroDAOImpl" id="daoLib"></jsp:useBean>
        <h1>Listar Libros</h1>
        <table class="table">
            <th>Codigo</th>
            <th>Titulo</th>
            <th>Fecha Publicacion</th>
            <th>Precio</th>
            <th>Stock</th>
            
            <c:forEach items="${daoLib.lstLibro()}" var="libro">
                <tr>
                <td>${libro.codigo}</td>
                <td>${libro.titulo}</td>
                <td><fmt:formatDate value="${libro.fechaPublicacion}" pattern="dd/MM/yyyy"></fmt:formatDate></td>
                <td>${libro.precio}</td>
                <td>${libro.stock}</td>
                <td><a href="ServletLibro?accion=EliminarLibro&codigo=${libro.codigo}">Eliminar</a></td>
                </tr>
            </c:forEach>

        </table>
        <p>${mensaje}</p>
        <jsp:include page="piePagina.jsp"></jsp:include>
    </body>
</html>
