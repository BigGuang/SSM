package com.waps.model.service;

import com.waps.model.domain.ResFile;
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
public interface ResFileService {

    public int add(ResFile obj);
    public int delete(String id);
    public int update(ResFile obj);

    public ResFile getResFile(ResFile obj);
    public ResFile getResFileById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<ResFile> getAll();
    public List<ResFile> find(Map<String, Object> map);
}
