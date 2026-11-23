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
 * A representation of the model object '<em><b>CIM Calculation Service For Dropper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association is a subclass of ServiceServiceDependency, and represents the reliance of a REDDropperService on one or more DropThresholdCalculationServices. The latter calculate average queue depth, based on the observed depths of a queue. The specific queue examined by each CalculationService is defined using the CalculationBasedOnQueue association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CalculationServiceForDropper()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_DropThresholdCalculationService REF' override.Antecedent.Min='1' override.Antecedent.Description='A calculation service for the dropper.' override.Dependent='CIM_REDDropperService REF' override.Dependent.Description='The RED dropper which is dependent on average queue depth calculations by the Antecedent Service.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CalculationServiceForDropper extends CIM_ServiceServiceDependency {
} // CIM_CalculationServiceForDropper
