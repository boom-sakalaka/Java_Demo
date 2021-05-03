package com.imooc.mgallery.dao;

import java.util.List;

import com.imooc.mgallery.entity.Painting;
import com.imooc.mgallery.utils.PageModel;
import com.imooc.mgallery.utils.XmlDataSource;

public class PaintingDao {
	public PageModel pagination(int page,int rows) {
		List<Painting> list = XmlDataSource.getRawData();
		PageModel pageModel = new PageModel(list,page,rows);
		return pageModel;
	}
}
