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
 * A representation of the model object '<em><b>CIM Port On Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PortOnDevice associates a Port or connection point with its Device.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PortOnDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Device::Ports' override.Antecedent='CIM_LogicalDevice REF' override.Antecedent.Description='The Device that includes the Port.' override.Dependent='CIM_LogicalPort REF' override.Dependent.Description='The Port on the Device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PortOnDevice extends CIM_HostedDependency {
} // CIM_PortOnDevice
