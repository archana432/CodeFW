/**
 * 
 */
package tests.imail;

import org.testng.annotations.Test;

import or.admin.UserManagement;
import or.common.Dashboard;
import or.common.LoginPage;
import or.common.Navigator;
import or.imail.External_Imail;
import or.imail.Imail_Dashboard;
import or.imail.Internal_Imail;

/**
 * @author shwetha
 *
 */
public class Imail_Module {
	
	private Navigator navigateToImail() {
		Navigator nav = new Navigator();
		Dashboard d = new Dashboard();
		nav.traverseMenu_VerifyPageTitle("/admin/imail/dashboard", d.link_Imail);
		return nav;
	}

	/****
	 * 1.Naviating to Imail
	 * 2.Click on External Imail
	 * 3.verify the UI
	 * @author Shwetha S Oct 7, 2019
	  
	  * 
	 */
	 
	@Test(description = "TC01_Admin_External_verifyUI", groups = {"UI Only"})
	public void Admin_External_verifyUI() throws InterruptedException{
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.ExternalImail_VerifyUI();
		
	}
  
	/****
	 * * 1.Naviating to Imail
	 * 2.Click on External Imail
	 * 3.verify the UI
	 * @author Shwetha S Oct 09, 2019
	 * 
	 * 
	 */
	 
