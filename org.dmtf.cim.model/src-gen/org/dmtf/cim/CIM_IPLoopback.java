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
 * A representation of the model object '<em><b>CIM IP Loopback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A loopback interface is a virtual Layer 3 interface typically found in an Ethernet Switch or router that has a single endpoint that is always up. Packets that are transmitted over a loopback interface are immediately received by this interface.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPLoopback()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::Network' override.ElementName='string' override.ElementName.Description='The Interface name for the Loopback interface. This property allows each instance to define a user-friendly name in addition to the Name property which is a key properties in this class. Element Name may be a copy of the Name property but the class provider may add additional indentifing information to the Name property to assure it is a unique instance when forming the key.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPLoopback extends CIM_IPProtocolEndpoint {
} // CIM_IPLoopback
