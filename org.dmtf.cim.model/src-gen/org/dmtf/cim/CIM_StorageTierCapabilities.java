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
 * A representation of the model object '<em><b>CIM Storage Tier Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of StorageCapabilities that defines the Capabilities of a storage tier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageTierCapabilities#getStorageTierCharacteristics <em>Storage Tier Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTierCapabilities#getRelativePerformanceOrderMin <em>Relative Performance Order Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTierCapabilities#getRelativePerformanceOrderMax <em>Relative Performance Order Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTierCapabilities#getRelativePerformanceOrderDefault <em>Relative Performance Order Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageTierCapabilities#getSupportedStorageTierMethodologies <em>Supported Storage Tier Methodologies</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageTierCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageTierCapabilities extends CIM_StorageCapabilities {
	/**
	 * Returns the value of the '<em><b>Storage Tier Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the storage tier charateristics. Performance generally relates to the underlying technology, for example, Solid State versus Fibre Channel drives. QoS refers to the Quality of Service, for example, RAID protected versus unprotected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Tier Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTierCapabilities_StorageTierCharacteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"BasedOnPerformance Only\",\"BasedOnQOS Only\",\"BasedOnPerformance And BasedOnQOS\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getStorageTierCharacteristics();

	/**
	 * Returns the value of the '<em><b>Relative Performance Order Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the minimum value for RelativePerformanceOrder that this storage tier can have.
	 * The minimum value for RelativePerformanceOrder that this storage tier can have, which represents the highest level of performance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order Min</em>' attribute.
	 * @see #setRelativePerformanceOrderMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTierCapabilities_RelativePerformanceOrderMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageTierCapabilities.RelativePerformanceOrderMax\",\"CIM_StorageTierCapabilities.RelativePerformanceOrderDefault\",\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	Integer getRelativePerformanceOrderMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTierCapabilities#getRelativePerformanceOrderMin <em>Relative Performance Order Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Performance Order Min</em>' attribute.
	 * @see #getRelativePerformanceOrderMin()
	 * @generated
	 */
	void setRelativePerformanceOrderMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Relative Performance Order Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the maxmimum value for RelativePerformanceOrder that this storage tier can have.
	 * The maximum value for RelativePerformanceOrder that this storage tier can have, which represents the lowest level of performance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order Max</em>' attribute.
	 * @see #setRelativePerformanceOrderMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTierCapabilities_RelativePerformanceOrderMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageTierCapabilities.RelativePerformanceOrderMin\",\"CIM_StorageTierCapabilities.RelativePerformanceOrderDefault\",\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	Integer getRelativePerformanceOrderMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTierCapabilities#getRelativePerformanceOrderMax <em>Relative Performance Order Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Performance Order Max</em>' attribute.
	 * @see #getRelativePerformanceOrderMax()
	 * @generated
	 */
	void setRelativePerformanceOrderMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Relative Performance Order Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the default value of RelativePerformanceOrder for the storage tier -- the smaller the RelativePerformanceOrder, the more performant the storage tier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order Default</em>' attribute.
	 * @see #setRelativePerformanceOrderDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTierCapabilities_RelativePerformanceOrderDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageTierCapabilities.RelativePerformanceOrderMin\",\"CIM_StorageTierCapabilities.RelativePerformanceOrderMax\",\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	Integer getRelativePerformanceOrderDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageTierCapabilities#getRelativePerformanceOrderDefault <em>Relative Performance Order Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Performance Order Default</em>' attribute.
	 * @see #getRelativePerformanceOrderDefault()
	 * @generated
	 */
	void setRelativePerformanceOrderDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Storage Tier Methodologies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array indicating the supported storage tier methodologies. StorageTierMethodologies are useful for use cases where client wants to place an element in a storage tier without specifying a specific storage tier, and let the implementation select an appropriate storage tier. None: This storage tier should not be considered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Tier Methodologies</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageTierCapabilities_SupportedStorageTierMethodologies()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"None\",\"Implementation Decides\",\"Highest Performance\",\"Lowest Performance\",\"Highest Availability\",\"Lowest Availability\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageTierMethodologies();

} // CIM_StorageTierCapabilities
