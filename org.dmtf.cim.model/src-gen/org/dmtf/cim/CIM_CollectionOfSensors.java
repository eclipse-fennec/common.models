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
 * A representation of the model object '<em><b>CIM Collection Of Sensors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CollectionOfSensors association indicates the Sensors that make up a MultiStateSensor.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CollectionOfSensors()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Device::Sensors' override.GroupComponent='CIM_MultiStateSensor REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The MultiStateSensor.' override.PartComponent='CIM_Sensor REF' override.PartComponent.Min='2' override.PartComponent.Description='A Sensor that is part of the MultiStateSensor.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_CollectionOfSensors extends CIM_Component {
} // CIM_CollectionOfSensors
