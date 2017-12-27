package gzfzkj.service.ServiceImpl;

import gzfzkj.dao.UserDao;
import gzfzkj.model.User;
import gzfzkj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-12-20.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    public User getUserByUserId(Integer userId) {
        return userDao.getByID(userId);
    }

    public Integer isExistUserId(Integer userId) {
        return userDao.isExistUserId(userId);
    }

    public int testInserKey(User user) {
        return userDao.testInserKey(user);
    }

}
