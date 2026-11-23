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
 * A representation of the model object '<em><b>CIM Storage Processor Affinity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageProcessorAffinity indicates a processing affinity and state between a TargetPortGroup or StorageResourceLoadGroup and a ComputerSystem representing a storage processor in a redundant storage server. The processor can host the group in either a healthy or failover state. Instances of this association are static, one for each combination of StorageResourceLoadGroup and ComputerSystem in the RedundancySet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageProcessorAffinity#getIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageProcessorAffinity#getIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageProcessorAffinity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' ClassConstraint='[\"inv:self.Dependent.oclIsKindOf(CIM_TargetPortGroup) or self.Dependent.oclIsKindOf(CIM_StorageResourceLoadGroup)\"]' UMLPackagePath='CIM::Device::Dependency' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Key='true' override.Antecedent.Description='The storage processor for which the Port Group or Storage Resource Load Group has affinity.' override.Dependent='CIM_Collection REF' override.Dependent.Key='true' override.Dependent.Description='The Target Port Group or Storage Resource Load Group.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_StorageProcessorAffinity extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is set to true if the TargetPortGroup or StorageResourceLoadGroup is hosted by the storage processor when the processor is healthy. It is set to false if the group can be hosted by the processor when the primary storage processor for the group has failed. This property is static, as is the association itself. For each StorageResourceLoadGroup, one instance of StorageProcessorAffinity will have IsPrimary=true, the rest will have IsPrimary=false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #setIsPrimary(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProcessorAffinity_IsPrimary()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsPrimary();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageProcessorAffinity#getIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #getIsPrimary()
	 * @generated
	 */
	void setIsPrimary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is set to true if the TargetPortGroup or StorageResourceLoadGroup is currently being hosted by the storage processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageProcessorAffinity_IsActive()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsActive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageProcessorAffinity#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(Boolean value);

} // CIM_StorageProcessorAffinity
