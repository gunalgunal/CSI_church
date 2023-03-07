package com.church.Church_CSI.backend.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(unique=true)
    private long uniqueIdForMember;

    private String name;

    private int age;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date dob;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date marriedDate;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date nyanasthanamDate;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date thidapaduthalDate;

    private String occupation;

    private String qualification;

    private String aadharNo;

    private String note;

    private String address;

    private String mobileNo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUniqueIdForMember() {
        return uniqueIdForMember;
    }

    public void setUniqueIdForMember(long uniqueIdForMember) {
        this.uniqueIdForMember = uniqueIdForMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getMarriedDate() {
        return marriedDate;
    }

    public void setMarriedDate(Date marriedDate) {
        this.marriedDate = marriedDate;
    }

    public Date getNyanasthanamDate() {
        return nyanasthanamDate;
    }

    public void setNyanasthanamDate(Date nyanasthanamDate) {
        this.nyanasthanamDate = nyanasthanamDate;
    }

    public Date getThidapaduthalDate() {
        return thidapaduthalDate;
    }

    public void setThidapaduthalDate(Date thidapaduthalDate) {
        this.thidapaduthalDate = thidapaduthalDate;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
