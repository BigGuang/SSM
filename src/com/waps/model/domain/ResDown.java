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

public class ResDown implements Serializable{

private static final long serialVersionUID=1L;

    private String Id; //

    private String resId; //

    private String title; //

    private String url; //

    private String size; //

    private Date createtime; //



    public String getId(){
        return Id;
    }

    public void setId(String Id) {
          this.Id = Id;
    }

    public String getResId(){
        return resId;
    }

    public void setResId(String resId) {
          this.resId = resId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
          this.title = title;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url) {
          this.url = url;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size) {
          this.size = size;
    }

    public Date getCreatetime(){
        return createtime;
    }

    public void setCreatetime(Date createtime) {
          this.createtime = createtime;
    }
}
