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
 * A representation of the model object '<em><b>CIM Collected Software Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CollectedSoftwareFeatures defines the SoftwareFeatures that are collected by InstalledProduct (ie, the installed image of a Product).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CollectedSoftwareFeatures()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::InstalledProduct' override.Collection='CIM_InstalledProduct REF' override.Collection.Aggregate='true' override.Collection.Description='The collection representing the installed image of a Product.' override.Member='CIM_SoftwareFeature REF' override.Member.Description='The SoftwareFeature that is a member of the InstalledProduct collection.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_CollectedSoftwareFeatures extends CIM_MemberOfCollection {
} // CIM_CollectedSoftwareFeatures
