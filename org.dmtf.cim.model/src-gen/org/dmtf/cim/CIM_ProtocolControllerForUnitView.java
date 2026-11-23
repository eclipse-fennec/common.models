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
 * A representation of the model object '<em><b>CIM Protocol Controller For Unit View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ProtocolControllerForUnitView instance is a view that is derived from the CIM_ProtocolControllerForUnit association between the a MappingProtocolControllerView and a LogicalDevice Note that if the LogicalDevice is associated to multipleProtocolControllers the DeviceNumber (LU Number) may differ for each MappingProtocolControllerView instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolControllerForUnitView#getPCFUDeviceAccess <em>PCFU Device Access</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerForUnitView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::ProtocolController' override.Antecedent='CIM_View REF' override.Antecedent.Key='true' override.Antecedent.Description='A reference to an instance of the MappingProtocolControllerView which provides access to the LogicalDevice.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Key='true' override.Dependent.Description='The LogicalDevice instance that is accessed from the MapingProtocolControllerView instance.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolControllerForUnitView extends CIM_AbstractProtocolControllerForDevice {
	/**
	 * Returns the value of the '<em><b>PCFU Device Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeviceAccess property from the underlying ProtocolControllerForUnit ProtocolController of the View instance and the LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PCFU Device Access</em>' attribute.
	 * @see #setPCFUDeviceAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerForUnitView_PCFUDeviceAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ProtocolControllerForUnit.DeviceAccess\"]'"
	 * @generated
	 */
	Integer getPCFUDeviceAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolControllerForUnitView#getPCFUDeviceAccess <em>PCFU Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCFU Device Access</em>' attribute.
	 * @see #getPCFUDeviceAccess()
	 * @generated
	 */
	void setPCFUDeviceAccess(Integer value);

} // CIM_ProtocolControllerForUnitView
