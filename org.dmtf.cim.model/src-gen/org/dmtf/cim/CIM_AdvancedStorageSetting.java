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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Advanced Storage Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This subclass of StorageSetting allows a client to specify advanced settings that can be applied to creating and manipulating elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AdvancedStorageSetting#getInitialStorageTierMethodology <em>Initial Storage Tier Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdvancedStorageSetting#getInitialStorageTieringSelection <em>Initial Storage Tiering Selection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdvancedStorageSetting#getRelativePerformanceOrderLimit <em>Relative Performance Order Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdvancedStorageSetting#getInitialRelativePerformanceOrderSet <em>Initial Relative Performance Order Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AdvancedStorageSetting#getStorageTieringFrozen <em>Storage Tiering Frozen</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AdvancedStorageSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AdvancedStorageSetting extends CIM_StorageSetting {
	/**
	 * Returns the value of the '<em><b>Initial Storage Tier Methodology</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the initial storage tier for this element. None (or null): The element should not be considered for storage tiering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Storage Tier Methodology</em>' attribute.
	 * @see #setInitialStorageTierMethodology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdvancedStorageSetting_InitialStorageTierMethodology()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"None\",\"Implementation Decides\",\"Highest Performance\",\"Lowest Performance\",\"Highest Availability\",\"Lowest Availability\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getInitialStorageTierMethodology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdvancedStorageSetting#getInitialStorageTierMethodology <em>Initial Storage Tier Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Storage Tier Methodology</em>' attribute.
	 * @see #getInitialStorageTierMethodology()
	 * @generated
	 */
	void setInitialStorageTierMethodology(Integer value);

	/**
	 * Returns the value of the '<em><b>Initial Storage Tiering Selection</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use this value to set the property StorageTieringSelection of the associated element. Storage tiering examines StorageTieringSelection to determine whether to use RelativePerformanceOrder or RelativePerformanceOrderSet for selecting an appropriate storage tier. A value of 0 or null indicates the associated element is not subject to storage tiering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Storage Tiering Selection</em>' attribute.
	 * @see #setInitialStorageTieringSelection(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdvancedStorageSetting_InitialStorageTieringSelection()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Use RelativePerformanceOrder\",\"Use RelativePerformanceOrderSet\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_AdvancedStorageSetting.RelativePerformanceOrderLimit\",\"CIM_AdvancedStorageSetting.InitialRelativePerformanceOrderSet\"]'"
	 * @generated
	 */
	Integer getInitialStorageTieringSelection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdvancedStorageSetting#getInitialStorageTieringSelection <em>Initial Storage Tiering Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Storage Tiering Selection</em>' attribute.
	 * @see #getInitialStorageTieringSelection()
	 * @generated
	 */
	void setInitialStorageTieringSelection(Integer value);

	/**
	 * Returns the value of the '<em><b>Relative Performance Order Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage tiering limit applied to the element. This property indicates RelativePerformanceOrder not to exceed this value.InitialStorageTierMethodology specifies the initial placement of the element in the appropriate storage tier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order Limit</em>' attribute.
	 * @see #setRelativePerformanceOrderLimit(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdvancedStorageSetting_RelativePerformanceOrderLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_AdvancedStorageSetting.InitialStorageTierMethodology\",\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	Integer getRelativePerformanceOrderLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdvancedStorageSetting#getRelativePerformanceOrderLimit <em>Relative Performance Order Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Performance Order Limit</em>' attribute.
	 * @see #getRelativePerformanceOrderLimit()
	 * @generated
	 */
	void setRelativePerformanceOrderLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Initial Relative Performance Order Set</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of values. The associated element can only be placed in storage tiers that have a RelativePerformanceOrder value included in this set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Relative Performance Order Set</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AdvancedStorageSetting_InitialRelativePerformanceOrderSet()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ModelCorrespondence='[\"CIM_AdvancedStorageSetting.InitialStorageTierMethodology\",\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	EList<Integer> getInitialRelativePerformanceOrderSet();

	/**
	 * Returns the value of the '<em><b>Storage Tiering Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, and the storage element is under the control of the tiering subsystem, the element's tiering associations will remain frozen -- no data relocation between tiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Tiering Frozen</em>' attribute.
	 * @see #setStorageTieringFrozen(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AdvancedStorageSetting_StorageTieringFrozen()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' ModelCorrespondence='[\"CIM_StorageVolume.StorageTieringSelection\"]'"
	 * @generated
	 */
	Boolean getStorageTieringFrozen();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AdvancedStorageSetting#getStorageTieringFrozen <em>Storage Tiering Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Tiering Frozen</em>' attribute.
	 * @see #getStorageTieringFrozen()
	 * @generated
	 */
	void setStorageTieringFrozen(Boolean value);

} // CIM_AdvancedStorageSetting
