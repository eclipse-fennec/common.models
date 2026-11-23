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
 * A representation of the model object '<em><b>CIM Asymmetric Accessibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association indicates the accessibility of StorageVolumes in the StorageResourceLoadGroup through ports in the associated TargetPortGroup.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AsymmetricAccessibility#getCurrentAccessState <em>Current Access State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AsymmetricAccessibility#getNormalAccessState <em>Normal Access State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AsymmetricAccessibility()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.Antecedent='CIM_TargetPortGroup REF' override.Antecedent.Key='true' override.Antecedent.Description='The Port Group.' override.Dependent='CIM_StorageResourceLoadGroup REF' override.Dependent.Key='true' override.Dependent.Description='The Storage Resource Load Group.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AsymmetricAccessibility extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Current Access State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the current accessibility state of volumes in the StorageResourceLoadGroup through ports in the TargetPortGroup. With the exception of 'Unavailable', the states are those defined by the T10 SPC-4 Target Port Group Access States clause. 2(Unavailable): The volumes are not accessible in any way. 3(Standby): No data access to the volume is possible. Status and other non-data access commands are available. 4(Active Non-Optimized): Data access to the volume is available at less than full bandwidth. 5(Active Optimized): Data access to the volume is available at full bandwidth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Access State</em>' attribute.
	 * @see #setCurrentAccessState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AsymmetricAccessibility_CurrentAccessState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unavailable\",\"Standby\",\"Active Non-Optimized\",\"Active Optimized\"]'"
	 * @generated
	 */
	Integer getCurrentAccessState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AsymmetricAccessibility#getCurrentAccessState <em>Current Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Access State</em>' attribute.
	 * @see #getCurrentAccessState()
	 * @generated
	 */
	void setCurrentAccessState(Integer value);

	/**
	 * Returns the value of the '<em><b>Normal Access State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the normal accessibility state of volumes in the StorageResourceLoadGroup through ports in the TargetPortGroup when the primary storage processor hosting the groups is healthy. With the exception of 'Unavailable', the states are those defined by the T10 SPC-4 Target Port Group Access States clause. 2(Unavailable): The volumes are not accessible. 3(Standby): No data access to the volume is possible. Status and other non-data access commands are available. 4(Active Non-Optimized): Data access to the volume is available at less than full bandwidth. 5(Active Optimized): Data access to the volume is available at full bandwidth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Normal Access State</em>' attribute.
	 * @see #setNormalAccessState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AsymmetricAccessibility_NormalAccessState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unavailable\",\"Standby\",\"Active Non-Optimized\",\"Active Optimized\"]'"
	 * @generated
	 */
	Integer getNormalAccessState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AsymmetricAccessibility#getNormalAccessState <em>Normal Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Access State</em>' attribute.
	 * @see #getNormalAccessState()
	 * @generated
	 */
	void setNormalAccessState(Integer value);

} // CIM_AsymmetricAccessibility
