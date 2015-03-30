package eu.artist.premigration.tft.tft.views;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import eu.artist.premigration.tft.tft.dialog.EffortDetailsDialog;
import eu.artist.premigration.tft.tft.effort.EffortCalculator;
import eu.artist.premigration.tft.tft.model.Component;
import eu.artist.premigration.tft.tft.model.MigrationGoalsContainer;
import eu.artist.premigration.tft.tft.model.migrationstrategy.Complexity;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;
import eu.artist.premigration.tft.tft.model.query.ComponentModelQuery;

public class MigrationEffortsView extends ViewPart {

	public static final String ID = "eu.artist.premigration.tft.tft.views.MigrationEffortsView";

	private static final int[] COLUMN_WIDTH = { 180, 180, 180, 180, 180};
	private static final String[] COLUMN_TITLES = { "Component Name", "Component Complexity", "Migration Complexity", "Estimated Migration Effort", "Absolute Effort"};

	private TreeViewer viewer;

	private List<Component> componentListTree;
	private Component applicationLevelComponent;

	private BigDecimal averageComponentComplexity;
	private Complexity overallMigrationStrategyComplexity;
	private BigDecimal overallMigrationEffort;
	
	private static boolean firstEffortInput = true;

	private Label lblAverageComponentComplexityText, lblAverageMigrationStrategyComplexityText, lblOverallMigrationEffortText;

