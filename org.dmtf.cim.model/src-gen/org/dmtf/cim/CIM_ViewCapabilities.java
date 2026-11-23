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
 * A representation of the model object '<em><b>CIM View Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ViewCapabilities identifies the capabilities of the implementation of view classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ViewCapabilities#getSupportedViews <em>Supported Views</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ViewCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ViewCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Views</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an array of strings that identify the views that are supported by name, without the namespace qualifier. 
	 * A string element in this array should take the form of <OrgID>:<viewname>, where <OrgID> is the identifier of the organization that defined the view and <viewname> is the name of the view. 
	 * For example, support for the DiskDriveView would be indicated by the string 'SNIA:DiskDriveView'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Views</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ViewCapabilities_SupportedViews()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSupportedViews();

} // CIM_ViewCapabilities
