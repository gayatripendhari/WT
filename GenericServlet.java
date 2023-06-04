import java.io.*;
import javax.servlet;
public class s1 extends GenericServlet{
    public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException{
        respone.serContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<font color=red size=5>");
        out.println("Welcome to Servlets");
        out.println("</font>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}