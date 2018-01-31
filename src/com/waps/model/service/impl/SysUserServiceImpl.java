package

    com.waps.model.service.impl;

import com.waps.model.dao.SysUserDao;
import com.waps.model.domain.SysUser;
import com.waps.model.service.SysUserService;
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

@Service(value = "sysUserService")
public class SysUserServiceImpl implements SysUserService {

    private SysUserDao sysuserdao;

    @Resource
    public void setSysUserDao(SysUserDao sysuserdao) {
        this.sysuserdao = sysuserdao;
    }

    @Override
    public int add(SysUser obj){
        return sysuserdao.add(obj);
    }

    @Override
    public int delete(String id){
        return sysuserdao.delete(id);
    }

    @Override
    public int update(SysUser obj){
        return sysuserdao.update(obj);
    }

    @Override
    public SysUser getSysUser(SysUser obj){
        return sysuserdao.getSysUser(obj);
    }

    @Override
    public SysUser getSysUserById(String id){
        return sysuserdao.getSysUserById(id);
    }

    @Override
    public Long getTotal(Map<String, Object> map){
        return sysuserdao.getTotal(map);
    }

    @Override
    public List<SysUser> getAll(){
        return sysuserdao.getAll();
    }

    @Override
    public List<SysUser> find(Map<String, Object> map){
        return sysuserdao.find(map);
    }
}
