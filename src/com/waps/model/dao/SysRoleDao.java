package com.waps.model.dao;

import com.waps.model.domain.SysRole;
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
public interface SysRoleDao {

    public int add(SysRole obj);
    public int delete(String id);
    public int update(SysRole obj);

    public SysRole getSysRole(SysRole obj);
    public SysRole getSysRoleById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<SysRole> getAll();
    public List<SysRole> find(Map<String, Object> map);

}