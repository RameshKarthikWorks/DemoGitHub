package PageObjectPackage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClassPackage.BaseClass;

public class EditPageObjectModel extends BaseClass {

	
	@FindBy(xpath="//img[@alt='Edit / Text Fields']")
	WebElement EditButton;
public EditPageObjectModel() {
	PageFactory.initElements(driver, EditPageObjectModel.class);
}
	public void ClickonEditButton() {
	EditButton.click();
	}
	
	
}
