package be.kuleuven.rodinia.transform.rfsm.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

import be.kuleuven.rodinia.transform.rfsm.Activator;
import be.kuleuven.rodinia.transform.rfsm.Component;
import be.kuleuven.rodinia.epsilon.service.egl.EglTransformParameter;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class StructureHandler extends AbstractHandler {

	private IResource resource;

	public StructureHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) currentSelection).getFirstElement();
			if(firstElement instanceof IResource) {
				resource = (IResource) firstElement;
				String projectPath = resource.getProject().getLocation().toOSString();
				doTransformations(projectPath);
			}
					}
		return null;
	}

	private void doTransformations(String projectPath) {
		doEglTransformation(projectPath);
	}

	private void doEglTransformation(String projectPath) {
		EglTransformParameter transformParameter = new EglTransformParameter();
		
		String eglTransformFileName = "epsilon/package.egl";
		String outputRoot = projectPath;
		String pluginID = Activator.PLUGIN_ID;
		String sourceMetaModelURI = "be.kuleuven.rodinia.model.rfsm";
		String sourceModelFilePath = resource.getLocation().toOSString();
		boolean sourceReadOnLoad = true;
		boolean sourceStoreOnDisposal = false;
		String transformName = "rFSM EGL Transform";
		
		transformParameter.setTransformName(transformName);
		transformParameter.setEglTransformFileName(eglTransformFileName);
		transformParameter.setOutputRoot(outputRoot);
		transformParameter.setPluginID(pluginID);
		transformParameter.setSourceMetaModelURI(sourceMetaModelURI);
		transformParameter.setSourceModelFilePath(sourceModelFilePath);
		transformParameter.setSourceReadOnLoad(sourceReadOnLoad);
		transformParameter.setSourceStoreOnDisposal(sourceStoreOnDisposal);
		
		Component componentInstance = Component.getInstance();
		componentInstance.getEglTransformService().doEglTransform(transformParameter);
	}
}
