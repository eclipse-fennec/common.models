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
 * A representation of the model object '<em><b>CIM FRU Includes Software Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FRUIncludesSoftwareFeature association identifies the SoftwareFeature(s) packaged with a particular FRU. A common usage is to determine whether the FRU is compatible with a hardware/software platform. In order to determine this, the following conditions need to be verified: 
 * (1) Is the physical package of the FRU compatible with the slots or equivalent packaging of the hardware? 
 * (2) Are there any physical constraints (such as power consumption) that prevent the FRU from being installed? 
 * (3) Are the SoftwareFeatures packaged with the FRU compatiable with the underlying operating system and other software already installed/to be installed on the platform? 
 * This latter question can be answered by first checking if an instance of FRUIncludesSoftwareFeature exists. If it does, then the compatibility of each SoftwareFeature can be determined by evaluating the Check classes for the Software Elements that are part of the Feature (found by traversing the association, SoftwareFeatureSoftwareElements). For example, there might be a SoftwareElementVersionCheck that declares that a SoftwareElement (of the FRU's Software Feature) is not compatible with current software.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FRUIncludesSoftwareFeature#getFRU <em>FRU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FRUIncludesSoftwareFeature#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FRUIncludesSoftwareFeature()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::DeploymentModel' keys='FRU,Component'"
 * @generated
 */
@ProviderType
public interface CIM_FRUIncludesSoftwareFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>FRU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The field replaceable unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRU</em>' reference.
	 * @see #setFRU(CIM_FRU)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRUIncludesSoftwareFeature_FRU()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FRU REF' Key='true' Aggregate='true' Max='1'"
	 * @generated
	 */
	CIM_FRU getFRU();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRUIncludesSoftwareFeature#getFRU <em>FRU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRU</em>' reference.
	 * @see #getFRU()
	 * @generated
	 */
	void setFRU(CIM_FRU value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SoftwareFeature which is included in the FRU and whose SoftwareElements should be evaluated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(CIM_SoftwareFeature)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRUIncludesSoftwareFeature_Component()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SoftwareFeature REF' Key='true'"
	 * @generated
	 */
	CIM_SoftwareFeature getComponent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRUIncludesSoftwareFeature#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(CIM_SoftwareFeature value);

} // CIM_FRUIncludesSoftwareFeature
