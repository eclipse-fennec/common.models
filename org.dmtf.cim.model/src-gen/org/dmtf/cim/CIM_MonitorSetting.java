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
 * A representation of the model object '<em><b>CIM Monitor Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MonitorSetting associates the MonitorResolution Setting object with the DesktopMonitor to which it applies.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MonitorSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::UserDevices' override.Element='CIM_DesktopMonitor REF' override.Element.Description='The DesktopMonitor.' override.Setting='CIM_MonitorResolution REF' override.Setting.Description='The MonitorResolution associated with the DesktopMonitor.' keys='Element,Setting'"
 * @generated
 */
@ProviderType
public interface CIM_MonitorSetting extends CIM_ElementSetting {
} // CIM_MonitorSetting
