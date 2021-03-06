package com.waps.obj2.service.impl;

import com.waps.obj2.dao.UserDao;
import com.waps.obj2.domain.User;
import com.waps.obj2.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(value="userService")
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getUser(User user) {
        return userDao.getUser(user);
    }

    @Override
    public int delete(int id) {
        return userDao.delete(id);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public List<User> find(Map<String, Object> map) {
        return userDao.find(map);
    }

    @Override
    public Long getTotal(Map<String, Object> map) {
        return userDao.getTotal(map);
    }
    public User getUserById(int id){
        return userDao.getUserById(id);
    }
}
