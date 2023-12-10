package com.ePallika.sample.thirdpartyapi.model.dto;


import com.ePallika.sample.thirdpartyapi.model.entity.EditingStatus;
import com.ePallika.sample.thirdpartyapi.model.entity.PlinthStatus;
import com.ePallika.sample.thirdpartyapi.model.entity.ProjectStatus1;
import com.ePallika.sample.thirdpartyapi.model.entity.ReportStatus;

import java.util.Date;

public class ProjectPermaDto {

    private long id;

    private String type;
    private String applicantName;
    private Date applicationDate;
    private ProjectStatus1 projectStatus1;
    private String projectStatus2;
    private ReportStatus reportStatus;
    private EditingStatus editingStatus;
    private boolean isRegistration;
    private boolean isTechnical;
    private boolean isExecutive;
    private boolean isWard;
    private boolean isRevenue;
    private boolean isNapi;

    private boolean isWardTechnical;
    private String registrationNo;
    private String rasidNo;
    private boolean isEngineer;
    private boolean isTechnicalDepartment;
    private int count;
    private BuildingPurposeDto buildingPurpose;

    private Date creationDate;

    private long plinthId;
    private PlinthStatus plinthStatus;
    private long superStructureId;
    private long nirmanSampannaId;

    private String manjurinama;
    private Date approveDate;
    private boolean isApplicantDetailsApproved;

    private boolean isNoticePublished;
    private long tempId;

    private String lat;
    private String lon;

    private String chalaniNo;
    private String patraSankhya;

    private String pdfDate;

    private Date noticePublishedAt;

    private String noticeRemarks;

    private String remarks;

    private String muchulka;

    private String napiFile;
    private String technicalDeptFile;

    private String remarksFile;

    private String wardFile;

    public String getTechnicalDeptFile() {
        return technicalDeptFile;
    }

    public void setTechnicalDeptFile(String technicalDeptFile) {
        this.technicalDeptFile = technicalDeptFile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public ProjectStatus1 getProjectStatus1() {
        return projectStatus1;
    }

    public void setProjectStatus1(ProjectStatus1 projectStatus1) {
        this.projectStatus1 = projectStatus1;
    }

    public String getProjectStatus2() {
        return projectStatus2;
    }

    public void setProjectStatus2(String projectStatus2) {
        this.projectStatus2 = projectStatus2;
    }

    public ReportStatus getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(ReportStatus reportStatus) {
        this.reportStatus = reportStatus;
    }

    public EditingStatus getEditingStatus() {
        return editingStatus;
    }

    public void setEditingStatus(EditingStatus editingStatus) {
        this.editingStatus = editingStatus;
    }

    public boolean isRegistration() {
        return isRegistration;
    }

    public void setRegistration(boolean isRegistration) {
        this.isRegistration = isRegistration;
    }

    public boolean isTechnical() {
        return isTechnical;
    }

    public void setTechnical(boolean isTechnical) {
        this.isTechnical = isTechnical;
    }

    public boolean isExecutive() {
        return isExecutive;
    }

    public void setExecutive(boolean isExecutive) {
        this.isExecutive = isExecutive;
    }

    public boolean isWard() {
        return isWard;
    }

    public void setWard(boolean isWard) {
        this.isWard = isWard;
    }

    public boolean isRevenue() {
        return isRevenue;
    }

    public void setRevenue(boolean isRevenue) {
        this.isRevenue = isRevenue;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getRasidNo() {
        return rasidNo;
    }

    public void setRasidNo(String rasidNo) {
        this.rasidNo = rasidNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public long getPlinthId() {
        return plinthId;
    }

    public void setPlinthId(long plinthId) {
        this.plinthId = plinthId;
    }

    public PlinthStatus getPlinthStatus() {
        return plinthStatus;
    }

    public void setPlinthStatus(PlinthStatus plinthStatus) {
        this.plinthStatus = plinthStatus;
    }

    public long getSuperStructureId() {
        return superStructureId;
    }

    public void setSuperStructureId(long superStructureId) {
        this.superStructureId = superStructureId;
    }

    public long getNirmanSampannaId() {
        return nirmanSampannaId;
    }

    public void setNirmanSampannaId(long nirmanSampannaId) {
        this.nirmanSampannaId = nirmanSampannaId;
    }

    public String getManjurinama() {
        return manjurinama;
    }

    public void setManjurinama(String manjurinama) {
        this.manjurinama = manjurinama;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public boolean isApplicantDetailsApproved() {
        return isApplicantDetailsApproved;
    }

    public void setApplicantDetailsApproved(boolean isApplicantDetailsApproved) {
        this.isApplicantDetailsApproved = isApplicantDetailsApproved;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTempId() {
        return tempId;
    }

    public void setTempId(long tempId) {
        this.tempId = tempId;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public boolean isNoticePublished() {
        return isNoticePublished;
    }

    public void setNoticePublished(boolean isNoticePublished) {
        this.isNoticePublished = isNoticePublished;
    }

    public Date getNoticePublishedAt() {
        return noticePublishedAt;
    }

    public void setNoticePublishedAt(Date noticePublishedAt) {
        this.noticePublishedAt = noticePublishedAt;
    }

    public String getNoticeRemarks() {
        return noticeRemarks;
    }

    public void setNoticeRemarks(String noticeRemarks) {
        this.noticeRemarks = noticeRemarks;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getChalaniNo() {
        return chalaniNo;
    }

    public void setChalaniNo(String chalaniNo) {
        this.chalaniNo = chalaniNo;
    }

    public String getPatraSankhya() {
        return patraSankhya;
    }

    public void setPatraSankhya(String patraSankhya) {
        this.patraSankhya = patraSankhya;
    }

    public String getMuchulka() {
        return muchulka;
    }

    public void setMuchulka(String muchulka) {
        this.muchulka = muchulka;
    }

    public String getNapiFile() {
        return napiFile;
    }

    public void setNapiFile(String napiFile) {
        this.napiFile = napiFile;
    }

    public boolean isNapi() {
        return isNapi;
    }

    public void setNapi(boolean isNapi) {
        this.isNapi = isNapi;
    }

    public String getPdfDate() {
        return pdfDate;
    }

    public void setPdfDate(String pdfDate) {
        this.pdfDate = pdfDate;
    }

    public String getRemarksFile() {
        return remarksFile;
    }

    public void setRemarksFile(String remarksFile) {
        this.remarksFile = remarksFile;
    }

    public BuildingPurposeDto getBuildingPurpose() {
        return buildingPurpose;
    }

    public void setBuildingPurpose(BuildingPurposeDto buildingPurpose) {
        this.buildingPurpose = buildingPurpose;
    }

    public boolean isEngineer() {
        return isEngineer;
    }

    public void setEngineer(boolean engineer) {
        isEngineer = engineer;
    }

    public boolean isTechnicalDepartment() {
        return isTechnicalDepartment;
    }

    public void setTechnicalDepartment(boolean technicalDepartment) {
        isTechnicalDepartment = technicalDepartment;
    }

    public String getWardFile() {
        return wardFile;
    }

    public void setWardFile(String wardFile) {
        this.wardFile = wardFile;
    }

    public boolean isWardTechnical() {
        return isWardTechnical;
    }

    public void setWardTechnical(boolean wardTechnical) {
        isWardTechnical = wardTechnical;
    }


}
