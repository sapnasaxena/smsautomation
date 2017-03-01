package com.qa.tests.ui.common;

public class CalendarModal {

	private String setTimeTextBox;
	private String selectTimeList;
	private String duration;
	private String selectDay;
	
	
	public static CalendarModal getCalendarDetails(){
		
		CalendarModal calendarModal = new CalendarModal();
		calendarModal.setSelectTimeList(calendarModal.getSelectTimeList());
		calendarModal.setSelectDay(calendarModal.getSelectDay());
		calendarModal.setDuration(calendarModal.getDuration());
		return calendarModal;
	
	}
	
	public static CalendarModal getDefaultCalendarDetails(String time, String day, String duration)
	{
		CalendarModal calendarModal = getCalendarDetails();
		calendarModal.setSelectTimeList(time);
		calendarModal.setSelectDay(day);
		calendarModal.setDuration(duration);
		return calendarModal;
	}
	
	public String getSetTimeTextBox() {
		return setTimeTextBox;
	}
	public void setSetTimeTextBox(String setTimeTextBox) {
		this.setTimeTextBox = setTimeTextBox;
	}
	public String getSelectTimeList() {
		return selectTimeList;
	}
	public void setSelectTimeList(String selectTimeList) {
		this.selectTimeList = selectTimeList;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getSelectDay() {
		return selectDay;
	}
	public void setSelectDay(String selectDay) {
		this.selectDay = selectDay;
	}
	
	
}
