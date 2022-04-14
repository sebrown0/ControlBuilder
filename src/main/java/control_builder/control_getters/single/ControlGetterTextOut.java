/**
 * 
 */
package control_builder.control_getters.single;

import org.openqa.selenium.By;

import control_builder.control_getters.ControlGetter;
import library.common.controls.interfaces.Control;
import library.common.controls.interfaces.ControlTest;
import library.common.controls.with_text.TextOut;
import library.dakar_hr.pages.homepage.CoreData;

/**
 * @author SteveBrown
 * @version 1.0
 * @since 1.0
 */
public final class ControlGetterTextOut extends ControlGetter {
	private Control cntrl;
		
	public ControlGetterTextOut(String name, CoreData coreData, By findBy, ControlTest controlTest) {
		super(name, coreData, findBy);
		this.cntrl = new TextOut(super.driver, super.findBy, controlTest);
	}

	@Override
	public Control getControl() {
		return cntrl;
	}

}
