package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.entities.Livre;


import java.io.IOException;
import java.util.List;

import org.apache.catalina.connector.Response;

import dao.ILivreDao;
import dao.LivreDaoImpl;


@WebServlet (name="cs",urlPatterns= {"/controleur","*.do"})
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ILivreDao metier;
	 @Override
	public void init() throws ServletException {
		metier = new LivreDaoImpl();
	}   
    
    /*public ControleurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String path=request.getServletPath();
		if (path.equals("/index.do"))
		{
		request.getRequestDispatcher("livres.jsp").forward(request,response);
		}
		else if (path.equals("/chercher.do"))
		{
		String motCle=request.getParameter("motCle");
		LivreModele model= new LivreModele();
		model.setMotCle(motCle);
		List<Livre> prods = metier.livresParMC(motCle);
		model.setLivres(prods);
		request.setAttribute("model", model);
		request.getRequestDispatcher("livres.jsp").forward(request,response);
		}
		else if (path.equals("/saisie.do")  )
		{
			request.getRequestDispatcher("saisieLivre.jsp").forward(request,response);
		}
		else if (path.equals("/save.do")  && request.getMethod().equals("POST"))
		{
		    String nomLivre=request.getParameter("nomLivre");
		    String nomAuteur=request.getParameter("nomAuteur");
		    String Despo=request.getParameter("Despo");
		    String DateDespo=request.getParameter("DateDespo");
		    String Etage=request.getParameter("Etage");
			
			Livre p = metier.save(new Livre(nomLivre,nomAuteur,Despo,DateDespo,Etage));
			request.setAttribute("livre", p);
			request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		else if (path.equals("/supprimer.do"))
		{
		    Long id= Long.parseLong(request.getParameter("id"));
		    metier.deletelivre(id);
		    response.sendRedirect("chercher.do?motCle=");
					
			//request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		else if (path.equals("/editer.do")  )
		{
			Long id= Long.parseLong(request.getParameter("id"));
		    Livre p = metier.getlivre(id);
		    request.setAttribute("livre", p);
			request.getRequestDispatcher("editerlivre.jsp").forward(request,response);
		}
		else if (path.equals("/update.do")  )
		{
			 Long id = Long.parseLong(request.getParameter("id"));
			 String nomLivre=request.getParameter("nomLivre");
			 String nomAuteur=request.getParameter("nomAuteur");
			 String Despo=request.getParameter("Despo");
			 String DateDespo=request.getParameter("DateDespo");
			 String Etage=request.getParameter("Etage");
			 Livre p = new Livre();
			 p.setIdLivre(id);
			 p.setNomLivre(nomLivre);
			 p.setNomAuteur(nomAuteur);
			 p.setDespo(Despo);
			 p.setDateDespo(DateDespo);
			 p.setEtage(Etage);
			 
			 metier.updatelivre(p);
			 request.setAttribute("livre", p);
			 request.getRequestDispatcher("confirmation.jsp").forward(request,response);
		}
		else
		{
		response.sendError(Response.SC_NOT_FOUND);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
