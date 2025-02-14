package hotelproject.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hotelproject.mappers.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void chargePoint(String id, int point) {
		userMapper.chargePoint(id, point);
	}

}
