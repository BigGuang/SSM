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

public class ResCatalog implements Serializable{

private static final long serialVersionUID=1L;

    private String id; //

    private String classid; //分类ID

    private String fatherid; //父级ID

    private String name; //目录名称

    private String owner; //所有者

    private Integer shareable; //是否可分享

    private Integer orderNum; //序号

    private String memo; //注释

    private String extend; //扩展



    public String getId(){
        return id;
    }

    public void setId(String id) {
          this.id = id;
    }

    public String getClassid(){
        return classid;
    }

    public void setClassid(String classid) {
          this.classid = classid;
    }

    public String getFatherid(){
        return fatherid;
    }

    public void setFatherid(String fatherid) {
          this.fatherid = fatherid;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
          this.name = name;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner) {
          this.owner = owner;
    }

    public Integer getShareable(){
        return shareable;
    }

    public void setShareable(Integer shareable) {
          this.shareable = shareable;
    }

    public Integer getOrderNum(){
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
          this.orderNum = orderNum;
    }

    public String getMemo(){
        return memo;
    }

    public void setMemo(String memo) {
          this.memo = memo;
    }

    public String getExtend(){
        return extend;
    }

    public void setExtend(String extend) {
          this.extend = extend;
    }
}
