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
 * A representation of the model object '<em><b>CIM J2ee JCA Nonpooled Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeJCANonpooledConnections provides the list of statistics for the non-connections pools that are associated with the referencing JCA resource statistics.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJCANonpooledConnections()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' override.Stats='CIM_J2eeJCAStats REF' override.Stats.Description='The JCA resource statistic.' override.RelatedStats='CIM_J2eeConnectionStats REF' override.RelatedStats.Description='The related JCA connection statistics.' keys='Stats,RelatedStats'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJCANonpooledConnections extends CIM_RelatedStatisticalData {
} // CIM_J2eeJCANonpooledConnections
