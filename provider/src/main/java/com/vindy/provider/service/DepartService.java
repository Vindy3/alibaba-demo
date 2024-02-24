package com.vindy.provider.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.vindy.provider.bean.Depart;

import java.util.List;

public interface DepartService extends IService<Depart> {
    boolean saveDepart(Depart depart);
    boolean removeDepartById(String id);
    boolean modifyDepart(Depart depart);
    Depart getDepartById(String id);
    List<Depart> listAllDeparts();
}
