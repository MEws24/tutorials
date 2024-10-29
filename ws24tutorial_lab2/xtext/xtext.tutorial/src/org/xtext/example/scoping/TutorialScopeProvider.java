package org.xtext.example.scoping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import tutorial.BasicItemType;
import tutorial.ComplexItemType;
import tutorial.Component;
import tutorial.Factory;
import tutorial.ItemConnection;
import tutorial.ItemType;
import tutorial.Marker;
import tutorial.TutorialPackage;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */

public class TutorialScopeProvider extends AbstractDeclarativeScopeProvider {
	
	public IScope scope_Component_itemType(Component component, EReference eReference) {
		if (eReference.equals(TutorialPackage.Literals.COMPONENT__ITEM_TYPE))  {
			Factory factory = (Factory) component.eContainer().eContainer();
			List<ItemType> itemTypes = factory.getItemTypes().stream()
					.filter(itemType -> itemType instanceof BasicItemType)
					.collect(Collectors.toList());
			return Scopes.scopeFor(itemTypes);
		}
		return IScope.NULLSCOPE;
	}
	
	public IScope scope_ItemConnection_markerA(ItemConnection itemConnection, EReference eReference) {
		if (eReference.equals(TutorialPackage.Literals.ITEM_CONNECTION__MARKER_A))  {
			List<Marker> markersToExclude = itemConnection.getComponentB().getItemType().getMarkers();
			ComplexItemType complexItem = (ComplexItemType) itemConnection.eContainer();
			List<Marker> markers = new ArrayList<Marker>();
			for(Component component: complexItem.getComponents()) {
				for(Marker marker: component.getItemType().getMarkers()) {
					if(!markersToExclude.contains(marker)) {
						markers.add(marker);
					}
				}
			}
			return Scopes.scopeFor(markers);
		}
		return IScope.NULLSCOPE;
	}
	
}
