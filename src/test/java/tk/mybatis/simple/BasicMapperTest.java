package tk.mybatis.simple;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

public class BasicMapperTest {

	private static SqlSessionFactory sqlSessionFactory;
		
	@BeforeClass
	public static void init() {
		try {
			//通过Resources工具类将mybatis-config.xml 配置文件读入Reader。
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			/**
			 * 通过SqlSessionFactoryBuilder建造类使用Reader创建SqlSessionFactory工厂对象。
			 * 在创建SqlSessionFactory对象的过程中， 首先解析mybatis-config.xml配置文件，
			 * 读取配置文件中的mappers配置后会读取全部的Mapper.xml进行具体方法的解析，
			 * 在这些解析完成后，SqlSessionFactory就包含了所有的属性配置和执行SQL的信息。
			 */
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch(IOException ignore) {
			ignore.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
	
}
