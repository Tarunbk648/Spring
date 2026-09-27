package com.xworkz.drive.repo;

import com.xworkz.drive.entity.DriveEntity;

import java.util.List;

public interface DriveRepo {
    boolean saveData(DriveEntity driveEntity);
    List<DriveEntity> getAllAccount();
    DriveEntity updateById(int id);
    boolean setData(DriveEntity driveEntity);
    boolean deleteData(int id);
}
