package com.llsfw.generator.model.standard.system;

import java.io.Serializable;
import java.util.Date;

public class TtOnlineSessionHis implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_ONLINE_SESSION_HIS.SESSION_ID
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private String sessionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_ONLINE_SESSION_HIS.SESSION_CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private Long sessionCreateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_ONLINE_SESSION_HIS.SESSION_LAST_ACCESSED_TIME
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private Long sessionLastAccessedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_ONLINE_SESSION_HIS.SESSION_MAX_INACTIVE_INTERVAL
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private Long sessionMaxInactiveInterval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_ONLINE_SESSION_HIS.SESSION_DESTORYED_TIME
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private Date sessionDestoryedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TT_ONLINE_SESSION_HIS.CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TT_ONLINE_SESSION_HIS
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TT_ONLINE_SESSION_HIS.SESSION_ID
     *
     * @return the value of TT_ONLINE_SESSION_HIS.SESSION_ID
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TT_ONLINE_SESSION_HIS.SESSION_ID
     *
     * @param sessionId the value for TT_ONLINE_SESSION_HIS.SESSION_ID
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TT_ONLINE_SESSION_HIS.SESSION_CREATE_DATE
     *
     * @return the value of TT_ONLINE_SESSION_HIS.SESSION_CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public Long getSessionCreateDate() {
        return sessionCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TT_ONLINE_SESSION_HIS.SESSION_CREATE_DATE
     *
     * @param sessionCreateDate the value for TT_ONLINE_SESSION_HIS.SESSION_CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public void setSessionCreateDate(Long sessionCreateDate) {
        this.sessionCreateDate = sessionCreateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TT_ONLINE_SESSION_HIS.SESSION_LAST_ACCESSED_TIME
     *
     * @return the value of TT_ONLINE_SESSION_HIS.SESSION_LAST_ACCESSED_TIME
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public Long getSessionLastAccessedTime() {
        return sessionLastAccessedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TT_ONLINE_SESSION_HIS.SESSION_LAST_ACCESSED_TIME
     *
     * @param sessionLastAccessedTime the value for TT_ONLINE_SESSION_HIS.SESSION_LAST_ACCESSED_TIME
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public void setSessionLastAccessedTime(Long sessionLastAccessedTime) {
        this.sessionLastAccessedTime = sessionLastAccessedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TT_ONLINE_SESSION_HIS.SESSION_MAX_INACTIVE_INTERVAL
     *
     * @return the value of TT_ONLINE_SESSION_HIS.SESSION_MAX_INACTIVE_INTERVAL
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public Long getSessionMaxInactiveInterval() {
        return sessionMaxInactiveInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TT_ONLINE_SESSION_HIS.SESSION_MAX_INACTIVE_INTERVAL
     *
     * @param sessionMaxInactiveInterval the value for TT_ONLINE_SESSION_HIS.SESSION_MAX_INACTIVE_INTERVAL
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public void setSessionMaxInactiveInterval(Long sessionMaxInactiveInterval) {
        this.sessionMaxInactiveInterval = sessionMaxInactiveInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TT_ONLINE_SESSION_HIS.SESSION_DESTORYED_TIME
     *
     * @return the value of TT_ONLINE_SESSION_HIS.SESSION_DESTORYED_TIME
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public Date getSessionDestoryedTime() {
        return sessionDestoryedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TT_ONLINE_SESSION_HIS.SESSION_DESTORYED_TIME
     *
     * @param sessionDestoryedTime the value for TT_ONLINE_SESSION_HIS.SESSION_DESTORYED_TIME
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public void setSessionDestoryedTime(Date sessionDestoryedTime) {
        this.sessionDestoryedTime = sessionDestoryedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TT_ONLINE_SESSION_HIS.CREATE_DATE
     *
     * @return the value of TT_ONLINE_SESSION_HIS.CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TT_ONLINE_SESSION_HIS.CREATE_DATE
     *
     * @param createDate the value for TT_ONLINE_SESSION_HIS.CREATE_DATE
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION_HIS
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
        TtOnlineSessionHis other = (TtOnlineSessionHis) that;
        return (this.getSessionId() == null ? other.getSessionId() == null : this.getSessionId().equals(other.getSessionId()))
            && (this.getSessionCreateDate() == null ? other.getSessionCreateDate() == null : this.getSessionCreateDate().equals(other.getSessionCreateDate()))
            && (this.getSessionLastAccessedTime() == null ? other.getSessionLastAccessedTime() == null : this.getSessionLastAccessedTime().equals(other.getSessionLastAccessedTime()))
            && (this.getSessionMaxInactiveInterval() == null ? other.getSessionMaxInactiveInterval() == null : this.getSessionMaxInactiveInterval().equals(other.getSessionMaxInactiveInterval()))
            && (this.getSessionDestoryedTime() == null ? other.getSessionDestoryedTime() == null : this.getSessionDestoryedTime().equals(other.getSessionDestoryedTime()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TT_ONLINE_SESSION_HIS
     *
     * @mbggenerated Fri Jan 15 16:04:44 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        result = prime * result + ((getSessionCreateDate() == null) ? 0 : getSessionCreateDate().hashCode());
        result = prime * result + ((getSessionLastAccessedTime() == null) ? 0 : getSessionLastAccessedTime().hashCode());
        result = prime * result + ((getSessionMaxInactiveInterval() == null) ? 0 : getSessionMaxInactiveInterval().hashCode());
        result = prime * result + ((getSessionDestoryedTime() == null) ? 0 : getSessionDestoryedTime().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }
}