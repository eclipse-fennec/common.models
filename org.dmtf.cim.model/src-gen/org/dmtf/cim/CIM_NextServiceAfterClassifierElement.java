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
 * A representation of the model object '<em><b>CIM Next Service After Classifier Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association used to establish a predecessor-successor relationship between a single ClassifierElement (within a ClassifierService) and the next ConditioningService object that further processes the selected traffic. Note that the cardinalities indicate that a FollowingService MUST be defined, after the ClassifierElement. This is because there is no reason to classify traffic unless further processing will be done.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NextServiceAfterClassifierElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.PrecedingService='CIM_ClassifierElement REF' override.PrecedingService.Description='The ClassifierElement that selects traffic to be passed to the FollowingService.' override.FollowingService='CIM_ConditioningService REF' override.FollowingService.Min='1' override.FollowingService.Max='1' override.FollowingService.Description='The ConditioningService that follows the ClassifierElement.' keys='PrecedingService,FollowingService'"
 * @generated
 */
@ProviderType
public interface CIM_NextServiceAfterClassifierElement extends CIM_NextService {
} // CIM_NextServiceAfterClassifierElement
