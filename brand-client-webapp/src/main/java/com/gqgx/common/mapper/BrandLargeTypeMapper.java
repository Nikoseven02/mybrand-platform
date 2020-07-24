package com.gqgx.common.mapper;

import com.gqgx.common.entity.BrandLargeType;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface BrandLargeTypeMapper extends Mapper<BrandLargeType> {
    BrandLargeType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrandLargeType brandLargeType);

    int insertSelective(BrandLargeType brandLargeType);

    int deleteByPrimaryKey(BrandLargeType brandLargeType);

    List<BrandLargeType> selectByExample(Example example);
}