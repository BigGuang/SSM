package com.waps.model.service;

import com.waps.model.domain.SysMenu;
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
public interface SysMenuService {

    public int add(SysMenu obj);
    public int delete(String id);
    public int update(SysMenu obj);

    public SysMenu getSysMenu(SysMenu obj);
    public SysMenu getSysMenuById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<SysMenu> getAll();
    public List<SysMenu> find(Map<String, Object> map);
}
