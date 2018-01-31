package com.waps.model.dao;

import com.waps.model.domain.SysRole2user;
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
public interface SysRole2userDao {

    public int add(SysRole2user obj);
    public int delete(String id);
    public int update(SysRole2user obj);

    public SysRole2user getSysRole2user(SysRole2user obj);
    public SysRole2user getSysRole2userById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<SysRole2user> getAll();
    public List<SysRole2user> find(Map<String, Object> map);

}