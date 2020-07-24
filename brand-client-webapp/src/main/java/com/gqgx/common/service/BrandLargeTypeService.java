package com.gqgx.common.service;

import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;

import java.util.List;

/**
 * Created by 15845 on 2020/7/24.
 */
public interface BrandLargeTypeService {
    BrandLargeType getBrandLargeType(Long id);

    int saveBrandLargeType(BrandLargeType brandLargeType);

    int deleteBrandLargeType(BrandLargeType brandLargeType);

    int deleteBrandLargeTypeByIds(Long[] ids);

    PagingResult<BrandLargeType> findBrandLargeType(BrandLargeType brandLargeType, LayuiPage page);

    List<BrandLargeType> findBrandLargeTypeList(BrandLargeType type);
}
