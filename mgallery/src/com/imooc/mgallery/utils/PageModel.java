package com.imooc.mgallery.utils;

import java.util.ArrayList;
import java.util.List;

public class PageModel {
	private int page; // ҳ��
	private int totalPages; // ��ҳ��
	private int rows; // ÿҳ��¼��
	private int totalRows; // �ܼ�¼��
	private int pageStartRow; // ��ǰҳ�ӵ�n�п�ʼ
	private int pageEndRow; // ��ǰҳ�ӵ�n�н���
	private boolean hasNextPage; // �Ƿ������һҳ
	private boolean hasPreviousPage; // �Ƿ������һҳ
	private List pageData;  // ��ǰҳ������
	
	public PageModel() {}
	
	/**
	 * ��ʼ�� PageModel ����
	 * @param data ԭʼ���ݼ���
	 * @param page ҳ��
	 * @param rows ÿҳ��¼��
	 */
	public PageModel(List data,int page,int rows) {
		this.page = page;
		this.rows = rows;
		totalRows = data.size();
		// ��ҳ�������������ȡ��
		// java �������������ֻ��õ������Ĳ���
		totalPages = new Double(Math.ceil(totalRows / (rows * 1f))).intValue();
		
		pageStartRow = (page-1) * rows;
		pageEndRow = page * rows;
		
		if(pageEndRow > totalRows) {
			pageEndRow = totalRows;
		}
		pageData =  data.subList(pageStartRow, pageEndRow); // �õ���ҳ����
		
		if(page > 1) { // �Ƿ������һҳ
			hasPreviousPage = true;
		}else {
			hasPreviousPage = false;
		}
		if(page < totalPages) {// �Ƿ������һҳ
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
	
	// ���Է���
	
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
