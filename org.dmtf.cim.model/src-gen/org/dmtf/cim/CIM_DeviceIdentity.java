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
 * A representation of the model object '<em><b>CIM Device Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_DeviceIdentity indicates that two LogicalDevices represent different aspects of the same underlying entity. This association refines the CIM_LogicalIdentity superclass by restricting it to the Device level and defining its use in well understood scenarios. One of these scenarios is to represent that a Device is both a 'bus' entity and a 'functional' entity. For example, a Device could be both a PCI Device (or a USB Device), as well as a CIM_Keyboard. The other scenario is where a Device plays multiple functional roles that can not be distinguished by their hardware realization alone. For example, a Fibre Channel adapter might have aspects of both a NetworkAdapter and a SCSIController.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::DeviceElements' override.SystemElement='CIM_LogicalDevice REF' override.SystemElement.Description='SystemElement represents one aspect of the Device.' override.SameElement='CIM_LogicalDevice REF' override.SameElement.Description='SameElement represents an alternate aspect of the System entity.' keys='SystemElement,SameElement'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceIdentity extends CIM_LogicalIdentity {
} // CIM_DeviceIdentity
