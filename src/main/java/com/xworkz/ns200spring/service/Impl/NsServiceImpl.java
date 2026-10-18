package com.xworkz.ns200spring.service.Impl;

import com.xworkz.ns200spring.dto.NsDto;
import com.xworkz.ns200spring.entity.NsEntity;
import com.xworkz.ns200spring.repo.NsRepo;
import com.xworkz.ns200spring.service.NsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NsServiceImpl implements NsService {
    @Autowired
    NsRepo nsRepo;

    @Override
    public boolean saveData(NsDto nsDto) {
        NsEntity nsEntity = new NsEntity();
        BeanUtils.copyProperties(nsDto, nsEntity);
        return nsRepo.saveData(nsEntity);
    }
}
