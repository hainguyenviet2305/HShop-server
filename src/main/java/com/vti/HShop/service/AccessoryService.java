package com.vti.HShop.service;

import com.vti.HShop.dto.AccessoryDto;
import com.vti.HShop.form.AccessoryCreateForm;
import com.vti.HShop.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);
    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(Long id, AccessoryUpdateForm form);

    void deleteById(Long id);
}
