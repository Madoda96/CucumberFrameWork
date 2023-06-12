package stepsDefinition;


import PageObjects.HomePage;
import PageObjects.MemberPage;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class funeralDignityPlan {


    @Steps
    MemberPage memberPage;
    @Steps
    HomePage homePage;
   // @Steps
    //AdditionalMembers additionalMembers;

    @Given("User is on the dignity plan page")
    public void user_is_on_the_dignity_plan_page() {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
        memberPage.EnterEmail("Test@gmail.com");
        homePage.clickContinueBtn();


    }
    @When("User completes the required  Member details .")
    public void user_completes_the_required_member_details() {
        memberPage.SelectTitle("Mr");
        memberPage.EnterName("Thomas");
        memberPage.Entersurname("Peters");
        memberPage.enterMobileNum("0854122350");
        memberPage.enterPostalAddress("1196 elves street");
        memberPage.EnterPostalCode("1205");
        memberPage.selectIncome("15,000 - 18,000");
        memberPage.selectOccupation("Skilled agriculture");
        memberPage.selectEducation("Post-graduate (Honours, Masters etc)");
        memberPage.acceptFICAdecl("Yes");
        memberPage.acceptFicaDeclaration2("Yes");
        memberPage.clickContinueBtn();

    }
//    @When("User adds two additional members, a spouse and child to the policy")
//    public void user_adds_two_additional_members_a_spouse_and_child_to_the_policy() {
//           additionalMembers.addSpouse();
//           additionalMembers.selectTitle("Dr");
//           additionalMembers.enterSpouseName("David");
//           additionalMembers.EnterChildSurname("Clemont");
//           additionalMembers.selectSpouseGender("Male");
//           additionalMembers.enterSpouseDateOfBirth("1989","Oct","20");

//           // add implementation to add ID number
//
//           additionalMembers.saveSpousedtls();
//
//           // adding child
//           additionalMembers.addChildrencheckBox();
//           additionalMembers.EnterChildName("Ismael");
//           additionalMembers.EnterChildSurname("Nkosi");
//           additionalMembers.selectChildGender("Male");
//           additionalMembers.IsChildStudentOrNot("Yes");
//           additionalMembers.childDateOfBirth("1996","Dec","18");
//
//           //add implementation for ID Number
//
//           additionalMembers.saveSpousedtls();



    @When("User adds two beneficiaries for the policy by allocating percentage")
    public void user_adds_two_beneficiaries_for_the_policy_by_allocating_percentage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User completes the Payer details by completing required information")
    public void user_completes_the_payer_details_by_completing_required_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user confirms the captured information on policy confirmation page")
    public void user_confirms_the_captured_information_on_policy_confirmation_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user accepts the terms and condition")
    public void user_accepts_the_terms_and_condition() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be able to see the policy number, correct monthly premium")
    public void user_should_be_able_to_see_the_policy_number_correct_monthly_premium() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





}
