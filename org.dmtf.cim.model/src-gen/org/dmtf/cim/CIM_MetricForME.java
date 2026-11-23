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
 * A representation of the model object '<em><b>CIM Metric For ME</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association links a ManagedElement to the metric values being maintained for it.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MetricForME()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Metrics::BaseMetric' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Description='ManagedElement to which the metric values belong.' override.Dependent='CIM_BaseMetricValue REF' override.Dependent.Description='A metric value for the ManagedElement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_MetricForME extends CIM_Dependency {
} // CIM_MetricForME
