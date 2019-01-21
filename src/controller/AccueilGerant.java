package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClientDao;
import dao.ConseillerDao;
import model.Conseiller;
import model.Personne;
import service.ConseillerServiceCRUD;

/**
 * Servlet implementation class AccueilGerantConseiller
 */
@WebServlet("/Gerant")
public class AccueilGerant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String address;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccueilGerant() {
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

		if (path.contains("Gerant")) {

			request.setAttribute("path", path);

			// affiche liste de de conseillers
			if (request.getParameter("page") != null && request.getParameter("page").equals("liste-conseiller")) {
				ConseillerServiceCRUD condao = new ConseillerServiceCRUD();
				List<Personne> conseillers = condao.findAll();
				request.setAttribute("listeConseiller", conseillers);
			}
			// suppression de conseiller
			if (request.getParameter("page") != null && request.getParameter("page").equals("delete-conseiller")
					&& request.getParameter("id") != null) {
				ConseillerServiceCRUD condao = new ConseillerServiceCRUD();
				condao.delete(Integer.valueOf(request.getParameter("id")));
				List<Personne> conseillers = condao.findAll();
				request.setAttribute("listeConseiller", conseillers);
			}
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

		String path = request.getRequestURI();


		if (request.getRequestURI() != null && path.contains("Gerant")) { // ajout de conseiller

			ConseillerServiceCRUD daoConseiller = new ConseillerServiceCRUD();
			request.setAttribute("path", path);

			Conseiller cons = new Conseiller(null, request.getParameter("nom"), request.getParameter("prenom"),
					request.getParameter("email"));

			daoConseiller.create(cons);
			address = "/WEB-INF/index.jsp";
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}

}
