package com.vindy.provider.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.vindy.provider.bean.Depart;

import java.util.List;

public interface DepartService extends IService<Depart> {
    boolean saveDepart(Depart depart);
    boolean removeDepartById(int id);
    boolean modifyDepart(Depart depart);
    Depart getDepartById(int id);
    List<Depart> listAllDeparts();
}
