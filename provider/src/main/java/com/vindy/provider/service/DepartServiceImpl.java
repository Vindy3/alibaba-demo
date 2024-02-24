package com.vindy.provider.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vindy.provider.bean.Depart;
import com.vindy.provider.repository.DepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @RefreshScope 动态刷新配置。
 */
@Service
@RefreshScope
public class DepartServiceImpl extends ServiceImpl<DepartRepository, Depart> implements DepartService  {

    @Autowired
    private DepartRepository repository;

    @Value("${depart.name}")
    private String name;

    // 插入
    @Override
    public boolean saveDepart(Depart depart) {
        return this.save(depart);
    }

    // 根据id删除
    @Override
    public boolean removeDepartById(String id) {
        repository.deleteById(id);
        return true;
    }

    // 修改
    @Override
    public boolean modifyDepart(Depart depart) {
        return updateById(depart);
    }

    // 根据id查询
    @Override
    public Depart getDepartById(String id) {
        Depart departById = getById(id);
        if(departById != null) {
            return departById;
        }
        Depart depart = new Depart();
        depart.setName("no this depart"+name);
        return depart;
    }

    // 查询所有
    @Override
    public List<Depart> listAllDeparts() {
        return list();
    }
}
