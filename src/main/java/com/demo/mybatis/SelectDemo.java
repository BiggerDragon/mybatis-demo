package com.demo.mybatis;

import com.demo.mapper.UserMapper;
import com.demo.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class SelectDemo {

    public static void main(String[] args) throws IOException {

        /**获取mybatis Configuration信息**/
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        /**创建SqlSessionFactory**/
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        /**获得一个SqlSession对象**/
        SqlSession sqlSession = sqlSessionFactory.openSession();

        /**使用statement id的形式操作数据库**/
        /**sqlSession会在Configuration对象中查找和配置文件相对应的MappedStatement,然后委托executor执行**/
        Object object = sqlSession.selectOne("com.demo.mapper.UserMapper.getOne", "U00000001");
        System.out.println(object);

        /**使用接口的形式操作数据库**/
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User("U000002", "小龙", 24, new Date());
        int i = userMapper.insert(user);
        System.out.println("i=" + i);
        /**提交**/
        sqlSession.commit();

    }
}
