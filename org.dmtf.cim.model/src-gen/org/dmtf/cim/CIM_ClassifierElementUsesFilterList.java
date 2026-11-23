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
 * A representation of the model object '<em><b>CIM Classifier Element Uses Filter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association relates one or more ClassifierElements with a FilterList that defines the criteria to select packets for the classifier to process. Note that a classifier is always modeled as a ClassifierService that aggregates a set of ClassifierElements. Each of these ClassifierElements is EITHER associated with a single FilterList OR associated to another ClassifierService (via NextServiceAfterClassifier Element to describe hierarchical classification).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClassifierElementUsesFilterList()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_FilterList REF' override.Antecedent.Max='1' override.Antecedent.Description='The FilterList that specifies the traffic criteria for a ClassifierElement.' override.Dependent='CIM_ClassifierElement REF' override.Dependent.Description='The ClassifierElement that depends on the FilterList for its traffic criteria.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ClassifierElementUsesFilterList extends CIM_Dependency {
} // CIM_ClassifierElementUsesFilterList
