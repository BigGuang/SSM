package com.waps.model.service;

import com.waps.model.domain.SysRole2module;
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
public interface SysRole2moduleService {

    public int add(SysRole2module obj);
    public int delete(String id);
    public int update(SysRole2module obj);

    public SysRole2module getSysRole2module(SysRole2module obj);
    public SysRole2module getSysRole2moduleById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<SysRole2module> getAll();
    public List<SysRole2module> find(Map<String, Object> map);
}
