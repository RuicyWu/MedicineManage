package ydgk.group10.wuzu.mapper;


import org.apache.ibatis.annotations.Param;
import ydgk.group10.wuzu.pojo.TbSelldetail;
import ydgk.group10.wuzu.pojo.TbSelldetailExample;

import java.util.List;

public interface TbSelldetailMapper {
    long countByExample(TbSelldetailExample example);

    int deleteByExample(TbSelldetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSelldetail record);

    int insertSelective(TbSelldetail record);

    List<TbSelldetail> selectByExample(TbSelldetailExample example);

    TbSelldetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSelldetail record, @Param("example") TbSelldetailExample example);

    int updateByExample(@Param("record") TbSelldetail record, @Param("example") TbSelldetailExample example);

    int updateByPrimaryKeySelective(TbSelldetail record);

    int updateByPrimaryKey(TbSelldetail record);
}