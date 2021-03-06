package com.qa.feedbackformscohorts.persistence.domain;

public class SentCohort {

	private Long cohortID;
	private String cohortName;
	private String trainerName;
	private int week;
	private String cohortDescription;

	public SentCohort() {

	}

	public SentCohort(Cohort cohort) {
		this.cohortID = cohort.getCohortID();
		this.cohortName = cohort.getCohortName();
		this.trainerName = cohort.getTrainerName();
		this.week = cohort.getWeek();
		this.cohortDescription = cohort.getCohortDescription();
	}

	public Long getCohortID() {
		return cohortID;
	}

	public void setCohortID(Long cohortID) {
		this.cohortID = cohortID;
	}

	public String getCohortName() {
		return cohortName;
	}

	public void setCohortName(String cohortName) {
		this.cohortName = cohortName;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public String getCohortDescription() {
		return cohortDescription;
	}

	public void setCohortDescription(String cohortDescription) {
		this.cohortDescription = cohortDescription;
	}

}