	@Test(description = "TC02_Admin-External_verify_SearchFunctionlity", groups = {"Func Only"})
	public void TC02_Admin_External_verify_SearchFunctionlity(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.verify_SearchFunctionlity();
		
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail
	 * 3.verify SortingFilterBySelect
	 * @author Shwetha S Oct 09, 2019
	 *  
	 * 
	 */
	 
	@Test(description = "TC03_Admin-External_verify_SortingFilterBySelect", groups = {"Func Only"})
	public void TC03_Admin_External_verify_SortingFilterBySelect(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.External_verifySortingFilterBySelect();
		
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail
	 * 3.verify SortingFilterByDate
	 * @author Shwetha S Oct 09, 2019
	 *  
	 * 
	 */
	@Test(description = "TC04_Admin_External_verify_SortingFilterByDate", groups = {"Func Only"})
	public void TC04_Admin_External_verify_SortingFilterByDate(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.verify_SortingFilterByDate();
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail  >> compose mail
	 * 3.verify SendDraftMail
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC05_Admin_External_verify_SendDraftMail", groups = {"Func Only"})
	public void TC05_Admin_External_verify_SendDraftMail(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.verify_SendDraftMail();
	}
  
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail >> Compose Mail 
	 * 3. Verify ClientPortal
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC06_Admin_External_ComposeNewMail_Verify_ClientPortal", groups = {"Func Only"})
	public void TC06_Admin_External_ComposeNewMail_Verify_ClientPortal(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.ComposeNewMail_Verify_ClientPortal();
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail >> Compose Mail 
	 * 3. Verify ClientPortal >> Compose mail >>Verify Admin
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC07_Admin_External_ComposeNewMailOnClientPortal_VerifyAdmin", groups = {"Func Only"})
	public void TC07_Admin_External_ComposeNewMailOnClientPortal_VerifyAdmin(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.ComposeNewMailOnClientPortal_VerifyAdmin();
		LoginPage lp=new LoginPage();
	    lp.performIntelligentLogin("Admin");
		navigateToImail();
		ei.External_verifySortingFilterByUnread();
	}


	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail
	 * 3.Mark Mail As Read
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC08_Admin_External_Check_MailMarkAsRead", groups = {"Func Only"})
	public void TC08_Admin_External_Check_MailMarkAsRead(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.External_Check_MailMarkAsUnRead();
	}
	
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail
	 * 3.Mark Mail MailMarkAsFavourites
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC09_Admin_External_Check_MailMarkAsFavourites", groups = {"Func Only"})
	public void TC09_Admin_External_Check_MailMarkAsFavourites(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.External_Check_MailMarkAsFavourites();
	}
	
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail
	 * 3.Mark Mail MailSetAsItemFlag
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	
	@Test(description = "TC10_Admin_External_Check_MailSetAsItemFlag", groups = {"Func Only"})
	public void TC10_Admin_External_Check_MailSetAsItemFlag(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.Admin_External_Check_MailSetAsItemFlag();
	}
	

	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail
	 * 3.Mark MailBlockItem
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC11_Admin_External_Check_Mail_BlockItem", groups = {"Func Only"})
	public void TC11_Admin_External_Check_Mail_BlockItem(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.External_Check_Mail_BlockItem();
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail
	 * 3.Mark Mail_Archive
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC12_Admin_External_Check_Mail_Archive", groups = {"Func Only"})
	public void TC12_Admin_External_Check_Mail_Archive(){
		navigateToImail();
	    External_Imail ei=new External_Imail();
		ei.External_Check_Mail_Archive();
	}
	
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on Internal Imail
	 * 3.verify the UI
	 * @author Shwetha S Oct 7, 2019
	 * 
	 */
	 
	@Test(description = "TC13_Admin_Internal_verifyUI", groups = {"UI Only"})
	public void TC13_Admin_Internal_verifyUI(){
		navigateToImail();
	    Internal_Imail ii=new Internal_Imail();
		ii.Admin_Internal_verifyUI();
	}
	
	
	/**
	 * * 1.Naviating to Imail
	 * 2.Click on Internal Imail
	 * 3.verify the UI
	 * @author Shwetha S Oct 09, 2019
	 * 
	 * 
	 */
	
	@Test(description = "TC14_Admin_Internal_verify_SearchFunctionlity", groups = {"Func Only"})
	public void TC14_Admin_Internal_verify_SearchFunctionlity(){
		navigateToImail();
	    Internal_Imail ii=new Internal_Imail();
		ii.verify_InternalImail_SearchFunctionlity();
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on Internal Imail
	 * 3.verify SortingFilterByDate
	 * @author Shwetha S Oct 09, 2019
	 *  
	 * 
	 */
	@Test(description = "TC15_Admin_Internal_verify_SortingFilterByDate", groups = {"Func Only"})
	public void TC15_Admin_Internal_verify_SortingFilterByDate(){
		navigateToImail();
	    Internal_Imail ii=new Internal_Imail();
		ii.Internal_verifySortingFilterByDate();
	}
	

	/**
	 * 1.Naviating to Imail
	 * 2.Click on Internal Imail  >> compose mail
	 * 3.verify SendDraftMail
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC16_Admin_Internal_verify_SendDraftMail", groups = {"Func Only"})
	public void TC16_Admin_External_verify_SendDraftMail(){
		navigateToImail();
	    Internal_Imail ii=new Internal_Imail();
		ii.Internal_verify_SendDraftMail();
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on External Imail >> Compose Mail 
	 * 3. Verify ClientPortal >> Compose mail >>Verify Admin
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC17_Admin_Internal_ComposeNewMail_VerifyClient_Admin", groups = {"Func Only"})
	public void TC17_Admin_Internal_ComposeNewMail_VerifyClient_Admin(){
		navigateToImail();
	    Internal_Imail ii=new Internal_Imail();
		ii.ComposeNewMailOnClientPortal_VerifyAdmin();
		LoginPage lp=new LoginPage();
	    lp.performIntelligentLogin("Admin");
		navigateToImail();
		ii.Internal_verifySortingFilterByUnread();
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on Internal Imail
	 * 3.Mark Mail As Read
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC18_Admin_Internal_Check_MailMarkAsRead", groups = {"Func Only"})
	public void TC18_Admin_Internal_Check_MailMarkAsRead(){
		navigateToImail();
	    Internal_Imail ii=new Internal_Imail();
	    ii.Internal_Check_MailMarkAsUnRead();
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on Internal Imail
	 * 3.Mark MarkAsFavourites
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC19_Admin_Internal_Check_MailMarkAsFavourites", groups = {"Func Only"})
	public void TC19_Admin_Internal_Check_MailMarkAsFavourites(){
		navigateToImail();
		Internal_Imail ii=new Internal_Imail();
		ii.Internal_Check_MailMarkAsFavourites();
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on Internal Imail
	 * 3.Mark mail SetAsItemFlag
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC20_Admin_Internal_Check_MailSetAsItemFlag", groups = {"Func Only"})
	public void TC20_Admin_Internal_Check_MailSetAsItemFlag(){
		navigateToImail();
		Internal_Imail ii=new Internal_Imail();
		ii.Admin_Internal_Check_MailSetAsItemFlag();
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on Internal Imail
	 * 3.Mark mail BlockItem
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC21_Admin_Internal_Check_Mail_BlockItem", groups = {"Func Only"})
	public void TC21_Admin_Internal_Check_Mail_BlockItem(){
		navigateToImail();
		Internal_Imail ii=new Internal_Imail();
		ii.Internal_Check_Mail_BlockItem();
	}
	
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on Internal Archive
	 * 3.Mark mail BlockItem
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC22_Admin_Internal_Check_Mail_Archive", groups = {"Func Only"})
	public void TC22_Admin_Internal_Check_Mail_Archive(){
		navigateToImail();
		Internal_Imail ii=new Internal_Imail();
		ii.Internal_Check_Mail_Archive();
	}
	

	/**
	 * 1.Naviating to Imail
	 * 2.Click on GroupMessages
	 * 3.Create Group message
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC23_Admin_Internal_Check_GroupMessages", groups = {"Func Only"})
	public void TC23_Admin_Internal_Check_GroupMessages(){
		navigateToImail();
		Internal_Imail ii=new Internal_Imail();
		ii.Verify_For_GroupMessages("shwetha");
	}
	
	/**
	 * 1.Naviating to Imail
	 * 2.Click on GroupMessages
	 * 3.Create Group message and send the message in group
	 * @author Shwetha S Oct 09, 2019
	 *  
	 */
	@Test(description = "TC24_Admin_Internal_send_GroupMessages", groups = {"Func Only"})
	public void TC24_Admin_Internal_send_GroupMessages(){
		navigateToImail();
		Internal_Imail ii=new Internal_Imail();
		ii.sendTheMessageInGroup();
	}
}
