package com.lishuo.mybatis.sqlsession.defaults;

import com.lishuo.mybatis.cfg.Configuration;
import com.lishuo.mybatis.sqlsession.SqlSession;
import com.lishuo.mybatis.sqlsession.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的连接
     *
     * @return
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
