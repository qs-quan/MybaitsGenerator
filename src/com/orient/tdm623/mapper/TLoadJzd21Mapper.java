package com.orient.tdm623.mapper;

import com.orient.tdm623.pojo.TLoadJzd21;
import com.orient.tdm623.pojo.TLoadJzd21Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLoadJzd21Mapper {
    long countByExample(TLoadJzd21Example example);

    int deleteByExample(TLoadJzd21Example example);

    int deleteByPrimaryKey(String id);

    int insert(TLoadJzd21 record);

    int insertSelective(TLoadJzd21 record);

    List<TLoadJzd21> selectByExample(TLoadJzd21Example example);

    TLoadJzd21 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TLoadJzd21 record, @Param("example") TLoadJzd21Example example);

    int updateByExample(@Param("record") TLoadJzd21 record, @Param("example") TLoadJzd21Example example);

    int updateByPrimaryKeySelective(TLoadJzd21 record);

    int updateByPrimaryKey(TLoadJzd21 record);
}