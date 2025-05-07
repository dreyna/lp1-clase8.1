<%-- 
    Document   : index
    Created on : 7 may. 2025, 15:53:06
    Author     : docente.fia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container w-50 d-flex flex-column justify-content-center align-items-center">
            <img src="recursos/img/user.png" width="128" height="128" alt="alt"/>
            <form action="login" method="post">
                <div class="mb-3">
                    <label for="correo" class="form-label">Correo:</label>
                    <input type="email" class="form-control" id="correo" name="correo" placeholder="name@example.com">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password:</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="********">
                </div>
                <div class="d-grid gap-2">
                    <input class="btn btn-primary" type="submit" value="Enviar">
                </div>
            </form>
        </div>

        <script src="recursos/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
