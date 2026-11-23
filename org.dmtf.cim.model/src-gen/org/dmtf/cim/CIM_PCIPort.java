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
 * A representation of the model object '<em><b>CIM PCI Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents PCI device ports used to describe the connection between PCI devices.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PCIPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Controller' override.PortType='uint16' override.PortType.Description='The type of port.' override.PortType.ValueMap='[\"0\",\"1\",\"2\",\"150\",\"151\",\"152\",\"153\",\"..\",\"16000..65535\"]' override.PortType.Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"PCI\",\"PCI-X\",\"PCIe\",\"PCIe Gen 2\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PCIPort extends CIM_LogicalPort {
} // CIM_PCIPort