	@SuppressWarnings("unchecked")
	public MigrationEffortsView() {
		if (MigrationGoalsContainer.INSTANCE.getMigrationGoals() != null && ComponentModelQuery.INSTANCE.isModelLoaded()){
			InventoryView inventoryView = (InventoryView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(InventoryView.ID);
			if (inventoryView != null && inventoryView.getViewer() != null && inventoryView.getViewer().getInput() != null) {
				componentListTree = new ArrayList<Component>((List<Component>) inventoryView.getViewer().getInput());
				removeUnselectedComponents(componentListTree);
			}
		}
	}

	private void removeUnselectedComponents(List<Component> componentList){
		
		for (Iterator<Component> iterator = componentList.iterator(); iterator.hasNext(); ){
			Component component = iterator.next();
			if (component.getChildren() != null && component.getChildren().size() > 0) {
				removeUnselectedComponents(component.getChildren());
			}
			if (!component.isSelected() && !component.isApplicationLevelComponent()){
				boolean hasCheckedChild = false;
				for (Component comp : component.getChildren()) {
					if (comp.isSelected()){
						hasCheckedChild = true;
						break;
					}
				}
				if (!hasCheckedChild) {
					iterator.remove();
				}
			}

		}
	}

	private void calculateOveralsForAppliation(){

		int totalDegree = 0;
		int migrationCandidateComponentCount = 0;
		averageComponentComplexity = BigDecimal.ZERO;
		overallMigrationEffort = BigDecimal.ZERO;

		List<Component> componentList = flattenTreeInput(componentListTree);
		for (Component component : componentList) {
			
			if (component.isApplicationLevelComponent()){
				//to be used later
				applicationLevelComponent = component;
				
			}
			
			if (component.getMigrationStrategies().size() > 0){
				totalDegree += component.getAverageMigrationStrategyComplexity().getDegree();
			}
			if (Float.isNaN(component.getComplexity())){
				averageComponentComplexity = averageComponentComplexity.add(BigDecimal.ZERO);
			}
			else {
				averageComponentComplexity = averageComponentComplexity.add(BigDecimal.valueOf(component.getComplexity()));
				migrationCandidateComponentCount += 1;
			}
			overallMigrationEffort = overallMigrationEffort.add(EffortCalculator.INSTANCE.calculateEffortForComponent(component));
		}

		if (migrationCandidateComponentCount != 0) {
			overallMigrationStrategyComplexity = Complexity.getComplexityByDegree(((new BigDecimal(totalDegree)).divide(new BigDecimal(migrationCandidateComponentCount), BigDecimal.ROUND_HALF_UP)).intValue());
			averageComponentComplexity = averageComponentComplexity.divide(new BigDecimal(migrationCandidateComponentCount), 2, BigDecimal.ROUND_HALF_UP);
		}
		else {
			overallMigrationStrategyComplexity = Complexity.UNKNOWN;
			averageComponentComplexity = BigDecimal.ZERO;
		}

		averageComponentComplexity = averageComponentComplexity.setScale(2, BigDecimal.ROUND_HALF_UP);
		overallMigrationEffort = overallMigrationEffort.setScale(2, BigDecimal.ROUND_HALF_UP);

		lblOverallMigrationEffortText.setText(overallMigrationEffort.toString());
		lblAverageMigrationStrategyComplexityText.setText(overallMigrationStrategyComplexity.toString());
		lblAverageComponentComplexityText.setText(averageComponentComplexity.toString());
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

	/**
	 * Recalculates the efforts and refreshes the viewer
	 */
	@SuppressWarnings("unchecked")
	public void recalculateEffortsAndRefreshViewer(){

		InventoryView inventoryView;
		inventoryView = (InventoryView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(InventoryView.ID);
		componentListTree = new ArrayList<Component>((List<Component>) inventoryView.getViewer().getInput());
		removeUnselectedComponents(componentListTree);
		viewer.setInput(componentListTree);
		viewer.expandAll();

		calculateOveralsForAppliation();

		viewer.getTree().update();
		viewer.refresh();
	}

	private void updateAbsoluteEfforts(Component seedComponent){

		BigDecimal absoluteEffort = seedComponent.getAbsoluteEffort();
		BigDecimal unitEffort = absoluteEffort.divide(EffortCalculator.INSTANCE.calculateEffortForComponent(seedComponent), BigDecimal.ROUND_HALF_UP);

		List<Component> componentList = flattenTreeInput(componentListTree);
		for (Component component : componentList) {
			if (!component.equals(seedComponent) && !Float.isNaN(component.getComplexity())) {
				BigDecimal totalAbsoluteEffort = new BigDecimal("0");
				for (MigrationStrategy strategy : component.getMigrationStrategies()){
					BigDecimal strategyAbsoluteEffort = unitEffort.multiply(new BigDecimal(EffortCalculator.INSTANCE.calculateEffortForStrategy(component, strategy)));
					strategy.setAbsoluteEffort(strategyAbsoluteEffort);
					totalAbsoluteEffort = totalAbsoluteEffort.add(strategyAbsoluteEffort);
				}
				component.setAbsoluteEffort(totalAbsoluteEffort);
			}
		}
	}

	@Override
	public void createPartControl(final Composite parent) {

		InventoryView inventoryView = (InventoryView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(InventoryView.ID);
		if (MigrationGoalsContainer.INSTANCE.getMigrationGoals() == null || !ComponentModelQuery.INSTANCE.isModelLoaded() ||
				inventoryView == null || inventoryView.getViewer() == null || inventoryView.getViewer().getInput() == null
		   ){

			GridLayout layout = new GridLayout(1, false);
			parent.setLayout(layout);

			GridData gridData = new GridData();
			gridData.verticalAlignment = GridData.CENTER;
			gridData.horizontalAlignment = GridData.CENTER;
			gridData.grabExcessHorizontalSpace = true;
			gridData.grabExcessVerticalSpace =  true;

			Label warningLabel = new Label(parent, SWT.NONE);
			warningLabel.setText("Migration Efforts View is activated from the Inventory View after the Migration Goals and the Component Model is loaded.");
			warningLabel.setLayoutData(gridData);
		}

		else {

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
							if (dialog.open() == Dialog.OK){
								BigDecimal totalAbsoluteEffort = new BigDecimal("0");
								for (MigrationStrategy strategy : component.getMigrationStrategies()){
									totalAbsoluteEffort = totalAbsoluteEffort.add(strategy.getAbsoluteEffort());
								}
								component.setAbsoluteEffort(totalAbsoluteEffort);
								if (firstEffortInput && !EffortDetailsDialog.firstEffortInput) {
									updateAbsoluteEfforts(component);
									firstEffortInput = false;
								}
								viewer.getTree().update();
								viewer.refresh();
								//If the application component is double clicked, the node collapses. The below check and action is added to avoid this.
								if (component.isApplicationLevelComponent()){
									viewer.expandAll();
								}
							}
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

			Label overallAppComplexity = new Label(container, SWT.BOLD);
			FontDescriptor boldDescriptor = FontDescriptor.createFrom(overallAppComplexity.getFont()).setStyle(SWT.BOLD);
			Font boldFont = boldDescriptor.createFont(overallAppComplexity.getDisplay());
			overallAppComplexity.setFont( boldFont );
			overallAppComplexity.setText("Average component complexity: ");
			lblAverageComponentComplexityText = new Label(container, SWT.NONE);

			Label lblOverallMigrationStrategyComplexity = new Label(container, SWT.BOLD);
			boldDescriptor = FontDescriptor.createFrom(lblOverallMigrationStrategyComplexity.getFont()).setStyle(SWT.BOLD);
			boldFont = boldDescriptor.createFont(lblOverallMigrationStrategyComplexity.getDisplay());
			lblOverallMigrationStrategyComplexity.setFont( boldFont );
			lblOverallMigrationStrategyComplexity.setText("Average migration strategy complexity: ");
			lblAverageMigrationStrategyComplexityText = new Label(container, SWT.NONE);

			Label lblOverallMigrationEffort = new Label(container, SWT.BOLD);
			boldDescriptor = FontDescriptor.createFrom(lblOverallMigrationEffort.getFont()).setStyle(SWT.BOLD);
			boldFont = boldDescriptor.createFont(lblOverallMigrationEffort.getDisplay());
			lblOverallMigrationEffort.setFont( boldFont );
			lblOverallMigrationEffort.setText("Overall migration effort: ");
			lblOverallMigrationEffortText = new Label(container, SWT.NONE);

			calculateOveralsForAppliation();
			
			applicationLevelComponent.setComplexity(Float.valueOf(averageComponentComplexity.toString()));
			viewer.getTree().update();
			viewer.refresh();

			getSite().getShell().getDisplay().asyncExec
			(new Runnable() {
				public void run() {
					MessageDialog.openInformation(
							parent.getShell(), "Absolute Efforts in PM", 
							"You can double click on any component's absolute effort cell and enter an effort estimation in person months. TFT will calculate the values for other tasks and components."
							);
				}
			});
		}
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
				if(!component.isApplicationLevelComponent() && component.getChildren().size() > 0){
					return "";
				}
				if (Float.isNaN(component.getComplexity())){
					return "Not Calculated";
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
				if (Float.isNaN(component.getComplexity())){
					return "Not Calculated: Component complexity unknown.";
				}
				return component.getMigrationStrategies().size() > 0 ? EffortCalculator.INSTANCE.calculateEffortForComponent(component).toString() : "Not Calculated: No assigned migration strategies.";
			}
		});

		//Absolute Effort
		column = createTreeViewerColumn(4);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				Component component = ((Component) element);

				if (!component.isApplicationLevelComponent() && component.getChildren().size() > 0){
					return "";
				}
				else {
					return component.getAbsoluteEffort().compareTo(new BigDecimal("0")) == 0 ? "" : component.getAbsoluteEffort().setScale(2, BigDecimal.ROUND_HALF_UP).toString();
				}
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

	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
		firstEffortInput = true;
		EffortDetailsDialog.firstEffortInput = true;
	}
}
