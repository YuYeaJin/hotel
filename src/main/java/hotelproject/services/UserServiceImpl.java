package hotelproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotelproject.repositories.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void chargePoint(String id, int point) {
		userDao.chargePoint(id, point);
	}

}
