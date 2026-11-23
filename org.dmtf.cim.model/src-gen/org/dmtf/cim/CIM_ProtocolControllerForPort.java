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
 * A representation of the model object '<em><b>CIM Protocol Controller For Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is used to define a relationship between a ProtocolController and a LogicalPort. This subclass is provided so that an enumeration of related controllers and ports can be performed without retrieving any other controllers or connected units.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolControllerForPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Device::ProtocolController' override.Antecedent='CIM_ProtocolController REF' override.Antecedent.Description='The ProtocolController.' override.Dependent='CIM_LogicalPort REF' override.Dependent.Description='The LogicalPort \'behind\' the ProtocolController.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolControllerForPort extends CIM_ProtocolControllerForDevice {
} // CIM_ProtocolControllerForPort
