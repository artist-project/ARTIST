/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Muzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.views;

import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.internal.ui.viewsupport.SelectionProviderMediator;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.eclipse.client.commands.AddArtefactToCategory;
import eu.artist.reusevol.repo.eclipse.client.commands.AddArtefactToTagAction;
import eu.artist.reusevol.repo.eclipse.client.commands.AddCategorytoArtefactAction;
import eu.artist.reusevol.repo.eclipse.client.commands.AddTagtoArtefactAction;
import eu.artist.reusevol.repo.eclipse.client.commands.CreateCategoryAction;
import eu.artist.reusevol.repo.eclipse.client.commands.CreateProjectAction;
import eu.artist.reusevol.repo.eclipse.client.commands.DeleteArtefactAction;
import eu.artist.reusevol.repo.eclipse.client.commands.DeleteCategoryAction;
import eu.artist.reusevol.repo.eclipse.client.commands.DeleteProjectAction;
import eu.artist.reusevol.repo.eclipse.client.commands.DownloadArtefactAction;
import eu.artist.reusevol.repo.eclipse.client.commands.RemoveArtefactsFromCategoryAction;
import eu.artist.reusevol.repo.eclipse.client.commands.RemoveArtefactsFromTagAction;
import eu.artist.reusevol.repo.eclipse.client.commands.RemoveCategoryFromArtefactAction;
import eu.artist.reusevol.repo.eclipse.client.commands.RemoveTagfromArtefact;
import eu.artist.reusevol.repo.eclipse.client.filter.HideEmptyCategoryFilter;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.model.RepoServer;
import eu.artist.reusevol.repo.eclipse.client.model.TableModel;
import eu.artist.reusevol.repo.eclipse.client.provider.CategoryTreeContentProvider;
import eu.artist.reusevol.repo.eclipse.client.provider.StructureTreeContentProvider;
import eu.artist.reusevol.repo.eclipse.client.provider.TagTreeContentProvider;
import eu.artist.reusevol.repo.eclipse.client.provider.TreeLabelProvider;

/**
 * TreeView : provides tree view implementation of repository elements in
 * hierarchical components.
 * 
 * **/



