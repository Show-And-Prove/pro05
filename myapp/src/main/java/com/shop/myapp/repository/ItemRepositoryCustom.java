package com.shop.myapp.repository;


import com.shop.myapp.dto.ItemSearchDto;
import com.shop.myapp.dto.MainItemDto;
import com.shop.myapp.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    // @QueryProjection 을 이용하여 바로 Dto 객체 반환
    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}
