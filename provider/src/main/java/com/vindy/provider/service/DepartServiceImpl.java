package com.vindy.provider.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vindy.provider.bean.Depart;
import com.vindy.provider.repository.DepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl extends ServiceImpl<DepartRepository, Depart> implements DepartService  {

    @Autowired
    private DepartRepository repository;

    // 插入
    @Override
    public boolean saveDepart(Depart depart) {
        return this.save(depart);
    }

    // 根据id删除
    @Override
    public boolean removeDepartById(int id) {
        repository.deleteById(id);
        return true;
    }

    // 修改
    @Override
    public boolean modifyDepart(Depart depart) {
        return this.updateById(depart);
    }

    // 根据id查询
    @Override
    public Depart getDepartById(int id) {
        Depart departById = this.getDepartById(id);
        if(departById != null) {
            return departById;
        }
        Depart depart = new Depart();
        depart.setName("no this depart");
        return depart;
    }

    // 查询所有
    @Override
    public List<Depart> listAllDeparts() {
        return list();
    }
}
