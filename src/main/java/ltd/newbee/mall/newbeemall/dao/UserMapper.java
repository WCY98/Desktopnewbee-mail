package ltd.newbee.mall.newbeemall.dao;

import ltd.newbee.mall.newbeemall.entity.MallUser;

public interface UserMapper {
	MallUser checkUserExists(Long userId);

	int checkUserExistsReturnCount(Long userId);
}