package tk.mybatis.simple.base.dao;

import java.util.List;

import tk.mybatis.simple.base.model.SysRole;

public interface ISysRoleMapper {
	
	/**
	 * 根据 角色ID 查找 角色信息
	 * @param id
	 * @return
	 */
	SysRole selectRoleById(Long id);
	
	/**
	 * 查找所有的 角色信息
	 * @return
	 */
	List<SysRole> selectAll();
}
