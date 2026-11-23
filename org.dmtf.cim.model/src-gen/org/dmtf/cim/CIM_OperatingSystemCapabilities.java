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
 * A representation of the model object '<em><b>CIM Operating System Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OperatingSystemCapabilities provides information about the capabilities of associated instances of CIM_OperatingSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OperatingSystemCapabilities#getHostShutdownBehavior <em>Host Shutdown Behavior</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystemCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::OperatingSystem' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_OperatingSystemCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Host Shutdown Behavior</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HostShutdownBehavior provides information about the capabilities of an associated instance of OperatingSystem to shutdown the hosting computer system.
	 * A value of "Disabled" indicates that if the associated OperatingSystem is shutdown using the RequestStateChange() or Shutdown() extrinsic methods, the ComputerSystem with which the ComputerSystem is associated through an instance of CIM_RunningOS shall be shutdown.
	 * A value of "No effect" indicates that if the associated OperatingSystem is shutdown using the RequestStateChange() or Shutdown() extrinsic methods, the ComputerSystem with which the OperatingSystem is associated through CIM_RunningOS shall not be shutdown.
	 * A value of "Unknown" indicates that the effect on the hosting ComputerSystem is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Shutdown Behavior</em>' attribute.
	 * @see #setHostShutdownBehavior(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OperatingSystemCapabilities_HostShutdownBehavior()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Disabled\",\"No effect\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getHostShutdownBehavior();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OperatingSystemCapabilities#getHostShutdownBehavior <em>Host Shutdown Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Shutdown Behavior</em>' attribute.
	 * @see #getHostShutdownBehavior()
	 * @generated
	 */
	void setHostShutdownBehavior(Integer value);

} // CIM_OperatingSystemCapabilities
