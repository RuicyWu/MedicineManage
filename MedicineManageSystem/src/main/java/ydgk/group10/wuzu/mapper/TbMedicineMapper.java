package ydgk.group10.wuzu.mapper;


import org.apache.ibatis.annotations.Param;
import ydgk.group10.wuzu.pojo.TbMedicine;
import ydgk.group10.wuzu.pojo.TbMedicineExample;

import java.util.List;

public interface TbMedicineMapper {
    long countByExample(TbMedicineExample example);

    int deleteByExample(TbMedicineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMedicine record);

    int insertSelective(TbMedicine record);

    List<TbMedicine> selectByExampleWithBLOBs(TbMedicineExample example);

    List<TbMedicine> selectByExample(TbMedicineExample example);

    TbMedicine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMedicine record, @Param("example") TbMedicineExample example);

    int updateByExampleWithBLOBs(@Param("record") TbMedicine record, @Param("example") TbMedicineExample example);

    int updateByExample(@Param("record") TbMedicine record, @Param("example") TbMedicineExample example);

    int updateByPrimaryKeySelective(TbMedicine record);

    int updateByPrimaryKeyWithBLOBs(TbMedicine record);

    int updateByPrimaryKey(TbMedicine record);
}