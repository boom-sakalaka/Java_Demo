package com.imooc.mgallery.utils;

import java.util.ArrayList;
import java.util.List;

public class PageModel {
	private int page; // 页号
	private int totalPages; // 总页数
	private int rows; // 每页记录数
	private int totalRows; // 总记录数
	private int pageStartRow; // 当前页从第n行开始
	private int pageEndRow; // 当前页从第n行结束
	private boolean hasNextPage; // 是否存在下一页
	private boolean hasPreviousPage; // 是否存在上一页
	private List pageData;  // 当前页面数据
	
	public PageModel() {}
	
	/**
	 * 初始化 PageModel 对象
	 * @param data 原始数据集合
	 * @param page 页号
	 * @param rows 每页记录数
	 */
	public PageModel(List data,int page,int rows) {
		this.page = page;
		this.rows = rows;
		totalRows = data.size();
		// 总页数计算规则，向上取整
		// java 中两个整数相除只会得到整数的部分
		totalPages = new Double(Math.ceil(totalRows / (rows * 1f))).intValue();
		
		pageStartRow = (page-1) * rows;
		pageEndRow = page * rows;
		
		if(pageEndRow > totalRows) {
			pageEndRow = totalRows;
		}
		pageData =  data.subList(pageStartRow, pageEndRow); // 得到分页数据
		
		if(page > 1) { // 是否存在上一页
			hasPreviousPage = true;
		}else {
			hasPreviousPage = false;
		}
		if(page < totalPages) {// 是否存在下一页
			hasNextPage = true;
		}else {
			hasNextPage = false;
		}
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getPageStartRow() {
		return pageStartRow;
	}

	public void setPageStartRow(int pageStartRow) {
		this.pageStartRow = pageStartRow;
	}

	public int getPageEndRow() {
		return pageEndRow;
	}

	public void setPageEndRow(int pageEndRow) {
		this.pageEndRow = pageEndRow;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}

	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public List getPageData() {
		return pageData;
	}

	public void setPageData(List pageData) {
		this.pageData = pageData;
	}
	
	// 测试方法
	
//	public static void main(String [] args) {
//		List<Integer> sample = new ArrayList();
//		for(int i = 0; i< 100;i++) {
//			sample.add(i);
//		}
//		
//		PageModel pageModel = new PageModel(sample,6,8);
//		System.out.println(pageModel.getPage());
//		System.out.println(pageModel.getTotalPages());
//		System.out.println(pageModel.getPageStartRow());
//		System.out.println(pageModel.getPageEndRow());
//		System.out.println(pageModel.getTotalRows());
//	}
	
}
