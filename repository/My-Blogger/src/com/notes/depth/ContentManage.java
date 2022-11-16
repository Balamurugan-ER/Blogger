//$Id$
/**
 * 
 */
package com.notes.depth;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author bala-16089
 *
 */
@WebServlet("/view/*")
public class ContentManage extends HttpServlet
{

	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		String pathInfo = req.getPathInfo();
		System.out.println("Service - Path Request : "+pathInfo);
		switch(pathInfo)
		{
		case "/object":
		{
			res.setHeader("key", "object");
			break;	
		}
		case "/package":
		{
			res.setHeader("key", "package");
			break;	
		}
		case "/class":
		{
			res.setHeader("key", "class");
			break;	
		}
		case "/string-immutable":
		{
			res.setHeader("key", "string-immutable");
			break;	
		}
		case "/primitives":
		{
			res.setHeader("key","primitives");
			break;	
		}
		case "/exception":
		{
			res.setHeader("key", "exception");
			break;
		}
		case "/inst-var-meth":
		{
			res.setHeader("key", "instVarMeth");
			break;
		}
		case "/overloading":
		{
			res.setHeader("key", "overloading");
			break;
		}
		case "/tostring":
		{
			res.setHeader("key", "tostring");
			break;
		}
		case "/collection":
		{
			res.setHeader("key", "collection");
			break;
		}
		case "/jvm":
		{
			res.setHeader("key", "jvm");
			break;
		}
		case "/tryCatch":
		{
			res.setHeader("key", "tryCatch");
		}
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/result.jsp");
		try {
			requestDispatcher.forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
