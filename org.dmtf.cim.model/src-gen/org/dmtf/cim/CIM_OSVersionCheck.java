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
 * A representation of the model object '<em><b>CIM OS Version Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OSVersionCheck class specifies the versions of the operating system that can support/execute this Software Element. The operating system itself (whose version should be validated) is defined in the TargetOperatingSystem property of the Check's scoping SoftwareElement. 
 * This Check can be for a specific, minimum, maximum or a range of releases of an OS. To identify a specific version of the OS, the minimum and maximum versions must be the same. To specify a minimum, only the minimum version needs to be defined. To specify a maximum version, only the maximum version needs to be defined. To specify a range, both minimum and maximum versions need to be defined. 
 * The data gathered from the Check and SoftwareElement objects are compared with the corresponding details found in the CIM_OperatingSystem object (referenced by the InstalledOS association), for the CIM_ComputerSystem object that defines the environment. The OSType property of CIM_OperatingSystem must match the value of CIM_SoftwareElement.TargetOperating System. Also, the OS' version information should be within the range of CIM_OSVersionCheck.Minimum/MaximumValue properties. Note that all the operating systems on the relevant computer do not need to satisfy the Check.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OSVersionCheck#getMinimumVersion <em>Minimum Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSVersionCheck#getMaximumVersion <em>Maximum Version</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OSVersionCheck()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_OSVersionCheck extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>Minimum Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum version of the required operating system. The value is encoded as <major>.<minor>.<revision> or <major>.<minor><letter revision>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Version</em>' attribute.
	 * @see #setMinimumVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSVersionCheck_MinimumVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_OperatingSystem.Version\"]'"
	 * @generated
	 */
	String getMinimumVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSVersionCheck#getMinimumVersion <em>Minimum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Version</em>' attribute.
	 * @see #getMinimumVersion()
	 * @generated
	 */
	void setMinimumVersion(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum version of the required operating system. The value is encoded as <major>.<minor>.<revision> or <major>.<minor><letter revision>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Version</em>' attribute.
	 * @see #setMaximumVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSVersionCheck_MaximumVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_OperatingSystem.Version\"]'"
	 * @generated
	 */
	String getMaximumVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSVersionCheck#getMaximumVersion <em>Maximum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Version</em>' attribute.
	 * @see #getMaximumVersion()
	 * @generated
	 */
	void setMaximumVersion(String value);

} // CIM_OSVersionCheck
