package com.xworkz.drive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="drive_info")
@NamedQueries({
        @NamedQuery(name = "getAll", query = "Select d from DriveEntity d"),
        @NamedQuery(name = "delete", query = "delete from DriveEntity d where d.driveId = :id")
})
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DriveEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="drive_Id")
    private int driveId;

    @Column(name="drive_Name")
    private String driveName;

    @Column(name="drive_Date")
    private String driveDate;

    @Column(name="drive_Address")
    private String driveAddress;
}
