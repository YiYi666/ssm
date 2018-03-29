package top.headtop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.headtop.mapper.UserMapper;
import top.headtop.pojo.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public void saveUser(User user) {
		userMapper.insert(user);
	}
	
}
