package stepsDefinition;

import PageObjects.confirmationPage;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;


public class MemberWithTwoChildrenAbove18AndAreStudents {

    @Steps
    confirmationPage confirmationPage;


    @Then("policy number should be generated with children added")
    public void policy_number_should_be_generated_due_to_age_of_children() throws InterruptedException {
        confirmationPage.viewPremium();
        confirmationPage.ViewWhoIsCovered();
        confirmationPage.ViewBenefits();
        confirmationPage.AnnualIncrease();
        confirmationPage.clickTermsAndConditions();
        confirmationPage.ClickConfirmBtn();
        Thread.sleep(5000);
        confirmationPage.ViewThankYouMessage();
        confirmationPage.finalPremiumMnth();
        confirmationPage.PolicyNumber();


    }
}
