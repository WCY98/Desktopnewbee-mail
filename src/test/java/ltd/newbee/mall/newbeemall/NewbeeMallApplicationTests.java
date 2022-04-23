package ltd.newbee.mall.newbeemall;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ltd.newbee.mall.newbeemall.service.RunRecommendApiHistoryService;

@SpringBootTest
class NewbeeMallApplicationTests {

	@Resource
	RunRecommendApiHistoryService runRecommendApiHistoryService;

	@Test
	void contextLoads() {
		int cnt = runRecommendApiHistoryService.insertRunRecommendApiHistory();
		assertEquals(1,cnt);
	}

}