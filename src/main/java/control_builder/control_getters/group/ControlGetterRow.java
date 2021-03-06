/**
 * 
 */
package control_builder.control_getters.group;

import core_data.CoreData;
import library.common.controls.adders.RowAdder;
import library.common.controls.interfaces.Control;
import root.elements.ControlGroup;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 *
 */
public class ControlGetterRow extends ControlGetterGroup {
	
	
	public ControlGetterRow(String name, CoreData coreData) {
		super(name, coreData);				
	}
	
	@Override
	public Control getControl() {
		return 
			new ControlGroup()
				.addElements(cntrls, new RowAdder());
	}
	
}
