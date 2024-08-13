package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage extends StartupPage {
	//please write all the locators for facebook page only 

	By loginButton = By.xpath(""); 
	By emailAddsPhoneNumberTextbox = By.xpath(""); 
	By passwordTextbox = By.xpath(""); 
	By profileIconImage = By.xpath(""); 
	By logoutButton = By.xpath(""); 
	By forgettenPasswordLink = By.xpath(""); 
	By createNewAccountLink = By.xpath(""); 
	By emailTextField = By.id(""); 
	By errorMessageWithoutCredential = By.xpath(""); 
	By errorMessageWithoutCredentialForgetPassword = By.xpath(""); 
	By withoutPasswordErrorMessage = By.xpath("");

	By createNewAccount = By.xpath(""); 
	By signUpButton = By.xpath(""); 
	By nameFieldErorMessage = By.xpath(""); 
	By firstNameTextField = By.xpath(""); 
	By surNameTextField = By.xpath(""); 
	By mobileNumberAndPassword = By.xpath(""); 
	By newPassword = By.xpath(""); 
	By selectDateFromDateDropdown = By.xpath(""); 
	By selectBirthdayMonth = By.xpath("");
	By selectBirthDayYear = By.xpath("");
	By customRadioButton = By.xpath("");
	By selectYourPronounDropdown = By.xpath("");
	By genderOptionalTextBox = By.xpath("");
	By selectFemaleRadioButton = By.xpath("");
	By selectMaleRadioButton = By.xpath("");
	By closeSignupPageImage = By.xpath("");
	By profile = By.xpath(""); 
	By profileName = By.xpath(""); 
	By updateProfilePicture = By.xpath(""); 
	By uploadPhoto = By.xpath(""); 
	By saveButton = By.xpath(""); 
	By editProfileButton=By.xpath("");
	By addButtonInsideBioSection=By.xpath("");
	By describeWhoAreYouTextField=By.xpath("");
	By saveButtonPresentInsideTheBioSection=By.xpath("");
	By xButton=By.xpath("");
	By addBioButton=By.xpath("");
	By aboutSection=By.xpath("");
	By workAndEducationSection=By.xpath("");
	By addUniversityIcon=By.xpath("");
	By schoolTextField=By.xpath("");
	By upperArrowButtonToHideTheYouMayKnowSection=By.xpath("");
	By addWorkplaceButton=By.xpath("");
	By companyTextField=By.xpath("");	
	By addCurrentCityButton=By.xpath("");
	By currentCityTextField=By.xpath("");
	By addHomeTownButton=By.xpath("");
	By homeTownTextField=By.xpath("");
	By cancelButton=By.xpath("");
	By addSecondarySchoolButton=By.xpath("");
	By schoolTextFieldPresentInsideSecondarySchoolTextField=By.xpath("");
	By addRelationshipStatusButton=By.xpath("");
	By stausDropdown=By.xpath("");
	By selectSingle=By.xpath("");
	By accountIcon=By.xpath("");
	By leavePageButton=By.xpath("");
	By LogoutButton=By.xpath("");
	By updateProfilePictureCameraIcon = By.xpath(""); 
	By uploadPhotoButton = By.xpath(""); 
	By notificationLink=By.xpath("");


	
	By errorMessageWithoutCredential1 = By.xpath(""); 
	
	By withoutPasswordErrorMessage1 = By.xpath("");


	


	public FaceBookPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this); // Initialize Page Factory
		// TODO Auto-generated constructor stub
	}


	/** @test1
	 * about this method validateFacebookTitleOfLoginPage() 
	 * @param : null
	 * @description : it is getting the page title and return the same,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String validateFacebookTitleOfLoginPage() throws Exception {
		return null;

	}


	/**@test2
	 * about this method enterEmailIdOrPhoneNumberInLoginPage() 
	 * @param : Map<String, String> expectedData
	 * @description : enter EmailIdOrPhoneNumber in the EmailIdOrPhoneNumber text field of the login page as per json expected data ,
	 * @return : null
	 * @author : Yaksha
	 */
	public boolean enterEmailIdOrPhoneNumberInLoginPage(Map<String, String> expectedData) throws Exception {
		return false;
	}

	/**
	 * about this method validateErrorMessageWithoutProvidePassword() 
	 * @param : null
	 * @description : it is getting the error message and validate the error message ,
	 * @return : errorMessage as string type
	 * @author : Yaksha
	 */
	public String validateErrorMessageWithoutProvidePassword(Map<String, String> expectedData) throws Exception {
		return null;
	}

	/**
	 * about this method enterPassword() 
	 * @param : Map<String, String> expectedData
	 * @description : enter password in the password text field of the login page as per json expected data ,
	 * @return : null
	 * @author : Yaksha
	 */
	public boolean enterPasswordInLoginPage(Map<String, String> expectedData) throws Exception {
		return false;
	}

	/**@test3
	 * about this method validateErrorMessageWithoutProvideEmailOrPhoneNumber() 
	 * @param : null
	 * @description : it is getting the error message and validate the error message ,
	 * @return : errorMessage as string type
	 * @author : Yaksha
	 */
	public String validateErrorMessageWithoutProvideEmailOrPhoneNumber() throws Exception {
		return null;
	}

	/**@test4
	 * about this method goBackToLogInPageAndValidateCreateNewAccountButtonIsPresentOrNot() 
	 * @param : null
	 * @description : here go back to the login page and verify whether the NewAccountButton element is present or not 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean goBackToLogInPageAndValidateCreateNewAccountButtonIsPresentOrNot() throws Exception {
		return null;
	}

	/**@test5
	 * about this method validateNavigateToTheSignUpPage() 
	 * @param : null
	 * @description : click on the createnew account and validate the sign up page title ,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String validateNavigateToTheSignUpPage() throws Exception {
		return null;

	}

	/**@test6.1
	 * about this method enterDataInFirstNameFieldSignupPage() 
	 * @param : Map<String, String>
	 * @description : Enter data in the first name text field of the Signup page,
	 * @return : String
	 * @author : Yaksha
	 */
	public  String enterDataInFirstNameFieldSignupPage( Map<String, String> expectedData) throws Exception {
		return null;
	}

	/**@test6.2
	 * about this method enterDataInSignUpPage() 
	 * @param : Map<String, String>
	 * @description : enter data in the  SignUpPage page,
	 * @return : null
	 * @author : Yaksha
	 *
	 */
	public  boolean enterDataInSignUpPage( Map<String, String> expectedData) throws Exception {
		return false;
	}

	/**@test6.3
	 * about this method selectDateFromDateDropdownAndVerifyDateDropdownIsPrsentOrNot() 
	 * @param : null
	 * @description : it is select any date from date dropdown and verify Date Dropdown is present in current page or not 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean selectDateFromDateDropdownAndVerifyDateDropdownIsPrsentOrNot() throws Exception {
		return null;
	}

	/**@test6.4
	 * about this method selectAnyMonthFromMonthDropdownAndVerifyMonthDropdownIsPrsentOrNot() 
	 * @param : null
	 * @description : it is select any month from month dropdown and verify month Dropdown is present in current page or not 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean selectAnyMonthFromMonthDropdownAndVerifyMonthDropdownIsPrsentOrNot() throws Exception {
		return null;
	}

	/**@test6.5
	 * about this method selectAnyYearFromYearDropdownAndVerifyYearDropdownIsPrsentOrNot() 
	 * @param : null
	 * @description : it is select any Year from Year dropdown and verify Year Dropdown is present in current page or not 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean selectAnyYearFromYearDropdownAndVerifyYearDropdownIsPrsentOrNot() throws Exception {
		return null;
	}

	
	/**@test7
	 * about this method verifyAllpresentOfFieldAfterCloseTheSignupPage() 
	 * @param : null
	 * @description : close the sign up page and verify all fields is present in current page or not 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifyAllpresentOfFieldAfterCloseTheSignupPage() throws Exception {
		return null;
	}

	/**@test8
	 * about this method enterValidEmail_PasswordInTextFieldAndVerifyLoginButtonIsPresentOrNot() 
	 * @param : Map<String, String> expectedData (getting the data from the expected Json file
	 * @description : enter the username and password in the corresponding Text filed and verify login button is present or not
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean enterValidEmail_PasswordInTextFieldAndVerifyLoginButtonIsPresentOrNot(Map<String, String> expectedData) throws Exception {
		return null;
	}

/**@Test9
	 * about this method loginToFacebookByGivenValidCredential() 
	 * @param : Map<String, String>
	 * @description : fill emailAddsPhoneNumberTextbox then enter data in passwordTextbox and click on login button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToFacebookByGivenValidCredential(Map<String, String> expectedData) throws Exception {
		return false;
	}

	

	/**@Test10
	 * about this method clickOnUpdateProfilePicture_and_UploadProfilePicture() 
	 * @param : String
	 * @description :click on update profile picture and click on upload photo and upload photo then click on save button.
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnUpdateProfilePictureAndUploadProfilePicture(String filePath) throws Exception {
		return false;
	}

	

	/**@Test11
	 * about this method gotoThePreviousPageAndClickOnAccount() 
	 * @param : null
	 * @description : going to the previous page then click on leave page button and click on Account icon which is present at the top right corner
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean gotoThePreviousPageAndClickOnAccount() throws Exception {
		return false;
	}
	/**@Test12
	 * about this method clickOnTheLogoutButton() 
	 * @param : null
	 * @description : Click on the logout button 
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickonTheLogoutButton() throws Exception {
		return false;
	}


	

}
