package zy.mapperTest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.zy.ElecBrakeMapper;
import org.example.mapper.zy.impl.ElecBrakeMapperImpl;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class ElecBrakeMapperTest {
    private SqlSession sqlSession;
    private ElecBrakeMapper elecBrakeMapper;
    @Before
    public void init() throws IOException {
        String resource="mybatis_config.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();
        this.elecBrakeMapper=new ElecBrakeMapperImpl(sqlSession);
    }

    @Test
    public void insert(){

    }
    @Test
    public void delete(){}
    @Test
    public void update(){}
    @Test
    public void select(){}
    @Test
    public void selectAll(){}
}
