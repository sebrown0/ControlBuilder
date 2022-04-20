/**
 * 
 */
package control_builder.control_getters.group;

import org.openqa.selenium.By;

import core_data.CoreData;
import dynamic_tests.elements.ControlGroup;
import library.common.controls.adders.InputGroup;
import library.common.controls.interfaces.Control;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 *
 */
public class ControlGetterInputGroup extends ControlGetterGroup {
	
	public ControlGetterInputGroup(String name, CoreData coreData, By findBy) {
		super(name, coreData, findBy);				
	}
	
	@Override
	public Control getControl() {
		return 
			new ControlGroup(driver, findBy)
				.addElements(cntrls, new InputGroup(findBy));
	}
	
}
