/**
 * 
 */
package control_builder.control_getters.single;

import org.openqa.selenium.By;

import control_builder.control_getters.ControlGetter;
import library.common.controls.interfaces.Control;
import library.common.controls.with_text.TextSelect;
import library.dakar_hr.pages.homepage.CoreData;

/**
 * @author SteveBrown
 * @version 1.0
 * @since 1.0
 * 
 * This was added for InitialisePayroll.
 * Where there are select boxes that cannot select,
 * or don't have a list to select from.
 * 
 */
public final class ControlGetterTextSelect extends ControlGetter {
	private Control cntrl;
		
	public ControlGetterTextSelect(String name, CoreData coreData, By findBy) {
		super(name, coreData, findBy);
		
		cntrl = new TextSelect(super.driver, super.findBy);
	}

	@Override
	public Control getControl() {
		return cntrl;
	}
	
}
