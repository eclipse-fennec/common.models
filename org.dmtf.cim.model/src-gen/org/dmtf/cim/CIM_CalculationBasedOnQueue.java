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
 * A representation of the model object '<em><b>CIM Calculation Based On Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association establishes a dependency relationship between a QueuingService and an instance of the DropThresholdCalculationService class. The queue's current depth is used by the CalculationService in calculating an average/smoothed queue depth.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CalculationBasedOnQueue()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_QueuingService REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The queue examined by the CalculationService.' override.Dependent='CIM_DropThresholdCalculationService REF' override.Dependent.Description='The CalculationService that provides an average queue depth.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CalculationBasedOnQueue extends CIM_ServiceServiceDependency {
} // CIM_CalculationBasedOnQueue
