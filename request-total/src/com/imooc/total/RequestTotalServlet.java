package com.imooc.total;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

/**
 * Servlet implementation class RequestTotalServlet
 */
@WebServlet("/rt")
public class RequestTotalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestTotalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context = request.getServletContext();
		List<String> timeList = (List)context.getAttribute("timeList");
		List<Integer> valueList = (List)context.getAttribute("valueList");
		response.setContentType("text/html;charset=utf-8");
//		response.getWriter().println(timeList.toString());
//		response.getWriter().println("<br/>");
//		response.getWriter().println(valueList.toString());
		
		Map result = new HashMap();
		result.put("timeList",timeList);
		result.put("valueList",valueList);
		String json = JSON.toJSONString(result);
		response.getWriter().println(json);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
