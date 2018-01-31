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

public class SysUser implements Serializable{

private static final long serialVersionUID=1L;

    private String id; //

    private String siteid; //

    private String username; //

    private String password; //

    private Integer enable; //

    private String roleid; //

    private String cpid; //

    private Integer authority; //

    private String email; //

    private String nickname; //

    private Date lasttime; //

    private Date createtime; //

    private String memo; //



    public String getId(){
        return id;
    }

    public void setId(String id) {
          this.id = id;
    }

    public String getSiteid(){
        return siteid;
    }

    public void setSiteid(String siteid) {
          this.siteid = siteid;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
          this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
          this.password = password;
    }

    public Integer getEnable(){
        return enable;
    }

    public void setEnable(Integer enable) {
          this.enable = enable;
    }

    public String getRoleid(){
        return roleid;
    }

    public void setRoleid(String roleid) {
          this.roleid = roleid;
    }

    public String getCpid(){
        return cpid;
    }

    public void setCpid(String cpid) {
          this.cpid = cpid;
    }

    public Integer getAuthority(){
        return authority;
    }

    public void setAuthority(Integer authority) {
          this.authority = authority;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
          this.email = email;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname) {
          this.nickname = nickname;
    }

    public Date getLasttime(){
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
          this.lasttime = lasttime;
    }

    public Date getCreatetime(){
        return createtime;
    }

    public void setCreatetime(Date createtime) {
          this.createtime = createtime;
    }

    public String getMemo(){
        return memo;
    }

    public void setMemo(String memo) {
          this.memo = memo;
    }
}
