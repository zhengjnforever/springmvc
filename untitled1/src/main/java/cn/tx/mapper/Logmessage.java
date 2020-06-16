package cn.tx.mapper;

import cn.tx.pojo.log;
import org.apache.ibatis.annotations.Mapper;


public interface Logmessage {

    void addlog(log log);
}
