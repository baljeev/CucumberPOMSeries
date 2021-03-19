package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class AccountsPageSteps {
	
private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
private AccountsPage accountPage;

@Given("user has already logged in to application")
public void user_has_already_logged_in_to_application(DataTable crdTable) {
   List<Map<String,String>>  crdList = crdTable.asMaps();
  String userName = crdList.get(0).get("Username");
   String passWord = crdList.get(0).get("Password");
   
   DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
   accountPage = loginpage.doLogin(userName, passWord);
   
}

@Given("user is on Accounts page")
public void user_is_on_accounts_page() {
	String title = accountPage.getAccountPageTitle();
	System.out.println("This is my Account Page Title : " + title);
   
}

@When("user gets account section")
public void user_gets_account_section(DataTable sectionList) {
	List<String> expectedsectionList = sectionList.asList();
	System.out.println("This is my Expected Section List : " + expectedsectionList );
	
   List<String> actualsectionList = accountPage.getAccountsSectionList();
   System.out.println("This is my Actual Section List : " + actualsectionList);
}

@When("accounts section count should be {int}")
public void accounts_section_count_should_be(Integer expectedsectionCount) {
  int  actualsectionCount = accountPage.getAccountsSectionCount();    
 Assert.assertEquals(expectedsectionCount,expectedsectionCount );
}
}
