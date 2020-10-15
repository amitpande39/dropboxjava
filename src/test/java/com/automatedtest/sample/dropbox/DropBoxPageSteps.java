package com.automatedtest.sample.dropbox;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DropBoxPageSteps {

    private DropBox dropbox;

    public DropBoxPageSteps() {
        this.dropbox = new DropBox();
    }

    @Given("^I navigate to dropbox login page$")
    public void i_navigate_to_dropbox_login_page() throws Throwable {
        this.dropbox.goToLoginPage();
    }

    @When("^I enter email address in email field with \"([^\"]*)\" and password with \"([^\"]*)\"$")
    public void enterCredential(String email, String password) throws Throwable {
        this.dropbox.enterCredentialAndLogin(email, password);
    }
//
//    @Then("^I upload multiple documents to test folder successfully$")
//    public void i_upload_multiple_documents_to_test_folder_successfully() throws Throwable {
//        throw new PendingException();
//    }
//
//    @And("^I have logged in to my dropbox account successfully$")
//    public void i_have_logged_in_to_my_dropbox_account_successfully() throws Throwable {
//        throw new PendingException();
//    }
//
//    @And("^I create a new \"([^\"]*)\" folder$")
//    public void i_create_a_new_something_folder(String strArg1) throws Throwable {
//        throw new PendingException();
//    }

}
