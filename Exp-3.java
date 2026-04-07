import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, 
                      HttpServletResponse response) 
                      throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Get the output writer
        PrintWriter out = response.getWriter();

        // Write response
        out.println("<html>");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, World!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
