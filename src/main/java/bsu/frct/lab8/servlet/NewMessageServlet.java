package bsu.frct.lab8.servlet;

import java.io.IOException;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bsu.frct.lab8.entity.ChatMessage;
import bsu.frct.lab8.entity.ChatUser;

public class NewMessageServlet extends ChatServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse
	response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String message = (String)request.getParameter("message");
		if (message!=null && !"".equals(message)) {
			ChatUser author = activeUsers.get((String)
			request.getSession().getAttribute("name"));
			synchronized (messages) {
				messages.add(new ChatMessage(message, author,
				Calendar.getInstance().getTimeInMillis()));
				author.increaseMessageAmount();
			}
			response.sendRedirect("/lab_8/compose_message.html");
		}
	}
}