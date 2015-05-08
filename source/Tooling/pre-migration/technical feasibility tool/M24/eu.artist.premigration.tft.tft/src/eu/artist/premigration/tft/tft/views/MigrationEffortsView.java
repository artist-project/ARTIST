package eu.artist.premigration.tft.tft.views;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import eu.artist.premigration.tft.tft.dialog.EffortDetailsDialog;
import eu.artist.premigration.tft.tft.effort.EffortCalculator;
import eu.artist.premigration.tft.tft.model.Component;
import eu.artist.premigration.tft.tft.model.migrationstrategy.Complexity;

public class MigrationEffortsView extends ViewPart {

	public static final String ID = "eu.artist.premigration.tft.tft.views.MigrationEffortsView";

	private static final int[] COLUMN_WIDTH = { 180, 180, 180, 180};
	private static final String[] COLUMN_TITLES = { "Component Name", "Component Complexity", "Overall Migration Complexity", "Overall Migration Effort"};

	private TreeViewer viewer;

	private List<Component> componentListTree;

	private BigDecimal overallApplicationComplexity;
	private Complexity overallMigrationStrategyComplexity;
	private BigDecimal overallMigrationEffort;

	@SuppressWarnings("unchecked")
	public MigrationEffortsView() {
		try {
			InventoryView inventoryView = (InventoryView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(InventoryView.ID);
			componentListTree = (List<Component>) inventoryView.getViewer().getInput();

		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void calculateOveralsForAppliation(){

		int totalDegree = 0;
		int migrationCandidateComponentCount = 0;
		overallApplicationComplexity = BigDecimal.ZERO;
		overallMigrationEffort = BigDecimal.ZERO;
		
		List<Component> componentList = flattenTreeInput(componentListTree);
		for (Component component : componentList) {
			if (component.getMigrationStrategies().size() > 0){
				totalDegree += component.getAverageMigrationStrategyComplexity().getDegree();
				migrationCandidateComponentCount += 1;
			}
			if (Float.isNaN(component.getComplexity())){
				overallApplicationComplexity = overallApplicationComplexity.add(BigDecimal.ZERO);
			}
			else {
				overallApplicationComplexity = overallApplicationComplexity.add(BigDecimal.valueOf(component.getComplexity()));
			}
			overallMigrationEffort = overallMigrationEffort.add(EffortCalculator.INSTANCE.calculateEffortForComponent(component));
		}
		
		overallMigrationStrategyComplexity = Complexity.getComplexityByDegree(totalDegree / migrationCandidateComponentCount);
		overallApplicationComplexity = overallApplicationComplexity.setScale(2, BigDecimal.ROUND_HALF_UP);
		overallMigrationEffort = overallMigrationEffort.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	//TODO: Same method exists in MigrationSuggestionEditingSuppor and MigrationEffortsView a utility class for TFT may be needed
	/**
	 * Traverses all components in the tree input and adds them to a list separately, ignoring parent child relationships
	 * 
	 * @param treeInput A {@link List} of {@link Component}s which is the Inventory View's {@link TreeViewer} input
	 * @return Flattened list of components
	 */
	private List<Component> flattenTreeInput(List<Component> treeInput) {

		List<Component> flattenedTreeInput = new ArrayList<Component>();

		for(Component component : treeInput){
			if (component.getChildren() != null && component.getChildren().size() > 0) {
				flattenedTreeInput.addAll(flattenTreeInput(component.getChildren()));
			}
			flattenedTreeInput.add(component);
		}
		return flattenedTreeInput;
	}


	@Override
	public void createPartControl(final Composite parent) {

		GridLayout layout = new GridLayout(1, false);
		parent.setLayout(layout);

		createViewer(parent);
		
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				if (!selection.isEmpty() && selection.getFirstElement() instanceof Component){
					Component component = (Component) selection.getFirstElement();
					if (component.getMigrationStrategies().size() > 0) {
						EffortDetailsDialog dialog = new EffortDetailsDialog(parent.getShell(), (Component) selection.getFirstElement());
						dialog.open();
					}
					else {
						MessageDialog.openWarning(parent.getShell(), "Warning", "This component has no migration strategy suggestions."); 
					}
				}
			}
		});
		
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout bottomContainerLayout = new GridLayout(6, false);
		container.setLayout(bottomContainerLayout);
		

		calculateOveralsForAppliation();
		
		Label overallAppComplexity = new Label(container, SWT.BOLD);
		FontDescriptor boldDescriptor = FontDescriptor.createFrom(overallAppComplexity.getFont()).setStyle(SWT.BOLD);
		Font boldFont = boldDescriptor.createFont(overallAppComplexity.getDisplay());
		overallAppComplexity.setFont( boldFont );
		overallAppComplexity.setText("Overall application complexity: ");
		Label overallAppComplexityText = new Label(container, SWT.NONE);
		overallAppComplexityText.setText(overallApplicationComplexity.toString());
		
		Label lblOverallMigrationStrategyComplexity = new Label(container, SWT.BOLD);
		boldDescriptor = FontDescriptor.createFrom(lblOverallMigrationStrategyComplexity.getFont()).setStyle(SWT.BOLD);
		boldFont = boldDescriptor.createFont(lblOverallMigrationStrategyComplexity.getDisplay());
		lblOverallMigrationStrategyComplexity.setFont( boldFont );
		lblOverallMigrationStrategyComplexity.setText("Overall migration strategy complexity: ");
		Label lblOverallMigrationStrategyComplexityText = new Label(container, SWT.NONE);
		lblOverallMigrationStrategyComplexityText.setText(overallMigrationStrategyComplexity.toString());
		
		Label lblOverallMigrationEffort = new Label(container, SWT.BOLD);
		boldDescriptor = FontDescriptor.createFrom(lblOverallMigrationEffort.getFont()).setStyle(SWT.BOLD);
		boldFont = boldDescriptor.createFont(lblOverallMigrationEffort.getDisplay());
		lblOverallMigrationEffort.setFont( boldFont );
		lblOverallMigrationEffort.setText("Overall migration effort: ");
		Label lblOverallMigrationEffortText = new Label(container, SWT.NONE);
		lblOverallMigrationEffortText.setText(overallMigrationEffort.toString());
	}

	/**
	 * Creates the {@link TreeViewer} on which the components are shown
	 * 
	 * @param parent Parent composite which contains the tree viewer
	 */
	private void createViewer(Composite parent) {

		// Define the TreeViewer

		Tree componentTree = new Tree(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		componentTree.setHeaderVisible(true);
		
		//Listener for item selection
		componentTree.addListener (SWT.Selection, new Listener () {

			private void checkUncheckChildren(TreeItem parentItem, boolean checked) {
				TreeItem[] children = parentItem.getItems();
				for (TreeItem child : children) {
					child.setChecked(checked);
					Component childComponent = ((Component) child.getData());
					childComponent.setSelection(checked);
					if (child.getItemCount() != 0) {
						checkUncheckChildren(child, checked);
					}
				}
			}
			//Handler for Check events
			public void handleEvent (Event event) {
				TreeItem parentItem = (TreeItem) event.item;
				boolean checked = parentItem.getChecked();
				((Component) parentItem.getData()).setSelection(checked);
				//May also be a selection event
				if(event.detail == SWT.CHECK) {
					checkUncheckChildren(parentItem, checked);
				}
			}
		});


		viewer = new TreeViewer(componentTree);
		viewer.setContentProvider(new ComponentDetailsContentProvider());

		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 1;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		viewer.getControl().setLayoutData(gridData);

		// Create the columns
		createColumns(componentTree);

		populateViewer();
	}

	private void populateViewer(){

		viewer.setInput(componentListTree);
		viewer.expandAll();
	}

	/**
	 * Creates the columns of the Tree
	 * 
	 * @param componentTree The {@link Tree} for which the columns will be created
	 */
	private void createColumns(final Tree componentTree) {

		componentTree.setLinesVisible(true);

		//Component name
		TreeViewerColumn column = createTreeViewerColumn(0);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((Component) element).getName();
			}
		});

