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
 * A representation of the model object '<em><b>CIM Metric Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Weak association of metric value objects with their metric definition. This association ties an instance of CIM_BaseMetricValue to its CIM_BaseMetricDefinition; it is weak because the existence of a CIM_BaseMetricValue depends on the existence of its associated CIM_BaseMetricDefinition: An instance of CIM_BaseMetricValue must not exist without being associated to its corresponding CIM_BaseMetricDefinition.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MetricInstance()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Metrics::BaseMetric' override.Antecedent='CIM_BaseMetricDefinition REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The CIM_BaseMetricDefinition for this particular CIM_BaseMetricValue.' override.Dependent='CIM_BaseMetricValue REF' override.Dependent.Description='A CIM_BaseMetricValue instance holding the Value.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_MetricInstance extends CIM_Dependency {
} // CIM_MetricInstance
