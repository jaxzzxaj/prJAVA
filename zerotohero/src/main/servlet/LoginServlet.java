package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		このあと作る新規登録用のVeiwからID/newname(キーの名前もID）を取得する
//		IDは文字列だからINTに直す
		String strId = request.getParameter("id");
		String strName = request.getParameter("newname");
		int intId =Integer.parseInt(strId);
		
//		ログインにつながっている”DAO”と”どのEntity”かを持ってくる
		SigniniDao Signin = new SigniniDao(); 
		UsersEntity Entity = Signin.searchById(intId);
		UsersEntity Entity = Signin.searchByName(strName);
		
//		キーと値を取得するor変数と値を取得する("", response)
		request.setAttribute("Id", intId);
		request.setAttribute("Name", strName);
		
//		requestの中に回収したデータをjspもしくはサーブレットに遷移させる
		RequestDispatcher next =request.getRequestDispatcher("./LoginServlet")；
		next.forward(request, response);
	}

}
