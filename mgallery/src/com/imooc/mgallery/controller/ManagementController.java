package com.imooc.mgallery.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.imooc.mgallery.entity.Painting;
import com.imooc.mgallery.service.PaintingService;
import com.imooc.mgallery.utils.PageModel;

/**
 * Servlet implementation class ManagementController
 */
@WebServlet("/management")
public class ManagementController extends HttpServlet {
	private PaintingService paintingService = new PaintingService();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagementController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String method = request.getParameter("method");
		if(method.equals("list")) {
			this.list(request,response);
		}else if(method.equals("delete")) {
			// this.delete(request,response);
		}else if(method.equals("show_create")) {
			this.showCreatePage(request,response);
		}else if(method.equals("create")) {
			this.create(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = request.getParameter("p");
		String rows = request.getParameter("r");
		if(page == null) {
			page = "1";
		}
		if(rows == null) {
			rows = "6";
		}
		PageModel pageModel =  paintingService.pagination(Integer.parseInt(page), Integer.parseInt(rows));
		request.setAttribute("pageModel", pageModel);
		request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
	}
	protected void showCreatePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/jsp/create.jsp").forward(request, response);
	}
	protected void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1.初始化 FileUpload
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload sf = new ServletFileUpload(factory);
		// 2. 遍历所有FileUpload
		try {
			List<FileItem> formData =  sf.parseRequest(request);
			Painting painting = new Painting();
			for(FileItem fi : formData) {
				if(fi.isFormField()) {
					System.out.println("普通输入项:" + fi.getFieldName() + ":" + fi.getString("UTF-8"));
					switch (fi.getFieldName()) {
					case "pname":
						painting.setPname(fi.getString("UTF-8"));
						break;
					case "category":
						painting.setCategory(Integer.parseInt(fi.getString("UTF-8")));
						break;
					case "price":
						painting.setPrice(Integer.parseInt(fi.getString("UTF-8")));
						break;
					case "description":
						painting.setDescription(fi.getString("UTF-8"));
						break;
					default:
						break;
					}
				}else {
					System.out.println("文件上传项:" + fi.getFieldName());
					//3.文件保存到服务器目录
					String path = request.getServletContext().getRealPath("/upload");
					System.out.println("上传文件目录:" + path);
					//String fileName = "test.jpg";
					String fileName = UUID.randomUUID().toString();
					//fi.getName()得到原始文件名,截取最后一个.后所有字符串,例如:wxml.jpg->.jpg
					String suffix = fi.getName().substring(fi.getName().lastIndexOf("."));
					//fi.write()写入目标文件
					fi.write(new File(path,fileName + suffix));
					painting.setPreview("/upload/" + fileName + suffix);
				}
			}
			paintingService.create(painting);//新增功能
			response.sendRedirect("/management?method=list");//返回列表页
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
