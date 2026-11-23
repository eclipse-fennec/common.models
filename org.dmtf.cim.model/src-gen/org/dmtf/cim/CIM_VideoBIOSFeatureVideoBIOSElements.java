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
 * A representation of the model object '<em><b>CIM Video BIOS Feature Video BIOS Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between VideoBIOSFeature and its aggregated VideoBIOSElements.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VideoBIOSFeatureVideoBIOSElements()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::BIOS' override.GroupComponent='CIM_VideoBIOSFeature REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The VideoBIOSFeature.' override.PartComponent='CIM_VideoBIOSElement REF' override.PartComponent.Description='The VideoBIOSElement that implements the capabilities described by VideoBIOSFeature.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_VideoBIOSFeatureVideoBIOSElements extends CIM_SoftwareFeatureSoftwareElements {
} // CIM_VideoBIOSFeatureVideoBIOSElements
