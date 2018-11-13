package com.uking.mbpro.dao;

import com.uking.mbpro.bean.Token;

public interface TokenMapper {
    int insert(Token record);

    int insertSelective(Token record);
}