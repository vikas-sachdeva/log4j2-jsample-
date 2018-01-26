package log4j2.jsample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LogManager.getLogger(HelloWorld.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOGGER.info("New request received");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Hello Servlet !!!</h2>");
		out.println("</body>");
		out.println("</html>");

		LOGGER.info("Response sent");
	}

}