		//Component complexity
		column = createTreeViewerColumn(1);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				Component component = ((Component) element);
				if (Float.isNaN(component.getComplexity())){
					return "";
				}
				else {
					BigDecimal complexityValue = new BigDecimal(component.getComplexity());
					complexityValue = complexityValue.setScale(2, BigDecimal.ROUND_HALF_UP);

					return complexityValue.toString();
				}
			}
		});


		//Strategy Complexity
		column = createTreeViewerColumn(2);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				Component component = ((Component) element);

				if (!component.isApplicationLevelComponent() && component.getChildren().size() > 0){
					return "";
				}
				else {
					return component.getAverageMigrationStrategyComplexity().getValue();
				}
			}
		});

		//Estimated Migration Effort
		column = createTreeViewerColumn(3);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Component component = ((Component) element);
				if (!component.isApplicationLevelComponent() && component.getChildren().size() > 0){
					return "";
				}
				return component.getMigrationStrategies().size() > 0 ? EffortCalculator.INSTANCE.calculateEffortForComponent(component).toString() : "";
			}
		});
	}

	/**
	 * Creates the TreeViewerColumn for the given index
	 * 
	 * @param columnIndex The index number of the column
	 * @return TreeViewerColumn
	 */
	private TreeViewerColumn createTreeViewerColumn(int columnIndex){
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(viewer, SWT.NONE);

		final TreeColumn column = viewerColumn.getColumn();
		column.setText(COLUMN_TITLES[columnIndex]);
		column.setWidth(COLUMN_WIDTH[columnIndex]);
		column.setResizable(true);
		column.setMoveable(true);

		return viewerColumn;
	}

	/**
	 * Content provider for the Tree
	 *
	 */
	class ComponentDetailsContentProvider implements ITreeContentProvider{

		public Object[] getChildren(Object parentElement){


			if (parentElement instanceof List)
				return ((List<?>) parentElement).toArray();
			if (parentElement instanceof Component){
				Component component = (Component) parentElement;
				if (component.getChildren().size() > 0) {
					return component.getChildren().toArray();
				}
			}

			return new Object[0];
		}

		public Object getParent(Object element){
			if (element instanceof Component)
				return ((Component) element).getParent();
			return null;
		}

		public boolean hasChildren(Object element){

			if (element instanceof Component){
				return ((Component) element).getChildren().size() > 0;
			}
			return false;

		}

		public Object[] getElements(Object components){
			return getChildren(components);
		}

		public void dispose(){
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput){
		}
	}

	public TreeViewer getViewer() {
		return viewer;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
