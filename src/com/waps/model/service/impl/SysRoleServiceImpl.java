package

    com.waps.model.service.impl;

import com.waps.model.domain.SysRole;
import com.waps.model.dao.SysRoleDao;
import com.waps.model.service.SysRoleService;
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

@Service(value = "sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

    private SysRoleDao sysroledao;

    @Resource
    public void setSysRoleDao(SysRoleDao sysroledao) {
        this.sysroledao = sysroledao;
    }

    @Override
    public int add(SysRole obj){
        return sysroledao.add(obj);
    }

    @Override
    public int delete(String id){
        return sysroledao.delete(id);
    }

    @Override
    public int update(SysRole obj){
        return sysroledao.update(obj);
    }

    @Override
    public SysRole getSysRole(SysRole obj){
        return sysroledao.getSysRole(obj);
    }

    @Override
    public SysRole getSysRoleById(String id){
        return sysroledao.getSysRoleById(id);
    }

    @Override
    public Long getTotal(Map<String, Object> map){
        return sysroledao.getTotal(map);
    }

    @Override
    public List<SysRole> getAll(){
        return sysroledao.getAll();
    }

    @Override
    public List<SysRole> find(Map<String, Object> map){
        return sysroledao.find(map);
    }
}
