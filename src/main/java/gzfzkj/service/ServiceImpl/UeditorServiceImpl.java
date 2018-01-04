package gzfzkj.service.ServiceImpl;

import gzfzkj.dao.UeditorDao;
import gzfzkj.service.UeditorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 钟桑扬 on 2018/1/4.
 */
@Service("ueditorService")
public class UeditorServiceImpl implements UeditorService {
    @Resource
    private UeditorDao ueditorDao;
    public void AddDataToDatabase(String content) {
        ueditorDao.AddDataToDatabase(content);
    }
}
