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
 * A representation of the model object '<em><b>CIM Collected MS Es</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CollectedMSEs is a generic association used to establish the members of the grouping object, CollectionOf MSEs.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CollectedMSEs()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Core::Collection' override.Collection='CIM_CollectionOfMSEs REF' override.Collection.Aggregate='true' override.Collection.Description='The grouping or \'bag\' object that represents the Collection.' override.Member='CIM_ManagedSystemElement REF' override.Member.Description='The members of the Collection.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_CollectedMSEs extends CIM_MemberOfCollection {
} // CIM_CollectedMSEs
