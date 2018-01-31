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

public class SysRole2module implements Serializable{

private static final long serialVersionUID=1L;

    private String id; //

    private String roleid; //

    private String moduleid; //



    public String getId(){
        return id;
    }

    public void setId(String id) {
          this.id = id;
    }

    public String getRoleid(){
        return roleid;
    }

    public void setRoleid(String roleid) {
          this.roleid = roleid;
    }

    public String getModuleid(){
        return moduleid;
    }

    public void setModuleid(String moduleid) {
          this.moduleid = moduleid;
    }
}
