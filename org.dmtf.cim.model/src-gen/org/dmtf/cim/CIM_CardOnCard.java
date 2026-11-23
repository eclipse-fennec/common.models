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
 * A representation of the model object '<em><b>CIM Card On Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Cards may be plugged into Motherboards/baseboards, are daughtercards of an adapter, or support special Card-like modules. These relationships are described by the CardOnCard association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CardOnCard#getMountOrSlotDescription <em>Mount Or Slot Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CardOnCard()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Package' override.GroupComponent='CIM_Card REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The Card that hosts another Card.' override.PartComponent='CIM_Card REF' override.PartComponent.Description='The Card that is plugged into or otherwise mounted on another Card.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_CardOnCard extends CIM_Container {
	/**
	 * Returns the value of the '<em><b>Mount Or Slot Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing and identifying how the Card is mounted on or plugged into the 'other' Card. Slot information could be included in this field and may be sufficient for certain management purposes. If so, this avoids creating instantiations of Connector/Slot objects just to model the relationship of Cards to HostingBoards or other adapters. On the other hand, if Slot and Connector information is available, this field could be used to provide more detailed mounting or slot insertion data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mount Or Slot Description</em>' attribute.
	 * @see #setMountOrSlotDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CardOnCard_MountOrSlotDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getMountOrSlotDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CardOnCard#getMountOrSlotDescription <em>Mount Or Slot Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Or Slot Description</em>' attribute.
	 * @see #getMountOrSlotDescription()
	 * @generated
	 */
	void setMountOrSlotDescription(String value);

} // CIM_CardOnCard
