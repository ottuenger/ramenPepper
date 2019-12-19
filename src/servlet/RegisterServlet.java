package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;






	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//requestパラメーターで遷移
		request.setCharacterEncoding("utf-8");
		String newN = request.getParameter("newN");
		String subYes = request.getParameter("subYes");
		String subNo = request.getParameter("subNo");
		String path = null;

        if(newN!=null&&newN.equals("新規登録")) {
        	path = "/new.jsp";
        }else if(subYes!=null&&subYes.equals("はい")){
        	path = "/index.jsp";
        }else if(subNo!=null&&subNo.equals("いいえ")){
        	path = "/mypage.jsp";
        }else {
        	path = "/index.jsp";
        }

      //画面遷移
		RequestDispatcher disp = request.getRequestDispatcher(path);
		disp.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//requestパラメーターで遷移
				request.setCharacterEncoding("utf-8");
				String newReg = request.getParameter("newReg");
				String newConfBack = request.getParameter("newConfBack");
				String newConf = request.getParameter("newConf");
				String editReg = request.getParameter("editReg");
				String editConfBack = request.getParameter("editConfBack");
				String editConf = request.getParameter("editConf");

				String path = null;

				if(newReg!=null&&newReg.equals("確認")) {
					path = "/newConfirm.jsp";
				}else if(newConfBack!=null&&newConfBack.equals("戻る")) {
					path = "/new.jsp";
				}else if(newConf!=null&&newConf.equals("登録")) {
					path = "/registerOK.jsp";
				}else if(editReg!=null&&editReg.equals("確認")) {
					path = "/editConfirm.jsp";
				}else if(editConfBack!=null&&editConfBack.equals("戻る")) {
					path = "/edit.jsp";
				}else if(editConf!=null&&editConf.equals("修正")) {
					path = "/mypage.jsp";
				}else {
					path = "/mypage.jsp";
				}


		//画面遷移
			RequestDispatcher disp = request.getRequestDispatcher(path);
			disp.forward(request, response);



}
}
