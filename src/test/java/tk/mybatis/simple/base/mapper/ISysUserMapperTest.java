package tk.mybatis.simple.base.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import tk.mybatis.simple.BasicMapperTest;
import tk.mybatis.simple.base.dao.ISysUserMapper;
import tk.mybatis.simple.base.model.SysRole;
import tk.mybatis.simple.base.model.SysUser;
import tk.mybatis.simple.base.model.ex.SysUserEx;

public class ISysUserMapperTest extends BasicMapperTest {

	@Test
	public void selectByIdTest() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("selectByIdTest");
			//获取  SysUserMapper 接口
			ISysUserMapper sysUserMapper = sqlSession.getMapper(ISysUserMapper.class);
			SysUser sysUser = sysUserMapper.selectById(1l);
			Assert.assertNotNull(sysUser);
			Assert.assertEquals("admin", sysUser.getUserName());
			System.out.println(sysUser);
			
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
			System.out.println("selectAllTest");
			ISysUserMapper sysUserMapper = sqlSession.getMapper(ISysUserMapper.class);
			List<SysUser> sysUserList = sysUserMapper.selectAll();
			Assert.assertNotNull(sysUserList);
			Assert.assertTrue(sysUserList.size()>0);
			for (SysUser sysUser : sysUserList) {
				System.out.println(sysUser);
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
	public void selectRolesByUserId() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("selectRolesByUserId");
			ISysUserMapper sysUserMapper = sqlSession.getMapper(ISysUserMapper.class);
			List<SysUserEx> sysUserExList = sysUserMapper.selectRolesByUserId(1L);
			Assert.assertNotNull(sysUserExList);
			Assert.assertTrue(sysUserExList.size()>0);
			for (SysUserEx sysUserEx : sysUserExList) {
				System.out.println(sysUserEx);
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
	public void selectUserAndRolesByUserId() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("selectUserAndRolesByUserId");
			ISysUserMapper sysUserMapper = sqlSession.getMapper(ISysUserMapper.class);
			SysUserEx sysUserEx = sysUserMapper.selectUserAndRolesByUserId(1L);
			Assert.assertNotNull(sysUserEx);
			Assert.assertTrue(sysUserEx.getSysRoleList().size()>0);
			for (SysRole sysRole : sysUserEx.getSysRoleList()) {
				System.out.println(sysRole);
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
	public void selectRolesByUseridAndRoleEnabled() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("selectRolesByUserId");
			ISysUserMapper sysUserMapper = sqlSession.getMapper(ISysUserMapper.class);
			List<SysUserEx> sysRoleExList = sysUserMapper.selectRolesByUseridAndRoleEnabled(1L,1);
			Assert.assertNotNull(sysRoleExList);
			Assert.assertTrue(sysRoleExList.size()>0);
			for (SysUserEx sysRoleEx : sysRoleExList) {
				System.out.println(sysRoleEx);
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
			System.out.println("insert");
			ISysUserMapper sysUserMapper = sqlSession.getMapper(ISysUserMapper.class);
			SysUser sysUser = new SysUser();
			sysUser.setUserName("test1");
			sysUser.setUserPassword("123456");
			sysUser.setUserEmail("test@mybatis.tk");
			sysUser.setUserInfo("test info");
			sysUser.setHeadImg(new byte[] {1,2,3});
			sysUser.setCreateTime(new Date());
			int result = sysUserMapper.insert(sysUser);
			Assert.assertEquals(1, result);
			Assert.assertNull(sysUser.getId());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			// TODO: handle finally clause
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
	@Test
	public void insert2Test() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("insert2");
			ISysUserMapper sysUserMapper = sqlSession.getMapper(ISysUserMapper.class);
			SysUser sysUser = new SysUser();
			sysUser.setUserName("test1");
			sysUser.setUserPassword("123456");
			sysUser.setUserEmail("test@mybatis.tk");
			sysUser.setUserInfo("test info");
			sysUser.setHeadImg(new byte[] {1,2,3});
			sysUser.setCreateTime(new Date());
			int result = sysUserMapper.insert2(sysUser);
			Assert.assertEquals(1, result);
			System.out.println(sysUser.getId());
			Assert.assertNotNull(sysUser.getId());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			// TODO: handle finally clause
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
	@Test
	public void insert3Test() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = getSqlSession();
		try {
			System.out.println("insert3");
			ISysUserMapper sysUserMapper = sqlSession.getMapper(ISysUserMapper.class);
			SysUser sysUser = new SysUser();
			sysUser.setUserName("test1");
			sysUser.setUserPassword("123456");
			sysUser.setUserEmail("test@mybatis.tk");
			sysUser.setUserInfo("test info");
			sysUser.setHeadImg(new byte[] {1,2,3});
			sysUser.setCreateTime(new Date());
			int result = sysUserMapper.insert3(sysUser);
			Assert.assertEquals(1, result);
			System.out.println(sysUser.getId());
			Assert.assertNotNull(sysUser.getId());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			// TODO: handle finally clause
			sqlSession.rollback();
			sqlSession.close();
		}
	}
	
}
