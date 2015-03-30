package eu.artist.premigration.tft.tft.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import eu.artist.premigration.tft.tft.views.InventoryView;
import eu.artist.premigration.tft.tft.views.MigrationEffortsView;
import eu.artist.premigration.tft.tft.views.MigrationGoalsView;

public class TFTPerspectiveFactory implements IPerspectiveFactory {

	 private static final float LEFT_RATIO = 0.25F;
	 
	 private static final float RIGHT_RATIO = 0.75F;
	 
	 private static final float BOTTOM_RATIO = 0.75F;

	@Override
	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();

		// Add View in left side area of the editor space
		IFolderLayout leftLayout = layout.createFolder("leftLayout", IPageLayout.LEFT, LEFT_RATIO, editorArea);
		leftLayout.addView(IPageLayout.ID_PROJECT_EXPLORER);
		leftLayout.addPlaceholder(IPageLayout.ID_BOOKMARKS);

		// Add View in right side area of the editor space
		IFolderLayout rightLayout = layout.createFolder("rightLayout", IPageLayout.RIGHT, RIGHT_RATIO, editorArea);
		rightLayout.addView(MigrationGoalsView.ID);

		// Add View in the bottom area in separate way
		IFolderLayout bottomLayout = layout.createFolder("bottomLayout", IPageLayout.BOTTOM, BOTTOM_RATIO, editorArea);
		bottomLayout.addView(InventoryView.ID);
		bottomLayout.addView(MigrationEffortsView.ID);
	}

}
