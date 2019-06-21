package com.demo.mybatis;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class ConfigurationDemo {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /**获取Configuration**/
        Configuration configuration = sqlSession.getConfiguration();

        MappedStatement getOneStatement = configuration.getMappedStatement("com.demo.mapper.UserMapper.getOne");
        System.out.println(getOneStatement);
        SqlSource sqlSource = getOneStatement.getSqlSource();
        System.out.println(sqlSource);

    }
}
