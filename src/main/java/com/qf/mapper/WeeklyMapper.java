package com.qf.mapper;

import com.qf.pojo.Weekly;
import com.qf.pojo.WeeklyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeeklyMapper {
    long countByExample(WeeklyExample example);

    int deleteByExample(WeeklyExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Weekly record);

    int insertSelective(Weekly record);

    List<Weekly> selectByExampleWithBLOBs(WeeklyExample example);

    List<Weekly> selectByExample(WeeklyExample example);

    Weekly selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") Weekly record, @Param("example") WeeklyExample example);

    int updateByExampleWithBLOBs(@Param("record") Weekly record, @Param("example") WeeklyExample example);

    int updateByExample(@Param("record") Weekly record, @Param("example") WeeklyExample example);

    int updateByPrimaryKeySelective(Weekly record);

    int updateByPrimaryKeyWithBLOBs(Weekly record);

    int updateByPrimaryKey(Weekly record);
}