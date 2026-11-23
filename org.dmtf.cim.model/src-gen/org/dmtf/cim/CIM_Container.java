/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Container association represents the relationship between a contained and a containing PhysicalElement. A containing object must be a PhysicalPackage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Container#getLocationWithinContainer <em>Location Within Container</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Container()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Package' override.GroupComponent='CIM_PhysicalPackage REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The PhysicalPackage that contains other PhysicalElements, including other Packages.' override.GroupComponent.MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalContainedIn\"]' override.PartComponent='CIM_PhysicalElement REF' override.PartComponent.Description='The PhysicalElement which is contained in the Package.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_Container extends CIM_Component {
	/**
	 * Returns the value of the '<em><b>Location Within Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string representing the positioning of the PhysicalElement within the PhysicalPackage. Information relative to stationary elements in the Container (for example, 'second drive bay from the top'), angles, altitudes and other data may be recorded in this property. This string could supplement or be used in place of instantiating the CIM_Location object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Within Container</em>' attribute.
	 * @see #setLocationWithinContainer(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Container_LocationWithinContainer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|Entity-MIB.entPhysicalParentRelPos\"]'"
	 * @generated
	 */
	String getLocationWithinContainer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Container#getLocationWithinContainer <em>Location Within Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Within Container</em>' attribute.
	 * @see #getLocationWithinContainer()
	 * @generated
	 */
	void setLocationWithinContainer(String value);

} // CIM_Container
