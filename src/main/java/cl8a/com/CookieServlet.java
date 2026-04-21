package cl8a.com;
/*8a. Build a servlet program to  create a cookie to get your name through text box and press submit button( 
through HTML)  to display the message by greeting Welcome back your name ! , you have visited this page 
n times ( n = number of your visit )  along with the list of cookies and demonstrate the expiry of cookie also. */
 

import java.io.*;
import java.net.URLEncoder;
import java.net.URLDecoder;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        String existingUser = null;
        int count = 0;

        // 🔹 Create cookie on first login
        if (userName != null && !userName.isEmpty()) {

            String encodedName = URLEncoder.encode(userName, "UTF-8");

            Cookie userCookie = new Cookie("user", encodedName);
            userCookie.setMaxAge(60); // 1 minute

            Cookie countCookie = new Cookie("count", "1");
            countCookie.setMaxAge(60);

            response.addCookie(userCookie);
            response.addCookie(countCookie);

            count = 1;
        }

        // 🔹 Read cookies
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("user")) {
                    existingUser = URLDecoder.decode(c.getValue(), "UTF-8");
                }

                if (c.getName().equals("count")) {
                    try {
                        count = Integer.parseInt(c.getValue());
                    } catch (Exception e) {
                        count = 0;
                    }

                    count++;

                    Cookie newCount = new Cookie("count", String.valueOf(count));
                    newCount.setMaxAge(60);
                    response.addCookie(newCount);
                }
            }
        }

        // 🔹 Output
        out.println("<html><body>");

        if (existingUser != null) {

            out.println("<h2>Welcome back, " + existingUser + "!</h2>");
            out.println("<h3>You have visited this page " + count + " times</h3>");

            // 🔥 Show all cookies (8b requirement)
            out.println("<h4>Cookie List:</h4>");

            if (cookies != null) {
                for (Cookie c : cookies) {
                    out.println("Name: " + c.getName() + " | Value: " + c.getValue() + "<br>");
                }
            }

        } else {
            out.println("<h2>Welcome Guest! Please login</h2>");
            out.println("<a href='index.html'>Go to Login</a>");
        }

        out.println("</body></html>");
    }
}