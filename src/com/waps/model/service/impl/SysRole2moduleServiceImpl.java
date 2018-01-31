package

    com.waps.model.service.impl;

import com.waps.model.domain.SysRole2module;
import com.waps.model.dao.SysRole2moduleDao;
import com.waps.model.service.SysRole2moduleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *   服务实现类
 * </p>
 *
 * @author 金小光
 * @since 2018-01-30
 */

@Service(value = "sysRole2moduleService")
public class SysRole2moduleServiceImpl implements SysRole2moduleService {

    private SysRole2moduleDao sysrole2moduledao;

    @Resource
    public void setSysRole2moduleDao(SysRole2moduleDao sysrole2moduledao) {
        this.sysrole2moduledao = sysrole2moduledao;
    }

    @Override
    public int add(SysRole2module obj){
        return sysrole2moduledao.add(obj);
    }

    @Override
    public int delete(String id){
        return sysrole2moduledao.delete(id);
    }

    @Override
    public int update(SysRole2module obj){
        return sysrole2moduledao.update(obj);
    }

    @Override
    public SysRole2module getSysRole2module(SysRole2module obj){
        return sysrole2moduledao.getSysRole2module(obj);
    }

    @Override
    public SysRole2module getSysRole2moduleById(String id){
        return sysrole2moduledao.getSysRole2moduleById(id);
    }

    @Override
    public Long getTotal(Map<String, Object> map){
        return sysrole2moduledao.getTotal(map);
    }

    @Override
    public List<SysRole2module> getAll(){
        return sysrole2moduledao.getAll();
    }

    @Override
    public List<SysRole2module> find(Map<String, Object> map){
        return sysrole2moduledao.find(map);
    }
}
