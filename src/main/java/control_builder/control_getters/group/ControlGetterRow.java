/**
 * 
 */
package control_builder.control_getters.group;

import dynamic_tests.elements.ControlGroup;
import library.common.controls.adders.RowAdder;
import library.common.controls.interfaces.Control;
import library.dakar_hr.pages.homepage.CoreData;

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
