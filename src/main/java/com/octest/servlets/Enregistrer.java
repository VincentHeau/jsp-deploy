package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.bdd.Enregistrement;
import com.octest.bdd.Noms;
import com.octest.beans.Utilisateur;

/**
 * Servlet implementation class Enregistrer
 */
public class Enregistrer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enregistrer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/enregistrer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setSurname(request.getParameter("surname"));
        utilisateur.setFirstname(request.getParameter("firstname"));
        //utilisateur.setType(request.getParameter("type"));
        //utilisateur.setSecondType(request.getParameter("secondType"));

        Enregistrement userTable = new Enregistrement ();
        userTable.ajouterUtilisateur(utilisateur);
                
        this.getServletContext().getRequestDispatcher("/WEB-INF/enregistrer.jsp").forward(request, response);
	
	}

}
