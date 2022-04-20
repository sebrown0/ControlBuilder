/**
 * 
 */
package control_builder.control_getters.single;

import org.openqa.selenium.By;

import control_builder.control_getters.ControlGetter;
import core_data.CoreData;
import library.common.controls.combos.ComboWriteAndSelect;
import library.common.controls.interfaces.Control;
import utils.text_writer.TextWriter;

/**
 * @author SteveBrown
 * @version 1.0
 * @since 1.0
 *
 */
public class ControlGetterComboWriteAndSelect extends ControlGetter {
	private Control combo;
	
	public ControlGetterComboWriteAndSelect(
		String name, CoreData coreData, By findBy, By resultsBy, TextWriter writer) {
		super(name, coreData, findBy);
		
		this.combo = new ComboWriteAndSelect(coreData, findBy, resultsBy, writer);
	}
	
	@Override
	public Control getControl() {
		return combo;
	}

}
