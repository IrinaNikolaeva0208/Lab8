package bsu.frct.lab8.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bsu.frct.lab8.entity.ChatMessage;
import bsu.frct.lab8.entity.ChatUser;

public class MessageListServlet extends ChatServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse
		response) throws ServletException, IOException {
		
		ChatUser author = activeUsers.get((String) request.getSession().getAttribute("name"));
        int amount = author.getMessageAmount();
		// ���������� ��������� HTTP-������ UTF-8
		response.setCharacterEncoding("utf8");
		// �������� ������ � ������ ������ HTTP-������
		PrintWriter pw = response.getWriter();
		// ������� � ����� HTML-�������� ��������
		pw.println("<html><head><meta http-equiv='Content-Type'content='text/html; charset=utf-8'/><meta http-equiv='refresh'content='10'></head>");
		pw.println("<body>");
		// � �������� ������� �������� � ����� HTML-�������� ��� ������� ���������
		for (ChatMessage message : messages){
			pw.println("<div><strong>" + message.getAuthor().getName() + "</strong>(" + amount + "): " + message.getMessage() + "</div>");
		}
		pw.println("</body></html>");
	}
}
