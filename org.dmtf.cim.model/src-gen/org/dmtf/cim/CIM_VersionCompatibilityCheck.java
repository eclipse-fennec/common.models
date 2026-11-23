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
 * A representation of the model object '<em><b>CIM Version Compatibility Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The VersionCompatibilityCheck class specifies whether it is permissible to create the next state of a SoftwareElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VersionCompatibilityCheck#getAllowDownVersion <em>Allow Down Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VersionCompatibilityCheck#getAllowMultipleVersions <em>Allow Multiple Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VersionCompatibilityCheck#getReinstall <em>Reinstall</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VersionCompatibilityCheck()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_VersionCompatibilityCheck extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>Allow Down Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AllowDownVersion property indicates that this Software Element can transition to its next state even if a higher or later version of the element already exists in the environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Down Version</em>' attribute.
	 * @see #setAllowDownVersion(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VersionCompatibilityCheck_AllowDownVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAllowDownVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VersionCompatibilityCheck#getAllowDownVersion <em>Allow Down Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Down Version</em>' attribute.
	 * @see #getAllowDownVersion()
	 * @generated
	 */
	void setAllowDownVersion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Multiple Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AllowMultipleVersions option controls the ability to configure multiple versions of a SoftwareElement on a system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Multiple Versions</em>' attribute.
	 * @see #setAllowMultipleVersions(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VersionCompatibilityCheck_AllowMultipleVersions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAllowMultipleVersions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VersionCompatibilityCheck#getAllowMultipleVersions <em>Allow Multiple Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Multiple Versions</em>' attribute.
	 * @see #getAllowMultipleVersions()
	 * @generated
	 */
	void setAllowMultipleVersions(Boolean value);

	/**
	 * Returns the value of the '<em><b>Reinstall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Reinstall property indicates that this SoftwareElement can transition to its next state even if an element of the same version already exists in the environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reinstall</em>' attribute.
	 * @see #setReinstall(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VersionCompatibilityCheck_Reinstall()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getReinstall();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VersionCompatibilityCheck#getReinstall <em>Reinstall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reinstall</em>' attribute.
	 * @see #getReinstall()
	 * @generated
	 */
	void setReinstall(Boolean value);

} // CIM_VersionCompatibilityCheck
