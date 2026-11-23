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
 * A representation of the model object '<em><b>CIM Group In Disk Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_GroupInDiskGroup describes that a DiskGroup can be divided into smaller named Collections.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_GroupInDiskGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Device::DiskGroup' override.Collection='CIM_DiskGroup REF' override.Collection.Aggregate='true' override.Collection.Max='1' override.Collection.Description='The DiskGroup that is divided into smaller Collections.' override.CollectionInCollection='CIM_DiskGroup REF' override.CollectionInCollection.Description='The DiskGroup that is a subset of the larger Group.' keys='Collection,CollectionInCollection'"
 * @generated
 */
@ProviderType
public interface CIM_GroupInDiskGroup extends CIM_CollectedCollections {
} // CIM_GroupInDiskGroup
