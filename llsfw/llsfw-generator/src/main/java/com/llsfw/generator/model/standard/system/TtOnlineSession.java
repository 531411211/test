package com.llsfw.generator.model.standard.system;

import java.io.Serializable;
import java.util.Date;

public class TtOnlineSession implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_ONLINE_SESSION.SESSION_ID
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private String sessionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_ONLINE_SESSION.SESSION_CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private Long sessionCreateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_ONLINE_SESSION.CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TT_ONLINE_SESSION.SESSION_ID
     *
     * @return the value of TT_ONLINE_SESSION.SESSION_ID
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TT_ONLINE_SESSION.SESSION_ID
     *
     * @param sessionId the value for TT_ONLINE_SESSION.SESSION_ID
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TT_ONLINE_SESSION.SESSION_CREATE_DATE
     *
     * @return the value of TT_ONLINE_SESSION.SESSION_CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public Long getSessionCreateDate() {
        return sessionCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TT_ONLINE_SESSION.SESSION_CREATE_DATE
     *
     * @param sessionCreateDate the value for TT_ONLINE_SESSION.SESSION_CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public void setSessionCreateDate(Long sessionCreateDate) {
        this.sessionCreateDate = sessionCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TT_ONLINE_SESSION.CREATE_DATE
     *
     * @return the value of TT_ONLINE_SESSION.CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TT_ONLINE_SESSION.CREATE_DATE
     *
     * @param createDate the value for TT_ONLINE_SESSION.CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TtOnlineSession other = (TtOnlineSession) that;
        return (this.getSessionId() == null ? other.getSessionId() == null : this.getSessionId().equals(other.getSessionId()))
            && (this.getSessionCreateDate() == null ? other.getSessionCreateDate() == null : this.getSessionCreateDate().equals(other.getSessionCreateDate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        result = prime * result + ((getSessionCreateDate() == null) ? 0 : getSessionCreateDate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }
}