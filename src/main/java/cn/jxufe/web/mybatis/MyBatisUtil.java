package cn.jxufe.web.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private final static SqlSessionFactory sqlSessionFactory;
	static {
		String resource = "mybatis-config.xml";
		Reader reader = null;
		try {
			//使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
		//构建sqlSession的工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
