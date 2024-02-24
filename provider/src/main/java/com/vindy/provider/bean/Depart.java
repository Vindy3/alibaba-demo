package com.vindy.provider.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@TableName(value ="depart")
@Data
public class Depart {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;


    private String name;

}


