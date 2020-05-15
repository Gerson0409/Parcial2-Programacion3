package com.gerson.ControladorDeDatos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gerson.DAO.UsuarioDao;
import com.gerson.DAO.consultasDao;
import com.gerson.Model.Consulta;
import com.gerson.Model.Usuario;
import com.google.gson.Gson;

/**
 * Servlet implementation class ServeletControler
 */
public class ServeletControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		

		Consulta con = new Consulta();
		consultasDao cd = new consultasDao();
	
		String id = null;
		String nombreU = null;
		String apellidoU = null;

		
		try {
			 id = request.getParameter("ID");
			 nombreU = request.getParameter("nomBre");
			 apellidoU = request.getParameter("aPellido");
		
			
			 con.setId(Integer.parseInt(id));
				con.setNombre(nombreU);
				con.setApellido(apellidoU);

				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		String action = request.getParameter("btn");
		
		if(action.equals("Guardar")){
			 con.setId(Integer.parseInt(id));
				con.setNombre(nombreU);
				con.setApellido(apellidoU);
			cd.agregarDatos(con);
			
		
		
		}else if(action.equals("Actualizar")){
		
			 con.setId(Integer.parseInt(id));
				con.setNombre(nombreU);
				con.setApellido(apellidoU);
			
			cd.actualizarDatos(con);
		}else if(action.equals("Eliminar")) {
	         con.setId(Integer.parseInt(id));
	         
	         

	         
	         cd.eliminarDatos(con);

	}
		
			response.sendRedirect("index.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
	consultasDao cDao = new consultasDao();
		
		Gson json = new Gson();		
				
		try {
			
			response.getWriter().append(json.toJson(cDao.ConsultaLista()));
			
		} catch (Exception e) {
		
			System.out.println(e);
	}
		
		
		
		
	}

}
