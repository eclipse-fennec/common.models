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
 * A representation of the model object '<em><b>CIM Chassis In Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Racks, as simple enclosures, contain Chassis that provide the physical componentry realizing processing nodes, storage devices, UPSs, etc. The ChassisInRack association makes explicit the 'containing' relationship between the Rack and the Chassis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ChassisInRack#getBottomU <em>Bottom U</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ChassisInRack()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.21.0' UMLPackagePath='CIM::Physical::Package' override.GroupComponent='CIM_Rack REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The Rack that contains the Chassis.' override.PartComponent='CIM_Chassis REF' override.PartComponent.Description='The Chassis which is mounted in the Rack.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ChassisInRack extends CIM_Container {
	/**
	 * Returns the value of the '<em><b>Bottom U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer indicating the lowest or 'bottom' U in which the Chassis is mounted. A 'U' is a standard unit of measure for the height of a Rack or rack-mountable component. It is equal to 1.75 inches or 4.445 cm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bottom U</em>' attribute.
	 * @see #setBottomU(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ChassisInRack_BottomU()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Us' PUnit='rack unit'"
	 * @generated
	 */
	Integer getBottomU();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ChassisInRack#getBottomU <em>Bottom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom U</em>' attribute.
	 * @see #getBottomU()
	 * @generated
	 */
	void setBottomU(Integer value);

} // CIM_ChassisInRack
