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
 * A representation of the model object '<em><b>CIM Installed OS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between the ComputerSystem and the OperatingSystem(s) installed or loaded on it. An OperatingSystem is 'installed' on a ComputerSystem, when placed on one of its StorageExtents - for example, copied to a disk drive or downloaded to Memory. Using this definition, an OperatingSystem is 'installed' on a NetPC when downloaded via the network.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InstalledOS#getPrimaryOS <em>Primary OS</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InstalledOS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::System::OperatingSystem' override.GroupComponent='CIM_ComputerSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The ComputerSystem.' override.PartComponent='CIM_OperatingSystem REF' override.PartComponent.Weak='true' override.PartComponent.Description='The OperatingSystem installed on the ComputerSystem.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_InstalledOS extends CIM_SystemComponent {
	/**
	 * Returns the value of the '<em><b>Primary OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the OperatingSystem is the default OS for the ComputerSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary OS</em>' attribute.
	 * @see #setPrimaryOS(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledOS_PrimaryOS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIF.DMTF|Operating System|001.4\"]'"
	 * @generated
	 */
	Boolean getPrimaryOS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledOS#getPrimaryOS <em>Primary OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary OS</em>' attribute.
	 * @see #getPrimaryOS()
	 * @generated
	 */
	void setPrimaryOS(Boolean value);

} // CIM_InstalledOS
