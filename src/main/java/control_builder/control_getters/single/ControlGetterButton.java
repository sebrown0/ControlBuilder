/**
 * 
 */
package control_builder.control_getters.single;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import control_builder.control_getters.ControlGetter;
import core_data.CoreData;
import library.common.controls.button.Button;
import library.common.controls.interfaces.Control;
import library.common.controls.interfaces.ControlTest;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 *
 */
public class ControlGetterButton extends ControlGetter {
	private Control btn;
	
	public ControlGetterButton(String name, CoreData coreData, By findBy, ControlTest controlTest) {
		super(name, coreData, findBy);
		
		this.btn = new Button(driver, findBy);
	}
	
	public ControlGetterButton(String name, CoreData coreData, By findBy, WebElement elButton) {
		super(name, coreData);
		
		this.btn = new Button(coreData.getWebDriver(), findBy, elButton);
	}
	
	@Override
	public Control getControl() {
		return btn;
	}

}
