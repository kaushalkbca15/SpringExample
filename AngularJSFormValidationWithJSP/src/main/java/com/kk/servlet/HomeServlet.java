package com.kk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

@WebServlet("/homeservlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 6013120138089120100L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = IOUtils.toString(request.getInputStream(), "UTF-8");
		System.out.println(data);
		ServletOutputStream outputStream = response.getOutputStream();

		response.setContentType("application/json;charset=UTF-8");
		outputStream.print(new Gson().toJson(new String(data)));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
