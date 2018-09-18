package tk.mybatis.simple.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.simple.base.model.SysUser;
import tk.mybatis.simple.base.model.ex.SysUserEx;

public interface ISysUserMapper {
	/**
	 * 通过 id 查询 用户
	 * @param id
	 * @return
	 */
	SysUser selectById(Long id);
	
	/**
	 * 查询全部 用户
	 * @return
	 */
	List<SysUser> selectAll();
	
	/**
	 * 通过 用户ID 查询 用户角色（关联的嵌套结果映射）
	 * @param userId
	 * @return
	 */
	List<SysUserEx> selectRolesByUserId(Long userId);
	
	/**
	 * 通过 用户ID 查询 用户角色（嵌套查询）
	 * @param id
	 * @return
	 */
	SysUserEx selectUserAndRolesByUserId(Long id);
	
	/**
	 * 根据用户id和角色的enabled状态获取用户的角色
	 * @param userId
	 * @param enabled
	 * @return
	 */
	List<SysUserEx> selectRolesByUseridAndRoleEnabled(@Param("userId") Long userId,@Param("enabled") Integer enabled);
	
	/**
	 * 新增用户
	 * @param sysUser
	 * @return
	 */
	int insert(SysUser sysUser);
	
	/**
	 * 新增用户－使用useGeneratedKeys方式
	 * @param sysUser
	 * @return
	 */
	int insert2(SysUser sysUser);
	
	/**
	 * 新增用户－使用selectKey方式
	 * @param sysUser
	 * @return
	 */
	int insert3(SysUser sysUser);
}
