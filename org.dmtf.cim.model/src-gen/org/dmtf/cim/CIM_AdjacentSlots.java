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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Adjacent Slots</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AdjacentSlots describes the layout of Slots on a HostingBoard or adapter Card. Information like the distance between the Slots and whether they are 'shared' (if one is populated, then the other Slot can not be used), is conveyed as properties of the association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AdjacentSlots#getSlotA <em>Slot A</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdjacentSlots#getSlotB <em>Slot B</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdjacentSlots#getDistanceBetweenSlots <em>Distance Between Slots</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdjacentSlots#getSharedSlots <em>Shared Slots</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AdjacentSlots()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Connector' keys='SlotA,SlotB'"
 * @generated
 */
@ProviderType
public interface CIM_AdjacentSlots extends EObject {
	/**
	 * Returns the value of the '<em><b>Slot A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One of the adjacent Slots.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot A</em>' reference.
	 * @see #setSlotA(CIM_Slot)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdjacentSlots_SlotA()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Slot REF' Key='true'"
	 * @generated
	 */
	CIM_Slot getSlotA();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdjacentSlots#getSlotA <em>Slot A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot A</em>' reference.
	 * @see #getSlotA()
	 * @generated
	 */
	void setSlotA(CIM_Slot value);

	/**
	 * Returns the value of the '<em><b>Slot B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 'other' adjacent Slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot B</em>' reference.
	 * @see #setSlotB(CIM_Slot)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdjacentSlots_SlotB()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Slot REF' Key='true'"
	 * @generated
	 */
	CIM_Slot getSlotB();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdjacentSlots#getSlotB <em>Slot B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot B</em>' reference.
	 * @see #getSlotB()
	 * @generated
	 */
	void setSlotB(CIM_Slot value);

	/**
	 * Returns the value of the '<em><b>Distance Between Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The distance, in inches, between adjacent Slots.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance Between Slots</em>' attribute.
	 * @see #setDistanceBetweenSlots(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdjacentSlots_DistanceBetweenSlots()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Inches' PUnit='inch'"
	 * @generated
	 */
	Float getDistanceBetweenSlots();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdjacentSlots#getDistanceBetweenSlots <em>Distance Between Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Between Slots</em>' attribute.
	 * @see #getDistanceBetweenSlots()
	 * @generated
	 */
	void setDistanceBetweenSlots(Float value);

	/**
	 * Returns the value of the '<em><b>Shared Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Slots can be located in close proximity on Hosting Boards or other Cards, such that if one of these Slots is populated by an adapter Card, the other Slot must be left empty. This relationship is indicated by the SharedSlots boolean set to TRUE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shared Slots</em>' attribute.
	 * @see #setSharedSlots(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdjacentSlots_SharedSlots()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSharedSlots();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdjacentSlots#getSharedSlots <em>Shared Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Slots</em>' attribute.
	 * @see #getSharedSlots()
	 * @generated
	 */
	void setSharedSlots(Boolean value);

} // CIM_AdjacentSlots
