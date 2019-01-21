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
@WebServlet({ "/addConseiller", "/addClient", "/deleteClient", "/editClient" })
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
		
		
		String path = request.getRequestURI();
		ClientDao daoClient = new ClientDao();
		ConseillerDao daoConseiller = new ConseillerDao();
		
		if (path.contains("addClient")) {
			Client cl = new Client(
					request.getParameter("nom"), 
					request.getParameter("prenom"), 
					request.getParameter("adresse"), 
					request.getParameter("ville"), 
					Integer.valueOf(request.getParameter("codePostal")), 
					request.getParameter("phone"), 
					true
					);
			
				System.out.println("test dans Servlet : "+cl);
				daoClient.create(cl);
			address = "/WEB-INF/index.jsp";
		}
		
		if (path.contains("addConseiller")) {

			Conseiller cons = new Conseiller(
					request.getParameter("nom"), 
					request.getParameter("prenom"), 
					request.getParameter("email")
					);

				daoConseiller.create(cons);
			address = "/WEB-INF/index.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address);
		dispatcher.forward(request, response);

	}

}
