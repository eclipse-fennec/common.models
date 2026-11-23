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
 * A representation of the model object '<em><b>CIM SAS Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the port of a Serial Attached SCSI device to system connection.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SASPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Ports' override.PortType='uint16' override.PortType.Description='The type of port.' override.PortType.ValueMap='[\"0\",\"1\",\"94\",\"16000..\"]' override.PortType.Values='[\"Unknown\",\"Other\",\"SAS\",\"Vendor Reserved\"]' override.PortType.ModelCorrespondence='[\"CIM_NetworkPort.OtherNetworkPortType\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_SASPort extends CIM_NetworkPort {
} // CIM_SASPort
