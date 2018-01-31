package com.waps.model.service;

import com.waps.model.domain.ResCatalog;
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
public interface ResCatalogService {

    public int add(ResCatalog obj);
    public int delete(String id);
    public int update(ResCatalog obj);

    public ResCatalog getResCatalog(ResCatalog obj);
    public ResCatalog getResCatalogById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<ResCatalog> getAll();
    public List<ResCatalog> find(Map<String, Object> map);
}
