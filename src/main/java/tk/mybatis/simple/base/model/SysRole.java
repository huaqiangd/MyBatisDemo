package tk.mybatis.simple.base.model;

import java.util.Date;

public class SysRole {
	/**
	 * 用户ID
	 */
	private Long id;
	/**
	 * 角色名
	 */
	private String roleName;
	/**
	 * 有效标志（1：有效 0：无效）
	 */
	private int enabled;
	
	/**
	 * 创建人
	 */
	private Long createBy;
	
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "SysRole [id=" + id + ", roleName=" + roleName + ", enabled=" + enabled + ", createBy=" + createBy
				+ ", createTime=" + createTime + "]";
	}

}
