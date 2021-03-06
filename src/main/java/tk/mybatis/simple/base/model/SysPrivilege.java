package tk.mybatis.simple.base.model;


public class SysPrivilege {
	/**
	 * 用户ID
	 */
	private Long id;
	/**
	 * 权限名称
	 */
	private String privilegeName;
	/**
	 * 权限Url
	 */
	private String privilegeUrl;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	public String getPrivilegeUrl() {
		return privilegeUrl;
	}
	public void setPrivilegeUrl(String privilegeUrl) {
		this.privilegeUrl = privilegeUrl;
	}
	@Override
	public String toString() {
		return "SysPrivilege [id=" + id + ", privilegeName=" + privilegeName + ", privilegeUrl=" + privilegeUrl + "]";
	}
}
