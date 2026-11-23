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
 * A representation of the model object '<em><b>CIM Uo WMetric Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association that describes the Metrics related to a UnitOfWorkDefinition. This is a Dependency relationship since the MetricDefinition relies on the UnitOfWorkDefinition for context. At least one context must be defined for a MetricDefinition, hence the Min (1) qualifier is placed on the UnitOfWorkDefinition reference.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UoWMetricDefinition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Antecedent='CIM_UnitOfWorkDefinition REF' override.Antecedent.Min='1' override.Antecedent.Description='The UnitOfWorkDefinition where the Metric applies.' override.Dependent='CIM_MetricDefinition REF' override.Dependent.Description='The MetricDefinition for a particular UnitOfWork.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_UoWMetricDefinition extends CIM_Dependency {
} // CIM_UoWMetricDefinition
