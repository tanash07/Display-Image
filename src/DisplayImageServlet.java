
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayImageServlet
 */
@WebServlet("/DisplayImageServlet")
public class DisplayImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("image/jpeg");
		ServletOutputStream outputStream;
		outputStream = response.getOutputStream();
		FileInputStream inputStream = new FileInputStream("d:\\new\\java.jpg");

		BufferedInputStream bin = new BufferedInputStream(inputStream);
		BufferedOutputStream bout = new BufferedOutputStream(outputStream);

		int ch = 0;

		while ((ch = bin.read()) != -1) {
			bout.write(ch);
		}

		bin.close();
		inputStream.close();
		bout.close();
		outputStream.close();

	}

}
