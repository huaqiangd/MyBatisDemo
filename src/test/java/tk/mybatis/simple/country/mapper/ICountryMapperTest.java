package tk.mybatis.simple.country.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.BasicMapperTest;
import tk.mybatis.simple.country.model.Country;

public class ICountryMapperTest extends BasicMapperTest {

	@Test
	public void selectAllTest() {
		// TODO Auto-generated method stub
		// 通过SqlSessionFactory工厂对象获取一个SqlSessiono
		SqlSession sqlSession = getSqlSession();
		try {
			// 通过SqlSession的selectList方法查找命名空间为tk.mybatis.simple.country.dao.CountryMapper的xml文件中id＝"selectAll"的方法，执行SQL查询
			// MyBatis底层使用JDBC执行SQL，获得查询结果集ResultSet后，根据resultType的配置将结果映射为Country类型的集合，
			// 返回查询结果
			List<Country> countryList = sqlSession.selectList("tk.mybatis.simple.country.dao.ICountryMapper.selectAll");
			printCountryList(countryList);
		} finally {
			// TODO: handle finally clause
			sqlSession.close();
		}
	}

	private void printCountryList(List<Country> countryList) {
		for (Country country : countryList) {
			System.out.printf("%-4d%4s%4s\n", country.getId(), country.getCountryName(), country.getCountryCode());
		}
	}

}