public class RepoProjectView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView";

	protected static final String Artifact = null;

	public TreeViewer viewer;
	private StructureTreeContentProvider contentProvider;
	private CategoryTreeContentProvider categorycontentProvider;
	private TagTreeContentProvider tagcontentProvider;

	public TableViewer tableViewer;
	private boolean displayCategoryArtifacts;
    
	// artefacts action 
	private Action downloadArtefactAction;
	private Action deleteArtefactAction;
	private Action addArtefactToCategoryAction;
	private Action removeArtefactToCategoryAction;
	private Action addArtefactToTagAction;
	private Action removeArtefactToTagAction;
	private Action downloadArtefactActionTable;
	
	
	private Action openRepoCategoryView;
	private Action openTagView;
	private Action openRepoProjectView;
	private Action openFullArtifactsList;
	private Action forceRefreshButton;
	private Action deleteProjectAction;
	
	private Action createProjectAction;
	private Action createCategoryAction;
	private Action deleteCategoryAction;
	

	private Action addCategorytoArtefactAction;
	private Action removeCategorytoArtefactAction;
	private Action addTagtoArtefactAction;
	private Action removeTagtoArtefactAction;
	
	
	protected Action hideEmptyCategories;
	protected ViewerFilter  hideCategoryFilter;
	
	private Action expandAllAction;
	private Action collapseAllAction;

	private Action addTagtoArtefactActionTable;
	private Action deleteArtefactActionTable;
	private Action removeTagtoArtefactActionTable;
	private Action addCategorytoArtefactActionTable;
	private Action removeCategorytoArtefactActionTable;
	

	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public RepoProjectView() {
		displayCategoryArtifacts = false;
	}
	
	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));

		viewer = new TreeViewer(parent);
		viewer.setContentProvider(getrepoContentProvider());
		viewer.setLabelProvider(new TreeLabelProvider());
		viewer.setAutoExpandLevel(4);

		createTableViewer(parent);

		// / for two views in one wrapper ( table and tree ) we need to create a
		// wrapper and then add setslection provider on that wrapper.

		StructuredViewer[] viewerCollection = { viewer, tableViewer };
		SelectionProviderMediator wrapper = new SelectionProviderMediator(
				viewerCollection, tableViewer);
		getSite().setSelectionProvider(wrapper);

		viewer.setUseHashlookup(true);
		LocalRepositoryModel model = LocalRepositoryModel.getInstance();
		viewer.setInput(model);

		// Create the help context id for the viewer's control
		PlatformUI
				.getWorkbench()
				.getHelpSystem()
				.setHelp(viewer.getControl(),
						"eu.artist.reusevol.repo.eclipse.client.viewer");
		makeActions();
		hookContextMenu();
		contributeToActionBars();
		hookSelectionCategoryAction();
		createFilters();

		// For some reason this is ignored
		switchToProjectView();
	}
	
	protected void createFilters() {
		hideCategoryFilter = 	new HideEmptyCategoryFilter();	
	}

	public StructureTreeContentProvider getrepoContentProvider() {
		if (contentProvider == null) {
			contentProvider = new StructureTreeContentProvider();
		}
		return contentProvider;
	}

	public CategoryTreeContentProvider getCategoryContentProvider() {
		if (categorycontentProvider == null) {
			categorycontentProvider = new CategoryTreeContentProvider();
		}
		return categorycontentProvider;
	}

	public TagTreeContentProvider getTagContentProvider() {
		if (tagcontentProvider == null) {
			tagcontentProvider = new TagTreeContentProvider();
		}
		return tagcontentProvider;
	}
	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void fillContextMenu(IMenuManager manager) {
		ISelection selection = viewer.getSelection();
		Object obj = ((IStructuredSelection) selection).getFirstElement();

		if (obj instanceof RepoServer) {
			manager.add(createProjectAction);
			manager.add(new Separator());
		} else if (obj instanceof RepoProject) {
			manager.add(deleteProjectAction);
			manager.add(new Separator());
		} else if (obj instanceof RepoPackage) {
			// Noop for now
		} else if (obj instanceof RepoArtefact) {
			manager.add(downloadArtefactAction);
			manager.add(deleteArtefactAction);
			manager.add(addCategorytoArtefactAction);
			manager.add(removeCategorytoArtefactAction);
			manager.add(addTagtoArtefactAction);
			manager.add(removeTagtoArtefactAction);
			manager.add(new Separator());
			
		} else if (obj instanceof RepoCategory) {
			manager.add(createCategoryAction);
			manager.add(deleteCategoryAction);
			manager.add(addArtefactToCategoryAction);
			manager.add(removeArtefactToCategoryAction);
				
			manager.add(new Separator());
		}else if (obj instanceof String) {  // for Tag 
			manager.add(addArtefactToTagAction);
			manager.add(removeArtefactToTagAction);	
			manager.add(new Separator());		
		} else {
			if (viewer.getContentProvider() instanceof CategoryTreeContentProvider) {
				// Add action for category view canvas
				manager.add(createCategoryAction);
				manager.add(deleteCategoryAction);
				manager.add(addArtefactToCategoryAction);
				manager.add(removeArtefactToCategoryAction);		
				manager.add(new Separator());
			} else {
				// Add action for project view canvas
			}
		}
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(downloadArtefactAction);
	}

	private void fillLocalToolBar(IToolBarManager manager) {	
		manager.add(openRepoProjectView);
		manager.add(openRepoCategoryView);
		manager.add(openTagView);
		manager.add(new Separator());
		manager.add(forceRefreshButton);
	    manager.add(openFullArtifactsList);
		manager.add(hideEmptyCategories);
		manager.add(new Separator());
		manager.add(expandAllAction);
		manager.add(collapseAllAction);
	}

	private static ImageDescriptor getImage(String file) {
		Bundle bundle = FrameworkUtil.getBundle(TreeLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path("icons/" + file), null);
		ImageDescriptor image = ImageDescriptor.createFromURL(url);
		return image;
	}

	private void makeActions() {
		// adding button for hiding empty category view 
		hideEmptyCategories = new Action("Hide Empty Category ", IAction.AS_CHECK_BOX) {
					public void run() {		
						updateFilter(hideEmptyCategories);
					}
				};
				
	//	hideEmptyCategories.setChecked(true);
		hideEmptyCategories.setText("Hide Empty Category");
		hideEmptyCategories.setToolTipText("Hide Empty Category");
		hideEmptyCategories.setImageDescriptor(getImage("hideIcon.jpg"));
		
		// adding button for category view opening
		openRepoProjectView = new Action("Project View", IAction.AS_CHECK_BOX) {
			public void run() {
				switchToProjectView();
			}
		};
		openRepoProjectView.setChecked(true);
		openRepoProjectView.setText("Project View");
		openRepoProjectView.setToolTipText("Project View");
		openRepoProjectView.setImageDescriptor(getImage("project_custom.png"));

		// adding button for manual refresh 
		forceRefreshButton = new Action() {
			public void run() {
				LocalRepositoryModel model = LocalRepositoryModel.getInstance();
				model.retriveData();
				viewer.refresh();
			}
		};
		forceRefreshButton.setText("Refresh View");
		forceRefreshButton.setToolTipText("Refresh View");
		forceRefreshButton.setImageDescriptor(getImage("refresh.png"));

		// adding button for expand all 
		expandAllAction = new Action() {
					public void run() {
						
						viewer.expandAll();
					}
				};
				expandAllAction.setText("Expand All");
				expandAllAction.setToolTipText("Expand All");
				expandAllAction.setImageDescriptor(getImage("expand.png"));
				
				// adding button for collapse all 
				collapseAllAction = new Action() {
							public void run() {
								viewer.collapseAll();
							}
						};
						collapseAllAction.setText("Collapse All");
						collapseAllAction.setToolTipText("Collapse All");
						collapseAllAction.setImageDescriptor(getImage("collapse.png"));	
		
		// adding button for category view opening
		openRepoCategoryView = new Action("Category View", IAction.AS_CHECK_BOX) {
			public void run() {
				switchToCategoryView();
			}
		};
		openRepoCategoryView.setToolTipText("Category View");
		openRepoCategoryView.setImageDescriptor(getImage("category_custom.png"));
		
		openTagView = new Action("Tag View", IAction.AS_CHECK_BOX) {
			public void run() {
				switchToTagView();
			}
		};
		openTagView.setToolTipText("Tag View");
		openTagView.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_TASK_TSK));
		
		openFullArtifactsList = new Action("Category", IAction.AS_CHECK_BOX) {
			public void run() {
				displayCategoryArtifacts = !(displayCategoryArtifacts);
			}
		};
		openFullArtifactsList.setText("Category");
		openFullArtifactsList.setToolTipText("Include all sub-categories");
		openFullArtifactsList.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
  
		downloadArtefactAction = new DownloadArtefactAction(viewer);
		deleteArtefactAction = new DeleteArtefactAction(viewer);
		addTagtoArtefactAction = new AddTagtoArtefactAction(viewer);
		removeTagtoArtefactAction = new RemoveTagfromArtefact(viewer);
		addCategorytoArtefactAction = new AddCategorytoArtefactAction(viewer);
		removeCategorytoArtefactAction = new RemoveCategoryFromArtefactAction(viewer);
		
		deleteProjectAction = new DeleteProjectAction(viewer);
		createProjectAction = new CreateProjectAction(viewer);
		createCategoryAction = new CreateCategoryAction(viewer);
		deleteCategoryAction = new DeleteCategoryAction(viewer);
		addArtefactToCategoryAction = new AddArtefactToCategory(viewer);
		removeArtefactToCategoryAction = new RemoveArtefactsFromCategoryAction(viewer);
		addArtefactToTagAction  = new AddArtefactToTagAction(viewer);
		removeArtefactToTagAction  = new RemoveArtefactsFromTagAction(viewer);
		
	}
	
	/* Multiple filters can be enabled at a time. */
	protected void updateFilter(Action action) {
		if(action == hideEmptyCategories) {
			if(action.isChecked()) {
				viewer.addFilter(hideCategoryFilter);
			} else {
				viewer.removeFilter(hideCategoryFilter);
				viewer.expandAll();
			}	
	     }
	
	  }

	private void switchToProjectView() {
		viewer.setContentProvider(getrepoContentProvider());
		viewer.expandToLevel(3);

		viewer.getControl().setSize(viewer.getControl().getParent().getSize());
		tableViewer.getControl().setSize(0,
				tableViewer.getControl().getSize().y);

		openFullArtifactsList.setEnabled(false);
		openRepoProjectView.setEnabled(true);
		openRepoCategoryView.setChecked(false);
		openTagView.setChecked(false);
	}

	private void switchToCategoryView() {
		viewer.setContentProvider(getCategoryContentProvider());
		viewer.expandToLevel(3);
	
		Point parentSize = viewer.getControl().getParent().getSize();
		viewer.getControl().setSize(parentSize.x / 2, parentSize.y);
		tableViewer.getControl().setSize(parentSize.x / 2, parentSize.y);

		openFullArtifactsList.setEnabled(true);
		openRepoProjectView.setChecked(false);
		openRepoCategoryView.setEnabled(true);
		openTagView.setChecked(false);
		
	}

	private void switchToTagView() {
		viewer.setContentProvider(getTagContentProvider());
		//viewer.expandToLevel(3);
	
		Point parentSize = viewer.getControl().getParent().getSize();
		viewer.getControl().setSize(parentSize.x / 2, parentSize.y);
		tableViewer.getControl().setSize(parentSize.x / 2, parentSize.y);

		openFullArtifactsList.setEnabled(false);
		openRepoProjectView.setChecked(false);
		openRepoCategoryView.setChecked(false);
		openTagView.setEnabled(true);
		
	}
	private void hookSelectionCategoryAction() {

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				LocalRepositoryModel model = LocalRepositoryModel.getInstance();

				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				if (obj instanceof RepoCategory) {
					RepoCategory selectedCategory = (RepoCategory) obj;
					Set<RepoArtefact> artifactsListforCat = new HashSet<RepoArtefact>();
					artifactsListforCat.addAll(model
							.getArtefactsForCategory(selectedCategory.getId()));

					tableViewer.setInput(null);

					if (displayCategoryArtifacts) {
						collectArtefactsFromSubcategroies(selectedCategory,
								artifactsListforCat);
					}

					if (artifactsListforCat.size() > 0) {
						for (RepoArtefact artefact : artifactsListforCat) {
							RepoProject project = model
									.getProjectfromSelectedArtifact(artefact);
							tableViewer.add(new TableModel(project, artefact));
						}
					}
				}
				
				if (obj instanceof String) {
					String selectedTag = (String) obj;
					Set<RepoArtefact> artifactsListforCat = new HashSet<RepoArtefact>();
					artifactsListforCat.addAll(model.getArtefactsForTag(selectedTag));

					tableViewer.setInput(null);

					if (artifactsListforCat.size() > 0) {
						for (RepoArtefact artefact : artifactsListforCat) {
							RepoProject project = model
									.getProjectfromSelectedArtifact(artefact);
							tableViewer.add(new TableModel(project, artefact));
						}
					}
				}
				
			}
		});
	}

	private void collectArtefactsFromSubcategroies(RepoCategory parent,
			Set<RepoArtefact> artefacts) {
		LocalRepositoryModel model = LocalRepositoryModel.getInstance();

		for (RepoCategory subCat : parent.getCategories()) {
			List<RepoArtefact> found = model.getArtefactsForCategory(subCat
					.getId());
			artefacts.addAll(found);
			collectArtefactsFromSubcategroies(subCat, artefacts);
		}
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	// //////////////////////////////////////////////////////////// TableViewer

	private void createTableViewer(Composite parent) {
		tableViewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		createColumns(parent, tableViewer);
		final Table table = tableViewer.getTable();

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		tableViewer.setContentProvider(new ArrayContentProvider());
		getSite().setSelectionProvider(tableViewer);
		tableViewer.setInput(null);

		// define layout for the viewer
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 1;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.BEGINNING;
		tableViewer.getControl().setLayoutData(gridData);
		menuDisplayTableRow();
	}

	private void menuDisplayTableRow() {
		MenuManager manager = new MenuManager();
		tableViewer.getControl().setMenu(
				manager.createContextMenu(tableViewer.getControl()));
		
		downloadArtefactActionTable = new DownloadArtefactAction(tableViewer);
		deleteArtefactActionTable = new DeleteArtefactAction(tableViewer);
		addTagtoArtefactActionTable = new AddTagtoArtefactAction(tableViewer);
		removeTagtoArtefactActionTable = new RemoveTagfromArtefact(tableViewer);
		addCategorytoArtefactActionTable = new AddCategorytoArtefactAction(tableViewer);
		removeCategorytoArtefactActionTable = new RemoveCategoryFromArtefactAction(tableViewer);
	
		deleteArtefactActionTable.setEnabled(true); 
		addTagtoArtefactActionTable.setEnabled(true) ;
		removeTagtoArtefactActionTable.setEnabled(true) ;
		addCategorytoArtefactActionTable.setEnabled(true) ;
		removeCategorytoArtefactActionTable.setEnabled(true); 
	
		
		manager.add(downloadArtefactActionTable);
		manager.add(deleteArtefactActionTable);
		manager.add(addTagtoArtefactActionTable);
		manager.add(removeTagtoArtefactActionTable);
		manager.add(addCategorytoArtefactActionTable);
		manager.add(removeCategorytoArtefactActionTable);
	}

	// create the columns for the table
	private void createColumns(final Composite parent, final TableViewer viewer) {
		createTableViewerColumn("Project", 100, 0, new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((TableModel) element).getProjectName();
			}
		});

		createTableViewerColumn("Package", 100, 1, new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((TableModel) element).getPackageName();
			}
		});

		createTableViewerColumn("Artefact Id", 100, 2,
				new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
						return ((TableModel) element).getArtefactId();
					}
				});

		createTableViewerColumn("Artefact Name", 100, 3,
				new ColumnLabelProvider() {
					@Override
					public String getText(Object element) {
						return ((TableModel) element).getArtefactName();
					}
				});
	}

	private TableViewerColumn createTableViewerColumn(String title, int bound,
			int colNumber, ColumnLabelProvider labelProvider) {
		TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		viewerColumn.setLabelProvider(labelProvider);

		TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);

		return viewerColumn;
	}

	public TreeViewer getViewer() {
		return viewer;
	}
}
