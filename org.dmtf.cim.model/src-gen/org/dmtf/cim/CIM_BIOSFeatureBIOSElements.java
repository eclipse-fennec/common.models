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
 * A representation of the model object '<em><b>CIM BIOS Feature BIOS Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link between BIOSFeature and its aggregated BIOSElements.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BIOSFeatureBIOSElements()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::BIOS' override.GroupComponent='CIM_BIOSFeature REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The BIOSFeature.' override.PartComponent='CIM_BIOSElement REF' override.PartComponent.Description='The BIOSElement that implements the capabilities described by BIOSFeature.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_BIOSFeatureBIOSElements extends CIM_SoftwareFeatureSoftwareElements {
} // CIM_BIOSFeatureBIOSElements
