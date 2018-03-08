package main.java.com.sxd.service.impl;

import main.java.com.sxd.dao.UserDao;
import main.java.com.sxd.service.UserService;

/**
 * @author Shixiaodong
 * @date 2018/3/6 23:56
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void add() {
        //userDao.insert();
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Add...");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
