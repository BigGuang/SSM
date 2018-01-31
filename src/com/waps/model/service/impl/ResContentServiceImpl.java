package

    com.waps.model.service.impl;

import com.waps.model.domain.ResContent;
import com.waps.model.dao.ResContentDao;
import com.waps.model.service.ResContentService;
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

@Service(value = "resContentService")
public class ResContentServiceImpl implements ResContentService {

    private ResContentDao rescontentdao;

    @Resource
    public void setResContentDao(ResContentDao rescontentdao) {
        this.rescontentdao = rescontentdao;
    }

    @Override
    public int add(ResContent obj){
        return rescontentdao.add(obj);
    }

    @Override
    public int delete(String id){
        return rescontentdao.delete(id);
    }

    @Override
    public int update(ResContent obj){
        return rescontentdao.update(obj);
    }

    @Override
    public ResContent getResContent(ResContent obj){
        return rescontentdao.getResContent(obj);
    }

    @Override
    public ResContent getResContentById(String id){
        return rescontentdao.getResContentById(id);
    }

    @Override
    public Long getTotal(Map<String, Object> map){
        return rescontentdao.getTotal(map);
    }

    @Override
    public List<ResContent> getAll(){
        return rescontentdao.getAll();
    }

    @Override
    public List<ResContent> find(Map<String, Object> map){
        return rescontentdao.find(map);
    }
}
