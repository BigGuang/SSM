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

public class SysRole implements Serializable{

private static final long serialVersionUID=1L;

    private String id; //

    private String rolename; //

    private Integer type; //

    private String description; //

    private String createtime; //



    public String getId(){
        return id;
    }

    public void setId(String id) {
          this.id = id;
    }

    public String getRolename(){
        return rolename;
    }

    public void setRolename(String rolename) {
          this.rolename = rolename;
    }

    public Integer getType(){
        return type;
    }

    public void setType(Integer type) {
          this.type = type;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
          this.description = description;
    }

    public String getCreatetime(){
        return createtime;
    }

    public void setCreatetime(String createtime) {
          this.createtime = createtime;
    }
}
