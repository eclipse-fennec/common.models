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
 * A representation of the model object '<em><b>CIM Element Statistical Data View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ElementStatisticalDataView is an association between a View Class instance and the CIM_StatisticalData instance for the base class of the View (e.g., CIM_StorageVolume).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementStatisticalDataView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StatisticsElement' override.ManagedElement='CIM_View REF' override.ManagedElement.Key='true' override.ManagedElement.Description='The View Class instance that has the CIM_StatisticalData instance.' override.Stats='CIM_StatisticalData REF' override.Stats.Key='true' override.Stats.Description='The CIM_StatisticalData instance for the base instance for a View Class (e.g., CIM_StorageVolume instance).' keys='ManagedElement,Stats'"
 * @generated
 */
@ProviderType
public interface CIM_ElementStatisticalDataView extends CIM_AbstractElementStatisticalData {
} // CIM_ElementStatisticalDataView
