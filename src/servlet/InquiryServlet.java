package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//mypageにフォワード
		System.out.println("aa");
		RequestDispatcher disp =
				request.getRequestDispatcher("/mypage.jsp");
		disp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//requestパラメーターで遷移
		request.setCharacterEncoding("utf-8");
		String from = request.getParameter("from");
		String toTop = request.getParameter("toTop");
		String edit = request.getParameter("edit");
		//forward先
		String path = null;

		if(from!=null && from.equals("確認")) {
			path = "/inquiryConfirm.jsp";
		} else if(toTop!=null && toTop.equals("TOPに戻る")){
			path = "/mypage.jsp";
		} else if(edit!=null&&edit.equals("編集")) {
			path = "/inquiry.jsp";
		} else {
			path = "/mypage.jsp";
		}
		//確認画面にフォワード
		RequestDispatcher disp =
				request.getRequestDispatcher(path);
		disp.forward(request, response);
	}

}
