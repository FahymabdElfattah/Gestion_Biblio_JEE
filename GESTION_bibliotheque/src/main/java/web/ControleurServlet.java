package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Livre;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ControleurServlet
 */
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ImetierCatalogue metier;
	
	@Override
	public void init() throws ServletException {
	metier=new MetierImpl();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String mc=request.getParameter("motCle");
		LivresModele mod = new LivresModele();
		
		mod.setMotCle(mc);
		List<Livre> prods = metier.getLivresParMotCle(mc);
		mod.setLivres(prods);
		request.setAttribute("modele", mod);
		request.getRequestDispatcher("LivresView.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
