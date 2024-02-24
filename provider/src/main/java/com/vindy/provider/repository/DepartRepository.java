package com.vindy.provider.repository;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vindy.provider.bean.Depart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartRepository extends BaseMapper<Depart> {
}
