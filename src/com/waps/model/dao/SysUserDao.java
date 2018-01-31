package com.waps.model.dao;

import com.waps.model.domain.SysUser;
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
public interface SysUserDao {

    public int add(SysUser obj);
    public int delete(String id);
    public int update(SysUser obj);

    public SysUser getSysUser(SysUser obj);
    public SysUser getSysUserById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<SysUser> getAll();
    public List<SysUser> find(Map<String, Object> map);

}