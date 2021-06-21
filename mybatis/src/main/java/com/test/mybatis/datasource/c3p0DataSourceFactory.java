package com.test.mybatis.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

public class c3p0DataSourceFactory  extends UnpooledDataSourceFactory {
    public c3p0DataSourceFactory() {
        this.dataSource = new ComboPooledDataSource();
    }
}
