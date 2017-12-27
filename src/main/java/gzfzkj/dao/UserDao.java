package gzfzkj.dao;

import gzfzkj.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by 钟桑扬 on 2017-12-20.
 */
@Repository
public interface UserDao {
    User getByID(Integer userId);
    Integer isExistUserId(Integer userId);
    int testInserKey(User user);
}
