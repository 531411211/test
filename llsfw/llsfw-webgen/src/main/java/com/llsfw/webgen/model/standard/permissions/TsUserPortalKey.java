package com.llsfw.webgen.model.standard.permissions;

import java.io.Serializable;

public class TsUserPortalKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TS_USER_PORTAL.LOGIN_NAME
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TS_USER_PORTAL.PORTAL_CODE
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    private String portalCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_USER_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TS_USER_PORTAL.LOGIN_NAME
     *
     * @return the value of TS_USER_PORTAL.LOGIN_NAME
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TS_USER_PORTAL.LOGIN_NAME
     *
     * @param loginName the value for TS_USER_PORTAL.LOGIN_NAME
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TS_USER_PORTAL.PORTAL_CODE
     *
     * @return the value of TS_USER_PORTAL.PORTAL_CODE
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public String getPortalCode() {
        return portalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TS_USER_PORTAL.PORTAL_CODE
     *
     * @param portalCode the value for TS_USER_PORTAL.PORTAL_CODE
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void setPortalCode(String portalCode) {
        this.portalCode = portalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_USER_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
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
        TsUserPortalKey other = (TsUserPortalKey) that;
        return (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getPortalCode() == null ? other.getPortalCode() == null : this.getPortalCode().equals(other.getPortalCode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_USER_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getPortalCode() == null) ? 0 : getPortalCode().hashCode());
        return result;
    }
}