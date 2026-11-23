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
 * A representation of the model object '<em><b>CIM Classifier Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ClassifierElement represents the linkage, within a single ClassifierService, between a FilterList (that defines the criteria to select packets from the stream of packets coming into the Service) and the next ConditioningService (to which the selected packets go after they leave the ClassifierService). ClassifierElement has no properties of its own. It is present to serve as an aggregated entity into ClassifierService (using the ClassifierElementIn ClassifierService association), and for associations with its FilterList (ClassifierElementUsesFilterList) and its next ConditioningService (NextServiceAfterClassifierElement). 
 * 
 * Note that a ClassifierElement may be associated with a ClassifierService through the NextServiceAfterClassifier Element association. This will occur when implementing hierarchical classification. In this case, the ClassifierElement MUST NOT instantiate the ClassifierElement UsesFilterList association. Further, when a ClassifierElement is associated with a ClassifierService as described above, the order of processing of the associated ClassifierService is a function of the ClassifierOrder property of the ClassifierElementInClassifierService aggregation.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClassifierElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ClassifierElement extends CIM_ClassifierService {
} // CIM_ClassifierElement
