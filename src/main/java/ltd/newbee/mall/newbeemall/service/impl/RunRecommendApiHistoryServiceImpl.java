package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.RunRecommendApiHistoryMapper;
import ltd.newbee.mall.newbeemall.entity.RunRecommendApiHistory;
import ltd.newbee.mall.newbeemall.service.RunRecommendApiHistoryService;

@Service
public class RunRecommendApiHistoryServiceImpl implements RunRecommendApiHistoryService {

	@Resource
	RunRecommendApiHistoryMapper runRecommendApiHistoryMapper;

	@Override
	public int insertRunRecommendApiHistory(List<RunRecommendApiHistory> list) {
//测试
//		List<RunRecommendApiHistory> list = new  ArrayList<RunRecommendApiHistory>();
//		RunRecommendApiHistory h1 = new RunRecommendApiHistory();
//		h1.setUserId(10003l);
//		h1.setRunDate(new Date());
//		h1.setCategoryId(0);
//		list.add(h1);
		return runRecommendApiHistoryMapper.insertRunRecommendApiHistory(list);

	}
//	@Override
//	public List<Long> selectRecCat (long userId){
//		return runRecommendApiHistoryMapper.selectRecCat(userId);
//	}
	@Override
	public List<RunRecommendApiHistory> selectRecCat() {
		return runRecommendApiHistoryMapper.selectRecCat();
	}	

}