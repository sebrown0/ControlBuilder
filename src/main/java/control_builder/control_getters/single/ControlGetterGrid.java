/**
 * 
 */
package control_builder.control_getters.single;

import org.openqa.selenium.By;

import control_builder.control_getters.ControlGetter;
import core_data.CoreData;
import library.common.controls.interfaces.Control;
import library.dk_grid.DkGrid;
import library.dk_grid.KeyStrategyRow;

/**
 * @author SteveBrown
 * @version 1.0
 * @since 1.0
 *
 */
public class ControlGetterGrid <T extends KeyStrategyRow> extends ControlGetter {
	private DkGrid<T> grid;
	
	public ControlGetterGrid(String name, By locator, CoreData coreData, T keyStrategy) {
		super(name, coreData);
	
		grid = new DkGrid<>(driver, locator, keyStrategy, coreData.getContextManager());
	}

	@Override
	public Control getControl() {
		return grid;
	}
	
}
