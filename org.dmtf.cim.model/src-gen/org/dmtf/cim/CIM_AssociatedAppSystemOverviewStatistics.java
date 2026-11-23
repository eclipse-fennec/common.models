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
 * A representation of the model object '<em><b>CIM Associated App System Overview Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The link to the runtime overview statistics of an application system.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedAppSystemOverviewStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::AppRuntime' override.ManagedElement='CIM_ApplicationSystem REF' override.ManagedElement.Min='1' override.ManagedElement.Max='1' override.ManagedElement.Description='The application system for which the overview is defined.' override.Stats='CIM_StatisticalRuntimeOverview REF' override.Stats.Max='1' override.Stats.Description='The application system runtime statistical overview.' keys='ManagedElement,Stats'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedAppSystemOverviewStatistics extends CIM_ElementStatisticalData {
} // CIM_AssociatedAppSystemOverviewStatistics
