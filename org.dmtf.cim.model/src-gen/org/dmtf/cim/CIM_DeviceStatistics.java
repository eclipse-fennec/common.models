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
 * A representation of the model object '<em><b>CIM Device Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DeviceStatistics relates the DeviceStatisticalInformation class to the LogicalDevice to which it applies.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Core::Statistics' override.Stats='CIM_DeviceStatisticalInformation REF' override.Stats.Weak='true' override.Stats.Description='The statistical object.' override.Element='CIM_LogicalDevice REF' override.Element.Min='1' override.Element.Max='1' override.Element.Description='The Device to which the statistics apply.' keys='Stats,Element'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceStatistics extends CIM_Statistics {
} // CIM_DeviceStatistics
