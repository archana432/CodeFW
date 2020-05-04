/**
 * 
 */
package or.imail;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.configData_Util.Constant;
import com.configData_Util.STATUS;
import com.customReporting.CustomReporter;
import com.driverManager.DriverFactory;
import com.mailUtil.MailUtil;
import com.seleniumExceptionHandling.CustomExceptionHandler;
import com.seleniumExceptionHandling.SeleniumMethods;

import or.common.HCMCommon;
import or.common.LoginPage;
import or.ocs.LoginPageForOCS;
import or.ocs.OCSDashboard;

/**
 * @author Shwetha S Oct 7, 2019
 *
 */
public class External_Imail {
	

	public static final String title = "admin/imail/external/inbox";

	SeleniumMethods com;
	HCMCommon comm;
	Imail_Dashboard imd=new Imail_Dashboard();
	public External_Imail() {
		PageFactory.initElements(DriverFactory.getDriver(), this);
		com = new SeleniumMethods();
		comm = new HCMCommon();
	}

	@FindBy(xpath = "//div[@class='search_bar']//div[@class='input_search P_25_TB']//input[@name='search']")
	private WebElement search_Field;
	
	@FindBy(xpath = "(//span[contains(@id,'react-select')][contains(@class,'value-wrapper')])[2]")
	public WebElement dropDown_FilterBy;
	
	
	@FindBy(xpath = "//div[@class='Select-placeholder'][contains(.,'Sort by: Date')]")
	private WebElement dropDown_FilterByDate;
	
	@FindBy(xpath = "//span[contains(.,'Compose New Message')]")
	private WebElement button_ComposeNewMessage;
	
	
	@FindBy(xpath = "//span[(@id='react-select-5--value')]//div[contains(.,'To:')]//following-sibling::div//input")
	private WebElement txtField_To;
	
	@FindBy(xpath = "//span[(@id='react-select-6--value')]//div[contains(text(),'CC:')]//following-sibling::div//input")
	private WebElement txtField_CC;
	
	@FindBy(xpath = "//input[@placeholder='Subject:']")
	private WebElement txtField_Subject;
	
	@FindBy(xpath = "//div[@class='col-md-12 px-0 int_text_but']//textarea")
	private WebElement txtArea_MessageBody;
	
	@FindBy(xpath = "//div[@class='row mt-5']//button[1]")
	private WebElement button_Draft;
	
	@FindBy(xpath = "//button[@class='default_btn']//i[@class='icon icon-share-icon']")
	private WebElement button_Send;
	
    @FindBy(xpath = "//i[@class='icon icon-flag-im flag-im color']")
	private WebElement icon_Flagged;
	
	@FindBy(xpath = "//i[@class='icon icon-favorite-im active']")
	private WebElement icon_Favourites;
	
	@FindBy(xpath = "//i[@class='icon icon-envelope-im active']")
	private WebElement icon_click_To_Make_MarkRead;
	
	@FindBy(xpath = "//i[@class='icon icon-favorite-im ']")
	private WebElement icon_click_To_Make_Favourite;
	
   @FindBy(xpath = "//div[@class='col-md-6 Imail_btn_right_v1 text-right parant_active']//i[@class='icon icon-flag-im ']")
   private WebElement icon_click_To_Make_Flaged;
   
   @FindBy(xpath = "//div[@class='col-md-6 Imail_btn_right_v1 text-right parant_active']//i[@class='icon icon-block-im ']")
   private WebElement icon_click_To_Make_Block;
   
   @FindBy(xpath = "//div[@class='col-md-6 Imail_btn_right_v1 text-right parant_active']//i[@class='icon icon-archive-im ']")
   private WebElement icon_click_To_Make_Archieve;
    
   
   @FindBy(xpath = "//i[@class='icon icon-block-im attach_im color']")
   private WebElement icon_Block;
	
	
    @FindBy(xpath = "//div[@class='mess_V_b'][contains(.,'23/10/2019 10:58 PM')]")
	private WebElement list_FavouritesDate;
	
	@FindBy(xpath = "(//div[@class='mess_vn_in_2']//p[@class='my-0 ML_show_fixed'][contains(.,'new  test')])")
	private WebElement subject_Text;
	
	@FindBy(xpath = "(//div[@class='ml-0 mb-0']//span[@class='add_access p-colr'])[1]")
	private WebElement Participant_P;
	
	@FindBy(xpath = "//div[@class='Imail_btn_right_v1 text-right']//i[@class='icon icon-share-icon']")
	private WebElement In_draft_shareIcon;
	
	
	
