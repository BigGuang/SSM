package com.waps.model.dao;

import com.waps.model.domain.ResContent;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author 金小光
 * @since 2018-01-30
 */
public interface ResContentDao {

    public int add(ResContent obj);
    public int delete(String id);
    public int update(ResContent obj);

    public ResContent getResContent(ResContent obj);
    public ResContent getResContentById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<ResContent> getAll();
    public List<ResContent> find(Map<String, Object> map);

}