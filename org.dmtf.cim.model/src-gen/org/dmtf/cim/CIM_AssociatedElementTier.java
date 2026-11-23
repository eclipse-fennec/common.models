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
 * A representation of the model object '<em><b>CIM Associated Element Tier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Define the association between an element and one or more storage tiers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedElementTier#getAllocated <em>Allocated</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedElementTier()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.GroupComponent='CIM_StorageTier REF' override.GroupComponent.Key='true' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The storage tier in the association.' override.PartComponent='CIM_LogicalElement REF' override.PartComponent.Key='true' override.PartComponent.Description='The element in the association.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedElementTier extends CIM_Component {
	/**
	 * Returns the value of the '<em><b>Allocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates what portion of the element is associated with (allocated from) this storage tier. None: Indicates the element is associated with this storage tier; however, currently none of the element's blocks are allocated from this storage tier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocated</em>' attribute.
	 * @see #setAllocated(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedElementTier_Allocated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"All\",\"Partial\",\"None\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getAllocated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedElementTier#getAllocated <em>Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated</em>' attribute.
	 * @see #getAllocated()
	 * @generated
	 */
	void setAllocated(Integer value);

} // CIM_AssociatedElementTier
