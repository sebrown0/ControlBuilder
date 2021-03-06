/**
 * 
 */
package control_builder.control_getters.single;

import org.openqa.selenium.By;

import control_builder.control_getters.ControlGetter;
import core_data.CoreData;
import library.common.controls.interfaces.Control;
import library.common.controls.interfaces.ControlTest;
import library.common.controls.with_text.Label;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 *  
 */
public final class ControlGetterLabel extends ControlGetter {
	private Control cntrl;
		
	public ControlGetterLabel(String name, CoreData coreData, By findBy, ControlTest controlTest) {
		super(name, coreData, findBy);
		
		cntrl = new Label(super.driver, super.findBy);
	}

	@Override
	public Control getControl() {
		return cntrl;
	}
	
}
