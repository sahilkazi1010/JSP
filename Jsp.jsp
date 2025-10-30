<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="style.jsp" method="post">
        <input type="text" name="uname"><br>
        <input type="password" name="password"><br>
        <input type="submit" value="validate">
     
        
    </form>
    
</body>
</html>

style.jsp
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <% String name=request.getParameter("uname"); %>
    <% String password=request.getParameter("password"); %>
    <% out.println("Name is:"+name); %>
    <% out.println("password is:"+password); %>

</body>
</html>
