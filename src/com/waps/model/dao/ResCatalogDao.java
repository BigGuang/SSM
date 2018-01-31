package com.waps.model.dao;

import com.waps.model.domain.ResCatalog;
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
public interface ResCatalogDao {

    public int add(ResCatalog obj);
    public int delete(String id);
    public int update(ResCatalog obj);

    public ResCatalog getResCatalog(ResCatalog obj);
    public ResCatalog getResCatalogById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<ResCatalog> getAll();
    public List<ResCatalog> find(Map<String, Object> map);

}