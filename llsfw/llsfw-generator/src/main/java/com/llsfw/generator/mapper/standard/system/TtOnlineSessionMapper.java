package com.llsfw.generator.mapper.standard.system;

import com.llsfw.generator.model.standard.system.TtOnlineSession;
import com.llsfw.generator.model.standard.system.TtOnlineSessionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtOnlineSessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    int countByExample(TtOnlineSessionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    int deleteByExample(TtOnlineSessionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    int deleteByPrimaryKey(String sessionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    int insert(TtOnlineSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    int insertSelective(TtOnlineSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    List<TtOnlineSession> selectByExample(TtOnlineSessionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    TtOnlineSession selectByPrimaryKey(String sessionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    int updateByExampleSelective(@Param("record") TtOnlineSession record, @Param("example") TtOnlineSessionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    int updateByExample(@Param("record") TtOnlineSession record, @Param("example") TtOnlineSessionCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    int updateByPrimaryKeySelective(TtOnlineSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    int updateByPrimaryKey(TtOnlineSession record);
}