	/**
	 * Verifying the External Imail UI
	 * @author Shwetha S Nov 4, 2019
	 */
	public void ExternalImail_VerifyUI() {
		
		Imail_Dashboard imd=new Imail_Dashboard();
		com.click(imd.link_External_Imail);
		com.isElementPresent(search_Field,"search field present");
		com.isElementPresent(dropDown_FilterBy,"Filter by select present");
		com.isElementPresent(dropDown_FilterByDate,"Filter by date");
		com.isElementPresent(button_ComposeNewMessage,"ComposeNewMessage");
	}


		/**
		 * Select the date by FilterByDate
	     * @author Shwetha S Nov 4, 2019
		 * 
		 */
		public void verify_SortingFilterByDate() {
			com.click(imd.link_External_Imail,"click on External Imail");
			comm.selectByVisibleText( dropDown_FilterByDate, "");
			
		}



	/**
	 * Select the status of mail by FilterBySelect such as Flagged,Favourite
	 * @author Shwetha S Nov 4, 2019
	 */
	public void External_verifySortingFilterBySelect() {
		Imail_Dashboard imd=new Imail_Dashboard();
		com.click(imd.link_External_Imail);
		com.isElementPresent(dropDown_FilterBy,"present");
	
		comm.selectByVisibleText(dropDown_FilterBy, "Flagged");
		com.isElementPresent(icon_Flagged);
		
		comm.selectByVisibleText(dropDown_FilterBy, "Favourite"); 
		com.click(list_FavouritesDate,"click on Favourites");
		com.wait(2);
		com.isElementPresent(icon_Favourites);
		
		
	}
	

	/**
	 * Select the status of mail by FilterBySelect such as Unread
	 * @author Shwetha S Nov 4, 2019
	 */

	public void External_verifySortingFilterByUnread() {
		Imail_Dashboard imd=new Imail_Dashboard();
		com.click(imd.link_External_Imail);
		com.isElementPresent(dropDown_FilterBy,"present");
	
		
		comm.selectByVisibleText(dropDown_FilterBy, "Unread");
	    com.wait(2);
		com.click(Participant_P,"Participant replied mail");
	}
	
	
	/**
	 * 
	 * @author Shwetha S Nov 4, 2019
	 * 
	 */
	/*public void External_verifySortingFilterByDate() {
		Imail_Dashboard imd=new Imail_Dashboard();
		com.click(imd.link_External_Imail);
		com.isElementPresent(dropDown_FilterByDate);
		
	}
   */

	/**
	 * enter the value in search field and verify
	 * @author Shwetha S Nov 4, 2019
	 */
	public void verify_SearchFunctionlity() {
		Imail_Dashboard imd=new Imail_Dashboard();
		com.click(imd.link_External_Imail);
		 
        com.isElementPresent(search_Field);
		
		com.sendKeys(search_Field, "shwetha");
		com.sendKeys(search_Field, Keys.ENTER);
		
	}
	
	

	/**
	 * Composing the mail
	 * @author Shwetha S Nov 4, 2019
	 */
	public void createNewMail(String userTxtForTo,String userTxtForFrom ){
		Imail_Dashboard imd=new Imail_Dashboard();
		com.click(imd.link_External_Imail);
		com.click(button_ComposeNewMessage);
        com.wait(2);
        
        com.isElementPresent(txtField_To,"Text To present");
		
		com.sendKeys(txtField_To, userTxtForTo);
		
		com.waitForElementsTobe_Present(By.xpath(
				"//div[@class='Select-menu-outer']//div[contains(@class,'option')][contains(.,'" + userTxtForTo + "')]"),
				userTxtForTo + " option");
		
		
		com.click(By.xpath(
				"//div[@class='Select-menu-outer']//div[contains(@class,'option')][contains(.,'" + userTxtForTo + "')]"),
				userTxtForTo + " option");
		
		com.wait(2);
		
		com.sendKeys(txtField_CC, userTxtForFrom);

		com.wait(3);
		
		
		com.click(By.xpath(
				"//div[@class='Select-menu-outer']//div[contains(@class,'option')][contains(.,'" + userTxtForFrom + "')]"),
				userTxtForFrom + " option");
		
		com.wait(2);
		com.sendKeys(txtField_Subject, "test");
		com.wait(2);
		com.sendKeys(txtArea_MessageBody, "test");
	}
	
