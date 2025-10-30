index.html(It should be created in web-app not web IMF) 
 <!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<Ɵ tle>Insert Ɵtle here</Ɵ tle> 
</head> 
<body> 
 <form acƟ on="Servlet" method="post"> 
 Username:<input type="text" name="username"><br> 
Password:<input type="text" name="password"><br> 
 <input type="submit"> 
 </form> 
</body> 
</html> 
2.Servlet.java(create in src/java) 
import jakarta.servlet.ServletExcepƟ on; 
import jakarta.servlet.annotaƟ on.WebServlet; 
import jakarta.servlet.hƩ p.HƩ pServlet; 
import jakarta.servlet.hƩ p.HƩ pServletRequest; 
import jakarta.servlet.hƩ p.HƩ pServletResponse; 
import java.io.IOExcepƟ on; 
import java.io.PrintWriter; 
@WebServlet("/Servlet") 
public class Servlet extends HƩ pServlet { 
 protected void doPost(HƩ pServletRequest request, HƩ pServletResponse response) 
throws ServletExcepƟ on, IOExcepƟ on { 
 String s1=request.getParameter("username"); 
 String s2=request.getParameter("password"); 
 PrintWriter pw=response.getWriter(); 
 response.setContentType("text/html"); 
 pw.println("Username:"+s1+"<br>Password:"+s2); 
 } 
}
