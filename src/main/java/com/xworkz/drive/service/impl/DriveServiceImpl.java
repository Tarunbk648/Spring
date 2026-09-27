package com.xworkz.drive.service.impl;

import com.xworkz.drive.dto.DriveDto;
import com.xworkz.drive.entity.DriveEntity;
import com.xworkz.drive.repo.DriveRepo;
import com.xworkz.drive.service.DriveService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DriveServiceImpl implements DriveService {
    @Autowired
    DriveRepo driveRepo;

    @Override
    public boolean saveData(DriveDto driveDto) {
        DriveEntity driveEntity= new DriveEntity();
        driveEntity.setDriveId(driveDto.getDriveId());
        driveEntity.setDriveName(driveDto.getDriveName());
        driveEntity.setDriveDate(driveDto.getDriveDate());
        driveEntity.setDriveAddress(driveDto.getDriveAddress());
        return driveRepo.saveData(driveEntity);

    }

    @Override
    public List<DriveDto> getAllAccount() {
        List<DriveEntity> driveEntities= driveRepo.getAllAccount();
        List<DriveDto> dtoList= new ArrayList<>();
        if(driveEntities!=null){
            for(DriveEntity e: driveEntities){
                DriveDto driveDto= new DriveDto();
                BeanUtils.copyProperties(e, driveDto);
                dtoList.add(driveDto);
            }
        }
        return dtoList;
    }

    @Override
    public DriveDto updateById(int id) {
        DriveEntity driveEntity= driveRepo.updateById(id);
        DriveDto driveDto= new DriveDto();
        BeanUtils.copyProperties(driveEntity, driveDto);
        return driveDto;
    }

    @Override
    public boolean setData(DriveDto driveDto) {
        DriveEntity driveEntity= new DriveEntity();
        BeanUtils.copyProperties(driveDto, driveEntity);
        return driveRepo.setData(driveEntity);
    }

    @Override
    public boolean deleteData(int id) {
        return driveRepo.deleteData(id);
    }


}
