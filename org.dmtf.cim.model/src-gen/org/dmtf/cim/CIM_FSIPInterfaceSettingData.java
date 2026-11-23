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
 * A representation of the model object '<em><b>CIM FSIP Interface Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FSIPInterfaceSettingData is a derived class of IPInterfaceSettingData that specifies the IP interface settings for a Fileserver. It contains the properties needed to establish an IPProtocolEndpoint and a NetworkVLAN.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FSIPInterfaceSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::System::Settings' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FSIPInterfaceSettingData extends CIM_IPInterfaceSettingData {
} // CIM_FSIPInterfaceSettingData
