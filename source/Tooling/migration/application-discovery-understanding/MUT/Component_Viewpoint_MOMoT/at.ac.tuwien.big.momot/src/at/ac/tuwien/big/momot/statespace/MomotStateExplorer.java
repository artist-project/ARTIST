package at.ac.tuwien.big.momot.statespace;

import java.lang.reflect.Field;
import java.util.List;

import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.impl.StateExplorer;

public class MomotStateExplorer extends StateExplorer {
	
	public MomotStateExplorer(StateSpaceIndex index) {
		super(index);
		Field engineField;
		try {
			engineField = StateExplorer.class.getDeclaredField("engine");
			engineField.setAccessible(true);
			@SuppressWarnings("unused")
			Engine engine = (Engine) engineField.get(this);
			
			Field field = StateExplorer.class.getDeclaredField("application");
			field.setAccessible(true);
//			field.set(this, new MomotRuleApplication(engine));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public List<Transition> doExplore(State state) throws StateSpaceException {
		System.out.println("MomotStateExplorer.doExplore()");
		return super.doExplore(state);
	}
}
