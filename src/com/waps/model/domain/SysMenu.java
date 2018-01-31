package com.waps.model.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 金小光
 * @since 2018-01-30
 */

public class SysMenu implements Serializable{

private static final long serialVersionUID=1L;

    private String id; //

    private String modulename; //

    private String fatherid; //

    private Integer type; //

    private Integer isleaf; //

    private String href; //

    private String icon; //

    private String description; //

    private Integer ordernum; //

    private String roles; //



    public String getId(){
        return id;
    }

    public void setId(String id) {
          this.id = id;
    }

    public String getModulename(){
        return modulename;
    }

    public void setModulename(String modulename) {
          this.modulename = modulename;
    }

    public String getFatherid(){
        return fatherid;
    }

    public void setFatherid(String fatherid) {
          this.fatherid = fatherid;
    }

    public Integer getType(){
        return type;
    }

    public void setType(Integer type) {
          this.type = type;
    }

    public Integer getIsleaf(){
        return isleaf;
    }

    public void setIsleaf(Integer isleaf) {
          this.isleaf = isleaf;
    }

    public String getHref(){
        return href;
    }

    public void setHref(String href) {
          this.href = href;
    }

    public String getIcon(){
        return icon;
    }

    public void setIcon(String icon) {
          this.icon = icon;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
          this.description = description;
    }

    public Integer getOrdernum(){
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
          this.ordernum = ordernum;
    }

    public String getRoles(){
        return roles;
    }

    public void setRoles(String roles) {
          this.roles = roles;
    }
}
