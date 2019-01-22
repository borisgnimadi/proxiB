package controller;

import java.io.IOException;
import java.util.List;

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
import service.ClientServiceCRUD;
import service.ConseillerServiceCRUD;

/**
 * Servlet implementation class AccueilGerantConseiller
 */
@WebServlet({ "/Conseiller" })

public class AccueilConseiller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String address;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccueilConseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getRequestURI();
		ClientServiceCRUD cldao = new ClientServiceCRUD();

		if (path.contains("Conseiller")) {

			// affiche liste de clients
			if (request.getParameter("page") != null && request.getParameter("page").contains("liste-client")) {
				List<Client> client = cldao.findAll();
				request.setAttribute("listeClient", client);
			}
			// suppression de client
			if (request.getParameter("page") != null && request.getParameter("page").equals("delete-client")
					&& request.getParameter("id") != null) {
				cldao.delete(Integer.valueOf(request.getParameter("id")));
				List<Client> clients = cldao.findAll();
				request.setAttribute("listeClient", clients);
			}			

			request.setAttribute("path", path);

			address = "/WEB-INF/index.jsp";

		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session2 = request.getSession();

		String path = request.getRequestURI();
		if (path.contains("Conseiller") && request.getParameter("page") != null
				&& request.getParameter("page").equals("ajout-client")) { // ajout de client
			ClientServiceCRUD daoClient = new ClientServiceCRUD();
			Client cl = new Client(request.getParameter("nom"), request.getParameter("prenom"),
					request.getParameter("adresse"), request.getParameter("ville"), 0, request.getParameter("phone"),
					true, (Integer) session2.getAttribute("idUser"));

			System.out.println("test dans Servlet : " + cl);
			daoClient.create(cl);

		}
		request.setAttribute("path", path);
		address = "/WEB-INF/index.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address);
		dispatcher.forward(request, response);

	}

}
