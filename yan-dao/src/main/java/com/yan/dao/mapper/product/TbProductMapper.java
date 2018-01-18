package com.yan.dao.mapper.product;

import com.yan.dao.model.product.TbProduct;
import com.yan.dao.model.product.TbProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    long countByExample(TbProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    int deleteByExample(TbProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    int deleteByPrimaryKey(String productCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    int insert(TbProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    int insertSelective(TbProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    List<TbProduct> selectByExample(TbProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    TbProduct selectByPrimaryKey(String productCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbProduct record, @Param("example") TbProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    int updateByExample(@Param("record") TbProduct record, @Param("example") TbProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    int updateByPrimaryKeySelective(TbProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Thu Dec 07 09:56:50 CST 2017
     */
    int updateByPrimaryKey(TbProduct record);
}