package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LibraryLoginPage;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDefinitions {
    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("http://library2.cybertekschool.com/");
    }

    @When("user enters librarian credentials")
    public void user_enters_librarian_credentials() {
        libraryLoginPage.emailBox.sendKeys("librarian13@library");
        libraryLoginPage.passwordBox.sendKeys("9rf6axdD"+ Keys.ENTER);
    }

    @Then("home page should be shown")
    public void home_page_should_be_shown() {
        String expectedTitle = "Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("titles do not match",expectedTitle, actualTitle);
    }

    @When("user enter student credentials")
    public void user_enter_student_credentials() {
        libraryLoginPage.emailBox.sendKeys("student12@library");
        libraryLoginPage.passwordBox.sendKeys("UC0LC9Hj"+ Keys.ENTER);
    }

    @When("user enters librarian username {string}")
    public void user_enters_librarian_username(String string) {
        libraryLoginPage.emailBox.sendKeys(string);
    }

    @When("user enters librarian password {string}")
    public void user_enters_librarian_password(String string) {
        libraryLoginPage.passwordBox.sendKeys(string+Keys.ENTER);
    }

    @When("user enters student username {string}")
    public void user_enters_student_username(String string) {
        libraryLoginPage.emailBox.sendKeys(string);
    }

    @When("user enters student password {string}")
    public void user_enters_student_password(String string) {
        libraryLoginPage.emailBox.sendKeys(string);
    }

}
