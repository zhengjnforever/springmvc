package cn.tx.service;

import cn.tx.mapper.Logmessage;
import cn.tx.pojo.log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: untitled1
 * @description: 实现
 * @author: Sam
 * @create: 2020-06-09 21:23
 **/
@Service
public class usergentServiceImpl implements usergentService {

    @Autowired
    private Logmessage logmeaasge;

    @Override
    public void insertlog(log ll) {

        logmeaasge.addlog(ll);
    }
}
