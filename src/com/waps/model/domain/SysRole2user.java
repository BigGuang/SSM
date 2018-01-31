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

public class SysRole2user implements Serializable{

private static final long serialVersionUID=1L;

    private String id; //

    private String userid; //

    private String roleid; //



    public String getId(){
        return id;
    }

    public void setId(String id) {
          this.id = id;
    }

    public String getUserid(){
        return userid;
    }

    public void setUserid(String userid) {
          this.userid = userid;
    }

    public String getRoleid(){
        return roleid;
    }

    public void setRoleid(String roleid) {
          this.roleid = roleid;
    }
}
