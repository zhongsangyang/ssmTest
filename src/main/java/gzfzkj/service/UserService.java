package gzfzkj.service;

import gzfzkj.model.User;

/**
 * Created by 钟桑扬 on 2017-12-20.
 */
public interface UserService {
    User getUserByUserId (Integer userId);
    Integer isExistUserId(Integer userId);
    int testInserKey(User user);
}
