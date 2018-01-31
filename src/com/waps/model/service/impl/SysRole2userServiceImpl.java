package

    com.waps.model.service.impl;

import com.waps.model.domain.SysRole2user;
import com.waps.model.dao.SysRole2userDao;
import com.waps.model.service.SysRole2userService;
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

@Service(value = "sysRole2userService")
public class SysRole2userServiceImpl implements SysRole2userService {

    private SysRole2userDao sysrole2userdao;

    @Resource
    public void setSysRole2userDao(SysRole2userDao sysrole2userdao) {
        this.sysrole2userdao = sysrole2userdao;
    }

    @Override
    public int add(SysRole2user obj){
        return sysrole2userdao.add(obj);
    }

    @Override
    public int delete(String id){
        return sysrole2userdao.delete(id);
    }

    @Override
    public int update(SysRole2user obj){
        return sysrole2userdao.update(obj);
    }

    @Override
    public SysRole2user getSysRole2user(SysRole2user obj){
        return sysrole2userdao.getSysRole2user(obj);
    }

    @Override
    public SysRole2user getSysRole2userById(String id){
        return sysrole2userdao.getSysRole2userById(id);
    }

    @Override
    public Long getTotal(Map<String, Object> map){
        return sysrole2userdao.getTotal(map);
    }

    @Override
    public List<SysRole2user> getAll(){
        return sysrole2userdao.getAll();
    }

    @Override
    public List<SysRole2user> find(Map<String, Object> map){
        return sysrole2userdao.find(map);
    }
}
