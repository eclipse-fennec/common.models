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
 * A representation of the model object '<em><b>CIM BGP Service Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association defines statistics collected for a BGP Service. The relationship is deprecated since the class BGPStatistics is deprecated. It is incorrectly associated with a BGPService, but should instead be associated with a BGPProtocolEndpoint using the ElementStatisticalData relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPServiceStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ElementStatisticalData\"]' Version='2.7.0' UMLPackagePath='CIM::Network::BGP' override.Stats='CIM_BGPStatistics REF' override.Stats.Deprecated='[\"CIM_ElementStatisticalData.Stats\"]' override.Stats.Max='1' override.Stats.Description='The statistics object for the BGP session.' override.Element='CIM_BGPService REF' override.Element.Deprecated='[\"CIM_ElementStatisticalData.ManagedElement\"]' override.Element.Min='1' override.Element.Max='1' override.Element.Description='The BGPService for which statistics are being gathered.' keys='Stats,Element'"
 * @generated
 */
@ProviderType
public interface CIM_BGPServiceStatistics extends CIM_ServiceStatistics {
} // CIM_BGPServiceStatistics
