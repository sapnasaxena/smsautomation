package com.qa.tests.ui.common;


public class AppointmentModal {
 private String selectPackage;
 private String clinicianPref;
 private String timings;
 private String selectTimings;
 
 
  public static AppointmentModal getDefaultAppointmentDetails(){
		AppointmentModal appointmentModal = new AppointmentModal();
		appointmentModal.setSelectPackage(appointmentModal.getSelectPackage());
		appointmentModal.setClinicianPref(appointmentModal.getClinicianPref());
		appointmentModal.setViewCalendar(appointmentModal.getViewCalendar());
		appointmentModal.setTimings(appointmentModal.getTimings());
		appointmentModal.setDuration(appointmentModal.getDuration());
		appointmentModal.setDayContent(appointmentModal.getDayContent());
		return appointmentModal;
	}
 
 
 public String getSelectTimings() {
	return selectTimings;
}
public void setSelectTimings(String selectTimings) {
	this.selectTimings = selectTimings;
}
public String getTimings() {
	return timings;
}
public void setTimings(String timings) {
	this.timings = timings;
}
private String viewCalendar;
 private String dayContent;
 private String duration;
public String getSelectPackage() {
	return selectPackage;
}
public void setSelectPackage(String selectPackage) {
	this.selectPackage = selectPackage;
}
public String getClinicianPref() {
	return clinicianPref;
}
public void setClinicianPref(String clinicianPref) {
	this.clinicianPref = clinicianPref;
}
public String getViewCalendar() {
	return viewCalendar;
}
public void setViewCalendar(String viewCalendar) {
	this.viewCalendar = viewCalendar;
}
public String getDayContent() {
	return dayContent;
}
public void setDayContent(String dayContent) {
	this.dayContent = dayContent;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}

	

}
