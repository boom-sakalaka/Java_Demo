package com.imooc.mgallery.service;

import java.util.List;

import com.imooc.mgallery.dao.PaintingDao;
import com.imooc.mgallery.entity.Painting;
import com.imooc.mgallery.utils.PageModel;

public class PaintingService {
	private PaintingDao paintingDao = new PaintingDao();
	public PageModel pagination(int page,int rows,String...category) {
		if(rows == 0) {
			throw new RuntimeException("��Ч��rows����");
		}
		if(category.length == 0 || category[0] == null) {
			return paintingDao.pagination(page, rows);
		}else {
			return paintingDao.pagination(Integer.parseInt(category[0]), page, rows);
		}
	}
	
	/**
	 * �����ͻ�
	 * @param painting ׼��������Painting����
	 */
	public void create(Painting painting) {
		paintingDao.create(painting);
	}
//	public static void main(String [] args) {
//		PaintingService paintingService = new PaintingService();
//		PageModel pageModel = paintingService.pagination(2, 6);
//		List<Painting> paintingList = pageModel.getPageData();
//		for(Painting painting : paintingList) {
//			System.out.println(painting.getPname());
//		}
//		System.out.println(pageModel.getPageStartRow());
//		System.out.println(pageModel.getPageEndRow());
//	}
}
