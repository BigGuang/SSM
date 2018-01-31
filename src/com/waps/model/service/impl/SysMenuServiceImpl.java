package

    com.waps.model.service.impl;

import com.waps.model.domain.SysMenu;
import com.waps.model.dao.SysMenuDao;
import com.waps.model.service.SysMenuService;
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

@Service(value = "sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {

    private SysMenuDao sysmenudao;

    @Resource
    public void setSysMenuDao(SysMenuDao sysmenudao) {
        this.sysmenudao = sysmenudao;
    }

    @Override
    public int add(SysMenu obj){
        return sysmenudao.add(obj);
    }

    @Override
    public int delete(String id){
        return sysmenudao.delete(id);
    }

    @Override
    public int update(SysMenu obj){
        return sysmenudao.update(obj);
    }

    @Override
    public SysMenu getSysMenu(SysMenu obj){
        return sysmenudao.getSysMenu(obj);
    }

    @Override
    public SysMenu getSysMenuById(String id){
        return sysmenudao.getSysMenuById(id);
    }

    @Override
    public Long getTotal(Map<String, Object> map){
        return sysmenudao.getTotal(map);
    }

    @Override
    public List<SysMenu> getAll(){
        return sysmenudao.getAll();
    }

    @Override
    public List<SysMenu> find(Map<String, Object> map){
        return sysmenudao.find(map);
    }
}
