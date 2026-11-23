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
 * A representation of the model object '<em><b>CIM Unix Process Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_UnixProcessStatistics is an association that relates a CIM_UnixProcess to its StatisticalInformation.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnixProcessStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::Unix' override.Element='CIM_UnixProcess REF' override.Element.Min='1' override.Element.Max='1' override.Element.Description='The Process for which statistical or metric data is defined.' override.Stats='CIM_UnixProcessStatisticalInformation REF' override.Stats.Weak='true' override.Stats.Description='The UNIX Process statistical information/object.' keys='Stats,Element'"
 * @generated
 */
@ProviderType
public interface CIM_UnixProcessStatistics extends CIM_Statistics {
} // CIM_UnixProcessStatistics
