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
 * A representation of the model object '<em><b>CIM Entries In Filter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a specialization of the CIM_Component aggregation which is used to define a set of filter entries (subclasses of FilterEntryBase) that are aggregated by a particular FilterList.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EntriesInFilterList#getEntrySequence <em>Entry Sequence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EntriesInFilterList()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Network::Filtering' override.GroupComponent='CIM_FilterList REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The FilterList, which aggregates the set of FilterEntries.' override.PartComponent='CIM_FilterEntryBase REF' override.PartComponent.Description='Any subclass of FilterEntryBase which is a part of the FilterList.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_EntriesInFilterList extends CIM_Component {
	/**
	 * Returns the value of the '<em><b>Entry Sequence</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The order of the Entry relative to all others in the FilterList. The only permissible value is zero - indicating that all the Entries are ANDed together.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Sequence</em>' attribute.
	 * @see #setEntrySequence(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EntriesInFilterList_EntrySequence()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\"]'"
	 * @generated
	 */
	Integer getEntrySequence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EntriesInFilterList#getEntrySequence <em>Entry Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Sequence</em>' attribute.
	 * @see #getEntrySequence()
	 * @generated
	 */
	void setEntrySequence(Integer value);

} // CIM_EntriesInFilterList
