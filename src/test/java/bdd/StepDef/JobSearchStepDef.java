package bdd.StepDef;

import bdd.PageAction.LabCorpPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class JobSearchStepDef {

	LabCorpPageActions LabCorpPageActionsobj= new LabCorpPageActions();

	@Given("^Browse to labcorp home page$")
	public void browse_to_labcorp_home_page() throws Throwable {
		LabCorpPageActionsobj.loadLabCorpHomePage();
	}

	@When("^Click on the careers link$")
	public void click_on_the_careers_link() throws Throwable {
		LabCorpPageActionsobj.applyJob();

	}

	@When("^Scroll to IT Job link$")
	public void scroll_to_IT_Job_link() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@When("^Click on the IT Job link$")
	public void click_on_the_IT_Job_link() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@When("^Click on the job title$")
	public void click_on_the_job_title() throws Throwable {
		LabCorpPageActionsobj.applyJob();

	}

	@When("^validate the job title$")
	public void validate_the_job_title() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@When("^Validate the Current URL$")
	public void validate_the_Current_URL() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@When("^Validate the Job location$")
	public void validate_the_Job_location() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@When("^Validate the job ID$")
	public void validate_the_job_ID() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@When("^Validate the Sentence from paragraph$")
	public void validate_the_Sentence_from_paragraph() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@When("^Validate the Bullete point$")
	public void validate_the_Bullete_point() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@When("^Validate the job requirment$")
	public void validate_the_job_requirment() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@When("^Validate the experience$")
	public void validate_the_experience() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}
	
	@When("^Click on the Apply Now button$")
	public void click_on_the_Apply_Now_button() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}

	@Then("^Click on the career home to return$")
	public void click_on_the_career_home_to_return() throws Throwable {
		LabCorpPageActionsobj.applyJob();
	}


}
