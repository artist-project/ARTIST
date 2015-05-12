package eu.artist.migration.cloudselection.ui.views;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;

import eu.artist.migration.cloudselection.ui.Utils;
import eu.artist.migration.cloudselection.umlmodelservice.modelparsing.Resources;
import eu.artist.migration.cloudselection.viewdatamodel.HelperElement;
import eu.artist.migration.cloudselection.viewdatamodel.LeafElement;
import eu.artist.migration.cloudselection.viewdatamodel.ModelElement;

public abstract class GenericView extends ViewPart{
	
	protected ViewContentProvider contentProv;
	
	private Action clear;
	private Action providerselection;
	private Action validateProvs;
	
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 2;
		layout.marginWidth = 0;
		layout.marginHeight = 2;
		parent.setLayout(layout);
		
		// layout the text field above the treeview
		GridData layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		
		// Create the tree viewer as a child of the composite parent
		TreeViewer treeViewer = new TreeViewer(parent);
		contentProv = new ViewContentProvider();
		treeViewer.setContentProvider(contentProv);
		treeViewer.setLabelProvider(new ViewLabelProvider());
		treeViewer.setUseHashlookup(true);
		
		// layout the tree viewer below the text field
		layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.grabExcessVerticalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.verticalAlignment = GridData.FILL;
		treeViewer.getControl().setLayoutData(layoutData);
		final Tree t = treeViewer.getTree();
		contentProv.setViewer(treeViewer);
		t.addMouseListener(new MouseListener(){
    		
	    	@Override
			public void mouseDown(MouseEvent e) {
				for(TreeItem item : t.getSelection()) {
					/*if((e.x > item.getImageBounds(0).x) && (e.x < (item.getImageBounds(0).x + item.getImage().getBounds().width))) {
						if((e.y > item.getImageBounds(0).y) && (e.y < (item.getImageBounds(0).y + item.getImage().getBounds().height))) {
					*/		ModelElement clickedElement = (ModelElement)item.getData();
							if (clickedElement instanceof LeafElement){
								boolean checked = ((LeafElement)clickedElement).isChecked(); 
								setChecked(clickedElement, !checked);
							}
					//	}
				//	}
				}
				
				contentProv.viewer.refresh();
			}

			@Override
			public void mouseUp(MouseEvent e) {
		}

			public void mouseDoubleClick(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

		});
		if (!Resources.isCoreLoaded()){
	 		 Resources.loadCoreResource();
	 	}
	 	contentProv.viewer.setInput(getInitalInput());
		contentProv.viewer.expandAll();
		contentProv.viewer.refresh();
		makeActions();
		contributeToActionBars();
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}
	
	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(clear);
		manager.add(validateProvs);
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(providerselection);
		manager.add(clear);
		manager.add(validateProvs);
	}

	private void makeActions() {
		clear = new Action() {
			public void run() {
				clearAll();
			}
		};
		clear.setText("Clear");
		clear.setToolTipText("Clear current selection");
		clear.setImageDescriptor(ImageDescriptor.createFromImage(Utils.createImage("clear.gif")));;
		
		providerselection = new Action(){
			public void run(){
				loadModels();
			}
		};
		providerselection.setText("Select providers");
		providerselection.setDescription("Select providers");
		providerselection.setImageDescriptor(ImageDescriptor.createFromImage(Utils.createImage("add_exc.gif")));
		
		validateProvs = new Action() {
			public void run(){
				validate();
			}
		};
		validateProvs.setText("Validate and suggest target platform");
		validateProvs.setDescription("Get the best target platform solution according to your selection");
		validateProvs.setImageDescriptor(ImageDescriptor.createFromImage(Utils.createImage("lrun_obj.gif")));
	}

	
	public void validate(){
		IWorkbenchWindow window = this.getViewSite().getWorkbenchWindow();
		IHandlerService handlerService = (IHandlerService)window.getService(IHandlerService.class);
		try {
			if (this instanceof ServiceFeaturesView){
				handlerService.executeCommand("eu.artist.migration.cloudselection.commands.validationServices", null);
			}
			else if (this instanceof CommonFeaturesView){
				handlerService.executeCommand("eu.artist.migration.cloudselection.commands.validationCommons", null);
			}	
		} catch (ExecutionException | NotDefinedException
				| NotEnabledException | NotHandledException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setChecked(ModelElement item, boolean checked){
		contentProv.viewer.refresh();
		if (item instanceof LeafElement){
			((LeafElement)item).setChecked(checked);
			if (contentProv.getChildren(item)!=null){
				Object[] elements = contentProv.getChildren(item);
				for (int i=0; i<elements.length; i++){
					setChecked((ModelElement)elements[i], checked);
				}
			}
		}
	}
	
	public void loadModels(){
		IWorkbenchWindow window = this.getViewSite().getWorkbenchWindow();
		IHandlerService handlerService = (IHandlerService)window.getService(IHandlerService.class);
		try {
			handlerService.executeCommand("eu.artist.migration.cloudselection.commands.ProviderSelection", null);
		} catch (ExecutionException | NotDefinedException | NotEnabledException
				| NotHandledException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void clearAll(){
		Object root = contentProv.viewer.getInput();
		if (root instanceof HelperElement)
			uncheck(((HelperElement)root).getChildren());
		contentProv.viewer.refresh();
	}
	
	public void uncheck (List<ModelElement> elements){
		for (int i=0; i<elements.size(); i++){
			ModelElement element = elements.get(i);
			if (element instanceof LeafElement){
				((LeafElement)element).setChecked(false);
			}
			else if (element instanceof HelperElement){
				uncheck(((HelperElement)element).getChildren());
			}
		}
	}
	
	public ModelElement getRoot(){
		Object root = contentProv.viewer.getInput();
		if (root instanceof HelperElement)
			return (HelperElement)root;
		else return null;
	}

	public Tree getTree(){
		return contentProv.viewer.getTree();
	}
	
	public TreeViewer getTreeViewer(){
		return contentProv.viewer;
	}

	public Set<LeafElement> findCheckedRoot(){
		Set<LeafElement> checked = new HashSet<LeafElement>();
		Object root = contentProv.viewer.getInput();
		if (root instanceof HelperElement)
			findChecked((HelperElement)root, checked);
		return checked;
	}
	
	protected void findChecked(ModelElement inputRoot, Set<LeafElement> checked){
		if (inputRoot instanceof HelperElement){
			List<ModelElement> startingList = ((HelperElement) inputRoot).getChildren();
			int count = startingList.size();
			for (int i=0; i<count; i++){
				ModelElement curEl = startingList.get(i);
				if (curEl instanceof HelperElement){
					findChecked(curEl, checked);
				}
				else if (curEl instanceof LeafElement){
					if (((LeafElement) curEl).isChecked()){
						checked.add((LeafElement)curEl);
					}
				}
			}
		}
	}
	
	public void setFocus(){
		contentProv.viewer.getControl().setFocus();
	}
	public HelperElement getInitalInput(){
		HelperElement root = new HelperElement();
		return root;
	}
}
