package com.qf.mapper;

import com.qf.pojo.Boss;
import com.qf.pojo.BossExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BossMapper {
    long countByExample(BossExample example);

    int deleteByExample(BossExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Boss record);

    int insertSelective(Boss record);

    List<Boss> selectByExample(BossExample example);

    Boss selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Boss record, @Param("example") BossExample example);

    int updateByExample(@Param("record") Boss record, @Param("example") BossExample example);

    int updateByPrimaryKeySelective(Boss record);

    int updateByPrimaryKey(Boss record);
}