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

public class ResContent implements Serializable{

private static final long serialVersionUID=1L;

    private String id; //

    private String oldId; //

    private String docId; //

    private String publisher; //

    private String classid; //

    private String catalogid; //

    private String type; //

    private String title; //

    private String content; //

    private String files; //

    private String keywords; //

    private String author; //

    private Integer totalsize; //

    private Date createTime; //

    private Date modifyTime; //

    private Integer ordernum; //

    private Integer visible; //

    private String memo; //

    private Integer status; //

    private String extend; //



    public String getId(){
        return id;
    }

    public void setId(String id) {
          this.id = id;
    }

    public String getOldId(){
        return oldId;
    }

    public void setOldId(String oldId) {
          this.oldId = oldId;
    }

    public String getDocId(){
        return docId;
    }

    public void setDocId(String docId) {
          this.docId = docId;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisher) {
          this.publisher = publisher;
    }

    public String getClassid(){
        return classid;
    }

    public void setClassid(String classid) {
          this.classid = classid;
    }

    public String getCatalogid(){
        return catalogid;
    }

    public void setCatalogid(String catalogid) {
          this.catalogid = catalogid;
    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
          this.type = type;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
          this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content) {
          this.content = content;
    }

    public String getFiles(){
        return files;
    }

    public void setFiles(String files) {
          this.files = files;
    }

    public String getKeywords(){
        return keywords;
    }

    public void setKeywords(String keywords) {
          this.keywords = keywords;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
          this.author = author;
    }

    public Integer getTotalsize(){
        return totalsize;
    }

    public void setTotalsize(Integer totalsize) {
          this.totalsize = totalsize;
    }

    public Date getCreateTime(){
        return createTime;
    }

    public void setCreateTime(Date createTime) {
          this.createTime = createTime;
    }

    public Date getModifyTime(){
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
          this.modifyTime = modifyTime;
    }

    public Integer getOrdernum(){
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
          this.ordernum = ordernum;
    }

    public Integer getVisible(){
        return visible;
    }

    public void setVisible(Integer visible) {
          this.visible = visible;
    }

    public String getMemo(){
        return memo;
    }

    public void setMemo(String memo) {
          this.memo = memo;
    }

    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status) {
          this.status = status;
    }

    public String getExtend(){
        return extend;
    }

    public void setExtend(String extend) {
          this.extend = extend;
    }
}
