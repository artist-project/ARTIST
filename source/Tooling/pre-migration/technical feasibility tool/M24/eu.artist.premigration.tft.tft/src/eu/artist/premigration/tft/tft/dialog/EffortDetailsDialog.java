package eu.artist.premigration.tft.tft.dialog;

import java.math.BigDecimal;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import eu.artist.premigration.tft.tft.effort.EffortCalculator;
import eu.artist.premigration.tft.tft.model.Component;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;

public class EffortDetailsDialog extends Dialog {

	private Component selectedComponent;
	private TableViewer viewer;
	
	private static final int[] COLUMN_WIDTH = { 180, 180, 180};
	private static final String[] COLUMN_TITLES = { "Migration Strategy", "Complexity", "Effort"};

	/**
	 * Constructor for the Effort Details Dialog
	 * <br>
	 * @param parentShell Parent of the dialog
	 * @param selectedComponent The component for which the effort details will be shown.
	 */
	public EffortDetailsDialog (Shell parentShell, Component selectedComponent) {
		super(parentShell);
		this.selectedComponent = selectedComponent;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = (Composite) super.createDialogArea(parent);

		GridLayout layout = new GridLayout(1, false);
		container.setLayout(layout);

		createViewer(container);
		return container;
	}
	
	//Overridden to simplify the dialog visual
	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		if (!"Cancel".equalsIgnoreCase(label))
			return super.createButton(parent, id, label, defaultButton);
		return null;
	}

	private void createViewer (Composite parent) {

		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);

		createColumns(parent, viewer);
		final Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setInput(selectedComponent.getMigrationStrategies());
	}

	private void createColumns(final Composite parent, final TableViewer viewer) {

		TableViewerColumn column = createTableViewerColumn(0);
		
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((MigrationStrategy) element).getText();
			}
		});
		
		column = createTableViewerColumn(1);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((MigrationStrategy) element).getComplexity().getValue();
			}
		});
		
		column = createTableViewerColumn(2);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				BigDecimal effort = BigDecimal.valueOf(EffortCalculator.INSTANCE.calculateEffortForStrategy(selectedComponent, (MigrationStrategy) element));
				effort = effort.setScale(2, BigDecimal.ROUND_HALF_UP);
				return effort.toString();
			}
		});
	}
	
	/**
	 * Creates the TreeViewerColumn for the given index
	 * 
	 * @param columnIndex The index number of the column
	 * @return TreeViewerColumn
	 */
	private TableViewerColumn createTableViewerColumn(int columnIndex){
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);

		final TableColumn column = viewerColumn.getColumn();
		column.setText(COLUMN_TITLES[columnIndex]);
		column.setWidth(COLUMN_WIDTH[columnIndex]);
		column.setResizable(true);
		column.setMoveable(true);

		return viewerColumn;
	}
}
