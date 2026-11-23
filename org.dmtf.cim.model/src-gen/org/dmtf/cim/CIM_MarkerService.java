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
 * A representation of the model object '<em><b>CIM Marker Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MarkerService represents the general process of marking a selected field in a network packet with a specified value. Packets are marked in order to control the conditioning that they will subsequently receive. Subclasses of MarkerService identify the specific fields to be marked, and introduce properties to represent the values used in marking these fields. Markers are usually invoked as a result of a preceding classifier match. 
 * 
 * MarkerService is a concrete class because its superclass (ConditioningService) is concrete. While this class can be instantiated, an instance of it does not accomplish anything, because both the field to be marked and the value used to mark it are defined in subclasses. 
 * 
 * MarkerService is modeled as a ConditioningService so that it can be aggregated into a QoSService (using the QoSConditioningSubService association). This association indicates that the MarkerService's functionality underlies the QoSService. MarkerService also participates in the NextService association to identify the subsequent ConditioningService(s) that act on packets after they have been marked.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MarkerService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_MarkerService extends CIM_ConditioningService {
} // CIM_MarkerService
