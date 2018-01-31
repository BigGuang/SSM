package

    com.waps.model.service.impl;

import com.waps.model.domain.ResCatalog;
import com.waps.model.dao.ResCatalogDao;
import com.waps.model.service.ResCatalogService;
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

@Service(value = "resCatalogService")
public class ResCatalogServiceImpl implements ResCatalogService {

    private ResCatalogDao rescatalogdao;

    @Resource
    public void setResCatalogDao(ResCatalogDao rescatalogdao) {
        this.rescatalogdao = rescatalogdao;
    }

    @Override
    public int add(ResCatalog obj){
        return rescatalogdao.add(obj);
    }

    @Override
    public int delete(String id){
        return rescatalogdao.delete(id);
    }

    @Override
    public int update(ResCatalog obj){
        return rescatalogdao.update(obj);
    }

    @Override
    public ResCatalog getResCatalog(ResCatalog obj){
        return rescatalogdao.getResCatalog(obj);
    }

    @Override
    public ResCatalog getResCatalogById(String id){
        return rescatalogdao.getResCatalogById(id);
    }

    @Override
    public Long getTotal(Map<String, Object> map){
        return rescatalogdao.getTotal(map);
    }

    @Override
    public List<ResCatalog> getAll(){
        return rescatalogdao.getAll();
    }

    @Override
    public List<ResCatalog> find(Map<String, Object> map){
        return rescatalogdao.find(map);
    }
}
