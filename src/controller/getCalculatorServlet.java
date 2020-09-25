package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;

/**
 * Servlet implementation class getCalculatorServlet
 */
@WebServlet("/getCalculatorServlet")
public class getCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getCalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String number1 = request.getParameter("userNumber1");
		String operation1 = request.getParameter("operation1");
		String number2 = request.getParameter("userNumber2");
		String operation2 = request.getParameter("operation2");
		String number3 = request.getParameter("userNumber3");

		Calculator userCalc = new Calculator(Double.parseDouble(number1), Double.parseDouble(number2),
				Double.parseDouble(number3), operation1, operation2);
		
		request.setAttribute("userCalculator", userCalc);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