	/**
	 * compose the mail and click on Draft
	 * @author Shwetha S Nov 4, 2019
	 */
	public void verify_SendDraftMail() {
		createNewMail("shwetha","Arch");
		com.click(button_Draft);
		Imail_Dashboard imd=new Imail_Dashboard();
		com.click(imd.external_Drafts);
		com.wait(2);
		com.click(By.xpath("//a[contains(.,'test')]"));
		com.wait(2);
		com.isElementPresent(In_draft_shareIcon);
	}



	/**
	 * Compose the mail >>send >>login to OCS>>verify the sent mail
	 * @author Shwetha S Nov 4, 2019
	 * 
	 */
	public void ComposeNewMail_Verify_ClientPortal() {
		createNewMail("shwetha","Arch");
		com.click(button_Send);
		
		LoginPage lp=new LoginPage();
		lp.logout();
		
		LoginPageForOCS lpOCS=new LoginPageForOCS();
		lpOCS.loginToOCSPortal("shwethachethanjn","SENKncgSEN");
		
		OCSDashboard dbOCS=new OCSDashboard();
		dbOCS.verifyTheMail();
		
	}
  

	/**
	 * Compose the mail >>send >>login to OCS>>verify the sent mail >>Reply to the mail 
	 * @author Shwetha S Nov 4, 2019
	 * 
	 */
	public void ComposeNewMailOnClientPortal_VerifyAdmin() {
		createNewMail("shwetha","Arch");
		com.click(button_Send);
		LoginPage lp=new LoginPage();
		lp.logout();
		
		LoginPageForOCS lpOCS=new LoginPageForOCS();
		lpOCS.loginToOCSPortal("shwethachethanjn","SENKncgSEN");
		
		OCSDashboard dbOCS=new OCSDashboard();
		dbOCS.sendBackTheReplyForMail();
		
		}

    
	/**
	 * compose the mail >>send >> click on mail>> mark as unread
	 * @author Shwetha S Nov 4, 2019
	 */
	public void External_Check_MailMarkAsUnRead() {
		
		createNewMail("shwetha", "arc");
		com.click(button_Send);
		com.wait(2);
		com.click(By.xpath("//a[contains(.,'test')]"));
		com.click(icon_click_To_Make_MarkRead,"Mark as Unread");
		}


	/**
	 * Compose the mail >>send >> click on mail>> mark as Favourite
	 * @author Shwetha S Nov 4, 2019
	 */
	public void External_Check_MailMarkAsFavourites() {
		createNewMail("shwetha", "arc");
		com.click(button_Send);
		com.wait(2);
		com.click(By.xpath("//a[contains(.,'test')]"));
		com.wait(2);
		com.isElementPresent(icon_click_To_Make_Favourite);
		com.click(icon_click_To_Make_Favourite,"Mark as Favourite");
		
	}
	/**
	 * Compose the mail >>send >> click on mail>> mark as Flagged
	 * @author Shwetha S Nov 4, 2019
	 */
	 public void Admin_External_Check_MailSetAsItemFlag() {
		createNewMail("shwetha", "arc");
		com.click(button_Send);
		com.wait(2);
		com.click(By.xpath("//a[contains(.,'test')]"));
		com.waitForElementsTobe_Present(icon_click_To_Make_Flaged);
		com.click(icon_click_To_Make_Flaged,"Mark as Flaged");
		
	}


	/**
	 * Compose the mail >>send >> click on mail>> mark as Block
	 * @author Shwetha S Nov 4, 2019
	 */
	public void External_Check_Mail_BlockItem() {
	
		createNewMail("shwetha", "arc");
		com.click(button_Send);
		com.wait(2);
		com.click(By.xpath("//a[contains(.,'test')]"));
		com.waitForElementsTobe_Present(icon_click_To_Make_Block);
		com.click(icon_click_To_Make_Block,"Mark as Block");
		com.waitForElementsTobe_Present(icon_Block,"Mail is set as blocked");
	 
	   }


	


	/**
	* Compose the mail >>send >> click on mail>> mark as Archive
	 * @author Shwetha S Nov 4, 2019
	 */
	public void External_Check_Mail_Archive() {
		createNewMail("shwetha", "arc");
		com.click(button_Send);
		com.wait(2);
		com.click(By.xpath("//a[contains(.,'test')]"));
		com.waitForElementsTobe_Present(icon_click_To_Make_Archieve);
		com.click(icon_click_To_Make_Archieve,"Mark as Archieve");
		Imail_Dashboard imd=new Imail_Dashboard();
		com.click(imd.external_Archived);
		com.wait(2);
		com.click(By.xpath("//a[contains(.,'test')]"));
		
	 }

}
		
	
