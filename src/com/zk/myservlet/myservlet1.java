package com.zk.myservlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myservlet1 extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String apath=this.getServletContext().getRealPath("/WEB-INF/a.properties");//参数一定要以斜杠开头
		System.out.println(apath);
		//创建一个properties
		Properties pro=new Properties();
		pro.load(new FileInputStream(apath));
		System.out.println(pro.getProperty("akey"));
		
		String bpath=this.getServletContext().getRealPath("/WEB-INF/classes/b.properties");
		System.out.println(bpath);
		Properties pro2=new Properties();
		pro2.load(new FileInputStream(bpath));
		System.out.println(pro2.getProperty("key"));
		
		String cpath=this.getServletContext().getRealPath("/WEB-INF/classes/com/zk/myservlet/c.properties");
		System.out.println(cpath);
		Properties pro3=new Properties();
		pro3.load(new FileInputStream(cpath));
		System.out.println(pro3.get("ckey"));
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
