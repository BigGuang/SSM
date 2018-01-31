package com.waps.model.service;

import com.waps.model.domain.SysRole2user;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 金小光
 * @since 2018-01-30
 */
public interface SysRole2userService {

    public int add(SysRole2user obj);
    public int delete(String id);
    public int update(SysRole2user obj);

    public SysRole2user getSysRole2user(SysRole2user obj);
    public SysRole2user getSysRole2userById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<SysRole2user> getAll();
    public List<SysRole2user> find(Map<String, Object> map);
}
