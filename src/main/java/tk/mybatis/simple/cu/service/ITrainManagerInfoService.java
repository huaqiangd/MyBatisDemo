package tk.mybatis.simple.cu.service;

import java.util.List;

import tk.mybatis.simple.cu.model.TrainManagerInfo;

public interface ITrainManagerInfoService {
	
	public TrainManagerInfo selectById(String id);
	
	public List<TrainManagerInfo> selectAll();
	
	public int insert(TrainManagerInfo trainManagerInfo);
	
	public int insertList(List<TrainManagerInfo> trainManagerInfoList);
}
