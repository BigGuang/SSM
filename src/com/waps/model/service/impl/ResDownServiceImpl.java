package

    com.waps.model.service.impl;

import com.waps.model.domain.ResDown;
import com.waps.model.dao.ResDownDao;
import com.waps.model.service.ResDownService;
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

@Service(value = "resDownService")
public class ResDownServiceImpl implements ResDownService {

    private ResDownDao resdowndao;

    @Resource
    public void setResDownDao(ResDownDao resdowndao) {
        this.resdowndao = resdowndao;
    }

    @Override
    public int add(ResDown obj){
        return resdowndao.add(obj);
    }

    @Override
    public int delete(String id){
        return resdowndao.delete(id);
    }

    @Override
    public int update(ResDown obj){
        return resdowndao.update(obj);
    }

    @Override
    public ResDown getResDown(ResDown obj){
        return resdowndao.getResDown(obj);
    }

    @Override
    public ResDown getResDownById(String id){
        return resdowndao.getResDownById(id);
    }

    @Override
    public Long getTotal(Map<String, Object> map){
        return resdowndao.getTotal(map);
    }

    @Override
    public List<ResDown> getAll(){
        return resdowndao.getAll();
    }

    @Override
    public List<ResDown> find(Map<String, Object> map){
        return resdowndao.find(map);
    }
}
