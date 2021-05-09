package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.Dao;

@WebServlet("/poistaasiakas")
public class PoistaAsiakas extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public PoistaAsiakas() {
        super();
        System.out.println("PoistaAsiakas.PoistaAsiakas()");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PoistaAsiakas.doGet()");
		String etunimi = request.getParameter("etunimi");
		Dao dao = new Dao();
		dao.poistaAsiakas(etunimi);
		response.sendRedirect("haeasiakkaat?hakusana=");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PoistaAsiakas.doPost()");
		doGet(request, response);
	}

}