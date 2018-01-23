<%-- 
    Document   : frmAgregarLibro
    Created on : 22/01/2018, 11:17:44 PM
    Author     : DS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="dist/js/bootstrap.js" type="text/javascript"></script>
        <script src="dist/js/bootstrap.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menuNavBar.jsp"></jsp:include>
        <form action="ServletLibro" method="POST">
            <input type="hidden" value="AgregarLibro" name="accion">
            <div class="container">
                <h2>Add Libro</h2>
                <div class="row">
                    <label class="col-lg-2">Titulo:</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" placeholder="add Titulo" name="txtTitulo">
                    </div>
                </div>
                <div class="row">
                    <label class="col-lg-2">Fecha Publicación:</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" placeholder="add Fecha Publicacion" name="txtFP">
                    </div>
                </div>
                <div class="row">
                    <label class="col-lg-2">Precio:</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" placeholder="add Precio" name="txtPrecio">
                    </div>
                </div>
                <div class="row">
                    <label class="col-lg-2">Stock:</label>
                    <div class="col-md-10">
                        <input type="text" class="form-control" placeholder="add Stock" name="txtStock">
                    </div>
                </div>
                <input type="submit" class="btn btn-primary">
            </div>
            <p>${mensaje}</p>
        <p>${no}</p>
        </form>
        <jsp:include page="piePagina.jsp"></jsp:include>
    </body>
</html>
