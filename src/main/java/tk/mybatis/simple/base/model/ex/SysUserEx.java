package tk.mybatis.simple.base.model.ex;

import java.util.List;

import tk.mybatis.simple.base.model.SysRole;
import tk.mybatis.simple.base.model.SysUser;

public class SysUserEx extends SysUser {

	private SysRole sysRole;
	
	private List<SysRole> sysRoleList;
	
	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

	public List<SysRole> getSysRoleList() {
		return sysRoleList;
	}

	public void setSysRoleList(List<SysRole> sysRoleList) {
		this.sysRoleList = sysRoleList;
	}

	@Override
	public String toString() {
		return "SysUserEx [sysUser =" + super.toString() + ", sysRole=" + sysRole + "]";
	}
	
	

}
