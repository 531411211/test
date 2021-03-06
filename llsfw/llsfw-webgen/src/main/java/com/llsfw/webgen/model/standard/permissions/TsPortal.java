package com.llsfw.webgen.model.standard.permissions;

import java.io.Serializable;
import java.util.Date;

public class TsPortal extends TsPortalKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TS_PORTAL.PORTAL_TITLE
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    private String portalTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TS_PORTAL.PORTAL_HEIGHT
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    private Integer portalHeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TS_PORTAL.PORTAL_URL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    private String portalUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TS_PORTAL.CREATE_BY
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TS_PORTAL.CREATE_DATE
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TS_PORTAL.PORTAL_TITLE
     *
     * @return the value of TS_PORTAL.PORTAL_TITLE
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public String getPortalTitle() {
        return portalTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TS_PORTAL.PORTAL_TITLE
     *
     * @param portalTitle the value for TS_PORTAL.PORTAL_TITLE
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void setPortalTitle(String portalTitle) {
        this.portalTitle = portalTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TS_PORTAL.PORTAL_HEIGHT
     *
     * @return the value of TS_PORTAL.PORTAL_HEIGHT
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public Integer getPortalHeight() {
        return portalHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TS_PORTAL.PORTAL_HEIGHT
     *
     * @param portalHeight the value for TS_PORTAL.PORTAL_HEIGHT
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void setPortalHeight(Integer portalHeight) {
        this.portalHeight = portalHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TS_PORTAL.PORTAL_URL
     *
     * @return the value of TS_PORTAL.PORTAL_URL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public String getPortalUrl() {
        return portalUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TS_PORTAL.PORTAL_URL
     *
     * @param portalUrl the value for TS_PORTAL.PORTAL_URL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TS_PORTAL.CREATE_BY
     *
     * @return the value of TS_PORTAL.CREATE_BY
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TS_PORTAL.CREATE_BY
     *
     * @param createBy the value for TS_PORTAL.CREATE_BY
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TS_PORTAL.CREATE_DATE
     *
     * @return the value of TS_PORTAL.CREATE_DATE
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TS_PORTAL.CREATE_DATE
     *
     * @param createDate the value for TS_PORTAL.CREATE_DATE
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
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
        TsPortal other = (TsPortal) that;
        return (this.getFunctionCode() == null ? other.getFunctionCode() == null : this.getFunctionCode().equals(other.getFunctionCode()))
            && (this.getPortalCode() == null ? other.getPortalCode() == null : this.getPortalCode().equals(other.getPortalCode()))
            && (this.getPortalTitle() == null ? other.getPortalTitle() == null : this.getPortalTitle().equals(other.getPortalTitle()))
            && (this.getPortalHeight() == null ? other.getPortalHeight() == null : this.getPortalHeight().equals(other.getPortalHeight()))
            && (this.getPortalUrl() == null ? other.getPortalUrl() == null : this.getPortalUrl().equals(other.getPortalUrl()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TS_PORTAL
     *
     * @mbggenerated Tue Mar 08 12:54:05 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFunctionCode() == null) ? 0 : getFunctionCode().hashCode());
        result = prime * result + ((getPortalCode() == null) ? 0 : getPortalCode().hashCode());
        result = prime * result + ((getPortalTitle() == null) ? 0 : getPortalTitle().hashCode());
        result = prime * result + ((getPortalHeight() == null) ? 0 : getPortalHeight().hashCode());
        result = prime * result + ((getPortalUrl() == null) ? 0 : getPortalUrl().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }
}