package com.gerson.ControladorDeDatos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gerson.DAO.UsuarioDao;
import com.gerson.Model.Usuario;

/**
 * Servlet implementation class ServeletUser
 */
public class ServeletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		
		String usu = request.getParameter("usuario");
		String contra = request.getParameter("contraseña");
		
		Usuario usua = new Usuario();
		UsuarioDao usDao = new UsuarioDao();
		
		usua.setNombre(usu);
		usua.setContrasenia(contra);
		
		int verificarusuario = usDao.ingresoUsuario(usua).size();
		
		if (verificarusuario == 1) {
			System.out.println("Bienvenido al sistema");
			response.sendRedirect("index.jsp");
			
		}else {
			System.out.println("Usuario o contraseña incorrecta");
			response.sendRedirect("Login.jsp");
			
		}
	}

}
