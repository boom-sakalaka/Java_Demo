package com.imooc.total;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class RequestTotalListener implements ServletContextListener,ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
		String url = request.getRequestURI().toString();
		if(url.endsWith("/rt") == true) {
			return;
		}
		List<String> timeList = (List)sre.getServletContext().getAttribute("timeList");
		List<Integer> valueList = (List)sre.getServletContext().getAttribute("valueList");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String time = sdf.format(date);
		if(timeList.indexOf(time) == -1) {
			timeList.add(time);
			valueList.add(1);
			sre.getServletContext().setAttribute("timeList", timeList);
			sre.getServletContext().setAttribute("valueList", valueList);
		}else {
			int index = timeList.indexOf(time);
			int value = valueList.get(index);
			valueList.set(index, value+1);
			sre.getServletContext().setAttribute("valueList", valueList);
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		List<String> timeList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		
		sce.getServletContext().setAttribute("timeList", timeList);
		sce.getServletContext().setAttribute("valueList", valueList);
	}

}
