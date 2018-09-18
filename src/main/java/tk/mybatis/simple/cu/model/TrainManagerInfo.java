package tk.mybatis.simple.cu.model;

import java.sql.Timestamp;

public class TrainManagerInfo {
	
    private String id;
	
	/**
	 * 机构员工编码	
	 */
	private String ccbEmpId;
	
	//姓名
	private String empeNm;
	
    //人员编号
    private String userId;
    
	//UAAP员工账号
	private String empeIdLandNm;

	//培训地点编号
	private String traininstId;

    //联系方式1
    private String contactInfo1;

    //联系方式2
    private String contactInfo2;
	
	//创建时间
    private Timestamp createTime;

   //最后修改时间
    private Timestamp lastUdtTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCcbEmpId() {
		return ccbEmpId;
	}

	public void setCcbEmpId(String ccbEmpId) {
		this.ccbEmpId = ccbEmpId;
	}

	public String getEmpeNm() {
		return empeNm;
	}

	public void setEmpeNm(String empeNm) {
		this.empeNm = empeNm;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmpeIdLandNm() {
		return empeIdLandNm;
	}

	public void setEmpeIdLandNm(String empeIdLandNm) {
		this.empeIdLandNm = empeIdLandNm;
	}

	public String getTraininstId() {
		return traininstId;
	}

	public void setTraininstId(String traininstId) {
		this.traininstId = traininstId;
	}

	public String getContactInfo1() {
		return contactInfo1;
	}

	public void setContactInfo1(String contactInfo1) {
		this.contactInfo1 = contactInfo1;
	}

	public String getContactInfo2() {
		return contactInfo2;
	}

	public void setContactInfo2(String contactInfo2) {
		this.contactInfo2 = contactInfo2;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getLastUdtTime() {
		return lastUdtTime;
	}

	public void setLastUdtTime(Timestamp lastUdtTime) {
		this.lastUdtTime = lastUdtTime;
	}

	@Override
	public String toString() {
		return "TrainManagerInfo [id=" + id + ", ccbEmpId=" + ccbEmpId + ", empeNm=" + empeNm + ", userId=" + userId
				+ ", empeIdLandNm=" + empeIdLandNm + ", traininstId=" + traininstId + ", contactInfo1=" + contactInfo1
				+ ", contactInfo2=" + contactInfo2 + ", createTime=" + createTime + ", lastUdtTime=" + lastUdtTime
				+ "]";
	}
	
	
}
