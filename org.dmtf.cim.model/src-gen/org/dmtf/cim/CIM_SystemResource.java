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
 * A representation of the model object '<em><b>CIM System Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entity managed by BIOS, an OperatingSystem or other software, which is available for use by application software and/or LogicalDevices. Resources are individually identified and allocated entities, that are assignable, reservable, counted/ tracked, releasable, reset-able, etc. Examples of software Resources are message queues, shared memory segments (identified by a key value), and named pipes, while examples of hardware Resources (in an x86 environment) are IRQs, DMA channels and memory mapped I/O.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SystemResource#getShareable <em>Shareable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemResource#getImplementationInfo <em>Implementation Info</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemResource()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.7.0' UMLPackagePath='CIM::System::SystemResources'"
 * @generated
 */
@ProviderType
public interface CIM_SystemResource extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the Resource can be shared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shareable</em>' attribute.
	 * @see #setShareable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemResource_Shareable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getShareable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemResource#getShareable <em>Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shareable</em>' attribute.
	 * @see #getShareable()
	 * @generated
	 */
	void setShareable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Implementation Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the Resource is implemented in hardware, software or both.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Info</em>' attribute.
	 * @see #setImplementationInfo(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemResource_ImplementationInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Hardware Only\",\"Software Only\",\"Hardware and Software\"]'"
	 * @generated
	 */
	Integer getImplementationInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SystemResource#getImplementationInfo <em>Implementation Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Info</em>' attribute.
	 * @see #getImplementationInfo()
	 * @generated
	 */
	void setImplementationInfo(Integer value);

} // CIM_SystemResource
