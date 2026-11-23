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
 * A representation of the model object '<em><b>CIM Processor Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ProcessorCapabilities inherits the capabilities of EnabledLogicalElementCapabilities and adds properties describing processor core and hardware thread support.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProcessorCapabilities#getNumberOfProcessorCores <em>Number Of Processor Cores</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProcessorCapabilities#getNumberOfHardwareThreads <em>Number Of Hardware Threads</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProcessorCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Device::Processor' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ProcessorCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Number Of Processor Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of processor cores available for processor. This number would not include cores disabled by hardware and may be obtained from SMBIOS 2.5 Type 4 offset 23h.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Processor Cores</em>' attribute.
	 * @see #setNumberOfProcessorCores(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProcessorCapabilities_NumberOfProcessorCores()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getNumberOfProcessorCores();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProcessorCapabilities#getNumberOfProcessorCores <em>Number Of Processor Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Processor Cores</em>' attribute.
	 * @see #getNumberOfProcessorCores()
	 * @generated
	 */
	void setNumberOfProcessorCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Hardware Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of hardware threads available for the processor. May be obtained from SMBIOS v2.5 4 offset 25h.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Hardware Threads</em>' attribute.
	 * @see #setNumberOfHardwareThreads(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProcessorCapabilities_NumberOfHardwareThreads()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getNumberOfHardwareThreads();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProcessorCapabilities#getNumberOfHardwareThreads <em>Number Of Hardware Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Hardware Threads</em>' attribute.
	 * @see #getNumberOfHardwareThreads()
	 * @generated
	 */
	void setNumberOfHardwareThreads(Integer value);

} // CIM_ProcessorCapabilities
