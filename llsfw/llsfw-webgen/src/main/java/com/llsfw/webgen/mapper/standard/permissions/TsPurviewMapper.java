package com.llsfw.webgen.mapper.standard.permissions;

import com.llsfw.webgen.model.standard.permissions.TsPurview;
import com.llsfw.webgen.model.standard.permissions.TsPurviewCriteria;
import com.llsfw.webgen.model.standard.permissions.TsPurviewKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsPurviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    int countByExample(TsPurviewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    int deleteByExample(TsPurviewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    int deleteByPrimaryKey(TsPurviewKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    int insert(TsPurview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    int insertSelective(TsPurview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    List<TsPurview> selectByExample(TsPurviewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    TsPurview selectByPrimaryKey(TsPurviewKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    int updateByExampleSelective(@Param("record") TsPurview record, @Param("example") TsPurviewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    int updateByExample(@Param("record") TsPurview record, @Param("example") TsPurviewCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    int updateByPrimaryKeySelective(TsPurview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PURVIEW
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    int updateByPrimaryKey(TsPurview record);
}