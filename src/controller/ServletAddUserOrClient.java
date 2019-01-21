package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClientDao;
import dao.ConseillerDao;
import model.Client;
import model.Conseiller;
import model.Personne;
import service.Login;

/**
 * Cette Servlet gère les opérations du CRUD, en faisant appel aux classes
 * concernées.
 */
@WebServlet({ "/addConseiller", "/deleteClient", "/editClient" })
public class ServletAddUserOrClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String address = "/WEB-INF/index.jsp";


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAddUserOrClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		


	}

}
