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
 * A representation of the model object '<em><b>CIM Associated Protocol Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is used to define a hierarchy relationship between ProtocolControllers. This subclass is provided so that an enumeration of related ProtocolControllers can be performed without retrieving any connected StorageVolumes, MediaAccessDevices or LogicalPorts.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedProtocolController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Device::ProtocolController' override.Antecedent='CIM_ProtocolController REF' override.Antecedent.Description='The \'upstream\', Antecedent ProtocolController.' override.Dependent='CIM_ProtocolController REF' override.Dependent.Description='The \'downstream\' Dependent ProtocolController.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedProtocolController extends CIM_ProtocolControllerForDevice {
} // CIM_AssociatedProtocolController
