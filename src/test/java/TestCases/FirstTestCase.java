package TestCases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import BaseClassPackage.BaseClass;
import PageObjectPackage.EditPageObjectModel;

public class FirstTestCase extends BaseClass{
	BaseClass baseClass;
@Test
public void Editpage() {
	PageFactory.initElements(driver, EditPageObjectModel.class);
	EditPageObjectModel editPageObjectModel =  new  EditPageObjectModel();
	editPageObjectModel.ClickonEditButton();

}
}
