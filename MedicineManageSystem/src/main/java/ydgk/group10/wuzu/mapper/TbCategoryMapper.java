package ydgk.group10.wuzu.mapper;


import org.apache.ibatis.annotations.Param;
import ydgk.group10.wuzu.pojo.TbCategory;
import ydgk.group10.wuzu.pojo.TbCategoryExample;

import java.util.List;

public interface TbCategoryMapper {
    long countByExample(TbCategoryExample example);

    int deleteByExample(TbCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCategory record);

    int insertSelective(TbCategory record);

    List<TbCategory> selectByExampleWithBLOBs(TbCategoryExample example);

    List<TbCategory> selectByExample(TbCategoryExample example);

    TbCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByExample(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByPrimaryKeySelective(TbCategory record);

    int updateByPrimaryKeyWithBLOBs(TbCategory record);

    int updateByPrimaryKey(TbCategory record);
}