package tk.mybatis.simple.cu.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import tk.mybatis.simple.BasicMapperTest;
import tk.mybatis.simple.cu.dao.ITrainManagerInfoMapper;
import tk.mybatis.simple.cu.model.TrainManagerInfo;

public class ITrainManagerInfoMapperTest extends BasicMapperTest {

	@Test
	public void selectByIdTest() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("==========selectByIdTest==========");
			//获取  SysUserMapper 接口
			ITrainManagerInfoMapper trainManagerInfoMapper = sqlSession.getMapper(ITrainManagerInfoMapper.class);
			TrainManagerInfo trainManagerInfo = trainManagerInfoMapper.selectById("123456");
			Assert.assertNotNull(trainManagerInfo);
			System.out.println(trainManagerInfo);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// TODO: handle finally clause
			sqlSession.close();
		}
	}

	@Test
	public void selectAllTest() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("==========selectAllTest==========");
			ITrainManagerInfoMapper trainManagerInfoMapper = sqlSession.getMapper(ITrainManagerInfoMapper.class);
			List<TrainManagerInfo> trainManagerInfoList = trainManagerInfoMapper.selectAll();
			Assert.assertNotNull(trainManagerInfoList);
			Assert.assertTrue(trainManagerInfoList.size()>0);
			for (TrainManagerInfo trainManagerInfo : trainManagerInfoList) {
				System.out.println(trainManagerInfo);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			// TODO: handle finally clause
			
			sqlSession.close();
		}
	}
	
	@Test
	public void insertTest() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("==========insert==========");
			ITrainManagerInfoMapper trainManagerInfoMapper = sqlSession.getMapper(ITrainManagerInfoMapper.class);
			TrainManagerInfo trainManagerInfo = new TrainManagerInfo();
			trainManagerInfo.setCcbEmpId("ccbEmpId");
			trainManagerInfo.setContactInfo1("contactInfo1");
			trainManagerInfo.setContactInfo2("contactInfo2");
			trainManagerInfo.setEmpeIdLandNm("chenyi.zh");
			trainManagerInfo.setEmpeNm("chenyi");
			trainManagerInfo.setTraininstId("traininstId");
			trainManagerInfo.setUserId("userId");
			
			int insertNum = trainManagerInfoMapper.insert(trainManagerInfo);
			System.out.println(insertNum);
			Assert.assertEquals(1, insertNum);
			System.out.println(trainManagerInfo.getId());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			// TODO: handle finally clause
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	@Test
	public void insertListTest() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("==========insertList==========");
			ITrainManagerInfoMapper trainManagerInfoMapper = sqlSession.getMapper(ITrainManagerInfoMapper.class);
			List<TrainManagerInfo> list = new ArrayList<>();
			TrainManagerInfo trainManagerInfo = new TrainManagerInfo();
			trainManagerInfo.setCcbEmpId("ccbEmpId");
			trainManagerInfo.setContactInfo1("contactInfo1");
			trainManagerInfo.setContactInfo2("contactInfo2");
			trainManagerInfo.setEmpeIdLandNm("lisi.zh");
			trainManagerInfo.setEmpeNm("lisi");
			trainManagerInfo.setTraininstId("traininstId");
			trainManagerInfo.setUserId("userId");
			list.add(trainManagerInfo);
			
			trainManagerInfo = new TrainManagerInfo();
			trainManagerInfo.setCcbEmpId("ccbEmpId");
			trainManagerInfo.setContactInfo1("contactInfo1");
			trainManagerInfo.setContactInfo2("contactInfo2");
			trainManagerInfo.setEmpeIdLandNm("wangwu.zh");
			trainManagerInfo.setEmpeNm("wangwu");
			trainManagerInfo.setTraininstId("traininstId");
			trainManagerInfo.setUserId("userId");
			list.add(trainManagerInfo);
			
			int insertNum = trainManagerInfoMapper.insertList(list);
			System.out.println(insertNum);
			Assert.assertEquals(2, insertNum);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sqlSession.commit();
			// TODO: handle finally clause
			
			sqlSession.close();
		}
	}

	@Test
	public void updateByIdTest() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("==========update==========");
			ITrainManagerInfoMapper trainManagerInfoMapper = sqlSession.getMapper(ITrainManagerInfoMapper.class);
			TrainManagerInfo trainManagerInfo = new TrainManagerInfo();
			trainManagerInfo.setId("123456");
			trainManagerInfo.setUserId("08369936");
			trainManagerInfo.setEmpeNm("zhangsan1");	
			
			int updateNum = trainManagerInfoMapper.updateById(trainManagerInfo);
			System.out.println(updateNum);
			Assert.assertEquals(1, updateNum);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			// TODO: handle finally clause
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	@Test
	public void updateByMapTest() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("==========updateByMap==========");
			ITrainManagerInfoMapper trainManagerInfoMapper = sqlSession.getMapper(ITrainManagerInfoMapper.class);
			Map<String,Object> trainManagerInfoMap = new HashMap<>();
			trainManagerInfoMap.put("id", "123456");
			trainManagerInfoMap.put("user_id", "08369936");
			trainManagerInfoMap.put("empe_nm", "zhangsan3");	
			
			int updateNum = trainManagerInfoMapper.updateByMap(trainManagerInfoMap);
			System.out.println(updateNum);
			Assert.assertEquals(1, updateNum);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			// TODO: handle finally clause
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	
}
