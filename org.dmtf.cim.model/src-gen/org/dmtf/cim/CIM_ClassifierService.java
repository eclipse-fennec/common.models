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
 * A representation of the model object '<em><b>CIM Classifier Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ClassifierService represents a logical entity associated with an ingress or egress interface of a device, that takes a single input stream, and sorts it into one or more output streams. The sorting is done by a set of filters that select packets based on the packet contents, or possibly based on other attributes associated with the packet. Each output stream is the result of matching a particular filter. 
 * 
 * Rather than being linked directly to its filters (instantiated as FilterLists), a classifier is modeled as an aggregation of ClassifierElements. Each of these ClassifierElements is linked to a single FilterList, by the association ClassifierElementUsesFilterList. Note that ClassifierServices are designed to allow hierarchical classification. When hierarchical classification is used, a ClassifierElement may point to another ClassifierService (via the association, NextServiceAfterClassifierElement). When this is true, the ClassifierElement MUST NOT use the ClassifierElementUses FilterList association. 
 * 
 * A classifier is modeled as a ConditioningService so that it can be aggregated into a QoSService (using the QoSConditioningSubService aggregation), and can use the NextService association to identify the subsequent ConditioningServices for different traffic streams.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClassifierService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ClassifierService extends CIM_ConditioningService {
} // CIM_ClassifierService
