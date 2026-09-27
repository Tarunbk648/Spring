package com.xworkz.drive.service;

import com.xworkz.drive.dto.DriveDto;

import java.util.List;

public interface DriveService {
    boolean saveData(DriveDto driveDto);
    List<DriveDto> getAllAccount();
    DriveDto updateById(int id);
    boolean setData(DriveDto driveDto);
    boolean deleteData(int id);
}
