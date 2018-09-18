package tk.mybatis.simple.cu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.simple.cu.model.TrainManagerInfo;

public interface ITrainManagerInfoMapper {
	/**
	 * 通过 id 查询 培训经理
	 * @param id
	 * @return
	 */
	public TrainManagerInfo selectById(String id);
	
	/**
	 * 查询全部 培训经理
	 * @return
	 */
	public List<TrainManagerInfo> selectAll();
	
	/**
	 * 插入
	 * @param trainManagerInfo
	 * @return 
	 */
	public int insert(TrainManagerInfo trainManagerInfo);
	
	/**
	 * 批量插入
	 * @param trainManagerInfoList
	 * @return 插入的数目
	 */
	public int insertList(List<TrainManagerInfo> trainManagerInfoList);
	
	/**
	 * 更新  
	 * @param trainManagerInfo
	 * @return
	 */
	public int updateById(TrainManagerInfo trainManagerInfo);
	
	/**
	 * 更新  
	 * @param trainManagerInfoMap
	 * @return
	 */
//	public int updateByMap(@Param("info") Map<String,Object> trainManagerInfoMap);
	public int updateByMap(Map<String,Object> trainManagerInfoMap);
}
