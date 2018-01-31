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

public class ResFile implements Serializable{

private static final long serialVersionUID=1L;

    private String id; //

    private String resId; //

    private String resName; //

    private String filePath; //

    private Date modifytime; //



    public String getId(){
        return id;
    }

    public void setId(String id) {
          this.id = id;
    }

    public String getResId(){
        return resId;
    }

    public void setResId(String resId) {
          this.resId = resId;
    }

    public String getResName(){
        return resName;
    }

    public void setResName(String resName) {
          this.resName = resName;
    }

    public String getFilePath(){
        return filePath;
    }

    public void setFilePath(String filePath) {
          this.filePath = filePath;
    }

    public Date getModifytime(){
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
          this.modifytime = modifytime;
    }
}
