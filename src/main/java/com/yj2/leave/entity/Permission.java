package com.yj2.leave.entity;

import java.io.Serializable;
import java.util.Date;

public class Permission implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.role_id
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    private String roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.menu_id
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    private String menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.create_time
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table permission
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.role_id
     *
     * @return the value of permission.role_id
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.role_id
     *
     * @param roleId the value for permission.role_id
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.menu_id
     *
     * @return the value of permission.menu_id
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.menu_id
     *
     * @param menuId the value for permission.menu_id
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.create_time
     *
     * @return the value of permission.create_time
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.create_time
     *
     * @param createTime the value for permission.create_time
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permission
     *
     * @mbg.generated Thu Feb 14 14:20:49 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}