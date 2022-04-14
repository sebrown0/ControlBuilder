/**
 * 
 */
package control_builder.control_getters.single;

import org.openqa.selenium.By;

import control_builder.control_getters.ControlGetter;
import library.common.controls.interfaces.Control;
import library.dakar_hr.dk_grid.DkGridEmployeeDetails;
import library.dakar_hr.pages.homepage.CoreData;


/**
 * @author Steve Brown
 *
 */
public final class ControlGetterDkGridEmployeeDetails extends ControlGetter {
	
	public ControlGetterDkGridEmployeeDetails(String name, CoreData coreData, By findBy) {
		super(name, coreData, findBy);
	}

	@Override
	public Control getControl() {
		driver.findElement(findBy).click();
		return new DkGridEmployeeDetails(super.coreData, findBy);
	}

}
