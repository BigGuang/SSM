package com.waps.model.service;

import com.waps.model.domain.SysUser;
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
public interface SysUserService {

    public int add(SysUser obj);
    public int delete(String id);
    public int update(SysUser obj);

    public SysUser getSysUser(SysUser obj);
    public SysUser getSysUserById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<SysUser> getAll();
    public List<SysUser> find(Map<String, Object> map);
}
